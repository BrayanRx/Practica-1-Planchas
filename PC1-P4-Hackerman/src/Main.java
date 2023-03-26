import java.util.Scanner;
public class Main {
    public static int Ackerman(int m, int n){
        if(m==0) return n+1;
        if(m>0 && n==0) return Ackerman(m-1,1);
        if(m>0 && n>0) return Ackerman(m-1, Ackerman(m,n-1));
        return 0;
    }
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int m,n;
        System.out.println("Ingrese m: "); m = ent.nextInt();
        System.out.println("Ingrese n: "); n = ent.nextInt();
        System.out.println("Resultado:\n" + Ackerman(m,n));
    }
}