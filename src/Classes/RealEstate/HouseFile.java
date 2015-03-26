package Classes.RealEstate;

import org.w3c.dom.*;

public class HouseFile {

    public static ListHouse getNextHouse(Node nNode) {
        try {
            
            int lotNumber = 0;
            String lastName = "";
            String firstName = "";
            int price = 0;
            int squareFeet = 0;
            int bedRooms = 0;
            Element eElement = (Element) nNode;

            lotNumber = Integer.parseInt(eElement.getAttribute("lotNumber"));
            lastName = eElement.getElementsByTagName("lastName").item(0).getTextContent();
            firstName = eElement.getElementsByTagName("firstName").item(0).getTextContent();
            price = Integer.parseInt(eElement.getElementsByTagName("price").item(0).getTextContent());
            squareFeet = Integer.parseInt(eElement.getElementsByTagName("squareFeet").item(0).getTextContent());
            bedRooms = Integer.parseInt(eElement.getElementsByTagName("bedRooms").item(0).getTextContent());

            ListHouse house = new ListHouse(lastName, firstName, lotNumber, price, squareFeet, bedRooms);
            
            return house;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
