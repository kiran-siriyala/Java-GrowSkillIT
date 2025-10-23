package LoopStatements;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=5;
		for(int i=1; i<=100; i++)
		{
			if(i%5==0)
			continue;
			System.out.println(i);
		}
	}
}

