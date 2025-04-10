import java.nio.channels.Pipe.SourceChannel;

public class App {
    public static void main(String[] args) throws Exception {
        int n=5;
        // int resultafoFinal = factorial(n);
        // System.out.println("Factorial de "+n+" es "+resultafoFinal);
        EjerciciosRecursivos eR = new EjerciciosRecursivos();
        
        System.out.println(eR.fibonacci(n));
        System.out.println(eR.sumaConsecutivos(n));
////////////////////////////////----------------------------------------
        int base=2, potencia=3;
        System.out.println("Potencia= "+eR.getPotencia(base, n));
    }




// se tiene que poner un metodo statico para poder llamar en la misma clase
// sin static solo se podra llamar cuando esta e otra clase
    public static int factorial(int n){
        if (n == 0) {
            System.out.println("Caso BASE alcanzado");
            return 1; //Caso Base
        }  
        int resultado =n*factorial(n-1);
        System.out.println("Calculando Factorian de: "+n+" * factorial ( "+ (n-1)+" - 1 )");
        return resultado;
    }


}
