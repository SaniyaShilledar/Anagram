
import java.util.Scanner;

public class HackerAnagram {
	public static void main(String[] args) {
		System.out.println("Enter length of array:");
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		System.out.println("Enter a number of elements:");
		//System.out.println("Enter a Specific value to find:");
		//int spc=s.nextInt();
		int a[]=new int[l];
		int re=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter a Specific value to find:");
		int spc=s.nextInt();
		
		/*for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}*/
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==spc)
			{

			System.out.println("Array contain specific Number:"+i);
			break;
			}
			}
		
	    
	       
	}

}
