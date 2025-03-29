package day05;

public class Person {
	String name;
	int age;
	
	public Person() {;}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		Person yonghee = new Person("영희", 20);
		Person zzangoo = new Person();
		
		System.out.println(yonghee.name);
	}
	

}
