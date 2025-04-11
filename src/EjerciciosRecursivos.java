public class EjerciciosRecursivos {
    public int fibonacci(int n){

        /*Metodo que devuelve la suma de los numeros que contiene n n=5
         *  5 + 4 + 3 + 2 + 1 = 15
         * @param n numero a ser sumado
         * @return la suma de los numeros que contiene n
         */
        if (n <=1) {
            return n;
            }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public int sumaConsecutivos (int n){
        if (n == 1) {
            return 1;
        }
        /*
         * int resultadoParcial = sumaConsecutivos (n-1)
         * int resultado =n resultadoParcial;
         */
        return n + sumaConsecutivos(n-1);
    }

    /**
     * Escribe una funcion recursiva que calcule la potencia de un número base elevado a un exponente entero exponente.
     * Por ejemplo, si base es 2 y exponente es 3, la función debe devolver 2^3=8
     * 2*2*2=8
     */
    public int getPotencia(int base, int exponente){
        if (exponente == 0) {
            return 1;
        } else {
            return base * getPotencia( base,exponente - 1); 
        }
        } 

    /*Suma de digitos de un numero:
     * Si el numero es menor que 10, lo cual significa que solo tiene un digito utilizado el operador modulo %
     * y se calcul el los digitos menos el ultimo utilizando la division entera /10. Luego, se realiza una llamada
     * recursiva a sumaDigitos con el resto y se suma el ultimo digito
     */

    public int getDigitos(int digi){
        if (digi==0){
            return digi;
        }
        return (digi%10)+getDigitos(digi/10);
    }

    }
