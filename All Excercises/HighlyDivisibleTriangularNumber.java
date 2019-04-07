
class HighlyDivisibleTriangularNumber {

    public static void main(String[] args) {

        int triNumber = 0;
        int number = 0;
        int numberOfDivisors = 0;

        long start = System.currentTimeMillis();

        while(numberOfDivisors <= 500){
            triNumber = summation(number);
            numberOfDivisors = divisors(triNumber);
            number++;
        }

        long finish = System.currentTimeMillis();

        System.out.println("time = " + (finish - start) + "\ntriNumber = " + triNumber + "\ndivisors = " + numberOfDivisors );

    }

    static int summation(int n) {
        return n * (n + 1) / 2;
    }

    static int divisors(int number) {
        int numberOfDivisors = 0;
        for (int i = 1; i <= Math.sqrt(number); i++)
            if (number % i == 0)
                numberOfDivisors++;
        numberOfDivisors *= 2;
        return numberOfDivisors;
    }

}