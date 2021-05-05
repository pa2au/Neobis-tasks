import java.util.Scanner;
public class Main {
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        int[] money = {100, 50, 20, 10, 5,2,1};
        int l=money.length;
        System.out.println(sum);
        for(int i=0; i<l; i++) {
            int banknote = sum / money[i];
            System.out.println(banknote+" nota(s) de R$ "+money[i]+",00");
            sum = sum % money[i];
        }
    }
}