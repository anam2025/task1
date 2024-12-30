import java.util.*;
public class RemoveDuplicate{
    public static void main("String args[]"){
        int arr[]={54,80,55,55,29};
        Arrays.short(arr);
        int c;
        for*(int i=0;i<arr.length;i++){
            c=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;}
                    else
                    break;            
            }
            if(c>0){
                i=i+c;
                list.add(arr[i]);
            }
        }
        if(list.is empty())
        list.add(-1);
        System.out.println(list);
        

    }
}