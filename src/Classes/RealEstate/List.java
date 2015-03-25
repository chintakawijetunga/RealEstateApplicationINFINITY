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
}
