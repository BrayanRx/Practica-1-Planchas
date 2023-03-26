import java.util.Scanner;
public class Main {
    public static int mcd(int a, int b){
        int r;
        while (b!=0) {
            r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    //algoritmo de euclides recursivo:
    public static int mcdrecursivo(int a, int b){
        if(b==0) return a;
        return mcdrecursivo(b,a%b);
    }
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int a,b;
        System.out.print("Ingrese a: "); a = ent.nextInt();
        System.out.print("Ingrese b: "); b = ent.nextInt();
        System.out.println("El mcd es:\n" + mcd(a,b));
    }
}