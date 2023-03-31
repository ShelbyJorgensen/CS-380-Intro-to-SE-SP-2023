package lab1;

public class CS380_Lab1 {
	public static void main(String[] args) {
		int givenNum = 12345;
		StringBuilder str = new StringBuilder(Integer.toString(givenNum));
		str.reverse();
		int reverseNum = Integer.parseInt(str.toString());
		System.out.println(reverseNum);
	}
}

