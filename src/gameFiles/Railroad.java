package gameFiles;

public class Railroad extends Property {
    
    static final int RENT_1 = 25;
    static final int RENT_2 = 50;
    static final int RENT_3 = 100;
    static final int RENT_4 = 200;
    
    static final int COST = 200;
    
    public Railroad(String aName, int lctn, String pic) {
        super(aName, COST, lctn, pic);
    }
    
    int sizeGroup() {
        int counter = 0;
        
        for (Property p : this.getGroup()) {
            if (p.getOwner() == this.getOwner()) {
                counter++;
            }
        }
        
        return counter;
    }
    
    int getRent() {
        switch (sizeGroup()) {
            case 1: return RENT_1;
            case 2: return RENT_2;
            case 3: return RENT_3;
            case 4: return RENT_4;
            default: return 0;
        }
    }
    
}