import java.util.Scanner;
class Banknotes_Coins{
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double sum = in.nextDouble();
        int[] money = {100, 50, 20, 10, 5, 2};
	double[] coins = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
        int b=money.length;
	int c=coins.length;
        System.out.println("NOTAS: ");
        for(int i=0; i<b; i++) {
            int banknote = (int) sum / money[i];
            System.out.println(banknote+" nota(s) de R$ "+money[i]+".00");
            sum = sum % money[i];
        }
	System.out.println("MOEDAS: ");
	for(int i=0; i<c; i++) {
            double coin= sum / coins[i];
	    int icoin= (int) coin;
            System.out.println(icoin +" moeda(s) de R$ "+ coins[i]);
            sum = sum % coins[i];
        }
    }
}