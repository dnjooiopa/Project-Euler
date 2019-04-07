import java.util.ArrayList;
import java.util.Collections;

class LargestPalinedromeProduct {

    public static void main(String[] args) {

        ArrayList<Integer> allPalindrome = new ArrayList<>();
        for(int n1 = 999; n1 > 900; n1--){
            for(int n2 = 999; n2 > 900; n2--){
                if(isPalindrome(n1*n2))
                    allPalindrome.add(n1*n2);
            }
          
        }
        Collections.sort(allPalindrome);
        System.out.println(allPalindrome.get(allPalindrome.size()-1));
    }

    static boolean isPalindrome(int number) {

        int reverse = 0;
        int n = number;
        while (n > 0) {
            reverse *= 10;
            reverse += n % 10;
            n /= 10;
        }
        return reverse == number;

    }

}