package calcular;
import java.util.Scanner;
public class Nomina{
public Nomina(){
System.out.println("Carga de nómina constructor");

}    
private String nombre="";
private int VH =32000;
private int nhoras=0;

public void setPedirInformacion(){
Scanner Lea  = new Scanner(System.in);
System.out.println("Nombre del empleado ");
nombre = Lea.next();
System.out.println("Número de horas trabajadas");
nhoras = Lea.nextInt();
}
public String getImprimaSalario(){
int salario = VH*nhoras;
return "Empleado "+ nombre+ " Horas trabajadas "+ nhoras + " $ "+salario;    
}
}
