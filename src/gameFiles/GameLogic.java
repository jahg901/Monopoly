package gameFiles;

import java.awt.Color;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class GameLogic {
    
    final int LUXURY_TAX = 100;
    final int INCOME_TAX = 200;
    final int GO_MONEY = 200;
    final int JAIL_COST = 50;
    
    Player activePlayer;
    Player highestBidder;
    Player assetsPlayer;
    Player storedActivePlayer;
    Player tradeProposee;
    Player owedPlayer;
    
    Player[] players;
    Space[] Spaces = new Space[41];
    Street[] St = new Street[22];
    Railroad[] RR = new Railroad[4];
    Utility[] Ut = new Utility[2];
    
    ChanceCard[] Chance = new ChanceCard[16];
    ChanceCard[] CommChest = new ChanceCard[16];
    ChanceCard activeCard;
    
    ImageIcon[] RedDices = new ImageIcon[6];
    ImageIcon[] YellowDices = new ImageIcon[6];
    ImageIcon[] Houses = new ImageIcon[6];
    ImageIcon[] BoardBottomHouses = new ImageIcon[6];
    ImageIcon[] BoardLeftHouses = new ImageIcon[6];
    ImageIcon[] BoardRightHouses = new ImageIcon[6];
    ImageIcon[] BoardTopHouses = new ImageIcon[6];
    ImageIcon[] BoardHouses;
    
    ImageIcon BlankPropCard;
    ImageIcon GOImage;
    ImageIcon FreeParkingImage;
    ImageIcon JustVisitingImage;
    ImageIcon ChanceBackground;
    ImageIcon CommunityChestBackground; 
    ImageIcon LuxuryTaxImage;
    ImageIcon IncomeTaxImage;

    Color brown = new Color(140, 86, 59);
    Color lightBlue = new Color(180, 222, 246);
    Color pink = new Color(200, 71, 146);
    Color orange = new Color(232, 152, 62);
    Color red = new Color(216, 54, 49);
    Color yellow = new Color(252, 242, 81);
    Color green = new Color(84, 175, 98);
    Color blue = new Color(48, 111, 180);
    
    int bidPrice = -1;
    int spaceEffect;
    int housesLeft = 32;
    int futureHouses;
    int futureHouseCost;
    
    boolean playerMoved;
    boolean playerInDebt = false;
    
    int[] futurePropHouses = new int[3];
    
    Property[] fullSetUsed;
    Street[] fullStreetSet = new Street[3];
    
    Property[] MortgageMenuProps = new Property[28];
    Property[] ProposerProps = new Property[28];
    Property[] ProposeeProps = new Property[28];
    
    Property[] ProposerTradedProps = new Property[28];
    Property[] ProposeeTradedProps = new Property[28];
    Property[] tempPropArray;
    
    int proposerTradedMoney = 0;
    int proposeeTradedMoney = 0;
    int proposerTradedOutOfJailCards = 0;
    int proposeeTradedOutOfJailCards = 0;
    
    int tradeCounter = 0;
    
    javax.swing.JCheckBox[] PropertyBoxes = new javax.swing.JCheckBox[28];
    javax.swing.JCheckBox[] ProposerBoxes = new javax.swing.JCheckBox[28];
    javax.swing.JCheckBox[] ProposeeBoxes = new javax.swing.JCheckBox[28];
    
    javax.swing.JLabel[] ProposerReviewCards = new javax.swing.JLabel[28];
    javax.swing.JLabel[] ProposeeReviewCards = new javax.swing.JLabel[28];
    
    Player[] tradePartners() {
        Player[] partners = new Player[players.length];
        int i = 0;
        for (Player p : players) {
            if (p.getPlaying() && activePlayer != p) {
                partners[i] = p;
                i++;
            }
        }
        return java.util.Arrays.copyOfRange(partners, 0, i);
    }
    
    String[] otherPlayerNamesArray() {
        Player[] partners = tradePartners();
        String[] playerNames = new String[partners.length];
        for (int i = 0; i < partners.length; i++) {
            playerNames[i] = partners[i].toString();
        }
        return playerNames;
    }
    
    void setGroups(Property[] pArr) {
        for (Property p : pArr) {
            p.setGroup(pArr);
            Spaces[p.getLocation()].setProp(p);
        }
    }
    
    void initSpaces() {
        
        Spaces[0] = new Space(0, 1, 740, 720);
        Spaces[1] = new Space(1, 0, 655, 720);
        Spaces[2] = new Space(2, 6, 590, 720);
        Spaces[3] = new Space(3, 0, 525, 720);
        Spaces[4] = new Space(4, 8, 460, 720);
        Spaces[5] = new Space(5, 0, 395, 720);
        Spaces[6] = new Space(6, 0, 330, 720);
        Spaces[7] = new Space(7, 5, 260, 720);
        Spaces[8] = new Space(8, 0, 195, 720);
        Spaces[9] = new Space(9, 0, 130, 720);
        Spaces[10] = new Space(10, 2, 5, 775);
        Spaces[11] = new Space(11, 0, 60, 650);
        Spaces[12] = new Space(12, 0, 60, 585);
        Spaces[13] = new Space(13, 0, 60, 520);
        Spaces[14] = new Space(14, 0, 60, 455);
        Spaces[15] = new Space(15, 0, 60, 390);
        Spaces[16] = new Space(16, 0, 60, 325);
        Spaces[17] = new Space(17, 6, 60, 260);
        Spaces[18] = new Space(18, 0, 60, 195);
        Spaces[19] = new Space(19, 0, 60, 130);
        Spaces[20] = new Space(20, 3, 40, 60);
        Spaces[21] = new Space(21, 0, 130, 50);
        Spaces[22] = new Space(22, 5, 195, 50);
        Spaces[23] = new Space(23, 0, 260, 50);
        Spaces[24] = new Space(24, 0, 325, 50);
        Spaces[25] = new Space(25, 0, 390, 50);
        Spaces[26] = new Space(26, 0, 455, 50);
        Spaces[27] = new Space(27, 0, 525, 50);
        Spaces[28] = new Space(28, 0, 590, 50);
        Spaces[29] = new Space(29, 0, 655, 50);
        Spaces[30] = new Space(30, 4, 720, 40);
        Spaces[31] = new Space(31, 0, 730, 130);
        Spaces[32] = new Space(32, 0, 730, 195);
        Spaces[33] = new Space(33, 6, 730, 260);
        Spaces[34] = new Space(34, 0, 730, 325);
        Spaces[35] = new Space(35, 0, 730, 390);
        Spaces[36] = new Space(36, 5, 730, 455);
        Spaces[37] = new Space(37, 0, 730, 520);
        Spaces[38] = new Space(38, 7, 730, 585);
        Spaces[39] = new Space(39, 0, 730, 650);
        Spaces[40] = new Space(40, -1, 40, 700);
        
    }
    
    void initProperties() {
        
        St[0] = new Street("Mediterranean Avenue", 60, 1, "St1", 2, 10, 30, 90, 160, 250, 50, 1);
        St[1] = new Street("Baltic Avenue", 60, 3, "St2", 4, 20, 60, 180, 320, 450, 50, 1);
        St[2] = new Street("Oriental Avenue", 100, 6, "St3", 6, 30, 90, 270, 400, 550, 50, 1);
        St[3] = new Street("Vermont Avenue", 100, 8, "St4", 6, 30, 90, 270, 400, 550, 50, 1);
        St[4] = new Street("Connecticut Avenue", 120, 9, "St5", 8, 40, 100, 300, 450, 600, 50, 1);
        St[5] = new Street("St. Charles Place", 140, 11, "St6", 10, 50, 150, 450, 625, 750, 100, 2);
        St[6] = new Street("States Avenue", 140, 13, "St7", 10, 50, 150, 450, 625, 750, 100, 2);
        St[7] = new Street("Virginia Avenue", 160, 14, "St8", 12, 60, 180, 500, 700, 900, 100, 2);
        St[8] = new Street("St. James Place", 180, 16, "St9", 14, 70, 200, 550, 750, 950, 100, 2);
        St[9] = new Street("Tennessee Avenue", 180, 18, "St10", 14, 70, 200, 550, 750, 950, 100, 2);
        St[10] = new Street("New York Avenue", 200, 19, "St11", 16, 80, 220, 600, 800, 1000, 100, 2);
        St[11] = new Street("Kentucky Avenue", 220, 21, "St12", 18, 90, 250, 700, 875, 1050, 150, 3);
        St[12] = new Street("Indiana Avenue", 220, 23, "St13", 18, 90, 250, 700, 875, 1050, 150, 3);
        St[13] = new Street("Illinois Avenue", 240, 24, "St14", 20, 100, 300, 750, 925, 1100, 150, 3);
        St[14] = new Street("Atlantic Avenue", 260, 26, "St15", 22, 110, 330, 800, 975, 1150, 150, 3);
        St[15] = new Street("Ventnor Avenue", 260, 27, "St16", 22, 110, 330, 800, 975, 1150, 150, 3);
        St[16] = new Street("Marvin Gardens", 280, 29, "St17", 24, 120, 360, 850, 1025, 1200, 150, 3);
        St[17] = new Street("Pacific Avenue", 300, 31, "St18", 26, 130, 390, 900, 1100, 1275, 200, 4);
        St[18] = new Street("North Carolina Avenue", 300, 32, "St19", 26, 130, 390, 900, 1100, 1275, 200, 4);
        St[19] = new Street("Pennsylvania Avenue", 320, 34, "St20", 28, 150, 450, 1000, 1200, 1400, 200, 4);
        St[20] = new Street("Park Place", 350, 37, "St21", 35, 175, 500, 1100, 1300, 1500, 200, 4);
        St[21] = new Street("Boardwalk", 400, 39, "St22", 50, 200, 600, 1400, 1700, 2000, 200, 4);
        
        RR[0] = new Railroad("Reading Railroad", 5, "RR1");
        RR[1] = new Railroad("Pennsylvania Railroad", 15, "RR2");
        RR[2] = new Railroad("B. & O. Railroad", 25, "RR3");
        RR[3] = new Railroad("Short Line", 35, "RR4");
        
        Ut[0] = new Utility("Electric Company", 12, "Ut1");
        Ut[1] = new Utility("Water Works", 28, "Ut2");
        
        Street[] Browns = { St[0], St[1] };
        Street[] LightBlues = { St[2], St[3], St[4] };
        Street[] Pinks = { St[5], St[6], St[7] };        
        Street[] Oranges = { St[8], St[9], St[10] };       
        Street[] Reds = { St[11], St[12], St[13] };        
        Street[] Yellows = { St[14], St[15], St[16] };
        Street[] Greens = { St[17], St[18], St[19] };
        Street[] Blues = { St[20], St[21] };
        
        setGroups(Browns);
        setGroups(LightBlues);
        setGroups(Pinks);
        setGroups(Oranges);
        setGroups(Reds);
        setGroups(Yellows);
        setGroups(Greens);
        setGroups(Blues);
        setGroups(RR);
        setGroups(Ut);
        
    }
    
    void initPlayers(int numPlayers) {
        players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            players[i] = new Player(i + 1);
        }
    }

    void initChanceCards() {
        Chance[0] = new ChanceCard(new String[] {"Advance to Illinois Avenue.", "If you pass GO, collect 200."}, 3, new int[] {24});
        Chance[1] = new ChanceCard(new String[] {"Bank pays you dividend of 50."}, 0, 50);
        Chance[2] = new ChanceCard(new String[] {"Make general repairs on all your property.", "For each house pay 25,",
            "for each hotel pay 100." }, 2, 25, 100);
        Chance[3] = new ChanceCard(new String[] {"Advance to St. Charles Place.", "If you pass GO, collect 200."}, 3, new int[] {11});
        Chance[4] = new ChanceCard(new String[] {"Go to jail. Go directly to jail.", "Do not pass GO. Do not collect 200."}, 5);
        Chance[5] = new ChanceCard(new String[] {"Speeding fine 15."}, 0, -15);
        Chance[6] = new ChanceCard(new String[] {"Advance to the nearest utility."}, 3, new int[] {12, 28});
        Chance[7] = new ChanceCard(new String[] {"Advance to the nearest railroad."}, 3, new int[] {5, 15, 25, 35});
        Chance[8] = new ChanceCard(new String[] {"Advance to GO. (Collect 200)"}, 3, new int[] {0});
        Chance[9] = new ChanceCard(new String[] {"Advance to the nearest railroad."}, 3, new int[] {5, 15, 25, 35});
        Chance[10] = new ChanceCard(new String[] {"Get out of jail free.", "This card may be kept until needed or traded."}, 6);
        Chance[11] = new ChanceCard(new String[] {"Advance to Boardwalk."}, 3, new int[] {39});
        Chance[12] = new ChanceCard(new String[] {"Go back three spaces."}, 4, -3);
        Chance[13] = new ChanceCard(new String[] {"You have been elected chairman of the board.", "Pay each player 50."}, 1, -50);
        Chance[14] = new ChanceCard(new String[] {"Take a trip on the Reading Railroad.", "If you pass GO, collect 200."}, 3, new int[] {5});
        Chance[15] = new ChanceCard(new String[] {"Your building loan matures. Collect 150."}, 0, 150);
        
        CommChest[0] = new ChanceCard(new String[] {"Bank error in your favour. Collect 200."}, 0, 200);
        CommChest[1] = new ChanceCard(new String[] {"It is your birthday.", "Collect 10 from every player."}, 1, 10);
        CommChest[2] = new ChanceCard(new String[] {"You are assessed for street repairs.", "Pay 40 per house and",
            "115 per hotel you own."}, 2, 40,  115);
        CommChest[3] = new ChanceCard(new String[] {"Income tax refund. Collect 20."}, 0, 20);
        CommChest[4] = new ChanceCard(new String[] {"Go to jail. Go directly to jail.", "Do not pass GO. Do not collect 200."}, 5);
        CommChest[5] = new ChanceCard(new String[] {"Advance to GO. (Collect 200)"}, 3, new int[] {0});
        CommChest[6] = new ChanceCard(new String[] {"Holiday fund matures. Receive 100."}, 0, 100);
        CommChest[7] = new ChanceCard(new String[] {"Doctor's fees. Pay 50."}, 0, -50);
        CommChest[8] = new ChanceCard(new String[] {"Hospital fees. Pay 100."}, 0, -100);
        CommChest[9] = new ChanceCard(new String[] {"You have won second prize in a", "beauty contest. Collect 10."}, 0, 10);
        CommChest[10] = new ChanceCard(new String[] {"Life insurance matures. Collect 100."}, 0, 100);
        CommChest[11] = new ChanceCard(new String[] {"You inherit 100."}, 0, 100);
        CommChest[12] = new ChanceCard(new String[] {"School fees. Pay 50."}, 0, -50);
        CommChest[13] = new ChanceCard(new String[] {"Get out of jail free.", "This card may be kept until needed or traded."}, 6);
        CommChest[14] = new ChanceCard(new String[] {"From sale of stock you get 50."}, 0, 50);
        CommChest[15] = new ChanceCard(new String[] {"Receive 25 consultancy fee."}, 0, 25);
    }
    
    void initImages() {
        for (int i = 0; i < 6; i++) {
            RedDices[i] = new ImageIcon(getClass().getResource("/diceimages/R" + String.valueOf(i + 1) + ".png"));
            YellowDices[i] = new ImageIcon(getClass().getResource("/diceimages/Y" + String.valueOf(i + 1) + ".png"));
            Houses[i] = new ImageIcon(getClass().getResource("/houseimages/" + String.valueOf(i) + "House.png"));
            BoardBottomHouses[i] = new ImageIcon(getClass().getResource("/houseimages/BoardBottom" + String.valueOf(i) + "House.png"));
            BoardLeftHouses[i] = new ImageIcon(getClass().getResource("/houseimages/BoardLeft" + String.valueOf(i) + "House.png"));
            BoardRightHouses[i] = new ImageIcon(getClass().getResource("/houseimages/BoardRight" + String.valueOf(i) + "House.png"));
            BoardTopHouses[i] = new ImageIcon(getClass().getResource("/houseimages/BoardTop" + String.valueOf(i) + "House.png"));
        }

        BlankPropCard = new ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"));
        GOImage = new ImageIcon(getClass().getResource("/images/GO.gif"));
        FreeParkingImage = new ImageIcon(getClass().getResource("/images/FreeParking.png"));
        JustVisitingImage = new ImageIcon(getClass().getResource("/images/Visiting.png"));
        ChanceBackground = new ImageIcon(getClass().getResource("/images/Chance.png"));
        CommunityChestBackground = new ImageIcon(getClass().getResource("/images/CommunityChest.png"));
        LuxuryTaxImage = new ImageIcon(getClass().getResource("/images/LuxuryTax.png"));
        IncomeTaxImage = new ImageIcon(getClass().getResource("/images/IncomeTax.png"));
        
    }

    void beginGame(int numPlayers) {
        initSpaces();
        initProperties();
        initPlayers(numPlayers);
        initChanceCards();
        initImages();
        playerMoved = false;
        activePlayer = players[0];
    }
    
    void clearHouseLabels() {
        for (Street s : St) {
            switch (s.getHouseOrientation()) {
                case 1:
                    BoardHouses = BoardBottomHouses;
                    break;
                case 2:
                    BoardHouses = BoardLeftHouses;
                    break;
                case 3:
                    BoardHouses = BoardTopHouses;
                    break;
                case 4:
                    BoardHouses = BoardRightHouses;
                    break;
            }
            s.getBoardHousesLabel().setIcon(BoardHouses[0]);      
        }
    }
    
    String playerLabelText() {
        return "Player " + String.valueOf(activePlayer.getNumber());
    }
    
    ChanceCard RandomChanceCard() {
        return Chance[(int)(Math.random() * Chance.length)];
    }
    
    ChanceCard RandomCommChestCard() {
        return CommChest[(int)(Math.random() * CommChest.length)];
    }
    
    Point tokenLocation(Player p) {
        int dX, dY;
        if (p.getLocation() != 10) {
            switch (Spaces[p.getLocation()].numOccupants(players)) {
            
                case 1:
                    dX = 0;
                    dY = 0;
                    break;
                
                case 2:
                    dX = 0;
                    dY = 20;
                    break;
                
                case 3:
                    dX = 0;
                    dY = 40;
                    break;
            
                case 4:
                    dX = -20;
                    dY = 0;
                    break;
            
                case 5:
                    dX = -20;
                    dY = 20;
                    break;
            
                case 6:
                    dX = -20;
                    dY = 40;
                    break;
            
                case 7:
                    dX = 20;
                    dY = 10;
                    break;
            
                case 8:
                    dX = 20;
                    dY = 30;
                    break;
            
                default:
                    dX = 500;
                    dY = 500;
                    break;
            }
        } else {
            switch (Spaces[p.getLocation()].numOccupants(players)) {
            
                case 1:
                    dX = 0;
                    dY = 0;
                    break;
                
                case 2:
                    dX = 0;
                    dY = -20;
                    break;
                    
                case 3:
                    dX = 20;
                    dY = 0;
                    break;
                    
                case 4:
                    dX = 0;
                    dY = -40;
                    break;
                    
                case 5:
                    dX = 40;
                    dY = 0;
                    break;
                    
                case 6:
                    dX = 0;
                    dY = -60;
                    break;
                    
                case 7:
                    dX = 60;
                    dY = 0;
                    break;
                    
                case 8:
                    dX = 0;
                    dY = -80;
                    break;
                    
                default:
                    dX = 500;
                    dY = 500;
                    break;
            }
        }
        
        Point pnt = new Point(Spaces[p.getLocation()].getCoords());
        
        if (p.getLocation() < 10) {
            pnt.translate(dX, dY);
        } else if (p.getLocation() < 20) {
            pnt.translate(-dY, -dX);
        } else if (p.getLocation() < 30) {
            pnt.translate(dX, -dY);
        } else {
            pnt.translate(dY, -dX);
        }
        
        
        return pnt;
    }
    
    Space activeSpace() {
        return Spaces[activePlayer.getLocation()];
    }
    
    void nextPlayer() {
        do {
            activePlayer = players[activePlayer.getNumber() % players.length];
        } while (!activePlayer.getPlaying());
    }
    
    int RollDice() {
        return (int)(Math.random() * 6 + 1);
    }
    
    boolean validateBid(Player bidder) {
        
        int bidValue;
        
        try {
            bidValue = Integer.parseInt(bidder.getBidPriceField().getText());
        } catch (NumberFormatException e) {
            return false;
        }
        
        if (bidValue <= bidder.getMoney() && bidValue > bidPrice) {
            bidPrice = bidValue;
            highestBidder = bidder;
            bidder.getBidPriceField().setText("");
            bidder.getBidPriceField().setForeground(Color.black);
            return true;
        } else {
            return false;
        }
    }
    
    boolean isPlayerHere(int i) {
        if (players.length < i) {
            return false;
        } else {
            return (players[i - 1].getPlaying());
        }
    }
    
    boolean isPlayerBidding(int i) {
        if (!isPlayerHere(i)) {
            return false;
        } else {
            return (!players[i - 1].getPassed());
        }
    }
    
    void startAuction() {
        for (Player p : players) {
            if (p.getPlaying()) {
                p.beginAuction();  
            }
        }
        bidPrice = -1;
        highestBidder = players[0];
    }
    
    public void newHighBidder() {
        for (Player p : players) {
            if (!p.getPassed() && p.getPlaying()) {
                p.getPassButton().setEnabled(true);
                p.getAuctionLabel().setForeground(Color.white);
            }
        }
        
        highestBidder.getPassButton().setEnabled(false);
        highestBidder.getAuctionLabel().setForeground(Color.yellow);
        
    }
    
    boolean auctionWon() {      
        int biddingCounter = 0;
        for (int i = 1; i <= players.length; i++) {
            if (isPlayerBidding(i)) {
                biddingCounter++;
            }
        }
        
        return (biddingCounter == 1);
    }
    
    void buyProperty(Player p, Property prop, int cost) {
        p.changeMoney(-cost);
        prop.setOwner(p);
    }
    
    Player rentOwedPlayer() {
        return activeSpace().getProp().getOwner();
    }
    
    int rent() {
        return activeSpace().getProp().getRent();
    }
    
    int numHousesBought() {
        if (futureHouses <= 4 * fullSetUsed.length) {
            return futureHouses - fullStreetSet[0].groupHouses();
        } else {
            return java.lang.Math.max((4 * fullSetUsed.length) - fullStreetSet[0].groupHouses(), 0);
        }
    }
    
    int numHotelsBought() {      
        if (futureHouses <= 4 * fullSetUsed.length) {
            return 0;
        } else {
            return futureHouses - java.lang.Math.max((4 * fullSetUsed.length), fullStreetSet[0].groupHouses());
        }
    }    
    
    void setHouseBuyButtonsActive() {
        for (Street s : St) {
            if (s.fullSet()
                    && s.getOwner() == activePlayer
                    && s.groupUnmortgaged()
                    && s.groupHouses() < 5 * s.getGroup().length) {
                
                s.getGroupButton().setEnabled(true);
                s.getGroupButton().setForeground(Color.black);
            } else {
                s.getGroupButton().setEnabled(false);
                s.getGroupButton().setForeground(Color.gray);
            }
        }
    }
    
    void setHouseSellButtonsActive() {
        for (Street s : St) {
            if (s.fullSet()
                    && s.getOwner() == activePlayer
                    && s.groupHouses() > 0) {
                
                s.getGroupButton().setEnabled(true);
                s.getGroupButton().setForeground(Color.black);
            } else {
                s.getGroupButton().setEnabled(false);
                s.getGroupButton().setForeground(Color.gray);
            }
        }
    }
    
    int numProperties(Player p) {
        int i = 0;
        for (Property prop : St) {
            if (prop.getOwner() == p) {
                i++;
            }
        }
        for (Property prop : RR) {
            if (prop.getOwner() == p) {
                i++;
            }
        }
        for (Property prop : Ut) {
            if (prop.getOwner() == p) {
                i++;
            }
        }
        return i;
    }
    
    int setupMortgageMenu(boolean onUnmortgage) {
        int i = 0;
        int factor1, factor2;
        
        if (onUnmortgage) {
            factor1 = 11;
            factor2 = 20;
        } else {
            factor1 = 1;
            factor2 = 2;
        }
        
        for (Street s : St) {
            if (s.isMortgaged() == onUnmortgage && s.groupHouses() == 0 && s.getOwner() == activePlayer) {
                PropertyBoxes[i].setText(s.getName() + " (" + String.valueOf(s.getCost() * factor1 / factor2) + ")");
                PropertyBoxes[i].setVisible(true);
                MortgageMenuProps[i] = s;
                i++;
            }
        }
        for (Property r : RR) {
            if (r.isMortgaged() == onUnmortgage && r.getOwner() == activePlayer) {
                PropertyBoxes[i].setText(r.getName() + " (" + String.valueOf(r.getCost() * factor1 / factor2) + ")");
                PropertyBoxes[i].setVisible(true);
                MortgageMenuProps[i] = r;
                i++;
            }
        }
        for (Property u : Ut) {
            if (u.isMortgaged() == onUnmortgage && u.getOwner() == activePlayer) {
                PropertyBoxes[i].setText(u.getName() + " (" + String.valueOf(u.getCost() * factor1 / factor2) + ")");
                PropertyBoxes[i].setVisible(true);
                MortgageMenuProps[i] = u;
                i++;
            }
        }
        for (int a = i; a < PropertyBoxes.length; a++) {
            PropertyBoxes[a].setVisible(false);
            MortgageMenuProps[i] = null;
        }
        return i;
    }

    int mortgageValue(boolean onUnmortgage) {
        int value = 0;
        if (onUnmortgage) {
            for (int i = 0; i < MortgageMenuProps.length; i++) {
                if (MortgageMenuProps[i] == null) {
                    break;
                }
                if (PropertyBoxes[i].isSelected()) {
                    value += MortgageMenuProps[i].getCost() * 11 / 20;
                }
            }
        } else {
            for (int i = 0; i < MortgageMenuProps.length; i++) {
                if (MortgageMenuProps[i] == null) {
                    break;
                }
                if (PropertyBoxes[i].isSelected()) {
                    value += MortgageMenuProps[i].getCost() / 2;
                }
            }
        }
        return value;
    }
    
    void mortgageProperties(boolean b) {
        for (int i = 0; i < MortgageMenuProps.length; i++) {
            if (MortgageMenuProps[i] == null) {
                break;
            }
            if (PropertyBoxes[i].isSelected()) {
                MortgageMenuProps[i].setMortgaged(!b);
            }
        }
    }
    
    int setupProposerList() {
        int i = 0;
        
        for (Street s : St) {
            if (s.groupHouses() == 0 && s.getOwner() == activePlayer) {
                if (s.isMortgaged()) {
                    ProposerBoxes[i].setText(s.getName() + " (M)");
                } else {
                    ProposerBoxes[i].setText(s.getName());
                }
                ProposerBoxes[i].setVisible(true);
                ProposerProps[i] = s;
                i++;
            }
        }
        for (Property r : RR) {
            if (r.getOwner() == activePlayer) {
                if (r.isMortgaged()) {
                    ProposerBoxes[i].setText(r.getName() + " (M)");
                } else {
                    ProposerBoxes[i].setText(r.getName());
                }
                ProposerBoxes[i].setVisible(true);
                ProposerProps[i] = r;
                i++;
            }
        }
        for (Property u : Ut) {
            if (u.getOwner() == activePlayer) {
                if (u.isMortgaged()) {
                    ProposerBoxes[i].setText(u.getName() + " (M)");
                } else {
                    ProposerBoxes[i].setText(u.getName());
                }
                ProposerBoxes[i].setVisible(true);
                ProposerProps[i] = u;
                i++;
            }
        }
        for (int a = i; a < ProposerBoxes.length; a++) {
            ProposerBoxes[a].setVisible(false);
            ProposerProps[a] = null;
        }
        return i;
    }
    
    int setupProposeeList() {
        int i = 0;
        
        for (Street s : St) {
            if (s.groupHouses() == 0 && s.getOwner() == tradeProposee) {
                if (s.isMortgaged()) {
                    ProposeeBoxes[i].setText(s.getName() + " (M)");
                } else {
                    ProposeeBoxes[i].setText(s.getName());
                }
                ProposeeBoxes[i].setVisible(true);
                ProposeeProps[i] = s;
                i++;
            }
        }
        for (Property r : RR) {
            if (r.getOwner() == tradeProposee) {
                if (r.isMortgaged()) {
                    ProposeeBoxes[i].setText(r.getName() + " (M)");
                } else {
                    ProposeeBoxes[i].setText(r.getName());
                }
                ProposeeBoxes[i].setVisible(true);
                ProposeeProps[i] = r;
                i++;
            }
        }
        for (Property u : Ut) {
            if (u.getOwner() == tradeProposee) {
                if (u.isMortgaged()) {
                    ProposeeBoxes[i].setText(u.getName() + " (M)");
                } else {
                    ProposeeBoxes[i].setText(u.getName());
                }
                ProposeeBoxes[i].setVisible(true);
                ProposeeProps[i] = u;
                i++;
            }
        }
        for (int a = i; a < ProposeeBoxes.length; a++) {
            ProposeeBoxes[a].setVisible(false);
            ProposeeProps[a] = null;
        }
        return i;
    }
    
    boolean proposeTrade(JTextField Proposer_MoneyField, JTextField Proposer_OutOfJailField,
            JTextField Proposee_MoneyField, JTextField Proposee_OutOfJailField) {
        
        try {
            proposerTradedMoney = Integer.parseInt(Proposer_MoneyField.getText());
            proposerTradedOutOfJailCards = Integer.parseInt(Proposer_OutOfJailField.getText());
            proposeeTradedMoney = Integer.parseInt(Proposee_MoneyField.getText());
            proposeeTradedOutOfJailCards = Integer.parseInt(Proposee_OutOfJailField.getText());
            if (proposerTradedMoney > activePlayer.getMoney() || proposerTradedMoney < 0
                    || proposerTradedOutOfJailCards > activePlayer.getJailFreeCards() || proposerTradedOutOfJailCards < 0
                    || proposeeTradedMoney > tradeProposee.getMoney() || proposeeTradedMoney < 0
                    || proposeeTradedOutOfJailCards > tradeProposee.getJailFreeCards() || proposeeTradedOutOfJailCards < 0) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        
        int index = 0;
        for (int i = 0; i < ProposerProps.length; i++) {
            if (ProposerProps[i] == null) {
                break;
            }
            if (ProposerBoxes[i].isSelected()) {
                ProposerTradedProps[index] = ProposerProps[i];
                index++;
            }
        }
        for (int i = index; i < ProposerTradedProps.length; i++) {
            ProposerTradedProps[i] = null;
        }
        index = 0;
        for (int i = 0; i < ProposeeProps.length; i++) {
            if (ProposeeProps[i] == null) {
                break;
            }
            if (ProposeeBoxes[i].isSelected()) {
                ProposeeTradedProps[index] = ProposeeProps[i];
                index++;
            }
        }
        for (int i = index; i < ProposeeTradedProps.length; i++) {
            ProposeeTradedProps[i] = null;
        }
        return true;
    }
    
    void cancelTrade() {
        tradeCounter = 0;
        proposerTradedMoney = 0;
        proposeeTradedMoney = 0;
        proposerTradedOutOfJailCards = 0;
        proposeeTradedOutOfJailCards = 0;
        for (int i = 0; i < ProposerTradedProps.length; i++) {
            ProposerTradedProps[i] = null;
            ProposeeTradedProps[i] = null;
            ProposerBoxes[i].setSelected(false);
            ProposeeBoxes[i].setSelected(false);
        }
    }
    
    int setupProposerReviewCards() {
        int i = 0;
        for (Property p : ProposeeTradedProps) {
            if (p == null) { break; }
            ProposerReviewCards[i].setIcon(p.getCardSmall());
            ProposerReviewCards[i].setVisible(true);
            i++;
        }
        for (int a = i; a < ProposerReviewCards.length; a++) {
            ProposerReviewCards[a].setVisible(false);
        }
        return i;
    }
    
    int setupProposeeReviewCards() {
        int i = 0;
        for (Property p : ProposerTradedProps) {
            if (p == null) { break; }
            ProposeeReviewCards[i].setIcon(p.getCardSmall());
            ProposeeReviewCards[i].setVisible(true);
            i++;
        }
        for (int a = i; a < ProposerTradedProps.length; a++) {
            ProposeeReviewCards[a].setVisible(false);
        }
        return i;
    }
    
    void trade() {
        for (Property p : ProposerTradedProps) {
            if (p == null) { break; }
            p.setOwner(tradeProposee);
        }
        for (Property p : ProposeeTradedProps) {
            if (p == null) { break; }
            p.setOwner(activePlayer);
        }
        activePlayer.pay(tradeProposee, proposerTradedMoney - proposeeTradedMoney);
        activePlayer.changeJailFreeCards(proposeeTradedOutOfJailCards - proposerTradedOutOfJailCards);
        tradeProposee.changeJailFreeCards(proposerTradedOutOfJailCards - proposeeTradedOutOfJailCards);
    }
    
    void bankrupt() {
        if (owedPlayer != null) {
            activePlayer.pay(owedPlayer, activePlayer.getMoney());
            owedPlayer.changeJailFreeCards(activePlayer.getJailFreeCards());
        }
        for (Property p : St) {
            if (p.getOwner() == activePlayer) {
                p.setOwner(owedPlayer);
            }
        }
        for (Property p : RR) {
            if (p.getOwner() == activePlayer) {
                p.setOwner(owedPlayer);
            }
        }
        for (Property p : Ut) {
            if (p.getOwner() == activePlayer) {
                p.setOwner(owedPlayer);
            }
        }
        activePlayer.getToken().setVisible(false);
        activePlayer.bankrupt();
    }
    
    Player winner() {
        boolean win = false;
        int winner = 0;
        for (int i = 1; i <= 8; i++) {
            if (isPlayerHere(i)) {
                if (win) {
                    return null;
                } else {
                    win = true;
                    winner = i;
                }
            }
        }
        if (winner == 0) {
            return null;
        } else {
            return players[winner - 1];
        }
    }
    
}
