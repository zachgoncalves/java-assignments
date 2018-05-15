package concerttix;

public class Vendor {

    private String bandName;
    private int venueCapacity;
    private int totalTicketsSold;
    private int costByPhone;
    private int costInPerson;
    private int salesByPhone;
    private int salesInPerson;
    private boolean POS; // true for venue, false for phone

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public int getCostByPhone() {
        return costByPhone;
    }

    public void setCostByPhone(int costByPhone) {
        this.costByPhone = costByPhone;
    }

    public int getCostInPerson() {
        return costInPerson;
    }

    public void setCostInPerson(int costInPerson) {
        this.costInPerson = costInPerson;
    }

    public int getTotalTicketsSold() {
        return totalTicketsSold;
    }

    public void setTotalTicketsSold(int totalTicketsSold) {
        this.totalTicketsSold = totalTicketsSold;
    }

    public int getTicketsRemaining() {
        return venueCapacity;
    }

    public void setVenueCapacity(int venueCapacity) {
        this.venueCapacity = venueCapacity;
    }

    public void TicketCounter(int sales) {
        if (POS) {
            salesByPhone += sales;
        } else {
            salesInPerson += sales;
        }
        venueCapacity -= sales;
    }

    public void setPOS(boolean POS) {
        this.POS = POS;
    }

    public int totalSales() {
        return getSalesByPhone() * costByPhone + getSalesInPerson() * costInPerson;
    }

    
    // @return the salesByPhone
    
    public int getSalesByPhone() {
        return salesByPhone;
    }

    
     //@return the salesInPerson
    
    public int getSalesInPerson() {
        return salesInPerson;
    }
}

/* 

Consider a class ConcertPromoter that records the tickets sold for a performance. 
Before the day of the concert, tickets are sold only over the phone. Sales on the 
day of the performance are made only in person at the concert venue. Tickets cost 
more at the venue than at over the phone, naturally.
The class has the following attributes:
• The name of the band
• The capacity of the venue (the number of seats)
• The number of tickets sold
• The price of a ticket sold by phone
• The price of a ticket sold at the venue in person
It has methods which:
• Record the sale of one or more tickets
• Change from selling by phone to selling at the venue (hint, do you need another instance variable)
• Return the number of tickets sold
• Return the number of tickets remaining
• Return the total sales for the concert
Implement ConcertPromoter and write a program that uses it to record the sales for 
a concert. Your program should record phone sales, then sales at the venue. As 
tickets are sold, the number of seats remaining should be displayed. At the end of 
the program, display the number of tickets sold and the total sales amount for the concert.
 */
