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
public class Main{
    public static void main(String[] args) {
    
    int numero=0;
    
    while(numero<100){
        
        numero++;
        
        System.out.println(numero);
        
    }
        
        
    }
}

11.
public class Main{
    public static void main(String[] args) {
        
        for(int i=1;i<=100; i++){
            
            System.out.println(i);
        }
        
    }
}

12.
public class Main{
    public static void main(String[] args) {
    
    int numero=0;
    
    while(numero<100){
        
        numero++;
        
        if(numero % 2==0 && numero % 3==0){
            
            System.out.println("El numero es divisor de 2 y de 3: "+ numero);
    }
        
        
    }
}
}

13.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Cuantas ventas vas a realizar: ");
		
		int V;
		
		V = scanner.nextInt();
		
		int TP=0;
		
		for(int i=0; i<V; i++){
		    System.out.print("Ingrese el precio de la venta: ");
		    int P;
		    P = scanner.nextInt();
		    TP = TP + P;
		}
		System.out.println("El total de ventas q se realizaron son: "+ V);
	    System.out.println("El precio total es: "+ TP);
		
	}
}

14.
import java.util.Scanner;
public class main 
{
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        int a = scanner.nextInt();
        System.out.println("Ingrese el valor de b");
        int b = scanner.nextInt();
        System.out.println("Ingrese el valor de c");
        int c = scanner.nextInt();
 
        double discriminante = Math.pow(b, 2)-(4*a*c);

        System.out.println(">>"+discriminante);
 
        if(discriminante > 0){
            double x1 = ((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2 = ((b*(-1))-Math.sqrt(discriminante))/(2*a);
 
            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
    }
}

15.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Ingrese un valor para ver si es mayor o igual a 0:");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("El número es menor que 0. Inténtelo de nuevo.");
            }
        } while (n < 0);

        if (n > 0) {
            System.out.println("El número " + n + " es mayor a 0.");
        } else {
            System.out.println("El número " + n + " es igual a 0.");
        }

16.
import java.util.Scanner;

public class VerificarContrasena {
    public static void main(String[] args) {

        String contrasenaCorrecta = "miContrasena123";
        Scanner scanner = new Scanner(System.in);

        int intentosRestantes = 3;
        String contrasenaIntroducida = "";


        while (intentosRestantes > 0 && !contrasenaIntroducida.equals(contrasenaCorrecta)) {
            System.out.print("Introduce la contraseña: ");
            contrasenaIntroducida = scanner.nextLine();

            if (contrasenaIntroducida.equals(contrasenaCorrecta)) {
                System.out.println("Enhorabuena");
                break;
            } else {
                intentosRestantes--;
                if (intentosRestantes > 0) {
                    System.out.println("Contraseña incorrecta. Te quedan " + intentosRestantes + " intento(s).");
                }
            }
        }

        if (!contrasenaIntroducida.equals(contrasenaCorrecta)) {
            System.out.println("Has agotado todos los intentos.");
        }

        scanner.close();
    }
}


17.
import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un día de la semana: ");
        String dia = scanner.nextLine().toLowerCase();

        switch (dia) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println(dia + " es un día laboral.");
                break;
            case "sábado":
            case "sabado":
            case "domingo":
                System.out.println(dia + " no es un día laboral.");
                break;
            default:
                System.out.println("El día introducido no es válido.");
                break;
        }

        scanner.close();
    }
}
