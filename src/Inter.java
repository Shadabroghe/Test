import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//================================================find Duplicate============================================
		
		
	int[] arra= {1,2,5,2,5,4,4,5};
/*	for(int i=0;i<arra.length;i++) {
		for(int j=i+1;j<arra.length;j++) {
			
			if(arra[i]==arra[j]) {
				
				System.out.println("Duplicate integer="+arra[i]);
			}
			
			
		}
	}*/
//================================================by using hashset====================
/*	Set<Integer> num = new HashSet<Integer>();
	for(int a: arra) {
		
		if(num.add(a)==false){
			System.out.println("Duplicate integer="+a);
		}
		
	}*/
	//=================================================find sum of natral nm==========================		
		
	
	int a=10;
	int sum=0;
	int  i;
	for(i=1;i<=a;i++);
	{
		sum=sum+i;
		
		}
	
	
	System.out.println("Addition="+sum);
	
	
	
	
	
	
	
	
		
		
		
	}

}
