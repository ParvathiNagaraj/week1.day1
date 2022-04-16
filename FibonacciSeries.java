package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8, firstnum = 0, secnum = 1;
		System.out.println(firstnum);
		for (int i = 1; i <= range; ++i) {
			int sum = firstnum + secnum;
			firstnum = secnum;
			secnum = sum;
			System.out.println(sum);
		}

	}

}
