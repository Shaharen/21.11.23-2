public class Exam07 {

	public static void main(String[] args) {
		// ���̰� 5�� �迭�� �����
		// 1 2 3 4 5 �� �� �ε��� 0��° ���� ���� ��
		// �迭���� ��簪�� ���
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
		
		// 5) 4���� ���� ����� �������� ������ �ٸ���
		int[] array4 = new int[5];
		for (int i = 0 ; i < array4.length; i++) {
			array4[i] = i + 1;
			System.out.println(array4[i]);
		}

	}

}
