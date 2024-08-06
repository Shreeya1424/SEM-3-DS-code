import java.util.Scanner;
public class BinarySearchRecurtion {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of arr");
        int n=sc.nextInt();
        int []myArray=new int[n];
        for(int i=0;i<myArray.length;i++){
            System.out.print("enter an element of index :"+(i));
            myArray[i]=sc.nextInt();
        }
        System.out.println("enter number to search");
        int searchNumber = sc.nextInt();
        sc.close(); 

        int result = binarySearch(myArray, 0, myArray.length - 1, searchNumber);
        if (result == -1) {
            System.out.println("Number does not exist in array");
        } else {
            System.out.println("Print index: " + (result + 1));
        }
    }

    public static int binarySearch(int[] myArray, int low, int high, int searchNumber) {
        boolean isFound = false;

        while (high >= low) {

            int mid = (high + low)/2;
            if(myArray[mid]==searchNumber){
                System.out.println("Print index :"+(mid+1)); 
                break;
            }
            else if(searchNumber<myArray[mid]){
                high = mid -1;
            }
            else if(searchNumber>myArray[mid]){
                low = mid+1;
            }
           
        }
        if(!isFound){
            System.out.println("Number does not exist in array");
        }

        return -1;

   } 
}
