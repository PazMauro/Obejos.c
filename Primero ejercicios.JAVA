1.
public class Main {
    public static void main(String[] args) {
        
        for (int I = 1; I <= 100; I++) {
            System.out.println(+I);
        }
        }
        }

2.
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

3.
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
