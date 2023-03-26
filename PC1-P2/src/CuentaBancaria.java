import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class CuentaBancaria {

    private long ncuenta;
    private long DNI;
    private double saldo;
    private float interesanual;
    private static long ultimacuenta=100000;
    private String DNIformateado;
    public CuentaBancaria(){
        this.ncuenta=++ultimacuenta;
    }
    public CuentaBancaria(long DNI, double saldo, float interesanual){
        this.ncuenta=++ultimacuenta;
        this.DNI=DNI;
        this.saldo = saldo;
        this.interesanual = interesanual;
    }

    public void actualizarSaldo(){
        this.saldo=saldo*(1+interesanual/36500);
    }
    public void ingresar(double monto){
        this.saldo+=monto;
        System.out.println("Ingreso correcto");
    }
    public void retirar(double monto){
        if(saldo>=monto){
            this.saldo-=monto;
            System.out.println("Retiro realizado");
        }
        else System.out.println("No hay suficiente saldo");
    }
    public void imprimirDetalle(){
        System.out.println("Nro Cuenta: " + ncuenta);
        System.out.println("DNI: " + ncuenta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Interes anual: " + interesanual + "%");
    }

    private Character CalcLetra(long DNI){
        List<Character> Asign = new ArrayList<>(Arrays.asList('T', 'R', 'W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'));
        return Asign.get((int)(DNI%23));
    }
    public void formateaDNI(){
        this.DNIformateado = Long.toString(DNI) + "-" + CalcLetra(DNI);
        System.out.println("DNI formateado: " + DNIformateado);
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof CuentaBancaria){
            CuentaBancaria cuenta = (CuentaBancaria) obj;
            if(this.DNI==cuenta.DNI && this.ncuenta==cuenta.ncuenta) return true;
        }
        return false;
    }

    public long getNcuenta() {
        return ncuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public float getInteresanual() {
        return interesanual;
    }

    public static long getUltimacuenta() {
        return ultimacuenta;
    }

    public String getDNIformateado() {
        return DNIformateado;
    }
}
