/**
 * sortarray
 */
// this method is conventiona; method where we use two loops for comprison 
//so complexbility is 0(n^2)
public class sortarray {

    static boolean sort(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[i])
            return false;
        }
        
     
    }
    return true;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,0};
        
      boolean print= sort(arr);
      System.out.println(print);
        
    }
    
}
