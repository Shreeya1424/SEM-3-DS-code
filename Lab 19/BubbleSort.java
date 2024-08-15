import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] myArray){
        int temp;
        boolean flag=true;
        for(int i=0;i<myArray.length-1;i++){
            for(int j=0;j<myArray.length-i-1;j++){
                if(myArray[j+1]<myArray[j]){
                    temp=myArray[j+1];
                    myArray[j+1]=myArray[j];
                    myArray[j]=temp;
                    flag=false;
                }
            }
            if(flag){
                return;
            }
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
        bubbleSort(myArray);
        printArray(myArray);
    }
}
