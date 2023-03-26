package uni.edu.pe;

import java.sql.SQLOutput;

public class Empleado implements Comparable<Empleado>{
    private String nombre;
    private String apellido;
    private int DNI;
    private float sueldobase;
    private float pagohextra;
    private int horasextra;
    private float tipoIR;
    private String estadocivil;
    private int nhijos;

    private float sueldobruto;
    private float mphorasextra;
    private float tipoIRresultante;
    private float retencionIR;
    private float sueldoneto;
//Constructor:
    public Empleado(){
        this.DNI = 0;
    }
    public Empleado(int DNI) {
        this.DNI=DNI;
    }

//Funciones pedidas:
    public float montoporhsextra(){
        this.mphorasextra = horasextra*pagohextra;
        return mphorasextra;
    }
    public float calculosueldobruto(){
        this.sueldobruto = mphorasextra + sueldobase;
        return sueldobruto;
    }

    public float calculoretencion(){
        float por=tipoIR;
        if(estadocivil.equals("Casado")) por-=2;
        por-=nhijos;
        if(por<0) por=0;
        this.tipoIRresultante=por;
        this.retencionIR=sueldobruto*por/100;
        this.sueldoneto = sueldobruto - retencionIR;
        return retencionIR;
    }

    public void visualizaempleado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + DNI);
        System.out.println("Pago por hora extra: " + pagohextra);
        System.out.println("Estado civil: " + estadocivil);
        System.out.println("Numero de hijos: " + nhijos);
        System.out.println("Tipo de IR: " + tipoIR);
        System.out.println("Tipo de IR resultante: " + tipoIRresultante);
    }
    public void visualizaTodo(){
        visualizaempleado();
        System.out.println("Sueldo base: " + sueldobase);
        System.out.println("Monto por horas extra: " + mphorasextra);
        System.out.println("Sueldo bruto: " + sueldobruto);
        System.out.println("Retencion del impuesto a la renta: " + retencionIR);
        System.out.println("Sueldo neto: " + sueldoneto);
    }
//Sobreescribiendo Equals:
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Empleado){
            Empleado emp = (Empleado) obj;
            if(this.DNI == emp.DNI) return true;
        }
        return false;
    }

    @Override // <- recomendable poner esto al sobreescribir un método
    public int compareTo(Empleado o) {
        if(o.DNI < this.DNI) return -1;
        if(o.DNI > this.DNI) return 1;
        return 0;
    }

    //getters y setters:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public float getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(float sueldobase) {
        this.sueldobase = sueldobase;
    }

    public float getPagohextra() {
        return pagohextra;
    }

    public void setPagohextra(float pagohextra) {
        this.pagohextra = pagohextra;
    }

    public int getHorasextra() {
        return horasextra;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }

    public float getTipoIR() {
        return tipoIR;
    }

    public void setTipoIR(float tipoIR) {
        this.tipoIR = tipoIR;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public int getNhijos() {
        return nhijos;
    }

    public void setNhijos(int nhijos) {
        this.nhijos = nhijos;
    }
}
