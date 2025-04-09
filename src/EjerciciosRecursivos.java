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
}
