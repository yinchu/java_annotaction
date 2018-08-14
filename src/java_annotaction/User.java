package java_annotaction;

public class User {
	
	public String name;
	
	public String age;

	public String getName() {
		return name;
	}

	@MyAnnotaction(value="yinchu")
	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	@MyAnnotaction("88")
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
