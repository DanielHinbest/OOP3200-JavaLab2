/* Program Name: OOP 3200 - Java Lab 2 - WorkTicket
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: November 19, 2020
 * Description: A project to create and display a work ticket using the WorkTicket class
 */
package ca.durhamcollege;
import java.util.Scanner;

//driver class
public class Main {

    public static void main(String[] args)
    {
        int ticketNumber = 0;
        String clientID = "";
        int year = 0;
        int month = 0;
        int day = 0;
        String issueDescription = "";

        Scanner keyboard = new Scanner(System.in);

        //Default constructor - stores input in variables then passes it into the setWorkTicket function to set the object
        WorkTicket ticket = new WorkTicket();
        System.out.print("Enter the ticket number: ");
        ticketNumber = keyboard.nextInt();
        System.out.print("Enter the client ID: ");
        clientID = keyboard.nextLine();
        System.out.println("Enter the ticket date:");
        System.out.print("\tDay: ");
        day = keyboard.nextInt();
        System.out.print("\tMonth: ");
        month = keyboard.nextInt();
        System.out.print("\tYear: ");
        year = keyboard.nextInt();
        System.out.print("Enter the issue description: ");
        issueDescription = keyboard.nextLine();
        ticket.setWorkTicket(ticketNumber, clientID, year, month, day, issueDescription);
        ticket.toString();
    }
}
