package basics;

public class Test {
	public static void main(String[] args) {
		
		System.out.println(facValue(6));
  }
	
	public static int facValue(int n) {
		
		if (n==0) {
			return 1;
		}
		return ((n-1) *n);
	}


}
