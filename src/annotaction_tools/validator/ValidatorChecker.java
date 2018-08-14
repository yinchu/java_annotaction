package annotaction_tools.validator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ValidatorChecker {

	public static boolean check(Object object) throws NoSuchMethodException, SecurityException, Exception {
		if(object == null) {
			System.out.println("校验对象不能是空...");
			return false;
		}
		Class<?> clazz = object.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			if(field.isAnnotationPresent(MyValidator.class)) {
				MyValidator mv = field.getAnnotation(MyValidator.class);
				Method method = clazz.getMethod("get" + getMethodName(field.getName()));
				if("class java.lang.String".equals(field.getGenericType().toString())) {
					String fieldValue = (String) method.invoke(object);
					if(fieldValue.length() < mv.min()) {
						System.out.println(field.getName() + "最小长度不能小于" + mv.min() + "...");
						return false;
					}
					if(fieldValue.length() > mv.max()) {
						System.out.println(field.getName() + "最大长度不能大于" + mv.max() + "...");
						return false;
					}
				}
			}
		}
		System.out.println("校验通过...");
		return true;
	}

	private static String getMethodName(String fildeName) throws Exception {
		byte[] items = fildeName.getBytes();
		items[0] = (byte) ((char) items[0] - 'a' + 'A');
		return new String(items);
	}
}
