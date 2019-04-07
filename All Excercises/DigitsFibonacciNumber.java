import java.math.BigInteger;

class DigitsFibonacciNumber{

    public static void main(String[] args){
        
        int i = 3;
        boolean found = false;
        while(!found){
            if(digits(fibonacci(i)) == 1000){
                found = true;
                break;
            }
            i++;
        }
        System.out.println(i);

    }

    static int digits(BigInteger number) {

        BigInteger zero = new BigInteger("0");
        BigInteger ten = new BigInteger("10");
        int length=0;

        while (number.compareTo(zero) == 1) {
            length++;
            number = number.divide(ten);
        }
        return length;

    }

    static BigInteger fibonacci(int n){
        BigInteger minus1 = new BigInteger("1");
        BigInteger minus2 = new BigInteger("1");
        BigInteger fibo = new BigInteger("0");
        for (int i = 3; i <= n; i++) {
            BigInteger temp = minus1;
            fibo = minus1.add(minus2);
            minus1 = fibo;
            minus2 = temp;
        }
        return fibo;
    }

}