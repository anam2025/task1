import java.util.*;
class vowelCount
{
public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a word");
    String word=sc.next();
    int len = word.length();
    int vowel=0;
    int cons=0;
    for(int i=0;i<len;i++){
        if(word.charAt(i)=='a'||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='i'||word.charAt(i)=='e'){
            vowel++;
        }
        else{
            cons++;
        }
    }
    System.out.println("number of vowel is" +vowel);
    System.out.println("number of cons is "+ cons);

}
}