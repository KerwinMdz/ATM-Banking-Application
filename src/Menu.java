import java.util.Scanner;

public class Menu {

 Scanner kbd = new Scanner(System.in);
 Bank bank = new Bank();
 boolean exit;

    public static void main(String[] args) {

    }
    public void runMenu(){
        displayHeader();
        while(!exit){
            displayMenu();
            int selection = getInput();
            executeAction(selection);
            break;
        }
    }
    private void displayHeader() {
        System.out.println("|-----------------------------|");
        System.out.println("|   Welcome to MyBank App     |");
        System.out.println("|           Enjoy :)          |");
        System.out.println("|-----------------------------|");
    }
    private void displayMenu() {
        System.out.println("Make a Selection!");
        System.out.println("Press (1) to create a new account");
        System.out.println("Press (2) to make a deposit");
        System.out.println("Press (3) to make a withdrawal");
        System.out.println("Press (4) to display account balance.");
        System.out.println("Press (0) to exit");
    }

    private int getInput(){
        int selection = -1;
        do {
            System.out.print("Please enter your choice: ");
            try {
                selection = Integer.parseInt(kbd.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numbers only");
            }
            if (selection < 0 || selection > 4) {
                System.out.println("Error! Please enter a valid input. Press 0 to exit");
            }
        }while (selection < 0 || selection > 4);
        return selection;
        }

        private void executeAction(int selection) {
        switch (selection) {
            case 0:
                System.out.println("Thank you for using MyBank App! Have a nice day!");
                break;
            case 1:
                //Create an account
            case 2:
                //Make a deposit
            case 3:
                //Make a withdrawal
            case 4:
                //List Balance
        }
    }


}
