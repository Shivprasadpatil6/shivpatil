package operatorsExamples;

public abstract class UnaryExample2 {
	public static void main(String[]args)
	{
		//30,32,31,31,31,31,32,33,33,33,33,33,33,33,34,34,34,34,34,35,35,35,35,34,34
		int a=30;
		System.out.println(a++);// 30>>30+1=31
		System.out.println(++a);//31+1=32>>32
		System.out.println(--a);//32-1=31>>31
		System.out.println(a++);//31>>31+1=32
		System.out.println(--a);//32-1=31>>31
		System.out.println(a++);//31>>31+1=32
		System.out.println(a++);//32>>32+1=33
		System.out.println(a++);//33>>33+1=34
		System.out.println(--a);//34-1=33>>33
		System.out.println(a++);//33>>33+1=34
		System.out.println(--a);//34-1=33>>33
		System.out.println(a++);//33>>33+1=34
		System.out.println(--a);//34-1=33>>33
		System.out.println(a++);//33>>33+1=34
		System.out.println(a++);//34>>34+1=35
		System.out.println(--a);//35-1=34>>34
		System.out.println(a++);//34>>34+1=35
		System.out.println(--a);//35>>35-1=34
		System.out.println(a++);//34>>34+1=35
		System.out.println(a++);//35>>35+1=36
		System.out.println(--a);//36-1=35>>35
		System.out.println(a++);//35>>35+1=36
		System.out.println(--a);//36-1=35>>35
		System.out.println(--a);//35-1=34>>34
		System.out.println(a--);//34>>34-1=33
	}

}
