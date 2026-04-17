package lambda;
@FunctionalInterface
interface Calc{
	void add(int n1, int n2);
}

public class MainLambd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc sum=(int n1, int n2)->{
			System.out.print("sum=");
			System.out.print((n1+n2));
			};
			sum.add(23,34);
			Calc sum1=(int n1, int n2 )-> System.out.println("sum="+(n1+n2));
			sum1.add(23,34 );
	}

}
