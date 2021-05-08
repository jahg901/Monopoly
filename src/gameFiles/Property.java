package gameFiles;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Property {
    
    private int cost;
    private int rent;
    private boolean mortgaged;
    
    private String name;
    private ImageIcon cardSmall;
    private ImageIcon cardBig;
    private Player owner;
    private int location;
    
    private JLabel card;
    private JLabel rentLabel;
    private JLabel housesLabel;
    
    private Property[] group;
    
    public Property(String aName, int aCost, int lctn, String pic) {
        name = aName;
        cost = aCost;
        location = lctn;
        cardBig = new ImageIcon(getClass().getResource("/propertycards/" + pic + ".png"));
        cardSmall = new ImageIcon(getClass().getResource("/smallpropertycards/" + pic + ".png"));
        mortgaged = false;
        owner = null;
    }
    
    void syncScreenElements(JLabel newCard, JLabel newRentLabel, JLabel newHousesLabel) {
        card = newCard;
        rentLabel = newRentLabel;
        housesLabel = newHousesLabel;
    }
    
    void setGroup(Property[] p) {
        group = p;
    }
    
    Property[] getGroup() {
        return group;
    }
    
    String getName() {
        return name;
    }
    
    int getRent() {
        return rent;
    }
    
    void setOwner(Player p) {
        owner = p;
    }
    
    Player getOwner() {
        return owner;
    }
    
    void setMortgaged(boolean b) {
        mortgaged = b;
    }
    
    boolean isMortgaged() {
        return mortgaged;
    }
    
    int getLocation() {
        return location;
    }
    
    ImageIcon getCardBig() {
        return cardBig;
    }
    
    ImageIcon getCardSmall() {
        return cardSmall;
    }
    
    int getCost() {
        return cost;
    }
    
    JLabel getCard() {
        return card;
    }
    
    JLabel getRentLabel() {
        return rentLabel;
    }
    
    JLabel getHousesLabel() {
        return housesLabel;
    }
    
}
