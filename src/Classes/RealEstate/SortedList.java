package Classes.RealEstate;

public class SortedList extends List {

    public SortedList(int maxItems) {
        super(maxItems);
    }
    
    
    @Override
    public boolean isThereHouse(Listable item) {
        
        int compare;
        int midPoint;
        int firstHouse = 0;
        int lastHouse = numOfItems - 1;
        boolean searchMore = (firstHouse <= lastHouse);
        boolean foundHouse = false;
        
        while (searchMore && !foundHouse) {
            midPoint = (firstHouse + lastHouse) / 2;
            compare = item.compareTo(houseList[midPoint]);
            
            if (compare == 0) {
                foundHouse = true;
            } else if (compare < 0) {
                lastHouse = midPoint - 1;
                searchMore = (firstHouse <= lastHouse);
            } else {
                firstHouse = midPoint + 1;
                searchMore = (firstHouse <= lastHouse);
            }
        }
        
        return foundHouse;
    }
    
    @Override
    public Listable retrieveHouse(Listable item) {
        
        return null;
    }

    @Override
    public void insertHouse(Listable item) {
        
        
    }

    @Override
    public void deleteHouse(Listable item) {
        
        
    }
}
