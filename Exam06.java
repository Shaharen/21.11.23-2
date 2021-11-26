
public class Exam06 {

	public static void main(String[] args) {

		int[] array1 = { 10, 20, 30, 40, 50 };
		int[] array2 = array1;					// 주소의 복사임 / 값의 복사가 아니다!
		
		array1[3] = 999;
		
		System.out.println(array2[3]);

	}

}
