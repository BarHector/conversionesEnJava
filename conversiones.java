package Conversiones_java;
//El paquete solo incluye este archivo

public class conversiones {
    public static void main(String[] args) {
        //De Int a String
            int numero = 1234;
            String cadena = Integer.toString(numero); //Primera Opción
            String cadenaDos = String.valueOf(numero); //Segunda Opción
            System.out.println("Int a String (Opcion 1): " + cadena);
            System.out.println("Int a String (Opcion 2): " + cadenaDos);

        //De String a Int
            String cadenaTres = "3456";
            int numeroDos = Integer.parseInt(cadenaTres); //Primera Opción
            Integer numeroTres = Integer.valueOf(cadenaTres); //Segunda Opción
            System.out.println("String a entero (Opcion 1): " + numeroDos);
            System.out.println("String a entero (Opcion 2): " + numeroTres);

        //De char a String
            char caracter = 'N';
            String cadenaCuatro = Character.toString(caracter);
            System.out.println("Char a String: " + cadenaCuatro);
        
        //De String a char
            //Solo aplica para el indice que se mande
            String cadenaCinco = "Esto es una cadena";
            char caracterDos = cadenaCinco.charAt(0); 
            System.out.println("String a Char(Solo un elemento): " + caracterDos);
            
            //En caso de querer aplicar la conversión a todo el String ...
            char[] caracterTres = cadenaCinco.toCharArray(); //Cada elemento de la cadena tiene una posición
            System.out.print("String a Char(Todo el String): ");
            for (int i = 0; i < 18; i++) { 
                System.out.print("" + caracterTres[i]);
            }
        
        //De String a double
            String cadenaSeis = "3.14";
            double pi = Double.parseDouble(cadenaSeis);
            System.out.println("\nString a double: " +  pi);
        
        //De double a String
            double gravedad = 9.81;
            String cadenaSiete = String.valueOf(gravedad);
            System.out.println("Double a String: " + cadenaSiete);
        
        //De String a float
            String cadenaOcho = "1.23f";
            float flotanteUno = Float.parseFloat(cadenaOcho);
            System.out.println("String a float: " + flotanteUno);
   
        // De float a String
            float flotanteDos = 4.56f;
            String cadenaNueve = Float.toString(flotanteDos);
            System.out.println("float a String: " + cadenaNueve);
    }    
}
