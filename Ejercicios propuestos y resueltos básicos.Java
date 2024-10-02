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
public class Ecuacion2GradoApp {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        int a = scanner.nextInt();
        System.out.println("Ingrese el valor de b");
        int b = scanner.nextInt();
        System.out.println("Ingrese el valor de c");
        int c = scanner.nextInt();
 
        double discriminante = Math.pow(b, 2)-(4*a*c);
 
        //Mensaje de traza
        System.out.println(">>"+discriminante);
 
        if(discriminante > 0){
            //Tambien se puede hacer por parte si lo ves más facil
            //recuerda que debes tener en cuenta la prioridad de elementos
            double x1 = ((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2 = ((b*(-1))-Math.sqrt(discriminante))/(2*a);
 
            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
    }
}

15.
