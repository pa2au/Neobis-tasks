import java.util.Scanner;
class Logical_Sequence{
     public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int X=in.nextInt();
			int Y=in.nextInt();
			for (int i = 1; i <=Y; i+=3) {
				for (int j = i; j <= i+(X - 1); j++) {
					System.out.print(j+" ");
				}
			System.out.println();
		}
	}
}