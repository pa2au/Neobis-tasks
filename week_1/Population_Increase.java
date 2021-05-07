import java.util.Scanner;
class Population{
    public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int PA,PB;
		double G1,G2;
		int count=0;
		for (int i = 1; i <= t; i++) {
        		PA = in.nextInt();
        		PB = in.nextInt();
        		G1 = in.nextDouble();
        		G2 = in.nextDouble();
        		while (PB >= PA) {
        			PA += (PA * G1) / 100;
        			PB += (PB * G2) / 100;
        			count++;
        			if (count > 100) {
        				break;
        			}
        		}
        		if (count > 100) {
        			System.out.println("Mais de 1 seculo.");
        		} else System.out.println(count + " anos");
     		}
    }
}