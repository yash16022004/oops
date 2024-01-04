import java.util.*;
class calculator{
    int a,b;
    int res;
        calculator(int a,int b,char sym){
            this.a=a;
            this.b=b;
            switch (sym) {
                case '+':
                res=a+b;
                    break;
                case '-':
                res=a-b;
                    break;
                case '/':
                res=a/b;
                    break;
                case '*':
                res=a*b;
                    break;
                default:
                    break;
            }
        }
        public void printcal(){
            System.out.println();
            System.out.println("a = "+a);
            
            System.out.println("a = "+a);

            System.out.println();
            System.out.println("result = "+res);  
            System.out.println();          
        }
}
class decision {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of a = ");
        int a=sc.nextInt();
        
        System.out.print("Enter the value of b = ");
        int b=sc.nextInt();

        char sym='+';
        calculator c=new calculator(a,b,sym);
        c.printcal();


    }    
}
