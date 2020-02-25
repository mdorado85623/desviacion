import java.util.Scanner;
/**
 * Programa en Java que lee un conjunto de n números double, los almacena en un arreglo o lista,
 * y luego calcula la desviación estándar de esos números, representada por la expresión matemática dada en el
 * ejercicio No. 2 del documento "Serie de Ejercicios Básicos de Programación No.3 - Construcción de Software"
 *  
 * 
 * @autores Jeimmy Solandry Naranjo - Santiago Velasquez - Mario Dorado
 * @version 1.0
 */
public class DesviaciónEstándar{
    
    //Definimos variables estáticas
    
    static double numero;
    static double media;
    static double varianza;
    static double desviacion;
    static int n;

    public static void main(String[] args)
    {
 
        Scanner teclado = new Scanner(System.in);

        //Se solicita la información al usuario

        System.out.println("Que cantidad de números desea calcular? ");

        n = teclado.nextInt();

        double numeros [] = new double[n];

        for (int i = 0; i < n;i++){

            System.out.println("Digite el número");

            numeros[i] = teclado.nextDouble();

        }

        //Se calcula la media, posteriormente se eleva al cuadrado la distancia entre cada dato y la media
        double suma = 0;

        for (double i: numeros){

            suma = suma +i;

        }

        media = suma / n;

        double sumatoria;

        for (int i=0; i < n; i++){

          // Se eleva al cuadrado
         
            sumatoria = Math.pow(numeros[i] - media,2);

            varianza = varianza + sumatoria;

        }

        varianza = varianza / (n-1);
       
        //Se calcula la raiz cuadrada
       
        desviacion = Math.sqrt(varianza);
       
        //Se redondea los decimales

        double redondear = Math.rint(desviacion*100)/100;

        // Se muestran los datos de salida

        System.out.println("La Desviacion Estándar es: " + redondear ); 
   
}
}
