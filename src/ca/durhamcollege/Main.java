/* Program Name: OOP 3200 - Java Lab 2 - WorkTicket
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: November 19, 2020
 * Description: A project to create and display a work ticket using the WorkTicket class
 */
package ca.durhamcollege;
import java.time.LocalDate;
import java.util.Scanner;

//driver class
public class Main {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // Default Constructor Display
        // We can use the mutators with this if we want
        WorkTicket ticket = new WorkTicket();
        System.out.println("Default Constructor\n_________________");
        System.out.println(ticket.toString());

        // Using setWorkTicket is an option


        // Parameterized constructor
        System.out.println("\nParameterized Constructor\n_________________");
        WorkTicket ticket3 = new WorkTicket(3, "124", LocalDate.now(), "sdfs");
        System.out.println("Work Ticket #:  " + ticket3.getTicketNumber());
        System.out.println("Client Id:      " + ticket3.getClientID());
        System.out.println("Date:           " + ticket3.getTicketDate());
        System.out.println("Description     " + ticket3.getIssueDescription());
    }
}
