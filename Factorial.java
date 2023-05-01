/**
 * The factorial program takes a natural number
 * and returns its factorial.
 *
 * @author Fatemeh Engqvist
 */

class Factorial{

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        if (n < 0){
            throw new IllegalArgumentException();
        }
        else{
            System.out.println(fac(n));
        }
    }

    static long fac(int n){
        long result = 1;
        for (int i = n; i > 0; i--){
            result = result * i;
        }
        return result;
    }
}
