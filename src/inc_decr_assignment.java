
public class inc_decr_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		System.out.println(a++);       //10 -->11
		System.out.println(++a);       //12 --->12
		System.out.println(a--);       //12 --->11
		System.out.println(--a);       //10 -->10
		
		//assignment operator
		
		a+=10;
		System.out.println(a);
		
		//turnery operation find largest number
		
		int d=80,b=70,c=60;
		int r=(d>b)?(d>c?d:c):(b>c?b:c);
		System.out.println("largest number is ="+r);
	}

}
