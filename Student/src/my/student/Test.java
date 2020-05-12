package my.student;

public class Test {
	public static void main(String[] args) {
		Student stu=new Student("张三", 23, 150.23, 98.93f, '男');  
        System.out.println("姓名 ： "+stu.getName()+" 性别 ："+stu.getSex()+" 年龄： "+stu.getAge()+" 体重 ： "+stu.getWeight()+" 成绩 ："+stu.getGrade());  
        stu.setName("张三1");//也可以重新设置姓名  
        System.out.println("姓名： "+stu.getName()+" 国籍  "+Student.country+" 职责： "+stu.getWork());  
    }  
}
