public class Exam07 {

	public static void main(String[] args) {
		// 길이가 5인 배열을 만들고
		// 1 2 3 4 5 를 각 인덱스 0번째 부터 저장 후
		// 배열안의 모든값을 출력
		// 1)
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		System.out.println();

		// 2)
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();

		// 3)
		int[] array2 = new int[5];

		array2[0] = 1;
		
		System.out.println(array2[0]);
		
		System.out.println();
		
		// 4)
		int[] array3 = new int[5];
		for (int i = 0 ; i < array3.length; i++) {
			array3[i] = i + 1;
		}
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}
		
		System.out.println();
		
		// 5) 4번과 같은 결과가 나오지만 순서는 다르다
		int[] array4 = new int[5];
		for (int i = 0 ; i < array4.length; i++) {
			array4[i] = i + 1;
			System.out.println(array4[i]);
		}

	}

}
