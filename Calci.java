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