package basics;

public class FactorialApp {

	public static void main(String[] args) {
		// fac(1) = 1 * 1
		// fac(2) = 2 * 1
		//fac(3) = 3 * 2 * 1 = 6
		System.out.println("Fact value is " +  fact(2));
		System.out.println(sum(4));
		
		int[] numbers = {2, -10, -14, 0, 40};
		System.out.println("Min: "+ findMin(numbers));
		System.out.println("Min: "+ findMax(numbers));
		System.out.println("Avg: " +findAvg(numbers));

	}
	//computes factorial
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		System.out.println(n);
		return fact(n-1) * n;
		
	}
	//function returns the sum of 1 to n
	public static int sum(int n) {
		int sum =0;
		for(int i =1; i<= n; i++) {
			System.out.println("Value of sum :" + sum + "+ "+ i);
			sum = sum +i;
			System.out.println("=" + sum);
			
		}
		return sum;
		
	}
	//Written the function return min, max and average
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 0; i <arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			
		}
		return min;
	}
	public static int findMax(int[] arr) {
		int max = arr[0];
		for( int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}return max;
	}
	public static int findAvg(int[] arr) {
		int sum=0;
		for(int n=0; n<arr.length; n++) {
			sum = sum + arr[n];
			
		}
		System.out.println("Sum: " + sum);
		return sum/arr.length;
	}
}
