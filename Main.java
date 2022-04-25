public class Main {
    public static void main(String[] args){
        By_Reference_Variable Var = new By_Reference_Variable();
        System.out.println(Var.x);
        Var.display();
        int a = 20;
        int b = 40;
        By_Method Me = new By_Method();
        int result = Me.addNumbers(a, b);
        System.out.println("Sum is: "+ result);
        By_Constructor con = new By_Constructor(4,5);
        con.ShowDetails();
    }
}
