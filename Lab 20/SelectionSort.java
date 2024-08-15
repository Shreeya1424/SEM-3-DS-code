import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] myArray){
        int minIndex,temp;
        for(int i=0;i<myArray.length;i++){
            minIndex = i;
            for(int j=i+1;j<myArray.length;j++){
                if(myArray[j]<myArray[minIndex]){
                    minIndex = j;
                }
            }
            temp=myArray[i];
            myArray[i] = myArray[minIndex];  
            myArray[minIndex] = temp;
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
        selectionSort(myArray);
        printArray(myArray);
    }

}
