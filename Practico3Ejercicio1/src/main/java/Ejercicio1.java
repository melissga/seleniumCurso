import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int num1 = input.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int num2 = input.nextInt();

       /* int resultado = sumaDeDosNumeros(num1,num2);
        System.out.println("el resultado de la suma de los nros ingresados es:" + resultado);
*/
        int obtenerMayor = mayor(num1,num2);
        System.out.println("el mayor de los dos numeros ingresados es: " + obtenerMayor);

    }
    public static int sumaDeDosNumeros(int a, int b){
        return a + b;
    }

    public static int mayor(int a, int b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }
}
