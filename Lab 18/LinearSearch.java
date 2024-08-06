import java .util.Scanner;
public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of arr");
        int n=sc.nextInt();
        int []myArray=new int[n];
        for(int i=0;i<myArray.length;i++){
            System.out.print("enter an element of index"+(i+1));
            myArray[i]=sc.nextInt();
        }
       
        System.out.println("enter number to search");
        int searchNumber = sc.nextInt();
        sc.close();
        boolean flag = false;
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]==searchNumber){
                System.out.println("Found at = "+i);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Number does not exist in array");
        }
    }
}