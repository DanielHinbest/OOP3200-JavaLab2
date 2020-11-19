/* Program Name: OOP 3200 - Java Lab 2 - WorkTicket
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: November 19, 2020
 * Description: A project to create and display a work ticket using the WorkTicket class
 */
package ca.durhamcollege;

import java.time.LocalDate;

public class WorkTicket
{
    // Private data members
    private int ticketNumber;
    private String clientID;
    private LocalDate ticketDate;
    private String issueDescription;

    //Constructors
    //Default
    public WorkTicket()
    {
        this.ticketNumber = 0;
        this.clientID = null;
        this.ticketDate = null;
        this.issueDescription = null;
    }

    //Parameterized
    public WorkTicket(int ticketNumber, String clientID, LocalDate ticketDate, String issueDescription)
    {
        SetWorkTicket(ticketNumber, clientID, ticketDate, issueDescription);
    }

    // ACCESSORS & MUTATORS
    //Get Ticket Number
    public int getTicketNumber()
    {
        return ticketNumber;
    }
    //Set Ticket Number
    public void setTicketNumber(int ticketNumber)
    {
        try
        {
            //If ticket number is less than 0, throws an exception
            if (ticketNumber < 0)
            {
                throw new IllegalArgumentException();
            }
            //Ticket is valid
            else
            {
                this.ticketNumber = ticketNumber;
            }
        }
        catch (IllegalArgumentException iae)
        {
            System.out.print(iae + " Ticket Number is invalid.\n");
        }
    }

    //Get Client ID
    public String getClientID()
    {
        return clientID;
    }
    //Set Client ID
    public void setClientID(String clientID)
    {
        try
        {
            //If Client Id's length is less/equal to 1, throw an exception
            if (clientID.length() <= 1)
            {
                throw new IllegalArgumentException();
            }
            //Client Id is valid
            else
            {
                this.clientID = clientID;
            }
        }
        catch(IllegalArgumentException iae)
        {
            System.out.print(iae + "Client Id is invalid.\n");
        }
    }

    //Get Ticket Date
    public LocalDate getTicketDate()
    {
        return ticketDate;
    }
    //Set Ticket Date --Validations go in here--
    public void setTicketDate(LocalDate ticketDate)
    {
        this.ticketDate = ticketDate;
    }

    //Get Issue Description
    public String getIssueDescription()
    {
        return issueDescription;
    }

    //Set Issue Description
    public void setIssueDescription(String issueDescription)
    {
        try
        {
            //If Issue Description length is less/equal to 1, throw an exception
            if (issueDescription.length() <= 1)
            {
                throw new IllegalArgumentException();
            }
            //Issue Description is valid
            else
            {
                this.issueDescription = issueDescription;
            }
        }
        catch (IllegalArgumentException iae)
        {
            System.out.print(iae + "Description is invalid");
        }

    }

    boolean SetWorkTicket(int ticketNumber, String clientId, LocalDate ticketDate, String issueDescription)
    {
        boolean validInput = true;

        setTicketNumber(ticketNumber);
        setClientID(clientId);
        setTicketDate(ticketDate);
        setIssueDescription(issueDescription);

        if (this.ticketNumber != ticketNumber || this.clientID != clientId || this.ticketDate != ticketDate ||
                this.issueDescription != issueDescription)
        {
            validInput = false;
        }
        return validInput;
    }

    // Functions
    @Override
    public String toString() {
        return "WorkTicket #: " + ticketNumber + "\n" +
                "ClientID:    " + clientID + "\n" +
                "Date:        " + ticketDate + "\n" +
                "Description  " + issueDescription + "\n";
    }
}
