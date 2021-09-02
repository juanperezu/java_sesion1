package ciclos;
public class Para{
public Para(){ 
System.out.println("Creando objeto para ");    
}// constructor de la clase

 //set 
 //get
private int n=0; // atributo de la clase para - +publico
public void setN(int numero){ // método  vacio (void) modificar
this.n=numero;
} // fin metodo setN

public int getN(){ // retorna un valor prefijo get devolver, retornar 
    // en este caso retorno un valor entero
int suma =0;
for(int i=0;i<=n;i++){
suma+=i; 
suma = suma+i;
}
return suma;    
}
}// fin clase
