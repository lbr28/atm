import java.util.Scanner;

/**
 * Created by lbregula on 11/30/16.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);


        System.out.println("Enter name:");
        String name = input.nextLine();
        if(name.equals("")){
            throw new Exception("Try again");
        }

        Customer customer1 = new Customer();
        customer1.getBalance();
        customer1.chooseFunction();









    }
}
