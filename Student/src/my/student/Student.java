package my.student;

public class Student {//封装student类
	private String name;
	private int age;
	private double weight;
	private float grade;
	private char sex;
	public static String country;
	private final String work="study";
	public Student(String name, int age, double weight, float grade, char sex) {  
	    super();  //调用父类的无参构造函数,若有参数则调用对应的构造函数
	    this.name = name;  ///this:指向类自己的指针
	    this.age = age;  
	    this.weight = weight;  
	    this.grade = grade;  
	    this.sex = sex;  
	   
	}  
	//无参构造器  
	public Student() {  
	    super();  
	}  
	  
	   //属性的set和get方法  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	public int getAge() {  
	    return age;  
	}  
	public void setAge(int age) {  
	    this.age = age;  
	}  
	public double getWeight() {  
	    return weight;  
	}  
	public void setWeight(double weight) {  
	    this.weight = weight;  
	}  
	public float getGrade() {  
	    return grade;  
	}  
	public void setGrade(float grade) {  
	    this.grade = grade;  
	}  
	public char getSex() {  
	    return sex;  
	}  
	public void setSex(char sex) {  
	    this.sex = sex;  
	}  
	public String getWork() {  
	    return work;  
	}  
}

