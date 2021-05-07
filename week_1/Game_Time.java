import java.util.Scanner;
class Game{
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
	int init_h=in.nextInt();
	int init_m=in.nextInt();
	int fin_h=in.nextInt();
	int fin_m=in.nextInt();

	int hour=fin_h-init_h;
	if(hour<0)
	hour=24+(fin_h-init_h);
	int minute=fin_m-init_m;
	if(minute<0){
		minute=60+fin_m-init_m;
		hour-=1;
	}
	if(init_h == fin_h && init_m == fin_m)
	System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
	else System.out.println("O JOGO DUROU "+hour+" HORA(S) E "+minute+" MINUTO(S)");}
}
	
