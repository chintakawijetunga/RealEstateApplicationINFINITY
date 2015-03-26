package Classes.RealEstate;

public abstract class List {

    protected Listable[] houseList;
    public int numOfItems;
    protected int currentPosition;

    public List(int maxItems) {
        
        numOfItems = 0;
        houseList = new Listable[maxItems];
    }

    public int listLengthIs() {
        return numOfItems;
    }

    public abstract boolean isThereHouse(Listable item);

    public abstract Listable retrieveHouse(Listable item);

    public abstract void insertHouse(Listable item);

    public abstract void deleteHouse(Listable item);

    public void resetHouseList() {
        currentPosition = 0;
    }

    public Listable getNextItem(boolean isNextButton) {
        
        Listable next = houseList[currentPosition];
        
        if (currentPosition == numOfItems - 1) {
            currentPosition = 0;
        } else {
            currentPosition++;
        }
        
        if (isNextButton) {
            next = houseList[currentPosition];
        }
        return next.copy();
    }

    public Listable getPreviousItem(boolean isPreviousButton) {
        
        Listable previous = houseList[currentPosition];
        
        if (currentPosition == 1) {
            currentPosition = 0;
        } else if (currentPosition == 0) {
            currentPosition = numOfItems - 1;
        } else {
            currentPosition--;
        }
        
        if (isPreviousButton) {
            previous = houseList[currentPosition];
        }
        return previous.copy();
    }
}
