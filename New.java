import java.util.*;
class msg{
    msg(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Name = ");
        String name=sc.nextLine();
        
        String cap=name.substring(0,1).toUpperCase()+name.substring(1, name.length());
        System.out.println("Hello! "+cap);
        System.out.println();
    }
}
class sum{
    int a;
    int b;
    int c;
    sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("a = ");
        int a=sc.nextInt();

        System.out.print("b = ");
        int b=sc.nextInt();

        System.out.println("\na = "+a);
        System.out.println("b = "+b);

        c=a+b;
    }
    public void printsum(){

        System.out.println("\nsum = "+c);
    }
}
class New {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        msg m=new msg();
        sum s=new sum();
        s.printsum();
    }
}
