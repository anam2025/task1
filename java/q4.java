import java.util.*;
public class q4{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the word");
        String word = sc.nextLine();
        String newWord=word.trim();
        System.out.println(newWord);
        System.out.println(newWord.contains("e"));
        System.out.println(newWord.startsWith("He"));
        System.out.println(newWord.endsWith("lo"));


    }
}