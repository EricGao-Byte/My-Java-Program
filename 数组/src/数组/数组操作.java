package 数组;
import java.util.Arrays;
public class 数组操作 {
	public static void main(String[] args) {
		int [] nums={1,25,2,32,12,32,22,37,16};
		System.out.println("before:"+Arrays.toString(nums));
		Arrays.sort(nums);//快速排序
		System.out.println("later:"+Arrays.toString(nums));
		Arrays.fill(nums, 9);//快速填充数字9
		System.out.println("later:"+Arrays.toString(nums));
	}
}
