package Chapter5;

public class WhileLoop {
	public static void main(String[] args)
	{
		int sum = 0;
		int i = 1;
		while (i < 10)
		{
			sum += i;
			i++;
			System.out.println(i); //when i = 10
			System.out.println(sum); //sum = 45
		}
		System.out.println(i); //when i = 10
		System.out.println(sum); //sum = 45
	}
}
