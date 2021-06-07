package assginment2;
import java.util.*;
public class calucatorapp {

	public static void main(String[] args) {
		int persons;
		String name;
		int income;
		int inc;
		Scanner sc=new Scanner(System.in);
		System.out.println("Tax  Calculator App ");
		System.out.println("----------WELCOME-----------");
		System.out.println("enter total person count");
		persons=sc.nextInt();
		for(int i=1;i<=persons;i++){
					System.out.println("enter name"+i);
					name=sc.next();
					//System.out.println(name);
					System.out.println("enter "+name+"s Annual Income");
					income=sc.nextInt();
					//System.out.println(income);
					if((income>=300000)){
						inc=((income/100)*20);
						System.out.println(name+" :"+inc);
					}
					else if(income>=100000 && income<=300000){
						inc=((income/100)*10);
						System.out.println(name+" : "+inc);
							
						}
					else{
						System.out.println("0");
					}
				}
						
		//System.out.println("Names With labile taxs");
		//System.out.println("------------------------");
		//for(int j=1;j<=persons;j++){
		}		
	}
		
	


