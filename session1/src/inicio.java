// nombre del archivo debe coincidir con el de la clase 
// ejemplo  name:inicio.java
/* public class inicio{
    }

*/

import ciclos.Para;
public class inicio {
    /*Método main es el método principal que permite 
    ejecutar ó llamar una clase*/
    public static void main(String[] args) {
     Para obj1 = new Para(); 
    for(int i =0;i<100;i++) {
        obj1.setN(i); // enviar el 100 establecer setN
        System.out.println(obj1.getN());
    }
     
        
    /**Para es la clase
     * obj1 es nombre del objeto a crear
     * = new es crear una instancia ó copia atraves del contructor de la clase
     * */
    //obj1.setN(100);  establecer un valor de 100
    // obj1.getN() obtener al suma de uan serie de números generados
    // en este caso desde  0 hasta el
    }
}// fin de la clase
