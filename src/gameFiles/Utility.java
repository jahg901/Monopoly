package gameFiles;

public class Utility extends Property {
    
    static final int MULTIPLIER_ONE = 4;
    static final int MULTIPLIER_BOTH = 10;
    static final int COST = 150;
    
    public Utility(String aName, int lctn, String pic) {
        super(aName, COST, lctn, pic);
    }
    
    boolean isPaired() {
        for (Property p : this.getGroup()) {
            if (p != this) {
                return p.getOwner() == this.getOwner();
            }
        }
        
        return false;
    }
    
    int getRent() {
        if (isPaired()) {
            return (Monopoly.RedDiceResult + Monopoly.YellowDiceResult) * MULTIPLIER_BOTH;
        } else {
            return (Monopoly.RedDiceResult + Monopoly.YellowDiceResult) * MULTIPLIER_ONE;
        }
    }
    
}
