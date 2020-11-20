/* Program Name: OOP 3200 - Java Lab 2 - WorkTicket
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: November 19, 2020
 * Description: A project to create and display a work ticket using the WorkTicket class
 */
package ca.durhamcollege;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//driver class
public class Main {

    public static void main(String[] args)
    {
        int ticketNumber = 0;
        String clientID = null;
        String dateInput = null;
        LocalDate ticketDate = null;
        String issueDescription = null;

        Scanner keyboard = new Scanner(System.in);

        // Default Constructor Display
        // We can use the mutators with this if we want
        WorkTicket ticket1 = new WorkTicket();
        System.out.println("Default Constructor\n_________________");
        System.out.println(ticket1.toString());

        // Using setWorkTicket to change ticket 1 data
        System.out.println("Set Work Ticket\n_________________");
        System.out.print("Enter the ticket number: ");
        ticketNumber = keyboard.nextInt();
        System.out.print("Enter the client ID: ");
        clientID = keyboard.nextLine();
        System.out.print("Enter the date (dd/mm/yyyy): ");
        dateInput = keyboard.next();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ticketDate = LocalDate.parse(dateInput, dateFormat);
        System.out.print("Enter the issue description: ");
        issueDescription = keyboard.nextLine();
        ticket1.setWorkTicket(ticketNumber, clientID, ticketDate, issueDescription);
        System.out.println(ticket1.toString());


        // Parameterized constructor
        System.out.println("\nParameterized Constructor\n_________________");
        WorkTicket ticket2 = new WorkTicket(3, "124", LocalDate.now(), "sdfs");
        System.out.println("Work Ticket #:  " + ticket2.getTicketNumber());
        System.out.println("Client Id:      " + ticket2.getClientID());
        System.out.println("Date:           " + ticket2.getTicketDate());
        System.out.println("Description     " + ticket2.getIssueDescription());
    }
}
