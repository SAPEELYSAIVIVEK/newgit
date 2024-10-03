import java.util.*;
public class Arraystack {
  private static int maxSize;
  private static int size;
  private static int top;
  private static int[] stackArray;
  public Arraystack(int userdefinedsize){
    maxSize=userdefinedsize;
    size=0;
    top=-1;
    stackArray=new int[maxSize];
  }
  public boolean isEmpty(){
    return (size==0);
  }
  public boolean isFull(){
     return (size!=maxSize);
  }
  public  void push(int value){
    if(!isFull()){
        size++;
        stackArray[++top]=value;
    }
    else
    System.out.println("Stack Overflowed");
  }
  public int pop(){
    if(!isEmpty()){
        size--;
       return top--;
    }
    else{

        System.out.println("Stack Is Empty");
        return -1;
    }
  }
  public  void peek(){
    if(!isEmpty()){
    System.out.println("Stack Is Empty");
   
    System.out.print(stackArray[top]+"  ");
     }
    
  }
  public static int Size(){
    return size;
  }
  
}
class Main{
public static void main(String[] args) {
    System.out.println("enter the size of the stack");
    Scanner sc=new Scanner(System.in);
    int Size=sc.nextInt();
    int k=0;
    Arraystack stack=new Arraystack(Size);
    while(k!=1){
        System.out.println("enter your choice");
        int ch=sc.nextInt();
        switch (ch) {
      case 1:
          System.out.println("enter the value you want to insert");
          stack.push(sc.nextInt());
          break;
      case 2:
          System.out.println("The poped Element is"+stack.pop());
          
          break;
      case 3:
          System.out.println("the Size Of the Stack is" + stack.Size()+" ");
          break;
      case 4:
       k=1;
      default:
          break;
  }
}
}
}