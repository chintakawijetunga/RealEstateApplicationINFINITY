package Classes.RealEstate;

public class SortedList extends List {

    public SortedList(int maxItems) {
        super(maxItems);
    }

    public SortedList() {
        super(100);
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
        
        int compare;
        int firstHouse = 0;
        int lastHouse = numOfItems - 1;
        int midPoint = (firstHouse + lastHouse) / 2;
        boolean foundHouse = false;
        
        while (!foundHouse) {
            midPoint = (firstHouse + lastHouse) / 2;
            compare = item.compareTo(houseList[midPoint]);
            if (compare == 0) {
                foundHouse = true;
            } else if (compare < 0) {
                lastHouse = midPoint - 1;
            } else {
                firstHouse = midPoint + 1;
            }
        }
        
        return houseList[midPoint].copy();
    }

    @Override
    public void insertHouse(Listable item) {
        
        int currentLocation = 0;
        boolean searchMore = (currentLocation < numOfItems);
        
        while (searchMore) {
            if (item.compareTo(houseList[currentLocation]) < 0) {
                searchMore = false;
            } else {
                currentLocation++;
                searchMore = (currentLocation < numOfItems);
            }
        }
        
        for (int index = numOfItems; index > currentLocation; index--) {
            houseList[index] = houseList[index - 1];
        }
        
        houseList[currentLocation] = item.copy();
        numOfItems++;
    }

    @Override
    public void deleteHouse(Listable item) {
        
        int currentLocation = 0;
        
        while (item.compareTo(houseList[currentLocation]) != 0) {
            currentLocation++;
        }
        
        for (int index = currentLocation + 1; index < numOfItems; index++) {
            houseList[index - 1] = houseList[index];
        }
        numOfItems--;
    }
}
