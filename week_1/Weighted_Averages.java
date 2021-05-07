import java.util.Scanner;
class Weighted{
     public static void main(String[] args){
        	Scanner in = new Scanner(System.in);
		int N=in.nextInt();
		double a1,a2,a3,avg;	
		for (int i=0;i<N;i++){
			a1 = in.nextDouble();
			a2 = in.nextDouble();
			a3 = in.nextDouble();
			avg =  (a1*2 + a2*3 + a3*5) / 10;
			System.out.printf("%.1f\n", avg);
		}
	}
}
