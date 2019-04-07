
class SpecialPythagoreanTriplet{


    public static void main(String[] args){
        
        for(int i = 1000 ; i > 0; i++){

            for(int j = 1000; j > 0; j--){

                for(int k = 1000; k > 0; k++)
                    if(isThousand(i, j, k)){

                        if(isPythagorean(i, j, k))
                            System.out.println(i + " " + j + " " + k);

                    }
                

            }

        }


    }

    static boolean isPythagorean(int a, int b, int c){

        if(((a*a)+(b*b)==c*c) || ((b*b)+(c*c)== a*a) || ((a*a)+(c*c)==b*b)){
            return true;
        }

        return false;

    }

    static boolean isThousand(int a, int b, int c){
        return (a+b+c) == 1000;
    }


}