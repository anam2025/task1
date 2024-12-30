public class checkShort{
    public static boolean checkelements(int arr[], int n){
        if(n==1){
            return true;
        }
return arr[n-1]>=arr[n-2]&& checkelements(arr, n-1);
    }

    public static void main (String [] args){
        int arr[]={5,6,7,8};
        boolean result=checkelements(arr,arr.length);
        System.out.println("the array is shorted:" +result);
    }

}