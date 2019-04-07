import java.math.BigInteger;
import java.util.ArrayList;

class LargestPrimeFactor {

    public static void main(String args[]) {
        
        ArrayList<BigInteger> t = new ArrayList<>();
        t = getPrimeFactor(new BigInteger("600851475143"));
        for( BigInteger a: t){
            System.out.println(a);
        }

    }

    static ArrayList<BigInteger> getPrimeFactor(BigInteger num) {
        BigInteger index = new BigInteger("2");
        ArrayList<BigInteger> primeFactors = new ArrayList<>();
        while (index.compareTo(num) == -1) {

            while ((num.mod(index)).equals(new BigInteger("0"))) {
                primeFactors.add(index);
                num = num.divide(index);
            }
            index = index.add(new BigInteger("1"));
        }

        if (num.compareTo(new BigInteger("2")) == 1) {
            primeFactors.add(num);
        }
        return primeFactors;
    }
}
