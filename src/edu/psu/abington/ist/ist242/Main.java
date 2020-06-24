/*
Project: Car Design
Purpose Details: Car Dealership Application
Course: IST 242
Team 4
Developed: June 14, 2020
Last date Changed: June 21, 2020
Rev: 1
*/
package edu.psu.abington.ist.ist242;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        // Customer obj
        Customer cust = new Customer();
        // Order obj
        Order or = new Order();
        // Inventory object
        Inventory inv = new Inventory();
        // Transaction object
        Transaction trans = new Transaction();
        // ARRAYLISTS -------------------------------------------------------------------------------------------------------------------------------------------------
        ArrayList<Customer> cList = new ArrayList<>();
        ArrayList<Inventory> iList = new ArrayList<>();
        ArrayList<Order> oList = new ArrayList<>();
        ArrayList<Transaction> tList = new ArrayList<>();
        // INVENTORY LIST ---------------------------------------------------------------------------------------------------------------------------------------------
        Inventory inv1 = new Inventory(1, "2020", "Honda", "Civic", 26899.99);
        Inventory inv2 = new Inventory(2, "2021","Ford", "Explorer",46799.99);
        Inventory inv3 = new Inventory(3, "2021", "Jeep", "Grand Cherokee", 39899.99);
        Inventory inv4 = new Inventory(4, "2021", "Chevrolet", "Pickup", 42699.99);
        iList.add(inv1);
        iList.add(inv2);
        iList.add(inv3);
        iList.add(inv4);

        System.out.println("---------------------------------------------------------");
        System.out.println("                   Car Dealership                        ");
        System.out.println("                        by:                              ");
        System.out.println("                      Team 4                             ");
        System.out.println("---------------------------------------------------------");
        final char CUST_CODE = '1'; //customer page
        final char PRINT_CUST = '2'; //print cust
        final char INV_CODE = '3'; //inventory page
        final char SALES_CODE = '4'; //sales person
        final char ORDER_CODE = '5'; //order page
        final char TRANS_CODE = '6'; //transaction page
        final char EXIT_CODE = 'E';
        char userAction;

        final String PROMPT_ACTION = "------------\n  MAIN MENU: \n------------\n1 - Add Customer\n2 - Print Customers\n3 - Inventory Page\n4 - Sales Person Page\n5 - Order Page\n6 - Transaction Page\nE - Exit\n\nPlease Enter you Selection: ";
        userAction = getAction(PROMPT_ACTION);
        while (userAction != EXIT_CODE) {
            switch (userAction) {
                case CUST_CODE: // Customers page
                    cList.add(cust.addCustomer());
                    System.out.println(" ");
                    break;
                case PRINT_CUST:
                    System.out.printf("%-10s | %-12s | %-10s\n", "ID", "Name", "Phone Number");
                    Customer.printCustomer(cList);
                    break;
                case INV_CODE: //Inventory Page
                    System.out.println("\t\t\t------------------------");
                    System.out.println("\t\t\t       Inventory        ");
                    System.out.println("\t\t\t------------------------");
                    Inventory.listMenu(iList);
                    break;
                case SALES_CODE: //Sales Person Page
                    Scanner input = new Scanner(System.in);
                    String answer = "";
                    System.out.print("What would you like to do: \n[A]dd in inventory \n[B]rowse Inventory \n[D]elete an item from Inventory\nPlease Choose your optio: ");
                    answer = input.nextLine().toUpperCase() + " ";
                    char firstChar = answer.charAt(0);
                    switch(firstChar){
                        case 'A':
                            iList.add(inv.addInventory());
                            break;
                        case 'B':
                            System.out.println("\t\t\t----------------------------");
                            System.out.println("     \t\t\tCurrently in Inventory        ");
                            System.out.println("\t\t\t----------------------------");
                            Inventory.listMenu(iList);
                            break;
                        case 'D':
                            Inventory.removeCar(iList);
                            break;
                    }
                    break;
                case ORDER_CODE: //Order Page
                    break;
                case TRANS_CODE: //Transaction Page
                    break;
            }
            userAction = getAction(PROMPT_ACTION);
        }
    }
    // METHOD TO GET USER CHOICE FOR MENU --------------------------------------------------------------------
    public static char getAction(String prompt) {
        Scanner scnr = new Scanner(System.in);
        String answer = "";
        System.out.print(prompt);
        answer = scnr.nextLine().toUpperCase() + " ";
        char firstChar = answer.charAt(0);
        return firstChar;
    }
}