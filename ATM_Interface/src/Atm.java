
import java.util.Scanner;


class BankAccount {


    String name;
    String user_Name;
    String password;
    String Account_No;
    int transactionAmount = 0;
    String transactionHistory = "";

    float balance = 50000f;
    Scanner sc = new Scanner(System.in);

    public void register(){

        System.out.print("Enter Your Name : ");
        name = sc.nextLine();

        System.out.print("Enter Your Username : ");
        user_Name = sc.nextLine();

        System.out.print("Enter Your Password : ");
        password = sc.nextLine();

        System.out.println("Registered Successfully !");
        System.out.println("Proceed to Login");

        System.out.println("-------------------------------------------------------");

    }
    public boolean login() {

        boolean isLogin = false;

        while ( !isLogin ) {
            System.out.println("Enter Your Username : ");
            String user_name = sc.nextLine();
            System.out.print("Enter Your Password : ");
            String Password = sc.nextLine();
            if ( user_name.equals(user_Name) & Password.equals(password) ) {

                System.out.print("\nLogin Successful  !!\n");
                System.out.println("-------------------------------------------------------");
                isLogin = true;

            }
            else {
                System.out.println("\n Username or Password not found");
            }
        }
        return isLogin;
    }




    public void withdraw_money(){


        System.out.print("\nEnter amount to be withdraw : ");
        Scanner sc = new Scanner(System.in);
        float withdrawAmount = sc.nextFloat();

        if(balance >= withdrawAmount){

            balance = balance - withdrawAmount;
            System.out.println("$"+withdrawAmount+" Withdrawn Successfully");

            System.out.println("-------------------------------------------------------");
            transactionAmount++;

        }
        else{
            System.out.print("Sorry,cannot withdraw money due to Insufficient Balance! \n"  );
        }

    }




    public void deposit_money() {
        System.out.print("Enter money to be deposited:");

        float deposited_money = sc.nextInt();


        balance = balance + deposited_money;
        System.out.println("Amount of $."+deposited_money+" has been successfully depsited");
        System.out.println("-------------------------------------------------------");

    }






    public void transfer_money() {


        System.out.print("Enter transfer amount : ");
        float transfer_amount = sc.nextFloat();

        if( balance >= transfer_amount){

            balance = balance - transfer_amount;
            System.out.println("$."+transfer_amount+" Transaction Successfully." );
            System.out.println("\n-------------------------------------------------------");
            transactionAmount++;

        }
        else {
            System.out.println("\nSorry, you have Insufficient Balance !");
        }

    }

    public void check_Balance() {
        System.out.println("\nYour bank balance is : $"+ balance);
        System.out.println("-------------------------------------------------------");
    }

}



public class Atm{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("First Register Yourself");

        System.out.print("Enter Your Choice - ");
        System.out.println("Yes or No");

        String choice = sc.next();
        choice=choice.toLowerCase();
        if(choice.equals("yes")){
            BankAccount bank = new BankAccount();
            bank.register();

            while(true){

                System.out.println("1.login");
                System.out.println("2.Exit");

                System.out.print("Enter Your Choice - ");
                int user_choice = sc.nextInt();

                if(user_choice == 1){

                    boolean login_status = bank.login();

                    if(login_status){
                        System.out.println("\n\n----------- WELCOME " + bank.name + " !! -----------\n");


                        boolean is_quit = false;

                        while(!is_quit){
                            System.out.println("1.Deposit Money");
                            System.out.println("2.Withdraw Money");
                            System.out.println("3.Transfer Money");
                            System.out.println("4.Check Bank Balance");
                            System.out.println("5.Quit");
                            System.out.println("____________________________");

                            System.out.print("Enter Your Choice - ");
                            int choice2 = sc.nextInt();

                            switch(choice2){

                                case 1:
                                    bank.deposit_money();
                                    break;

                                case 2:
                                    bank.withdraw_money();
                                    break;

                                case 3:
                                    bank.transfer_money();
                                    break;

                                case 4:
                                    bank.check_Balance();
                                    break;

                                case 5:
                                    is_quit = true;

                                    System.out.println("**********************************************************");
                                    break;





                            }
                        }

                    }
                }

                else{
                    System.out.println("--------------------Thanks for visiting"+" "+ bank.name+"!-----------------");
                    System.exit(0);
                }

            }
        }




    }

}