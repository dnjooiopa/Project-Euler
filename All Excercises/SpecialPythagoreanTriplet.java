
class SpecialPythagoreanTriplet{


    public static void main(String[] args){
        
        int a = 0, b = 0, c = 0;
        int t = 1000;
        boolean found = false;
        for (a = 1; a < t / 3; a++) {
            for (b = a; b < t / 2; b++) {
                c = t - a - b;

                if (a * a + b * b == c * c) {
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a*b*c);

    }



}