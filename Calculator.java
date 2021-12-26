package week1.day2;

public class Calculator {
	public int add(int num1,int num2)
	{
		return num1+num2;

	}
	public int sub(int num1,int num2)
	{
		return num1-num2;

	}
	public int mul(int num1,int num2)
	{
		return num1*num2;
	}
	public int div(int num1,int num2)
	{
		return num1/num2;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int add = cal.add(30,20);
		int sub = cal.sub(30,20);
		int mul = cal.mul(30,20);
		int div = cal.div(30,20);
		System.out.println("the two number add is"+ add);
		System.out.println("the two number sub is"+ sub);
		System.out.println("the two number multiplication is"+ mul);
		System.out.println("the two number division is"+ div);


	}

}
