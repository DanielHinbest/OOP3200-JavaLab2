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
        WorkTicket Ticket;

        //Default Constructor Display
        Ticket = new WorkTicket();
        System.out.println("Default Constructor\n_________________\n");

        //System.out.println("Work Ticket #:  " + Ticket.getTicketNumber());
        //System.out.println("Client Id:      " + Ticket.getClientID());
        //System.out.println("Date:           " + Ticket.getTicketDate());
        //System.out.println("Description     " + Ticket.getIssueDescription());

        System.out.println(Ticket.toString());

        // Parameterized constructor
        System.out.println("\nParameterized Constructor\n_________________\n");
        Ticket = new WorkTicket(3, "124", LocalDate.now(), "sdfs");

    }
}
