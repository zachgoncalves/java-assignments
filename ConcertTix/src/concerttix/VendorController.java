package concerttix;

public class VendorController {

    public static void main(String[] args) {
        Vendor v = new Vendor();
        v.setBandName("The Wombats");
        v.setCostByPhone(10);
        v.setCostInPerson(20);
        v.setVenueCapacity(40000);
        
        v.setPOS(true);
        v.TicketCounter(21400);
        v.setPOS(false);
        v.TicketCounter(18000);
        
        System.out.println("Band: " + v.getBandName());
        System.out.println(v.getSalesByPhone() + " tickets sold by phone.");
        System.out.println(v.getSalesInPerson()+ " tickets sold in person.");
        System.out.println(v.totalSales() + " total tickets sold.");
        System.out.println(v.getTicketsRemaining() + " tickets remaining.");
    }
}
