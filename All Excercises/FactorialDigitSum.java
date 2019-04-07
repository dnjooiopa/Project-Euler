import java.math.BigInteger;

class FactorialDigitSum {


    public static void main(String[] args){
        
        System.out.println(sumDigit(getFactorial(100)));

    }
    
    static BigInteger getFactorial(int number) {
        BigInteger fac = new BigInteger("1");
        for (int i = 2; i <= number; i++) {
            fac = fac.multiply(new BigInteger(String.valueOf(i)));
        }
        return fac;
    }

    static BigInteger sumDigit(BigInteger number){

        BigInteger zero = new BigInteger("0");
        BigInteger summation = new BigInteger("0");
        BigInteger ten = new BigInteger("10");

        while(number.compareTo(zero) == 1){
            summation = summation.add(number.mod(ten));
            number = number.divide(ten);
        }
        return summation;

    }



}