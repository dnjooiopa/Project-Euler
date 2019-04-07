import java.math.BigInteger;

class PowerDigitSum{

    public static void main(String[] args){
        
        BigInteger number = new BigInteger("2");
        number  = number.pow(1000);

        System.out.println(digitSum(number));

    }

    static BigInteger digitSum(BigInteger number){

        BigInteger digitSummation = new BigInteger("0");
        BigInteger ten = new BigInteger("10");
        while(number.compareTo(new BigInteger("0")) == 1){
            digitSummation = digitSummation.add(number.mod(ten));
            number = number.divide(ten);

        }
        return digitSummation;

    }

}