import java.math.BigInteger;

class LatticePaths{

    public static void main(String[] args){
        
        System.out.println(C(40,20));

    }

    static BigInteger getFactorial(int number){
        BigInteger fac = new BigInteger("1");
        for(int i = 2; i <= number; i++){
            fac = fac.multiply(new BigInteger(String.valueOf(i)));
        }
        return fac;
    }

    static BigInteger C(int n, int r){
        BigInteger x = getFactorial(n);
        BigInteger y = getFactorial(r);
        BigInteger z = getFactorial(n-r);
        
        return x.divide(y.multiply(z));
    }



}