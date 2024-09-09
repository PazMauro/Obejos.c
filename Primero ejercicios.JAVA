1.
public class Main {
    public static void main(String[] args) {
        
        for (int I = 1; I <= 100; I++) {
            
            if (I % 2 == 0){
            System.out.println("El numero par es " + I);
        }
        else{
            System.out.println("El numero es impar "+ I);
        }
        }
    }
}

2.
public class Main{
    
public static void main(String[] args) {

for(int i=50; i <= 100; i++){
    if(esPrimo(i)){
        System.out.println(i + "es primo");
    }
    else {
        System.out.println(i);
    }
 }
}
public static boolean esPrimo (int numero){
    
        
            if( numero <= 1){
                return false;
            }
            
            for (int J = 2; J <= Math.sqrt(numero); J++){
                if( numero % J == 0){
                    return false;
                }
            }
            return true;
        }
}

3.
import java.util.Scanner;

public class Main{
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Introdusca un numero: ");
    int numero = scanner.nextInt();
    if(numero>=100){
        if(esPrimo(numero)){
        System.out.println("El numero es primo " + numero);
        }
    }
}
public static boolean esPrimo (int numero){
    
        
            if( numero <= 1){
                return false;
            }
            
            for (int J = 2; J <= Math.sqrt(numero); J++){
                if( numero % J == 0){
                    return false;
                }
            }
            return true;
        }
}

4.
import java.util.Scanner;

public class Main{
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Introduzca un numero: ");
    int numero = scanner.nextInt();
    System.out.print("Introduzca un numero: ");
    int numero1 = scanner.nextInt();
    
    System.out.print("Ingrese la opcion: 1-suma 2-resta 3-multiplicacion 4-divicion ");
    int opcion = scanner.nextInt();
    
    switch(opcion){
        case 1:
            System.out.print(numero + numero1);
            break;
        case 2:
            System.out.print(numero - numero1);
            break;
        case 3:
            System.out.print(numero1*numero);
            break;
        case 4:
            System.out.print(numero/numero1);
            break;
    }
}
}

5.
public class Main{
    
public static void main(String[] args) {
    
    int[] numero = {1,2,3,4,5};
    
    for(int i : numero){
        System.out.print(i);
    }
    
    
    
}
}
