public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] createIntArray() {
		int[] arr;
		arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i +1;
		}
		return arr;                                                              
	}


	public static String[] createArray(String s1, String s2, String s3, String s4) {
		String[] word = {s1,s2,s3,s4};
		return word;
	}


	public static String getElement(int n, String[] arr3){
		return arr3[n];
	}

	public static void replaceElement(int n, double value, double[] arr4){
		System.out.print(arr4[n] = value);
	}
}