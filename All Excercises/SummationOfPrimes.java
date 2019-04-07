import java.math.BigInteger;

class SummationOfPrimes{

    public static void main(String[] args){
       BigInteger sumPrime = new BigInteger("0");
        for(int i = 2; i < 2000000; i++){
            if(isPrime(i)){
                System.out.println(i);
                sumPrime = sumPrime.add(new BigInteger(String.valueOf(i)));
            }
        }

        System.out.println(sumPrime);

    }

    static boolean isPrime(int number){

        if(number == 1)
            return false;

        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0)
                return false;
        }

        return true;

    }


}