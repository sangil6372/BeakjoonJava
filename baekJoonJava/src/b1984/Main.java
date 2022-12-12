package b1984;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		set(arr);
		System.out.println(arr[1]);
	}
	
	public static void set(int[] arr) {
		arr[1] = 100;
	}
}
