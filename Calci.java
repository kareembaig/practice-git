import java.util.Scanner;
interface Calci{
	public int add(int a,int b);
	public int product(int a,int b);
}

class CalciImpl implements Calci{
	public int add(int a, int b){
		return a+b;
	}
	public int product(int a, int b){
		return a*b;
	}
}
class CalciDriver{
	public static void main(String[] args){
		Scanner sc=new Scanner();
		CalciImpl c=new CalciImpl();
		System.out.println("Enter the 1st number");
		int n1=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int n2=sc.nextInt();
		System.out.println("n1"+"+"+"n2"+"="+c.add(n1,n2));
		System.out.println("n1"+"*"+"n2"+"="+c.product(n1,n2));

	}
}