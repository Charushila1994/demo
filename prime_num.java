
public class prime_num {
	public static void main(String[] args) {
		int num=15;
		boolean abc= false;
		for(int i=1;i<=num/2;i++)
		{
		if(num%i==0)
		{
		abc=true;
		break;
		}
		}
		if(!abc)
		System.out.println(num+"is a prime number");
		else

        System.out.println(num+"is a not prime number");
	}

}
