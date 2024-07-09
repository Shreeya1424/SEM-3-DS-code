import java.util.Scanner;
class Stack{
    private int MaxSize;
    private int top;
    private int[]StackArray;

public Stack(int size){
    MaxSize = size;
    top =-1;
   StackArray= new int[size];
}
public void push(int X){
    if(top>=MaxSize){
        System.out.println("Stack is Overflow");
    }
    else{
        top++;
        StackArray[top]=X;
    }
}
public int pop(){
    if(top>=0){
        System.out.println("Stack is Overflow");
        return 0;
    }
    else{
        top--;
       return StackArray[top+1];
    }
}
public int peep(int i){
    if(top-i+1<=0){
        System.out.println("Stack is Overflow");
        return 0;
    }
    else{
       return StackArray[top-i+1];
    }
}
public void change(int X,int i){
    if(top-i+1<=0){
        System.out.println("Stack is Overflow");
    }
    else{
        StackArray[top-i+1]=X;
        return;
    }
}
public void display(){
    if(top>=0){
        // System.out.println("Stack is Constant: ");
       for(int i=0;i<top;i++){
        System.out.print(this.StackArray[i] + " ");
       }
       System.out.println();
    }
    else{
        System.out.println("Stack is empty");
    }
}
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter MaxSize");
   int MaxSize=sc.nextInt();
   Stack StackArray = new Stack(MaxSize);

    boolean flag = false;
    // do{
    while(flag==false){

    System.out.println("1.PUSH:");
    System.out.println("2.POP:");
    System.out.println("3.PEEP:");
    System.out.println("4.CHANGE:");
    System.out.println("5.DISPLAY:");
    System.out.println("6.exist");
    int choice = sc.nextInt();
    if(choice==6){
        flag=true;
    }
    
    switch(choice){
        case 1:
                    System.out.print("Enter value to push: ");
                    int X = sc.nextInt();
                    StackArray.push(X);
                    StackArray.display();
                    break;
                case 2:
                StackArray.pop();
                StackArray.display();

                    break;
                case 3:
                // System.out.println("Top value: " + StackArray.peep());
                int i = sc.nextInt();
                StackArray.peep(i);
                    break;
                
                case 4:
                System.out.print("Enter new value that want you change: ");
                int a = sc.nextInt();
                System.out.print("Enter new value that want you change with: ");
                int b= sc.nextInt();
                StackArray.change(a,b);
                StackArray.display();

                break;
                case 5:
                StackArray.display();
                    break;
                // case 6:
                // System.out.println("exist program");    
                    default:
                    System.out.println("Invalid choice. Try again.");
                    break;

    // }
}
    // while(choice != 6);
}
}
}