/* Program Name: OOP 3200 - Java Lab 2 - WorkTicket
 * Authors: Ryan Clayson and Daniel Hinbest
 * Date: November 19, 2020
 * Description: A project to create and display a work ticket using the WorkTicket class
 */
package ca.durhamcollege;

import java.time.LocalDate;

public class WorkTicket {
    // Private data members
    private int ticketNumber;
    private String clientID;
    private LocalDate ticketDate;
    private String issueDescription;

    //Constructors
    public WorkTicket()
    {
        ticketNumber = 0;
        clientID = null;
        ticketDate = null;
        issueDescription = null;
    }

    public WorkTicket(int number, String id, LocalDate date, String description)
    {
        ticketNumber = number;
        clientID = id;
        ticketDate = date;
        issueDescription = description;
    }

    // Accessors and Mutators
    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public LocalDate getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(LocalDate ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    boolean SetWorkTicket(int ticketNumber, String clientId, LocalDate date, String issueDescription)
    {
        boolean validInput = true;

        setTicketNumber(ticketNumber);
        setClientID(clientId);
        setTicketDate(date);
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
        return "WorkTicket{" +
                "ticketNumber=" + ticketNumber +
                ", clientID='" + clientID + '\'' +
                ", ticketDate=" + ticketDate +
                ", issueDescription='" + issueDescription + '\'' +
                '}';
    }
}
