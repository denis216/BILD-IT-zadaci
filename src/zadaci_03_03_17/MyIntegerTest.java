package zadaci_03_03_17;

public class MyIntegerTest {

	public static void main(String[] args) {
		// create two MyInteger objects
		MyInteger myInt1 = new MyInteger(8);
		MyInteger myInt2 = new MyInteger(155);

		// invoke every method that exist in MyInteger class
		System.out.println(myInt1.isEven());
		System.out.println(myInt1.isOdd());
		System.out.println(myInt1.isPrime());
		System.out.println();

		System.out.println(MyInteger.isEven(7));
		System.out.println(MyInteger.isOdd(7));
		System.out.println(MyInteger.isPrime(7));
		System.out.println();

		System.out.println(MyInteger.isEven(myInt2));
		System.out.println(MyInteger.isOdd(myInt2));
		System.out.println(MyInteger.isPrime(myInt2));
		System.out.println();

		System.out.println(myInt1.equal(3));
		System.out.println(myInt1.equal(myInt2));

		char[] ch = { 's', '2', 'a' };
		System.out.println(MyInteger.parseInt(ch));

		String s = "12345";
		String a = "fghgd2323";

		System.out.println(MyInteger.parseInt(s));
		System.out.println(MyInteger.parseInt(a));
	}

}