import java.util.Scanner;
public class VarArg
{
	static int sum(int ...arr)
	{
		int result=0;
		int avg=0;
		int count=0;
		for(int a:arr)
		{
			result+=a;
			count++;
		}
		avg=result/count;
		return avg;
	}
	public static void main(String[] args) 
	{
		System.out.println("Sum of 10,20,80,90 : "+sum(10,20,80,90));
	}
}