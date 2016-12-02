import java.util.Scanner;
/**
 *
 * Created by lbregula on 11/30/16.
 */
public class Customer {
    private String name;
    private int balance;
    private String function;
    private Scanner input = new Scanner(System.in);


    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void chooseFunction() throws Exception {
    System.out.println("What would you like to do; check balance, withdraw, cancel");
    String function = input.nextLine();

    if (function.equalsIgnoreCase("check balance")){
        System.out.println("Your balance is $100");
    }
    else if (function.equalsIgnoreCase("withdraw")){
        System.out.println("How much would you like to withdraw?");
        int amount = Integer.parseInt(this.input.nextLine());
        if (amount > this.balance){
            throw new Exception(("Funds not available"));
        }
        this.balance -= amount;
    }
    else if (function.equalsIgnoreCase("cancel")){
        System.out.println("Thank you, and please come again");
    }
    else {
        System.out.println("invalid");
        chooseFunction();
    }




}


}

