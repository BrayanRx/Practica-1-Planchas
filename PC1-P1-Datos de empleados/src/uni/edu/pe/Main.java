package uni.edu.pe;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n;
        System.out.print("Cantidad de empleados: ");
        n=ent.nextInt();
        List<Empleado> Empleados = new ArrayList<>();
        System.out.println("Ingrese los datos:");
        for(int i=1; i<=n; i++){
            Empleado emp = new Empleado(); // se puede crear el objeto con el DNI
            System.out.println("Empleado " + i + ":");
            ent.nextLine(); //limpieza de Buffer
            System.out.print("Nombre: "); emp.setNombre(ent.nextLine());
            System.out.print("Apellido: "); emp.setApellido(ent.nextLine());
            System.out.print("DNI: "); emp.setDNI(ent.nextInt());
            System.out.println("Sueldo base: "); emp.setSueldobase(ent.nextFloat());
            System.out.println("Pago por hora extra: "); emp.setPagohextra(ent.nextFloat());
            System.out.println("Horas extra trabajadas: "); emp.setHorasextra(ent.nextInt());
            System.out.println("Tipo de Impuesto a la renta (%): "); emp.setTipoIR(ent.nextFloat());
            ent.nextLine(); //limpieza de Buffer
            System.out.println("Estado Civil: (Casado/Soltero/Viudo): "); emp.setEstadocivil(ent.nextLine());
            System.out.println("Numero de hijos: "); emp.setNhijos(ent.nextInt());
            emp.montoporhsextra();
            emp.calculosueldobruto();
            emp.calculoretencion();
            Empleados.add(emp);
        }
        System.out.println("\nEmpleados registrados correctamente...\n");
        int x=1;
        while (x==1){
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Validar empleados iguales");
            System.out.println("2. Ver informacion de algun empleado");
            System.out.println("3. Salir");
            int op=ent.nextInt();
            switch (op){
                case 1:
                    int nE1, nE2;
                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    System.out.print("Numero de empleado 1: "); nE1 = ent.nextInt();
                    System.out.print("Numero de empleado 2: "); nE2 = ent.nextInt();
                    if(Empleados.get(nE1-1).equals(Empleados.get(nE2-1))){
                        System.out.println("Los empleados son iguales");
                    }
                    else System.out.println("Los empleados no son iguales");
                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    break;
                case 2:
                    int nE;
                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    System.out.println("Numero de empleado a verificar: "); nE = ent.nextInt();
                    Empleados.get(nE-1).visualizaTodo();
                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
                    break;
                case 3:
                    x=0;
                    break;
            }
        }
    }
}