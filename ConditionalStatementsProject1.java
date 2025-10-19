package Conditionalstatements;

public class ConditionalStatementsProject1 {

	public static void main(String[] args) {
			//int Maths=20,Science=30,English=17;
			int Maths=75,Science=73,English=87;
			int a=Maths+Science+English;
			int b=(a/3);
			System.out.println(a);
			System.out.println(b);
					
			if(b<=90 && b>=100) 
			{
				System.out.println("The grade is A+");
				System.out.println("Excellent Performance");
			}
			else if(b<=89 && b>=75)
			{
				System.out.println("The grade is A");
				System.out.println("Excellent Performance");
			}	
			else if(b<=74 && b>=60)
			{
				System.out.println("The Grade is B");
				System.out.println("Keep improving");
			}
			else if(b<=59 && b>=40)
			{
				System.out.println("The Grade is B");
				System.out.println("Keep improving");
			}
			else if(b<=39)
			{
				System.out.println("Fail");
			}
			else 
			{
				System.out.println("Please Work Harder Next Time");
			}
			   
			if(Maths<35||Science<35||English<35)
			{
				System.out.println("Failed due to low score in atleast one subject");
			}   
			
		}
}
