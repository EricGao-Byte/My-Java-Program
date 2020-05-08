
public class Main {
//	public static void main(String[] args) {
////		int [] ns = new int[5];
//		int[] ns = {1,2,3,4,5};
//		int i;
//		for (i=0;i<5;i++)
//		{
//			ns[i] = 1;
//			System.out.println(ns[i]);
//		}
//	}   
		public static void main(String[] args) 
		{
		    String[] names = {"ABC", "XYZ", "zoo"};
		    String s = names[1];
		    names[1] = "cat";
		    System.out.println(s); // s是"XYZ"还是"cat"?
		}
}
