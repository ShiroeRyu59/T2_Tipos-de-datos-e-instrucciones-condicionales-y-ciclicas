import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la opcion a utilizar:");
        System.out.println("1. Evaluar un entero");
        System.out.println("2. Validar si es año bisiesto o no");
        System.out.println("3. Validar el dia segun el numero indicado");
        System.out.println("4. Menu de acciones predefinidas");
        System.out.println("5. Sumatoria ciclica");
        System.out.println("6. Repeticion de acciones");
        System.out.println("7. Visualizacion numeros naturales");
        System.out.println("8. Sumatoria segun numero indicado");
        System.out.println("Seleccione la opcion a validar...");
        int option = scanner.nextInt();
        if (option == 1) 
        {
            solEntero();
        }
        else if (option == 2)
        {
            evBisiesto();
        }
        else if (option == 3)
        {
            evDiaSemana();
        }
        else if (option == 4)
        {
            actMenu();
        }
        else if (option == 5)
        {
            rollSum();
        }
        else if (option == 6)
        {
            actionRep();
        }
        else if (option == 7)
        {
            naturalSee();
        }
        else if (option == 8)
        {
            naturalSum();
        }
        else {
            System.out.println("La opcion ingresada no es valida, revisar");
        }
        scanner.close();

    }
    //ejercicio 1, solicitud de un entero
    public static void solEntero()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero entero a evaluar:");
        int entero = scanner.nextInt();

        if (entero > 0)
        {
            System.out.println("El numero indicado es positivo");
        }
        else if (entero < 0)
        {
            System.out.println("El numero indicado es negativo");
        }
        else
        {
            System.out.println("El numero indicado es cero");
        }
        scanner.close();
    }
    public static void evBisiesto()//programa para revisar si un año es bisiesto
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el año a evaluar:");
        int anio = scanner.nextInt();

        if ((anio % 4 == 0 && anio % 100 !=0 || anio % 400 == 0)) 
        {
            System.out.println("El año indicado es bisiesto :D");
        }
        else 
        {
            System.out.println("Si tu cumpleaños es el 29 de febrero, tendrás que esperar, ya que el año indicado no es bisiesto :(");
        }
        scanner.close();
    }
    public static void evDiaSemana()//programa de verificacion del dia de la semana
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7, para evaluar que dia de la semana es:");
        int day = scanner.nextInt();

        switch(day)
        {
            case 1:
            System.out.println("El dia es Lunes");
            break;
            
            case 2:
            System.out.println("El dia es Martes");
            break;

            case 3:
            System.out.println("El dia es Miercoles");
            break;

            case 4:
            System.out.println("El dia es Jueves");
            break;

            case 5:
            System.out.println("El dia es Viernes");
            break;

            case 6:
            System.out.println("El dia es Sabado");
            break;

            case 7:
            System.out.println("El dia es Domingo");
            break;

            default:
            System.out.println("No ingreso una opcion valida, intente nuevamente");
            break;
        }
        scanner.close();
    }
    public static void actMenu()//programa de menu con switch
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------MENU--------------");
        System.out.println("El siguiente menu es informativo, por lo que solamente podra seleccionar las opciones definidas, seleccione su opcion:");
        System.out.println("1. Mostrar un mensaje de bienvenida");
        System.out.println("2. Indicar la fecha actual");
        System.out.println("3. Salir y finalizar el programa");
        System.out.println("Seleccione la opcion a realizar......");
        int menu = scanner.nextInt();

        switch (menu)
        {
            case 1:
            System.out.println("Le damos la bienvenida al programa realizado por Joaquin Santizo, esperamos sus actividades sean exitosas, buen inicio de semana!");
            break;

            case 2:
            LocalDate actFecha = LocalDate.now();
            System.out.println("La fecha de la consulta hecha es: " + actFecha);
            break;

            case 3:
            System.out.println("Nos vemos hasta la siguiente ejecucion del programa :D");
            System.exit(0);
            break;

            default:
            System.out.println("La opcion ingresada no es valida, revisar");
            break;
        }
        scanner.close();
    }
    public static void rollSum()//programa de suma en bucle
    {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int newnumero;
        System.out.println("Ingrese un numero para iniciar la suma: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese otro numero para sumarlo al anterior: ");
        int num2 = scanner.nextInt();
        suma = num1 + num2;
        System.out.println("La suma de los dos numeros indicados es:" + suma);
        System.out.println("Ingrese mas numeros para seguirlos sumando a lo anterior, si desea detener la suma, ingrese un numero negativo");
        while (true)
        {
            System.out.println("Ingrese el nuevo numero a sumar:");
            newnumero = scanner.nextInt();

            if (newnumero < 0)
            {
                break;
            }

            suma += newnumero;
            System.out.println("El valor actual de la suma es: " + suma);
        }
        System.out.println("La sumatoria total por los numeros que ingresaste es: " + suma);
        scanner.close();
    }
    public static void actionRep()//programa de repeticion de acciones y contador de las mismas
    {
        System.out.println("En esta funcion, se le mostrara un mensaje generico, despues de ello, se le consultara si quiere nuevamente generarlo:");
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        int repeticion = 0;
        do 
        {
            System.out.println("Tomorrowland 2025");
            repeticion++;
            System.out.println("Repetir nuevamente? (si/no)");
            respuesta = scanner.nextLine();
        }
        while (respuesta.equals("si"));
        System.out.println("Usted repitio el mensaje en " + repeticion + " ocasiones");
        scanner.close();
    }
    public static void naturalSee()//impresion en pantalla de los numeros naturales
    {
        System.out.println("Se mostraran los numeros naturales del 1 al 10: ");
        for (int n = 1; n < 11; n++)
        {
        System.out.println(n);
        }
        System.out.println("Nos vemos :D");
    }
    public static void naturalSum()//programa para sumatoria de los numeros naturales
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Se le solicita pueda ingresar un numero entero, para realizar la suma de dicha cantidad de numeros naturales:");
        System.out.println("Ingrese el numero entero de su eleccion: ");
        int z = scanner.nextInt();
        int total = 0;

        for (int j = 1; j < (z+1); j++)
        {
            total += j;
        }
        System.out.println("La sumatoria de los " + z + " primeros numeros naturales es de: " + total);
        scanner.close();
    }

}