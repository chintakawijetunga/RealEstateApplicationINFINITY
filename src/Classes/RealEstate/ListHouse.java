package Classes.RealEstate;

public class ListHouse implements Listable {

    private String lastName;
    private String firstName;
    private int lotNumber;
    private int price;
    private int squareFeet;
    private int bedRooms;
    
    
    public ListHouse(String lastName, String firstName, int lotNumber, int price, int squareFeet, int bedRooms) {
       
        this.lastName = lastName;
        this.firstName = firstName;
        this.lotNumber = lotNumber;
        this.price = price;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }

    @Override
    public Listable copy() {
        
        ListHouse result = new ListHouse(lastName, firstName, lotNumber, price, squareFeet, bedRooms);
        return result;
    }

    @Override
    public int compareTo(Listable otherListHouse) {
        
        ListHouse otherHouse = (ListHouse) otherListHouse;
        int diff=this.lotNumber - otherHouse.lotNumber;
        return diff;
    }

    
}
