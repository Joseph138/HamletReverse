package FileIODemo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadHamlet {
    public static void main(String[] args) {
        try {
            File file = new File("src/FileIODemo/hamlet.txt");

            try (Scanner scanner = new Scanner(file);) {
                while (scanner.hasNextLine()) {
                    String line = reverseBook(scanner.nextLine());
                    System.out.println(line);
                }
            }
        }catch(FileNotFoundException e){
            System.out.println("Error. ");
            e.printStackTrace();
        }

    }
    public static String reverseBook(String str){
        char[]letters = new char[str.length()];
        int letterIndex =0;
        for(int i = str.length()-1; i >= 0; i--){
            letters[letterIndex] = str.charAt(i);
            letterIndex++;
        }
        String reverseBook = "";
        for(int i  =0; i<str.length(); i++){
            reverseBook = reverseBook + letters[i];
        }
        return reverseBook;
    }
}
