import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] myArray){
        int j,x;
        for(int i=1; i<myArray.length; i++){
            x=myArray[i];
            j = i-1;
            while (j >= 0 && myArray[j] > x) {
                myArray[j+1] = myArray[j];
                j--;
            }
            myArray[j+1] = x;
        }
        return;
    }

    public static void printArray(int[] myArray){
        for(int i=0;i<myArray.length;i++){
            System.out.print(myArray[i]+" ");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements in array : ");
        int n = sc.nextInt();
        int[] myArray = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter array element : ");
            myArray[i] = sc.nextInt();
        }
        insertionSort(myArray);
         printArray(myArray);
    }

}
