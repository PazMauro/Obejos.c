1.
public class Main{
    public static void main(String[] args) {
    
    int numero=10;
    int numero1=5;
    
    System.out.println("La suma de los numero es: " +(numero+numero1));
    System.out.println("La resta de los numeros es:" +(numero-numero1));
    System.out.println("La multiplicacion de los numeros es: " +(numero*numero1));
    System.out.println("La division de los numeros es: "+(numero/numero1));
}
}

2.
public class Main{
    public static void main(String[] args) {
    
    int a=50;
    int b=5;
    int g=0;
    
    if(a>=b){
        
        if(a==b){
            System.out.println("El numero A y B son iguales");
        }
        else{
            System.out.println("El numero A es mayor al numero B");
        }
    }
    else{
    System.out.println("El numero B es mayor al numero A");
    }
}
}

3.import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese un nombre: ");
    
    String nombre = scanner.nextLine();
    
    System.out.println("¡Bienvenido "+nombre+ "!");
    
}
}

3.
public class Main{
    public static void main(String[] args) {
    
    String nombre = "Fernando";
    
    System.out.println("¡Bienvenido "+nombre+ "!");
    
}
}

4.
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese un nombre: ");
    
    String nombre = scanner.nextLine();
    
    System.out.println("¡Bienvenido "+nombre+ "!");
}
}

5.
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingrese el diametro del radio:");
    
    int R = scanner.nextInt();
    
    double area = Math.PI * Math.pow(R, 2);
    
    System.out.println("El area es: "+ area);
    
}
}

6.
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.print("Ingrese un numero para ver si es divisible por 2 y el resto da 0: ");
    
    int numero = scanner.nextInt();
    
    if(numero % 2 ==0 ){
        System.out.println("El resto da 0 ");
    }
    else{
        System.out.print("El resto no da 0");
    }
}
}


7.
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.print("Ingrese el numero para ver si pertenece a la tabla ASCII: ");
    
    int numero = scanner.nextInt();
    
    char ASCII = (char) numero;
    
    System.out.println(ASCII);
}
}


8.
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.print("Ingrese una letra para cumplir con lo q pide el ejercicio: ");
    
    String palabra = scanner.nextLine();
    
    char ASCII = palabra.charAt(0);
    
    int numero = (int) ASCII;
    
    System.out.println(numero);
}
}


9.
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    double precio;
    
    do{
    System.out.print("Ingrese el precio del producto: ");
    
    precio = scanner.nextInt();
    
    double IVA= (precio * 0.21);
    
    double PT= precio+IVA;
    
    System.out.println("El precio del producto es: " + PT);
    
}while(precio!=0);
}
}


10.


11.


12.


13.


14.


15.


16.


17.


18.


19.
