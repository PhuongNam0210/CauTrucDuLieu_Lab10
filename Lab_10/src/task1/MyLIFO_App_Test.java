package task1;

import java.util.Arrays;

public class MyLIFO_App_Test {
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4,5,6,7};
		String str = "{}()[{()}]";
		MyLIFO_App m = new MyLIFO_App();
		m.reserve(arr);
		System.out.println(Arrays.asList(arr));
		System.out.println(m.isCorrect(str));
	}
}
