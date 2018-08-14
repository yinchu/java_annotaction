package java_annotaction;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyAnnotactionUtil {
	
	public static User createUser() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		User user = new User();
		Method[] methods = User.class.getDeclaredMethods();
		for(Method method : methods) {
			/// 如果此方法有注解，就把注解里面的数据赋值到user对象
			if(method.isAnnotationPresent(MyAnnotaction.class)) {
				MyAnnotaction ma = method.getAnnotation(MyAnnotaction.class);
				method.invoke(user, ma.value());
			}
		}
		return user;
	}
}
