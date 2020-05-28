package interpreter_ejercicio_corregido;

public class Client {

    public static void main (String [] args){
       String toInterpretate="Como administrador Quiero generar un reporte diario Para evaluar las ganancias";

       System.out.println("Evaluar : "+toInterpretate+"\n Interpretado : "
               + new Parser(toInterpretate).evaluate());
     /* String toInterpretate1="Quiero";

       System.out.println("Evaluar : "+toInterpretate1+"\n Interpretado : "
               + new Parser(toInterpretate1).evaluate());
       String toInterpretate2="Para";

       System.out.println("Evaluar : "+toInterpretate2+"\n Interpretado : "
               + new Parser(toInterpretate2).evaluate());
*/
    }
}
