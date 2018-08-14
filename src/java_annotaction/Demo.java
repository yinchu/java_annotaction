package java_annotaction;

import java.lang.reflect.InvocationTargetException;

public class Demo {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		User user = MyAnnotactionUtil.createUser();
		System.out.println("Hello, my name is " + user.getName() + ", I'm " + 
				user.getAge() + " years old. Thank you!");
	}

}
