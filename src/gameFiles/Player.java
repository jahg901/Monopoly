package gameFiles;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Player {
    
    static final int STARTING_MONEY = 1500;
    
    private int playerNumber;
    private int money;
    private int debtOwed;
    private int jailFreeCards;
    private boolean isPlaying;
    private boolean inJail;
    private int location;
    private boolean auctionPassed;
    private int numJailTurns;
    
    private ImageIcon playerCardSmall;
    private ImageIcon playerCardBig;
    private ImageIcon playerCardHuge;
    private JLabel playerToken;
    private JLabel auctionLabel;
    private JTextField bidPriceField;
    private JButton bidButton;
    private JButton passButton;
    
    public Player(int playerNum) {
        playerNumber = playerNum;
        playerCardBig = new ImageIcon(getClass().getResource("/playerimages/P" + String.valueOf(playerNum) + ".png"));
        playerCardHuge = new ImageIcon(getClass().getResource("/bigplayerimages/P" + String.valueOf(playerNum) + ".png"));
        playerCardSmall = new ImageIcon(playerCardBig.getImage().getScaledInstance(90, 120, 0));
        
        money = STARTING_MONEY;
        debtOwed = 0;
        jailFreeCards = 0;
        location = 0;
        isPlaying = true;
        inJail = false;
        auctionPassed = false;
        numJailTurns = 0;
    }
    
    public int getNumber() {
        return playerNumber;
    }
    
    void buyProperty(Property p, int price) {
        money -= price;
        p.setOwner(this);
    }
    
    void changeMoney(int n) {
        if (money < -n) {
            debtOwed -= money + n;
            money = 0;
        } else {
            money += n;
        }
    }
    
    int getMoney() {
        return money;
    }
    
    void changeJailFreeCards(int n) {
        jailFreeCards += n;
    }
    
    int getJailFreeCards() {
        return jailFreeCards;
    }
    
    void bankrupt() {
        isPlaying = false;
    }
    
    boolean getPlaying() {
        return isPlaying;
    }
    
    boolean getInJail() {
        return inJail;
    }
        
    void setDebtOwed(int n) {
        debtOwed = n;
    }
    
    int getDebtOwed() {
        return debtOwed;
    }
    
    int getLocation() {
        return location;
    }
    
    void move(int n) {
        location += n;
    }
    
    void setLocation(int n) {
        location = n;
    }
    
    boolean passedGO() {
        if (location >= 40) {
            location -= 40;
            return true;
        } else {
            return false;
        }
    }
    
    void setPassed(boolean b) {
        auctionPassed = b;
    }
    
    boolean getPassed() {
        return auctionPassed;
    }
    
    ImageIcon getPlayerCardBig() {
        return playerCardBig;
    }
    
    ImageIcon getPlayerCardHuge() {
        return playerCardHuge;
    }
    
    ImageIcon getPlayerCardSmall() {
        return playerCardSmall;
    }
    
    JLabel getToken() {
        return playerToken;
    }
    
    JLabel getAuctionLabel() {
        return auctionLabel;
    }
    
    JTextField getBidPriceField() {
        return bidPriceField;
    }
    
    JButton getBidButton() {
        return bidButton;
    }
    
    JButton getPassButton() {
        return passButton;
    }
    
    void setComponents(JLabel token, JLabel aL, JTextField bPF, JButton bB, JButton pB) {
        playerToken = token;
        auctionLabel = aL;
        bidPriceField = bPF;
        bidButton = bB;
        passButton = pB;
    }
    
    void beginAuction() {
        setPassed(false);
        auctionLabel.setForeground(Color.white);
        bidPriceField.setEnabled(true);
        bidPriceField.setText("");
        bidButton.setEnabled(true);
        passButton.setEnabled(false);
    }
    
    void pass() {
        setPassed(true);
        auctionLabel.setForeground(Color.gray);
        bidPriceField.setText("Out");
        bidPriceField.setEnabled(false);
        bidButton.setEnabled(false);
        passButton.setEnabled(false);
    }
    
    void goToJail() {
        inJail = true;
        location = 40;
    }
    
    void getOutOfJail() {
        inJail = false;
        location = 10;
    }
    
    void pay(Player p, int amnt) {
        if (money < amnt) {
            debtOwed = amnt - money;
            pay(p, money);
        } else {
            money -= amnt;
            p.changeMoney(amnt);
        }
    }
    
    boolean jailTurns() {
        numJailTurns++;
        if (numJailTurns >= 3) {
            numJailTurns = 0;
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        return "Player " + String.valueOf(this.getNumber());
    }
}
