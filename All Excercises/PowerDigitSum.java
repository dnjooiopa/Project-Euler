import java.math.BigInteger;

class PowerDigitSum{

    public static void main(String[] args){
        
        BigInteger number = new BigInteger("2");
        number  = number.pow(1000);

        System.out.println(sumDigit(number));

    }

    static BigInteger sumDigit(BigInteger number) {

        BigInteger zero = new BigInteger("0");
        BigInteger summation = new BigInteger("0");
        BigInteger ten = new BigInteger("10");

        while (number.compareTo(zero) == 1) {
            summation = summation.add(number.mod(ten));
            number = number.divide(ten);
        }
        return summation;

    }

}