
class SmallestMultiple{

    public static void main(String[] args){
        
        int number = 2520;
        while(true){
            if(isDividable(number))
                break;
            number++;
        }
        System.out.println(number);
    }

    static boolean isDividable(int number){

        for(int i = 2; i <= 20; i++){
            if(number % i != 0)
                return false;
        }
        return true;

    }

}