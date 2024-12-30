import java.util.*;
public class q3{
    public static void main (String[]  args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the paragrapgh");
        String word =sc.nextLine();
        int []arr = new int[256];

        for(int i =0;i<word.length();i++){
            arr[(int)word.charAt(i)]++;

        }
        for(int i=0;i<256;i++){
            if(arr[i]>0){
                System.out.println("the character " +(char)i+" is occurred "+arr[i]+"times");
            }
        }
    }
}