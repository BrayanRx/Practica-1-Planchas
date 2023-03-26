import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        List<CuentaBancaria> Cuentas = new ArrayList<>();
        System.out.print("Ingrese n: "); int n = ent.nextInt();
        ent.nextLine(); //limpieza de buffer
        for(int i=1; i<=n; i++){
            System.out.println("Cuenta " + i + ":");
            long DNI;
            double saldo;
            float interes;
            System.out.print("DNI: "); DNI= ent.nextLong();
            System.out.print("Saldo: "); saldo=ent.nextDouble();
            System.out.print("& Interes: "); interes = ent.nextFloat();
            CuentaBancaria cuenta = new CuentaBancaria(DNI, saldo, interes);
            System.out.println("Ingreso 1: "); cuenta.ingresar(ent.nextLong());
            System.out.println("Ingreso 2: "); cuenta.ingresar(ent.nextLong());
            System.out.println("Retiro 1: "); cuenta.retirar(ent.nextLong());
        }
        double maxsaldo=0;
        double salprom=0;
        for(CuentaBancaria cuent : Cuentas) {
            salprom+=cuent.getSaldo();
            if (cuent.getSaldo() > maxsaldo) maxsaldo = cuent.getSaldo();
        }
        salprom/=n;
        System.out.println("Saldo promedio de cuentas = " + salprom);
        System.out.println("Cuenta(s) con mayor saldo:");
        for(CuentaBancaria cuent : Cuentas) {
            if (cuent.getSaldo() == maxsaldo) {
                System.out.println("N Cuenta: " + cuent.getNcuenta());
                cuent.formateaDNI();
                System.out.println("Saldo: " + cuent.getSaldo());
            }
        }
    }
}