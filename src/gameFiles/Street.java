package gameFiles;

import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class Street extends Property {
    
    private int numHouses = 0;
    
    private int rent;
    private int rent1House;
    private int rent2House;
    private int rent3House;
    private int rent4House;
    private int rentHotel;
    private int houseOrientation;
    private int houseCost;
    
    private JRadioButton groupButton;
    private JLabel boardHousesLabel;

    public Street(String nme, int cst, int lctn, String pic, int r, int r1H, int r2H, int r3H, int r4H, int rHt, int hC, int hO) {
        super(nme, cst, lctn, pic);
        
        rent = r;
        rent1House = r1H;
        rent2House = r2H;
        rent3House = r3H;
        rent4House = r4H;
        rentHotel = rHt;
        houseOrientation = hO;
        houseCost = hC;
    }
    
    boolean fullSet() {
        for (Property p : this.getGroup()) {
            if (p.getOwner() != this.getOwner()) {
                return false;
            }
        }
        
        return true;
    }
        
    int getRent() {
        switch (numHouses) {
            case 0:
                if (fullSet()) {
                    return 2 * rent;
                } else {
                    return rent;
                }       
            case 1: return rent1House;               
            case 2: return rent2House;                
            case 3: return rent3House;               
            case 4: return rent4House;               
            case 5: return rentHotel;            
            default: return 0;
        }
    }

    void setHouses(int n) {
        numHouses = n;
    }
    
    int getHouses() {
        return numHouses;
    }
    
    int getHouseCost() {
        return houseCost;
    }
    
    int getHouseOrientation() {
        return houseOrientation;
    }
    
    void syncScreenElements(JLabel newCard, JLabel newRentLabel, JLabel newHousesLabel, JRadioButton newGroupButton, JLabel newBoardHousesLabel) {
        super.syncScreenElements(newCard, newRentLabel, newHousesLabel);
        groupButton = newGroupButton;
        boardHousesLabel = newBoardHousesLabel;
    }
    
    JRadioButton getGroupButton() {
        return groupButton;
    }
    
    JLabel getBoardHousesLabel() {
        return boardHousesLabel;
    }
    
    int groupHouses() {
        int i = 0;
        for (Property p : this.getGroup()) {
            i += ((Street) p).numHouses;
        }
        return i;
    }
    
    boolean groupUnmortgaged() {
        for (Property p : this.getGroup()) {
            if (p.isMortgaged()) {
                return false;
            }
        }
        return true;
    }
    
}
