import java.util.*;
public class Lab3_6Replace {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the value of array index"+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a no toBe replace:" );
        int toBeReplaced = sc.nextInt();
        System.out.println("Enter a no  replace: " );
        int replaceWith = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == toBeReplaced) {
                arr[i] = replaceWith;
                index = i;
                break; 
            }
        }
        System.out.println("Index of replaced number: " + index);
        System.out.print("Final array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        sc.close();

    }
}