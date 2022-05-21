/**
 *
 * @author Iker Lobo 
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos la variable Nombres como un Array de Strings
        String[] nombres;
        // la longitud del Array es 3 posiciones 0,1 y 2
        nombres = new String[3];
        
        //en el 0 el valor será Iker, en el 1 Jon y en el 3 Maria
        nombres[0]="Iker";
        nombres[1]="Jon";
        nombres[2]="María";
        
        //con For recorremos números de 0 a 2
        for (int k=0; k<3;k++){
            //Obtenemos valor de K
            String nombre = nombres[k];
            //Imprime los nombres almacenados en el array a través de K
            System.out.println(nombre);
            
        }
       
    }
    
}
