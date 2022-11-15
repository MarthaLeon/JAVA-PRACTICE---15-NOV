import java.util.Scanner;

public class suma{
    public static void main(string args[]) {
 
        Scanner dato_sumar_usuario = new Scanner(System.in);
         int sumando_uno=0;
         int sumando_dos=0;
         double sumando_tres=0;
         double sumando_cuatro=0;
         double sumando_cinco=0;
         float total_suma=0; 

        System.out.println("Ingrese el primer número para sumar: ");
        sumando_uno = dato_sumar_usuario.nextFloat();

        System.out.println("Ingrese el segundo número para sumar: ");
        sumando_dos = dato_sumar_usuario.nextFloat();

        System.out.println("Ingrese el tercer número para sumar: ");
        sumando_tres = dato_sumar_usuario.nextFloat();

        System.out.println("Ingrese el cuarto número para sumar: ");
        sumando_cuarto = dato_sumar_usuario.nextFloat();

        System.out.println("Ingrese el quinto número para sumar: ");
        sumando_cinco = dato_sumar_usuario.nextFloat();

        float conversion_uno=Float.parseFloat(sumando_uno);
        float conversion_dos=Float.parseFloat(sumando_dos);
        float conversion_tres=Float.parseFloat(sumando_tres);
        float conversion_cuatro=Float.parseFloat(sumando_cuatro);
        float conversion_cinco=Float.parseFloat(sumando_cinco);

         total_suma= conversion_uno + conversion_dos + conversion_tres + conversion_cuatro +
         conversion_cinco;
         System.out.println("El total de la suma es: " + total_suma)
    }
}

//Este método sirve para calcular el total de la suma de 5 datos númericos ingresados por el usuario
//Incluye la conversión de datos de tipo integer and double a tipo float
//Utiliza la programación orientada a objetos porque se trata de un módulo independiente que 
//puede ser utilizado, modificado o extendido sin afectar a los demás módulos. Para ello,
//se utilizaron variables diferentes a las de los demás objetos lo cual hace que estas sean independientes de
//las variables de los otros métodos.


import java.util.Scanner;

public class multiplicacion{
    public static void main(string args[]) {
          
         Scanner dato_multiplicar_usuario = new Scanner(System.in);
         float multi_uno=0;
         float multi_dos=0;
         float multi_tres=0;
         float multi_cuatro=0;
         float multi_cinco=0;
         float multiplicacion=0;

        System.out.println("Ingrese el primer número para multiplicar: ");
        multi_uno = dato_multiplicar_usuario.nextFloat();

        System.out.println("Ingrese el segundo número para multiplicar: ");
        multi_dos = dato_multiplicar_usuario.nextFloat();

        System.out.println("Ingrese el tercer número para multiplicar: ");
        multi_tres = dato_multiplicar_usuario.nextFloat();

        System.out.println("Ingrese el cuarto número para multiplicar: ");
        multi_cuarto = dato_multiplicar_usuario.nextFloat();

        System.out.println("Ingrese el quinto número para multiplicar: ");
        multi_cinco = dato_multiplicar_usuario.nextFloat();

         multiplicacion= multi_uno*multi_dos*multi_tres*multi_cuatro*multi_cinco;
         System.out.println("El total de la multiplicación es: " + multiplicacion)
    }
}



//Este método sirve para calcular el total de la multiplicación de 5 datos númericos ingresados por el usuario
//Utiliza la programación orientada a objetos porque se trata de un módulo independiente que 
//puede ser utilizado, modificado o extendido sin afectar a los demás módulos. Para ello,
//se utilizaron variables diferentes a las de los demás objetos lo cual hace que estas sean independientes de
//las variables de los otros métodos.





import java.util.Scanner;

public class promedio{
    public static void main(string args[]) {
          
         Scanner dato_promediar_usuario = new Scanner(System.in);
         float cantidad_uno=0;
         float cantidad_dos=0;
         float cantidad_tres=0;
         float cantidad_cuatro=0;
         float cantidad_cinco=0;
         float promedio=0;

        System.out.println("Ingrese el primer número para promediar: ");
        cantidad_uno = dato_promediar_usuario.nextFloat();

        System.out.println("Ingrese el segundo número para promediar: ");
        cantidad_dos = dato_promediar_usuario.nextFloat();

        System.out.println("Ingrese el tercer número para promediar: ");
        cantidad_tres = dato_promediar_usuario.nextFloat();

        System.out.println("Ingrese el cuarto número para promediar: ");
        cantidad_cuarto = dato_promediar_usuario.nextFloat();

        System.out.println("Ingrese el quinto número para promediar: ");
        cantidad_cinco = dato_promediar_usuario.nextFloat();


         promedio=(cantidad_uno+cantidad_dos+cantidad_tres+cantidad_cuatro+
         cantidad_cinco)/5;
         System.out.println("El promedio es: " + promedio)
    }
}


//Este método sirve para calcular el promedio de 5 datos númericos ingresados por el usuario
//Utiliza la programación orientada a objetos porque se trata de un módulo independiente que 
//puede ser utilizado, modificado o extendido sin afectar a los demás módulos. Para ello,
//se utilizaron variables diferentes a las de los demás objetos lo cual hace que estas sean independientes de
//las variables de los otros métodos.