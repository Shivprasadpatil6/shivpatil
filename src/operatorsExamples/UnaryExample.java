package operatorsExamples;

public class UnaryExample {
	public static void main(String[]args)
	//21,21,22,23,21,22,22,22,22,24,23,23,22,22,23,22,22,22,21,21,23,22,22,24,24//
	{
		int a=20;
		System.out.println(++a);//a= 20+1 =21>> a=21
		System.out.println(a++);//a=21 >> a=21+1>> a=22
		System.out.println(a++);//a=22 >> a=22+1>> a=23
		System.out.println(a--);//a=23>> a=23-1>> a=22
		System.out.println(--a);//a=22-1=21>> a=21
		System.out.println(++a);//a=21+1 =22>> a=22
		System.out.println(a++);//a=22>> a=22+1>> a=23
		System.out.println(--a);//a=23-1=22>> a=22
		System.out.println(a++);//a=22>> a=22+1>> a=23
		System.out.println(++a);//a=23+1=24>> a=24
		System.out.println(--a);//a=24-1=23>> a=23
		System.out.println(a--);//a=23>> a=23-1>> a=22
		System.out.println(a++);//a=22>> a=22+1>> a=23
		System.out.println(--a);//a=23-1=22>> a=22
		System.out.println(++a);//a=22+1=23>> a=23
		System.out.println(--a);//a=23-1=22>> a=22
		System.out.println(a++);//a=22 >> a=22+1=23
		System.out.println(--a);//a=23-1=22>> a=22
		System.out.println(--a);//a=22-1=21>> a=21
		System.out.println(a++);//a=21>> a=21+1=22
		System.out.println(++a);//a=22+1=23>> a=23
		System.out.println(--a);//a=23-1=22>> a=22
		System.out.println(a++);//a=22>>a=22+1=23
		System.out.println(++a);//a=23+1=24>> a=24
		System.out.println(a--);//a=24>>a=24-1=23
		
		
		
	}
	

}
