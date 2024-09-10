1.
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese el numero 1: ");
    int numero = scanner.nextInt();
    
    System.out.println("Ingrese el numero 2: ");
    int numero1 = scanner.nextInt();
    
    int suma;
    int resta;
    int mult;
     div;
    
    suma= numero+numero1;
    resta= numero-numero1;
    mult= numero*numero1;
    div=numero/numero1;
    
    System.out.println("La suma de los numero es: " +suma);
    System.out.println("La resta de los numeros es:" +resta);
    System.out.println("La multiplicacion de los numeros es: " +mult);
    System.out.println("La division de los numeros es: "+div);
}
}
