import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;;

public class LargeSum {
    public static void main(String[] args) {
        File file = new File("text file/allDigit.txt");
        ArrayList<String> digitStr = new ArrayList<>();
        
        try {

            //Read all digits from file
            Scanner scanner = new Scanner(file);
            StringBuilder allDigit = new StringBuilder("");
            while (scanner.hasNextLine()) {
                digitStr.add(scanner.nextLine());
            }
            scanner.close();

            //Find sum of digits
            System.out.println(sum(digitStr));


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    static BigInteger sum(ArrayList<String> digitStr){

        BigInteger sum = new BigInteger("0");

        for(int i = 0; i < digitStr.size(); i++){
            sum = sum.add(new BigInteger(digitStr.get(i)));
        }

        return sum;

    }

}