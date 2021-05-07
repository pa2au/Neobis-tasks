import java.util.Scanner;
class Triangles{
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		double A = in.nextDouble();
		double B = in.nextDouble();
		double C = in.nextDouble();
		double n;
		
		if (B > A && B > C) {
			n = A;
			A = B;
			B = n;
		} else if (C > A) {
			n = A;
			A = C;
			C = n;
		}

		if (A >= (B + C))  
			System.out.println("NAO FORMA TRIANGULO");
		else {
			if (Math.pow(A,2) == Math.pow(B,2) + Math.pow(C,2)) System.out.println("TRIANGULO RETANGULO");
			if (Math.pow(A,2) > Math.pow(B,2) + Math.pow(C,2)) System.out.println("TRIANGULO OBTUSANGULO");
			if (Math.pow(A,2) < Math.pow(B,2) + Math.pow(C,2)) System.out.println("TRIANGULO ACUTANGULO");
			if (A == B && A == C) System.out.println("TRIANGULO EQUILATERO");
			if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A)) System.out.println("TRIANGULO ISOSCELES");
		}
	}
	
}