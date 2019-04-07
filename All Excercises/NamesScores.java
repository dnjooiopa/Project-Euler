
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class NamesScores {

    public static void main(String[] args) {

        File file = new File("text File/names.txt");

        try {

            // add text as String
            Scanner scanner = new Scanner(file);
            StringBuilder allNames = new StringBuilder("");
            if(scanner.hasNext()){
                allNames.append(scanner.next());
            }
            scanner.close();
            

           // split String to array
            String[] names = allNames.toString().split(",");
            Arrays.sort(names);
            StringBuilder[] nameArr = new StringBuilder[names.length];
            for(int i = 0; i < nameArr.length; i++){
                nameArr[i] = new StringBuilder(names[i]);
            }
            // delete "
            for (int i = 0; i < nameArr.length; i++) {
                nameArr[i].deleteCharAt(0);
                nameArr[i].deleteCharAt(nameArr[i].length()-1);
            }
            
            // sum all scores
            int sum = 0;
            for(int i=0; i < nameArr.length; i++){
                sum += getScore(nameArr[i].toString(), i+1);
            }
            System.out.println(sum);
            
        } catch (FileNotFoundException e) {    
           e.printStackTrace();
        }

    }

    static int getScore(String name, int index){
        int score=0;
        for(int i=0; i < name.length(); i++){
            score += (int)(name.charAt(i)) -64;
        }

        return score * index;
        
    }

}