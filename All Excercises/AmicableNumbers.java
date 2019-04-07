
import java.util.ArrayList;

class AmicableNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> amicable = new ArrayList<>();
        for(int i = 0; i < 10000; i++ ){     
            if(isAmicable(i, sumArray(divisors(i)))){
                if(!amicable.contains(i)){
                    amicable.add(i);
                    amicable.add(sumArray(divisors(i)));
                }
            }
        }

        int sum = sumArray(amicable);
        System.out.println(sum);

        


    }

    static ArrayList<Integer> divisors(int number) {
        ArrayList<Integer> allDivisors = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                allDivisors.add(i);
            }
        }
        return allDivisors;
    }

    static int sumArray(ArrayList<Integer> arr) {
        int summation = 0;
        for (int i : arr) {
            summation += i;
        }
        return summation;
    }

    static boolean isAmicable(int num1, int num2) {
        if (num1 != num2) {
            int sum1 = sumArray(divisors(num1));
            int sum2 = sumArray(divisors(num2));
            return (sum1 == num2) && (sum2 == num1);
        }
        return false;

    }

}