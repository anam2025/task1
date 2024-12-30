public class checkVowel{
    public int check_vowel(String sentence){
        for (int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||sentence.charAt(i)=='0'||sentence.charAt(i)=='u'){
                 System.out.println("1");
            }
            else{
            System.out.println("0");
            
            }
        }
    return 0;
}
public static void main (String []args){
    checkVowel obj=new checkVowel();
    obj.check_vowel("aman");
}
}