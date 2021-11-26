
public class Exam04 {

	public static void main(String[] args) {
		// 길이가 5인 정수형 배열 array 생성
		int[] array = new int[5];		// 레퍼런스형 특징 1 ) new 가 들어간다.
										// 레퍼런스형 특징 2 ) 주소값이 들어있다.
		
		// 배열타입 배열선언 배열레퍼런스 = 배열 생성   선언한배열타입과동일    길이
		//  int    [ ]     array  =   new          int           [5];
		
		array[0] = 27;  		// 배열 0번에 27저장
		array[1] = 30;
		array[2] = 15;
		array[3] = 44;
		array[4] = 31;
		// array[5] = 77;			// 실행시 오류남
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
					
		

	}

}
