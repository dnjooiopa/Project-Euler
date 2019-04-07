
class SumSquareDifference{

    public static void main(String[] args){
        
        System.out.println(sumSquarer2(100) - sumSquare1(100));
    }

    static int sumSquare1(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum += Math.pow(i, 2);
        }
        return sum;
    }

    static int sumSquarer2(int number){
        int n = number * (number + 1) / 2;
        return (int)Math.pow(n, 2);
    }

}