import java.util.*;
public class basic {
    public static void RemoveDuplicate(int arr[]){
        Map<Integer, Boolean> mp = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(mp.containsKey(arr[i])){
                continue;
            }
            else{
                mp.put(arr[i], true);
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void UniqueValue(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]) {
                    count++;
                    
                }
            }
            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        
        int arr[] = new int[]{1, 3, 5, 3, 5, 8, 2, 9, 6};
        RemoveDuplicate(arr);
        System.out.println();
        UniqueValue(arr);
    }
}