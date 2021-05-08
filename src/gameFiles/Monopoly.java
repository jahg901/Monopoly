package gameFiles;

import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class Monopoly extends JFrame {
	
	GameLogic game = new GameLogic();
    static int RedDiceResult = 0;
    static int YellowDiceResult = 0;
    int numDoubles = 0;
    int cost = 0;
    int playerMoney = 0;
    
    public void syncAllProperties() {
        game.St[0].syncScreenElements(ViewAssets_St0Card, ViewAssets_St0RentLabel, ViewAssets_St0HousesLabel, Houses_BrownButton, GameBoard_St0Houses);
        game.St[1].syncScreenElements(ViewAssets_St1Card, ViewAssets_St1RentLabel, ViewAssets_St1HousesLabel, Houses_BrownButton, GameBoard_St1Houses);
        game.St[2].syncScreenElements(ViewAssets_St2Card, ViewAssets_St2RentLabel, ViewAssets_St2HousesLabel, Houses_LightBlueButton, GameBoard_St2Houses);
        game.St[3].syncScreenElements(ViewAssets_St3Card, ViewAssets_St3RentLabel, ViewAssets_St3HousesLabel, Houses_LightBlueButton, GameBoard_St3Houses);
        game.St[4].syncScreenElements(ViewAssets_St4Card, ViewAssets_St4RentLabel, ViewAssets_St4HousesLabel, Houses_LightBlueButton, GameBoard_St4Houses);
        game.St[5].syncScreenElements(ViewAssets_St5Card, ViewAssets_St5RentLabel, ViewAssets_St5HousesLabel, Houses_PinkButton, GameBoard_St5Houses);
        game.St[6].syncScreenElements(ViewAssets_St6Card, ViewAssets_St6RentLabel, ViewAssets_St6HousesLabel, Houses_PinkButton, GameBoard_St6Houses);
        game.St[7].syncScreenElements(ViewAssets_St7Card, ViewAssets_St7RentLabel, ViewAssets_St7HousesLabel, Houses_PinkButton, GameBoard_St7Houses);
        game.St[8].syncScreenElements(ViewAssets_St8Card, ViewAssets_St8RentLabel, ViewAssets_St8HousesLabel, Houses_OrangeButton, GameBoard_St8Houses);
        game.St[9].syncScreenElements(ViewAssets_St9Card, ViewAssets_St9RentLabel, ViewAssets_St9HousesLabel, Houses_OrangeButton, GameBoard_St9Houses);
        game.St[10].syncScreenElements(ViewAssets_St10Card, ViewAssets_St10RentLabel, ViewAssets_St10HousesLabel, Houses_OrangeButton, GameBoard_St10Houses);
        game.St[11].syncScreenElements(ViewAssets_St11Card, ViewAssets_St11RentLabel, ViewAssets_St11HousesLabel, Houses_RedButton, GameBoard_St11Houses);
        game.St[12].syncScreenElements(ViewAssets_St12Card, ViewAssets_St12RentLabel, ViewAssets_St12HousesLabel, Houses_RedButton, GameBoard_St12Houses);
        game.St[13].syncScreenElements(ViewAssets_St13Card, ViewAssets_St13RentLabel, ViewAssets_St13HousesLabel, Houses_RedButton, GameBoard_St13Houses);
        game.St[14].syncScreenElements(ViewAssets_St14Card, ViewAssets_St14RentLabel, ViewAssets_St14HousesLabel, Houses_YellowButton, GameBoard_St14Houses);
        game.St[15].syncScreenElements(ViewAssets_St15Card, ViewAssets_St15RentLabel, ViewAssets_St15HousesLabel, Houses_YellowButton, GameBoard_St15Houses);
        game.St[16].syncScreenElements(ViewAssets_St16Card, ViewAssets_St16RentLabel, ViewAssets_St16HousesLabel, Houses_YellowButton, GameBoard_St16Houses);
        game.St[17].syncScreenElements(ViewAssets_St17Card, ViewAssets_St17RentLabel, ViewAssets_St17HousesLabel, Houses_GreenButton, GameBoard_St17Houses);
        game.St[18].syncScreenElements(ViewAssets_St18Card, ViewAssets_St18RentLabel, ViewAssets_St18HousesLabel, Houses_GreenButton, GameBoard_St18Houses);
        game.St[19].syncScreenElements(ViewAssets_St19Card, ViewAssets_St19RentLabel, ViewAssets_St19HousesLabel, Houses_GreenButton, GameBoard_St19Houses);
        game.St[20].syncScreenElements(ViewAssets_St20Card, ViewAssets_St20RentLabel, ViewAssets_St20HousesLabel, Houses_BlueButton, GameBoard_St20Houses);
        game.St[21].syncScreenElements(ViewAssets_St21Card, ViewAssets_St21RentLabel, ViewAssets_St21HousesLabel, Houses_BlueButton, GameBoard_St21Houses);
        
        game.RR[0].syncScreenElements(ViewAssets_RR0Card, ViewAssets_RR0RentLabel, null);
        game.RR[1].syncScreenElements(ViewAssets_RR1Card, ViewAssets_RR1RentLabel, null);
        game.RR[2].syncScreenElements(ViewAssets_RR2Card, ViewAssets_RR2RentLabel, null);
        game.RR[3].syncScreenElements(ViewAssets_RR3Card, ViewAssets_RR3RentLabel, null);
        
        game.Ut[0].syncScreenElements(ViewAssets_Ut0Card, null, null);
        game.Ut[1].syncScreenElements(ViewAssets_Ut1Card, null, null);
    }
    
    public void syncAllPlayerComponents() {       
        switch (game.players.length) {   
            case 8:
                game.players[7].setComponents(TokenP8, Property_P8AuctionLabel, Property_P8BidPrice,
                        Property_P8BidButton, Property_P8PassButton);
            case 7:
                game.players[6].setComponents(TokenP7, Property_P7AuctionLabel, Property_P7BidPrice,
                        Property_P7BidButton, Property_P7PassButton);                
            case 6:
                game.players[5].setComponents(TokenP6, Property_P6AuctionLabel, Property_P6BidPrice,
                        Property_P6BidButton, Property_P6PassButton);               
            case 5:
                game.players[4].setComponents(TokenP5, Property_P5AuctionLabel, Property_P5BidPrice,
                        Property_P5BidButton, Property_P5PassButton);               
            case 4:
                game.players[3].setComponents(TokenP4, Property_P4AuctionLabel, Property_P4BidPrice,
                        Property_P4BidButton, Property_P4PassButton);                
            case 3:
                game.players[2].setComponents(TokenP3, Property_P3AuctionLabel, Property_P3BidPrice,
                        Property_P3BidButton, Property_P3PassButton);               
            case 2:
                game.players[0].setComponents(TokenP1, Property_P1AuctionLabel, Property_P1BidPrice,
                        Property_P1BidButton, Property_P1PassButton);
                game.players[1].setComponents(TokenP2, Property_P2AuctionLabel, Property_P2BidPrice,
                        Property_P2BidButton, Property_P2PassButton);                
            default:
                break;
        }
    }    
    
    public void showViewAssets() {
        ViewAssets_TitleLabel.setText("Player " + String.valueOf(game.assetsPlayer.getNumber()) + " Assets");
        ViewAssets_OOJLabel.setText(String.valueOf(game.assetsPlayer.getJailFreeCards()));
        ViewAssets_MoneyLabel.setText(String.valueOf(game.assetsPlayer.getMoney()));
        
        for (Street s : game.St) {
            if (s.getOwner() == game.assetsPlayer) {
                s.getCard().setIcon(s.getCardSmall());
                if (s.isMortgaged()) {
                    s.getRentLabel().setText("Mortgaged");
                } else {
                    s.getRentLabel().setText("Rent: " + String.valueOf(s.getRent()));
                }
                s.getHousesLabel().setIcon(game.Houses[s.getHouses()]);
                s.getRentLabel().setVisible(true);
                s.getHousesLabel().setVisible(true);
            } else {
                s.getCard().setIcon(game.BlankPropCard);
                s.getRentLabel().setVisible(false);
                s.getHousesLabel().setVisible(false);
            }
        }
        
        for (Railroad r : game.RR) {
            if (r.getOwner() == game.assetsPlayer) {
                r.getCard().setIcon(r.getCardSmall());
                if (r.isMortgaged()) {
                    r.getRentLabel().setText("Mortgaged");
                } else {
                    r.getRentLabel().setText("Rent: " + String.valueOf(r.getRent()));
                }
                r.getRentLabel().setVisible(true);
                
            } else {
                r.getCard().setIcon(game.BlankPropCard);
                r.getRentLabel().setVisible(false);
            }
        }
        
        for (Utility u : game.Ut) {
            if (u.getOwner() == game.assetsPlayer) {
                u.getCard().setIcon(u.getCardSmall());
                
            } else {
                u.getCard().setIcon(game.BlankPropCard);
            }
        }
        
        ViewAssets_PageChangerButton.setSelected(false);
        CardLayout card = (CardLayout)ViewAssets_CardRegion.getLayout();
        card.show(ViewAssets_CardRegion, "Pg1");
        ViewAssets_PageChangerButton.setText("Next Page");
        ViewAssetsWindow.setVisible(true);
    }
    
    public void initMortgageCheckBoxes() {
        game.PropertyBoxes[0] = Mortgage_CheckBox0;
        game.PropertyBoxes[1] = Mortgage_CheckBox1;
        game.PropertyBoxes[2] = Mortgage_CheckBox2;
        game.PropertyBoxes[3] = Mortgage_CheckBox3;
        game.PropertyBoxes[4] = Mortgage_CheckBox4;
        game.PropertyBoxes[5] = Mortgage_CheckBox5;
        game.PropertyBoxes[6] = Mortgage_CheckBox6;
        game.PropertyBoxes[7] = Mortgage_CheckBox7;
        game.PropertyBoxes[8] = Mortgage_CheckBox8;
        game.PropertyBoxes[9] = Mortgage_CheckBox9;
        game.PropertyBoxes[10] = Mortgage_CheckBox10;
        game.PropertyBoxes[11] = Mortgage_CheckBox11;
        game.PropertyBoxes[12] = Mortgage_CheckBox12;
        game.PropertyBoxes[13] = Mortgage_CheckBox13;
        game.PropertyBoxes[14] = Mortgage_CheckBox14;
        game.PropertyBoxes[15] = Mortgage_CheckBox15;
        game.PropertyBoxes[16] = Mortgage_CheckBox16;
        game.PropertyBoxes[17] = Mortgage_CheckBox17;
        game.PropertyBoxes[18] = Mortgage_CheckBox18;
        game.PropertyBoxes[19] = Mortgage_CheckBox19;
        game.PropertyBoxes[20] = Mortgage_CheckBox20;
        game.PropertyBoxes[21] = Mortgage_CheckBox21;
        game.PropertyBoxes[22] = Mortgage_CheckBox22;
        game.PropertyBoxes[23] = Mortgage_CheckBox23;
        game.PropertyBoxes[24] = Mortgage_CheckBox24;
        game.PropertyBoxes[25] = Mortgage_CheckBox25;
        game.PropertyBoxes[26] = Mortgage_CheckBox26;
        game.PropertyBoxes[27] = Mortgage_CheckBox27;
    }
    
    public void initCheckBoxes() {
        game.ProposerBoxes[0] = Proposer_CheckBox0;
        game.ProposerBoxes[1] = Proposer_CheckBox1;
        game.ProposerBoxes[2] = Proposer_CheckBox2;
        game.ProposerBoxes[3] = Proposer_CheckBox3;
        game.ProposerBoxes[4] = Proposer_CheckBox4;
        game.ProposerBoxes[5] = Proposer_CheckBox5;
        game.ProposerBoxes[6] = Proposer_CheckBox6;
        game.ProposerBoxes[7] = Proposer_CheckBox7;
        game.ProposerBoxes[8] = Proposer_CheckBox8;
        game.ProposerBoxes[9] = Proposer_CheckBox9;
        game.ProposerBoxes[10] = Proposer_CheckBox10;
        game.ProposerBoxes[11] = Proposer_CheckBox11;
        game.ProposerBoxes[12] = Proposer_CheckBox12;
        game.ProposerBoxes[13] = Proposer_CheckBox13;
        game.ProposerBoxes[14] = Proposer_CheckBox14;
        game.ProposerBoxes[15] = Proposer_CheckBox15;
        game.ProposerBoxes[16] = Proposer_CheckBox16;
        game.ProposerBoxes[17] = Proposer_CheckBox17;
        game.ProposerBoxes[18] = Proposer_CheckBox18;
        game.ProposerBoxes[19] = Proposer_CheckBox19;
        game.ProposerBoxes[20] = Proposer_CheckBox20;
        game.ProposerBoxes[21] = Proposer_CheckBox21;
        game.ProposerBoxes[22] = Proposer_CheckBox22;
        game.ProposerBoxes[23] = Proposer_CheckBox23;
        game.ProposerBoxes[24] = Proposer_CheckBox24;
        game.ProposerBoxes[25] = Proposer_CheckBox25;
        game.ProposerBoxes[26] = Proposer_CheckBox26;
        game.ProposerBoxes[27] = Proposer_CheckBox27;
        
        game.ProposeeBoxes[0] = Proposee_CheckBox0;
        game.ProposeeBoxes[1] = Proposee_CheckBox1;
        game.ProposeeBoxes[2] = Proposee_CheckBox2;
        game.ProposeeBoxes[3] = Proposee_CheckBox3;
        game.ProposeeBoxes[4] = Proposee_CheckBox4;
        game.ProposeeBoxes[5] = Proposee_CheckBox5;
        game.ProposeeBoxes[6] = Proposee_CheckBox6;
        game.ProposeeBoxes[7] = Proposee_CheckBox7;
        game.ProposeeBoxes[8] = Proposee_CheckBox8;
        game.ProposeeBoxes[9] = Proposee_CheckBox9;
        game.ProposeeBoxes[10] = Proposee_CheckBox10;
        game.ProposeeBoxes[11] = Proposee_CheckBox11;
        game.ProposeeBoxes[12] = Proposee_CheckBox12;
        game.ProposeeBoxes[13] = Proposee_CheckBox13;
        game.ProposeeBoxes[14] = Proposee_CheckBox14;
        game.ProposeeBoxes[15] = Proposee_CheckBox15;
        game.ProposeeBoxes[16] = Proposee_CheckBox16;
        game.ProposeeBoxes[17] = Proposee_CheckBox17;
        game.ProposeeBoxes[18] = Proposee_CheckBox18;
        game.ProposeeBoxes[19] = Proposee_CheckBox19;
        game.ProposeeBoxes[20] = Proposee_CheckBox20;
        game.ProposeeBoxes[21] = Proposee_CheckBox21;
        game.ProposeeBoxes[22] = Proposee_CheckBox22;
        game.ProposeeBoxes[23] = Proposee_CheckBox23;
        game.ProposeeBoxes[24] = Proposee_CheckBox24;
        game.ProposeeBoxes[25] = Proposee_CheckBox25;
        game.ProposeeBoxes[26] = Proposee_CheckBox26;
        game.ProposeeBoxes[27] = Proposee_CheckBox27;
    }
    
    public void initReviewCards() {
        game.ProposerReviewCards[0] = Review_ProposerPropIcon0;
        game.ProposerReviewCards[1] = Review_ProposerPropIcon1;
        game.ProposerReviewCards[2] = Review_ProposerPropIcon2;
        game.ProposerReviewCards[3] = Review_ProposerPropIcon3;
        game.ProposerReviewCards[4] = Review_ProposerPropIcon4;
        game.ProposerReviewCards[5] = Review_ProposerPropIcon5;
        game.ProposerReviewCards[6] = Review_ProposerPropIcon6;
        game.ProposerReviewCards[7] = Review_ProposerPropIcon7;
        game.ProposerReviewCards[8] = Review_ProposerPropIcon8;
        game.ProposerReviewCards[9] = Review_ProposerPropIcon9;
        game.ProposerReviewCards[10] = Review_ProposerPropIcon10;
        game.ProposerReviewCards[11] = Review_ProposerPropIcon11;
        game.ProposerReviewCards[12] = Review_ProposerPropIcon12;
        game.ProposerReviewCards[13] = Review_ProposerPropIcon13;
        game.ProposerReviewCards[14] = Review_ProposerPropIcon14;
        game.ProposerReviewCards[15] = Review_ProposerPropIcon15;
        game.ProposerReviewCards[16] = Review_ProposerPropIcon16;
        game.ProposerReviewCards[17] = Review_ProposerPropIcon17;
        game.ProposerReviewCards[18] = Review_ProposerPropIcon18;
        game.ProposerReviewCards[19] = Review_ProposerPropIcon19;
        game.ProposerReviewCards[20] = Review_ProposerPropIcon20;
        game.ProposerReviewCards[21] = Review_ProposerPropIcon21;
        game.ProposerReviewCards[22] = Review_ProposerPropIcon22;
        game.ProposerReviewCards[23] = Review_ProposerPropIcon23;
        game.ProposerReviewCards[24] = Review_ProposerPropIcon24;
        game.ProposerReviewCards[25] = Review_ProposerPropIcon25;
        game.ProposerReviewCards[26] = Review_ProposerPropIcon26;
        game.ProposerReviewCards[27] = Review_ProposerPropIcon27;
        
        game.ProposeeReviewCards[0] = Review_ProposeePropIcon0;
        game.ProposeeReviewCards[1] = Review_ProposeePropIcon1;
        game.ProposeeReviewCards[2] = Review_ProposeePropIcon2;
        game.ProposeeReviewCards[3] = Review_ProposeePropIcon3;
        game.ProposeeReviewCards[4] = Review_ProposeePropIcon4;
        game.ProposeeReviewCards[5] = Review_ProposeePropIcon5;
        game.ProposeeReviewCards[6] = Review_ProposeePropIcon6;
        game.ProposeeReviewCards[7] = Review_ProposeePropIcon7;
        game.ProposeeReviewCards[8] = Review_ProposeePropIcon8;
        game.ProposeeReviewCards[9] = Review_ProposeePropIcon9;
        game.ProposeeReviewCards[10] = Review_ProposeePropIcon10;
        game.ProposeeReviewCards[11] = Review_ProposeePropIcon11;
        game.ProposeeReviewCards[12] = Review_ProposeePropIcon12;
        game.ProposeeReviewCards[13] = Review_ProposeePropIcon13;
        game.ProposeeReviewCards[14] = Review_ProposeePropIcon14;
        game.ProposeeReviewCards[15] = Review_ProposeePropIcon15;
        game.ProposeeReviewCards[16] = Review_ProposeePropIcon16;
        game.ProposeeReviewCards[17] = Review_ProposeePropIcon17;
        game.ProposeeReviewCards[18] = Review_ProposeePropIcon18;
        game.ProposeeReviewCards[19] = Review_ProposeePropIcon19;
        game.ProposeeReviewCards[20] = Review_ProposeePropIcon20;
        game.ProposeeReviewCards[21] = Review_ProposeePropIcon21;
        game.ProposeeReviewCards[22] = Review_ProposeePropIcon22;
        game.ProposeeReviewCards[23] = Review_ProposeePropIcon23;
        game.ProposeeReviewCards[24] = Review_ProposeePropIcon24;
        game.ProposeeReviewCards[25] = Review_ProposeePropIcon25;
        game.ProposeeReviewCards[26] = Review_ProposeePropIcon26;
        game.ProposeeReviewCards[27] = Review_ProposeePropIcon27;
    }
    
    public void setMortgageValueButton() {
        int value = game.mortgageValue(Mortgage_SwitchMenusButton.isSelected());
        Mortgage_EarningsValueLabel.setText(String.valueOf(value));
        if (Mortgage_SwitchMenusButton.isSelected() && value > game.activePlayer.getMoney()) {
            Mortgage_Button.setEnabled(false);
        } else {
            Mortgage_Button.setEnabled(true);
        }
    }
    
    public void disableButtons() {
        GameBoard_HousesButton.setVisible(false);
        GameBoard_HousesButton.setEnabled(false);
        GameBoard_HousesButton.setVisible(true);
        GameBoard_MortgageButton.setVisible(false);
        GameBoard_MortgageButton.setEnabled(false);
        GameBoard_MortgageButton.setVisible(true);
        GameBoard_TradeButton.setVisible(false);
        GameBoard_TradeButton.setEnabled(false);
        GameBoard_TradeButton.setVisible(true);
        GameBoard_NextPlayerButton.setVisible(false);
        GameBoard_NextPlayerButton.setEnabled(false);
        GameBoard_NextPlayerButton.setVisible(true);
        GameBoard_DiceButton.setEnabled(false);
    }
    
    public void enableButtons() {
        GameBoard_HousesButton.setEnabled(true);
        GameBoard_MortgageButton.setEnabled(true);
        GameBoard_TradeButton.setEnabled(true);
        if (game.playerMoved) {
            GameBoard_NextPlayerButton.setEnabled(true);
        }
        GameBoard_DiceButton.setEnabled(true);
    }
    
    public void goInDebt(Player p) {
        game.playerInDebt = true;
        game.storedActivePlayer = game.activePlayer;
        game.activePlayer = p;
        disableButtons();
        enableDebtButtons();
        DebtWindow.setVisible(true);
        CardLayout card = (CardLayout)Debt_CardRegion.getLayout();
        card.show(Debt_CardRegion, "InDebt");
    }
    
    public void disableDebtButtons() {
        Debt_HousesButton.setEnabled(false);
        Debt_MortgageButton.setEnabled(false);
        Debt_TradeButton.setEnabled(false);
        Debt_UpdateButton.setEnabled(false);
        Debt_BankruptButton.setEnabled(false);
    }
    
    public void enableDebtButtons() {
        Debt_HousesButton.setEnabled(true);
        Debt_MortgageButton.setEnabled(true);
        Debt_TradeButton.setEnabled(true);
        Debt_UpdateButton.setEnabled(true);
        Debt_BankruptButton.setEnabled(true);
    }

    private void initComponents() {

        PropertyWindow = new javax.swing.JDialog();
        PropertyPanel = new javax.swing.JPanel();
        Property_Container = new javax.swing.JPanel();
        Property_PropCard = new javax.swing.JLabel();
        Property_CardRegion = new javax.swing.JPanel();
        Property_BuyCard = new javax.swing.JPanel();
        Property_Label1 = new javax.swing.JLabel();
        Property_Label2 = new javax.swing.JLabel();
        Property_CostLabel = new javax.swing.JLabel();
        Property_YouHaveLabel = new javax.swing.JLabel();
        Property_Label3 = new javax.swing.JLabel();
        Property_Label4 = new javax.swing.JLabel();
        Property_BuyButton = new javax.swing.JButton();
        Property_AuctionButton = new javax.swing.JButton();
        Property_AuctionCard = new javax.swing.JPanel();
        Property_AuctionLabel = new javax.swing.JLabel();
        Property_P1AuctionLabel = new javax.swing.JLabel();
        Property_P2AuctionLabel = new javax.swing.JLabel();
        Property_P3AuctionLabel = new javax.swing.JLabel();
        Property_P4AuctionLabel = new javax.swing.JLabel();
        Property_P5AuctionLabel = new javax.swing.JLabel();
        Property_P6AuctionLabel = new javax.swing.JLabel();
        Property_P7AuctionLabel = new javax.swing.JLabel();
        Property_P8AuctionLabel = new javax.swing.JLabel();
        Property_P1BidPrice = new javax.swing.JTextField();
        Property_P2BidPrice = new javax.swing.JTextField();
        Property_P3BidPrice = new javax.swing.JTextField();
        Property_P4BidPrice = new javax.swing.JTextField();
        Property_P5BidPrice = new javax.swing.JTextField();
        Property_P6BidPrice = new javax.swing.JTextField();
        Property_P7BidPrice = new javax.swing.JTextField();
        Property_P8BidPrice = new javax.swing.JTextField();
        Property_P1BidButton = new javax.swing.JButton();
        Property_P2BidButton = new javax.swing.JButton();
        Property_P3BidButton = new javax.swing.JButton();
        Property_P4BidButton = new javax.swing.JButton();
        Property_P5BidButton = new javax.swing.JButton();
        Property_P6BidButton = new javax.swing.JButton();
        Property_P7BidButton = new javax.swing.JButton();
        Property_P8BidButton = new javax.swing.JButton();
        Property_P8PassButton = new javax.swing.JButton();
        Property_P7PassButton = new javax.swing.JButton();
        Property_P6PassButton = new javax.swing.JButton();
        Property_P5PassButton = new javax.swing.JButton();
        Property_P4PassButton = new javax.swing.JButton();
        Property_P3PassButton = new javax.swing.JButton();
        Property_P2PassButton = new javax.swing.JButton();
        Property_P1PassButton = new javax.swing.JButton();
        Property_CurrentBidLabel = new javax.swing.JLabel();
        Property_CurrentBidValue = new javax.swing.JLabel();
        Property_WinnerCard = new javax.swing.JPanel();
        Property_WinningBidder = new javax.swing.JLabel();
        Property_WinningBidLabel = new javax.swing.JLabel();
        Property_WinningBidOKButton = new javax.swing.JButton();
        Property_PayRentCard = new javax.swing.JPanel();
        Property_PayRentLabel1 = new javax.swing.JLabel();
        Property_RentOwedLabel = new javax.swing.JLabel();
        Property_PayRentYourMoney = new javax.swing.JLabel();
        Property_PayRentButton = new javax.swing.JButton();
        Property_PayRentLabel2 = new javax.swing.JLabel();
        Property_NoRentCard = new javax.swing.JPanel();
        Property_NoRentLabel1 = new javax.swing.JLabel();
        Property_NoRentOKButton = new javax.swing.JButton();
        Property_NoRentLabel2 = new javax.swing.JLabel();
        ViewAssetsWindow = new javax.swing.JDialog();
        ViewAssetsPanel = new javax.swing.JPanel();
        ViewAssets_TitlePanel = new javax.swing.JPanel();
        ViewAssets_TitleLabel = new javax.swing.JLabel();
        ViewAssets_MoneyIcon = new javax.swing.JLabel();
        ViewAssets_MoneyLabel = new javax.swing.JLabel();
        ViewAssets_OOJLabel = new javax.swing.JLabel();
        ViewAssets_OOJIcon = new javax.swing.JLabel();
        ViewAssets_CardRegion = new javax.swing.JPanel();
        ViewAssets_Pg1Panel = new javax.swing.JPanel();
        ViewAssets_St0Card = new javax.swing.JLabel();
        ViewAssets_St1Card = new javax.swing.JLabel();
        ViewAssets_St2Card = new javax.swing.JLabel();
        ViewAssets_St3Card = new javax.swing.JLabel();
        ViewAssets_St4Card = new javax.swing.JLabel();
        ViewAssets_St5Card = new javax.swing.JLabel();
        ViewAssets_St6Card = new javax.swing.JLabel();
        ViewAssets_St7Card = new javax.swing.JLabel();
        ViewAssets_St8Card = new javax.swing.JLabel();
        ViewAssets_St9Card = new javax.swing.JLabel();
        ViewAssets_St10Card = new javax.swing.JLabel();
        ViewAssets_St11Card = new javax.swing.JLabel();
        ViewAssets_St12Card = new javax.swing.JLabel();
        ViewAssets_St13Card = new javax.swing.JLabel();
        ViewAssets_St0RentLabel = new javax.swing.JLabel();
        ViewAssets_St1RentLabel = new javax.swing.JLabel();
        ViewAssets_St2RentLabel = new javax.swing.JLabel();
        ViewAssets_St3RentLabel = new javax.swing.JLabel();
        ViewAssets_St4RentLabel = new javax.swing.JLabel();
        ViewAssets_St5RentLabel = new javax.swing.JLabel();
        ViewAssets_St6RentLabel = new javax.swing.JLabel();
        ViewAssets_St7RentLabel = new javax.swing.JLabel();
        ViewAssets_St8RentLabel = new javax.swing.JLabel();
        ViewAssets_St9RentLabel = new javax.swing.JLabel();
        ViewAssets_St10RentLabel = new javax.swing.JLabel();
        ViewAssets_St11RentLabel = new javax.swing.JLabel();
        ViewAssets_St12RentLabel = new javax.swing.JLabel();
        ViewAssets_St13RentLabel = new javax.swing.JLabel();
        ViewAssets_St0HousesLabel = new javax.swing.JLabel();
        ViewAssets_St1HousesLabel = new javax.swing.JLabel();
        ViewAssets_St2HousesLabel = new javax.swing.JLabel();
        ViewAssets_St3HousesLabel = new javax.swing.JLabel();
        ViewAssets_St4HousesLabel = new javax.swing.JLabel();
        ViewAssets_St5HousesLabel = new javax.swing.JLabel();
        ViewAssets_St6HousesLabel = new javax.swing.JLabel();
        ViewAssets_St7HousesLabel = new javax.swing.JLabel();
        ViewAssets_St8HousesLabel = new javax.swing.JLabel();
        ViewAssets_St9HousesLabel = new javax.swing.JLabel();
        ViewAssets_St10HousesLabel = new javax.swing.JLabel();
        ViewAssets_St11HousesLabel = new javax.swing.JLabel();
        ViewAssets_St12HousesLabel = new javax.swing.JLabel();
        ViewAssets_St13HousesLabel = new javax.swing.JLabel();
        ViewAssets_Pg2Panel = new javax.swing.JPanel();
        ViewAssets_St14Card = new javax.swing.JLabel();
        ViewAssets_St15Card = new javax.swing.JLabel();
        ViewAssets_St16Card = new javax.swing.JLabel();
        ViewAssets_St17Card = new javax.swing.JLabel();
        ViewAssets_St18Card = new javax.swing.JLabel();
        ViewAssets_St19Card = new javax.swing.JLabel();
        ViewAssets_St20Card = new javax.swing.JLabel();
        ViewAssets_St21Card = new javax.swing.JLabel();
        ViewAssets_RR0Card = new javax.swing.JLabel();
        ViewAssets_RR1Card = new javax.swing.JLabel();
        ViewAssets_RR2Card = new javax.swing.JLabel();
        ViewAssets_RR3Card = new javax.swing.JLabel();
        ViewAssets_Ut0Card = new javax.swing.JLabel();
        ViewAssets_Ut1Card = new javax.swing.JLabel();
        ViewAssets_St14RentLabel = new javax.swing.JLabel();
        ViewAssets_St15RentLabel = new javax.swing.JLabel();
        ViewAssets_St16RentLabel = new javax.swing.JLabel();
        ViewAssets_St17RentLabel = new javax.swing.JLabel();
        ViewAssets_St18RentLabel = new javax.swing.JLabel();
        ViewAssets_St19RentLabel = new javax.swing.JLabel();
        ViewAssets_St20RentLabel = new javax.swing.JLabel();
        ViewAssets_St21RentLabel = new javax.swing.JLabel();
        ViewAssets_RR0RentLabel = new javax.swing.JLabel();
        ViewAssets_RR1RentLabel = new javax.swing.JLabel();
        ViewAssets_RR2RentLabel = new javax.swing.JLabel();
        ViewAssets_RR3RentLabel = new javax.swing.JLabel();
        ViewAssets_St14HousesLabel = new javax.swing.JLabel();
        ViewAssets_St15HousesLabel = new javax.swing.JLabel();
        ViewAssets_St16HousesLabel = new javax.swing.JLabel();
        ViewAssets_St17HousesLabel = new javax.swing.JLabel();
        ViewAssets_St18HousesLabel = new javax.swing.JLabel();
        ViewAssets_St19HousesLabel = new javax.swing.JLabel();
        ViewAssets_St20HousesLabel = new javax.swing.JLabel();
        ViewAssets_St21HousesLabel = new javax.swing.JLabel();
        ViewAssets_BottomPanel = new javax.swing.JPanel();
        ViewAssets_PageChangerButton = new javax.swing.JToggleButton();
        NeutralSpaceWindow = new javax.swing.JDialog();
        NeutralSpacePanel = new javax.swing.JPanel();
        NeutralSpace_Message = new javax.swing.JLabel();
        NeutralSpace_Icon = new javax.swing.JLabel();
        NeutralSpace_OKButton = new javax.swing.JButton();
        JailWindow = new javax.swing.JDialog();
        JailPanel = new javax.swing.JPanel();
        Jail_Message = new javax.swing.JLabel();
        Jail_Icon = new javax.swing.JLabel();
        Jail_OKButton = new javax.swing.JButton();
        ChanceWindow = new javax.swing.JDialog();
        Chance_CardRegion = new javax.swing.JPanel();
        Chance_InitialCard = new javax.swing.JLayeredPane();
        Chance_Background = new javax.swing.JLabel();
        Chance_TurnOverButton = new javax.swing.JButton();
        Chance_RevealCard = new javax.swing.JPanel();
        Chance_TitlePanel = new javax.swing.JPanel();
        Chance_TitleLabel = new javax.swing.JLabel();
        Chance_EffectMessage1 = new javax.swing.JLabel();
        Chance_EffectMessage2 = new javax.swing.JLabel();
        Chance_EffectMessage3 = new javax.swing.JLabel();
        Chance_OKButton = new javax.swing.JButton();
        TaxWindow = new javax.swing.JDialog();
        TaxPanel = new javax.swing.JPanel();
        Tax_TitleLabel = new javax.swing.JLabel();
        Tax_MessageLabel = new javax.swing.JLabel();
        Tax_Icon = new javax.swing.JLabel();
        Tax_OKButton = new javax.swing.JButton();
        HousesWindow = new javax.swing.JDialog();
        HousesPanel = new javax.swing.JPanel();
        Houses_TitleLabel = new javax.swing.JLabel();
        Houses_RemainingLabel = new javax.swing.JLabel();
        Houses_BrownButton = new javax.swing.JRadioButton();
        Houses_LightBlueButton = new javax.swing.JRadioButton();
        Houses_PinkButton = new javax.swing.JRadioButton();
        Houses_OrangeButton = new javax.swing.JRadioButton();
        Houses_RedButton = new javax.swing.JRadioButton();
        Houses_YellowButton = new javax.swing.JRadioButton();
        Houses_GreenButton = new javax.swing.JRadioButton();
        Houses_BlueButton = new javax.swing.JRadioButton();
        Houses_CardRegion = new javax.swing.JPanel();
        Houses_BlankCard = new javax.swing.JPanel();
        Houses_BuyCard1 = new javax.swing.JPanel();
        Houses_BuyProperty1 = new javax.swing.JLabel();
        Houses_BuyProperty2 = new javax.swing.JLabel();
        Houses_BuyProperty3 = new javax.swing.JLabel();
        Houses_BuyHouses1 = new javax.swing.JLabel();
        Houses_BuyHouses2 = new javax.swing.JLabel();
        Houses_BuyHouses3 = new javax.swing.JLabel();
        Houses_BuySlider = new javax.swing.JSlider();
        Houses_QuantityLabel = new javax.swing.JLabel();
        Houses_CostLabel = new javax.swing.JLabel();
        Houses_PlayerMoneyLabel = new javax.swing.JLabel();
        Houses_BuyButton = new javax.swing.JButton();
        Houses_SellHotelCard = new javax.swing.JPanel();
        Houses_SellHotelTitleLabel = new javax.swing.JLabel();
        Houses_SellHotelMessage1 = new javax.swing.JLabel();
        Houses_SellHotelMessage2 = new javax.swing.JLabel();
        Houses_SellHotelMessage3 = new javax.swing.JLabel();
        Houses_SellHotelCheckbox = new javax.swing.JCheckBox();
        Houses_SellHotelButton = new javax.swing.JButton();
        Houses_SellHotelEarningsLabel = new javax.swing.JLabel();
        Houses_SellHotelYouHaveLabel = new javax.swing.JLabel();
        Houses_SwitchBuySell = new javax.swing.JToggleButton();
        FullSetsButtonGroup = new javax.swing.ButtonGroup();
        MortgageWindow = new javax.swing.JDialog();
        MortgagePanel = new javax.swing.JPanel();
        Mortgage_TitleLabel = new javax.swing.JLabel();
        Mortgage_ScrollPane = new javax.swing.JScrollPane();
        Mortgage_ScrollPanel = new javax.swing.JPanel();
        Mortgage_CheckBox0 = new javax.swing.JCheckBox();
        Mortgage_CheckBox1 = new javax.swing.JCheckBox();
        Mortgage_CheckBox2 = new javax.swing.JCheckBox();
        Mortgage_CheckBox3 = new javax.swing.JCheckBox();
        Mortgage_CheckBox4 = new javax.swing.JCheckBox();
        Mortgage_CheckBox5 = new javax.swing.JCheckBox();
        Mortgage_CheckBox6 = new javax.swing.JCheckBox();
        Mortgage_CheckBox7 = new javax.swing.JCheckBox();
        Mortgage_CheckBox8 = new javax.swing.JCheckBox();
        Mortgage_CheckBox9 = new javax.swing.JCheckBox();
        Mortgage_CheckBox10 = new javax.swing.JCheckBox();
        Mortgage_CheckBox11 = new javax.swing.JCheckBox();
        Mortgage_CheckBox12 = new javax.swing.JCheckBox();
        Mortgage_CheckBox13 = new javax.swing.JCheckBox();
        Mortgage_CheckBox14 = new javax.swing.JCheckBox();
        Mortgage_CheckBox15 = new javax.swing.JCheckBox();
        Mortgage_CheckBox16 = new javax.swing.JCheckBox();
        Mortgage_CheckBox17 = new javax.swing.JCheckBox();
        Mortgage_CheckBox18 = new javax.swing.JCheckBox();
        Mortgage_CheckBox19 = new javax.swing.JCheckBox();
        Mortgage_CheckBox20 = new javax.swing.JCheckBox();
        Mortgage_CheckBox21 = new javax.swing.JCheckBox();
        Mortgage_CheckBox22 = new javax.swing.JCheckBox();
        Mortgage_CheckBox23 = new javax.swing.JCheckBox();
        Mortgage_CheckBox24 = new javax.swing.JCheckBox();
        Mortgage_CheckBox25 = new javax.swing.JCheckBox();
        Mortgage_CheckBox26 = new javax.swing.JCheckBox();
        Mortgage_CheckBox27 = new javax.swing.JCheckBox();
        Mortgage_SwitchMenusButton = new javax.swing.JToggleButton();
        Mortgage_Message1 = new javax.swing.JLabel();
        Mortgage_Message2 = new javax.swing.JLabel();
        Mortgage_Message3 = new javax.swing.JLabel();
        Mortgage_Message4 = new javax.swing.JLabel();
        Mortgage_EarningsLabel = new javax.swing.JLabel();
        Mortgage_EarningsValueLabel = new javax.swing.JLabel();
        Mortgage_Button = new javax.swing.JButton();
        Mortgage_YouHaveLabel = new javax.swing.JLabel();
        Mortgage_YouHaveValueLabel = new javax.swing.JLabel();
        TradeWindow = new javax.swing.JDialog();
        Trade_CardRegion = new javax.swing.JPanel();
        Trade_ProposalCard = new javax.swing.JPanel();
        Proposer_NameLabel = new javax.swing.JLabel();
        Proposee_NameLabel = new javax.swing.JLabel();
        ProposerAssets = new javax.swing.JPanel();
        Proposer_OutOfJailIcon = new javax.swing.JLabel();
        Proposer_OutOfJailCardsLabel = new javax.swing.JLabel();
        Proposer_MoneyLabel = new javax.swing.JLabel();
        Proposer_MoneyIcon = new javax.swing.JLabel();
        Proposer_OutOfJailField = new javax.swing.JTextField();
        Proposer_MoneyField = new javax.swing.JTextField();
        ProposerScrollPane = new javax.swing.JScrollPane();
        ProposerPanel = new javax.swing.JPanel();
        Proposer_CheckBox0 = new javax.swing.JCheckBox();
        Proposer_CheckBox1 = new javax.swing.JCheckBox();
        Proposer_CheckBox2 = new javax.swing.JCheckBox();
        Proposer_CheckBox3 = new javax.swing.JCheckBox();
        Proposer_CheckBox4 = new javax.swing.JCheckBox();
        Proposer_CheckBox5 = new javax.swing.JCheckBox();
        Proposer_CheckBox6 = new javax.swing.JCheckBox();
        Proposer_CheckBox7 = new javax.swing.JCheckBox();
        Proposer_CheckBox8 = new javax.swing.JCheckBox();
        Proposer_CheckBox9 = new javax.swing.JCheckBox();
        Proposer_CheckBox10 = new javax.swing.JCheckBox();
        Proposer_CheckBox11 = new javax.swing.JCheckBox();
        Proposer_CheckBox12 = new javax.swing.JCheckBox();
        Proposer_CheckBox13 = new javax.swing.JCheckBox();
        Proposer_CheckBox14 = new javax.swing.JCheckBox();
        Proposer_CheckBox15 = new javax.swing.JCheckBox();
        Proposer_CheckBox16 = new javax.swing.JCheckBox();
        Proposer_CheckBox17 = new javax.swing.JCheckBox();
        Proposer_CheckBox18 = new javax.swing.JCheckBox();
        Proposer_CheckBox19 = new javax.swing.JCheckBox();
        Proposer_CheckBox20 = new javax.swing.JCheckBox();
        Proposer_CheckBox21 = new javax.swing.JCheckBox();
        Proposer_CheckBox22 = new javax.swing.JCheckBox();
        Proposer_CheckBox23 = new javax.swing.JCheckBox();
        Proposer_CheckBox24 = new javax.swing.JCheckBox();
        Proposer_CheckBox25 = new javax.swing.JCheckBox();
        Proposer_CheckBox26 = new javax.swing.JCheckBox();
        Proposer_CheckBox27 = new javax.swing.JCheckBox();
        ProposeeAssets = new javax.swing.JPanel();
        Proposee_OutOfJailIcon = new javax.swing.JLabel();
        Proposee_OutOfJailCardsLabel = new javax.swing.JLabel();
        Proposee_MoneyLabel = new javax.swing.JLabel();
        Proposee_MoneyIcon = new javax.swing.JLabel();
        Proposee_OutOfJailField = new javax.swing.JTextField();
        Proposee_MoneyField = new javax.swing.JTextField();
        ProposeeScrollPane = new javax.swing.JScrollPane();
        ProposeePanel = new javax.swing.JPanel();
        Proposee_CheckBox0 = new javax.swing.JCheckBox();
        Proposee_CheckBox1 = new javax.swing.JCheckBox();
        Proposee_CheckBox2 = new javax.swing.JCheckBox();
        Proposee_CheckBox3 = new javax.swing.JCheckBox();
        Proposee_CheckBox4 = new javax.swing.JCheckBox();
        Proposee_CheckBox5 = new javax.swing.JCheckBox();
        Proposee_CheckBox6 = new javax.swing.JCheckBox();
        Proposee_CheckBox7 = new javax.swing.JCheckBox();
        Proposee_CheckBox8 = new javax.swing.JCheckBox();
        Proposee_CheckBox9 = new javax.swing.JCheckBox();
        Proposee_CheckBox10 = new javax.swing.JCheckBox();
        Proposee_CheckBox11 = new javax.swing.JCheckBox();
        Proposee_CheckBox12 = new javax.swing.JCheckBox();
        Proposee_CheckBox13 = new javax.swing.JCheckBox();
        Proposee_CheckBox14 = new javax.swing.JCheckBox();
        Proposee_CheckBox15 = new javax.swing.JCheckBox();
        Proposee_CheckBox16 = new javax.swing.JCheckBox();
        Proposee_CheckBox17 = new javax.swing.JCheckBox();
        Proposee_CheckBox18 = new javax.swing.JCheckBox();
        Proposee_CheckBox19 = new javax.swing.JCheckBox();
        Proposee_CheckBox20 = new javax.swing.JCheckBox();
        Proposee_CheckBox21 = new javax.swing.JCheckBox();
        Proposee_CheckBox22 = new javax.swing.JCheckBox();
        Proposee_CheckBox23 = new javax.swing.JCheckBox();
        Proposee_CheckBox24 = new javax.swing.JCheckBox();
        Proposee_CheckBox25 = new javax.swing.JCheckBox();
        Proposee_CheckBox26 = new javax.swing.JCheckBox();
        Proposee_CheckBox27 = new javax.swing.JCheckBox();
        Trade_ProposeButton = new javax.swing.JButton();
        Proposal_CancelButton = new javax.swing.JButton();
        Proposal_TitleCardRegion = new javax.swing.JPanel();
        Proposal_InitialCard = new javax.swing.JPanel();
        Proposal_TitleLabel = new javax.swing.JLabel();
        Proposal_PlayersComboBox = new javax.swing.JComboBox<>();
        Proposal_CounterCard = new javax.swing.JPanel();
        Proposal_CounterTitleLabel = new javax.swing.JLabel();
        Trade_ReviewCard = new javax.swing.JPanel();
        Review_TitleLabel = new javax.swing.JLabel();
        Review_ProposerScroll = new javax.swing.JScrollPane();
        Review_ProposerPanel = new javax.swing.JPanel();
        Review_ProposerPropIcon0 = new javax.swing.JLabel();
        Review_ProposerPropIcon1 = new javax.swing.JLabel();
        Review_ProposerPropIcon2 = new javax.swing.JLabel();
        Review_ProposerPropIcon3 = new javax.swing.JLabel();
        Review_ProposerPropIcon4 = new javax.swing.JLabel();
        Review_ProposerPropIcon5 = new javax.swing.JLabel();
        Review_ProposerPropIcon6 = new javax.swing.JLabel();
        Review_ProposerPropIcon7 = new javax.swing.JLabel();
        Review_ProposerPropIcon8 = new javax.swing.JLabel();
        Review_ProposerPropIcon9 = new javax.swing.JLabel();
        Review_ProposerPropIcon10 = new javax.swing.JLabel();
        Review_ProposerPropIcon11 = new javax.swing.JLabel();
        Review_ProposerPropIcon12 = new javax.swing.JLabel();
        Review_ProposerPropIcon13 = new javax.swing.JLabel();
        Review_ProposerPropIcon14 = new javax.swing.JLabel();
        Review_ProposerPropIcon15 = new javax.swing.JLabel();
        Review_ProposerPropIcon16 = new javax.swing.JLabel();
        Review_ProposerPropIcon17 = new javax.swing.JLabel();
        Review_ProposerPropIcon18 = new javax.swing.JLabel();
        Review_ProposerPropIcon19 = new javax.swing.JLabel();
        Review_ProposerPropIcon20 = new javax.swing.JLabel();
        Review_ProposerPropIcon21 = new javax.swing.JLabel();
        Review_ProposerPropIcon22 = new javax.swing.JLabel();
        Review_ProposerPropIcon23 = new javax.swing.JLabel();
        Review_ProposerPropIcon24 = new javax.swing.JLabel();
        Review_ProposerPropIcon25 = new javax.swing.JLabel();
        Review_ProposerPropIcon26 = new javax.swing.JLabel();
        Review_ProposerPropIcon27 = new javax.swing.JLabel();
        Review_ProposeeScroll = new javax.swing.JScrollPane();
        Review_ProposeePanel = new javax.swing.JPanel();
        Review_ProposeePropIcon0 = new javax.swing.JLabel();
        Review_ProposeePropIcon1 = new javax.swing.JLabel();
        Review_ProposeePropIcon2 = new javax.swing.JLabel();
        Review_ProposeePropIcon3 = new javax.swing.JLabel();
        Review_ProposeePropIcon4 = new javax.swing.JLabel();
        Review_ProposeePropIcon5 = new javax.swing.JLabel();
        Review_ProposeePropIcon6 = new javax.swing.JLabel();
        Review_ProposeePropIcon7 = new javax.swing.JLabel();
        Review_ProposeePropIcon8 = new javax.swing.JLabel();
        Review_ProposeePropIcon9 = new javax.swing.JLabel();
        Review_ProposeePropIcon10 = new javax.swing.JLabel();
        Review_ProposeePropIcon11 = new javax.swing.JLabel();
        Review_ProposeePropIcon12 = new javax.swing.JLabel();
        Review_ProposeePropIcon13 = new javax.swing.JLabel();
        Review_ProposeePropIcon14 = new javax.swing.JLabel();
        Review_ProposeePropIcon15 = new javax.swing.JLabel();
        Review_ProposeePropIcon16 = new javax.swing.JLabel();
        Review_ProposeePropIcon17 = new javax.swing.JLabel();
        Review_ProposeePropIcon18 = new javax.swing.JLabel();
        Review_ProposeePropIcon19 = new javax.swing.JLabel();
        Review_ProposeePropIcon20 = new javax.swing.JLabel();
        Review_ProposeePropIcon21 = new javax.swing.JLabel();
        Review_ProposeePropIcon22 = new javax.swing.JLabel();
        Review_ProposeePropIcon23 = new javax.swing.JLabel();
        Review_ProposeePropIcon24 = new javax.swing.JLabel();
        Review_ProposeePropIcon25 = new javax.swing.JLabel();
        Review_ProposeePropIcon26 = new javax.swing.JLabel();
        Review_ProposeePropIcon27 = new javax.swing.JLabel();
        Review_ProposerLabel = new javax.swing.JLabel();
        Review_ProposeeLabel = new javax.swing.JLabel();
        Review_ProposerMoneyIcon = new javax.swing.JLabel();
        Review_ProposerMoneyLabel = new javax.swing.JLabel();
        Review_ProposerOutOfJailIcon = new javax.swing.JLabel();
        Review_ProposerOutOfJailCardsLabel = new javax.swing.JLabel();
        Review_ProposeeMoneyIcon = new javax.swing.JLabel();
        Review_ProposeeMoneyLabel = new javax.swing.JLabel();
        Review_ProposeeOutOfJailIcon = new javax.swing.JLabel();
        Review_ProposeeOutOfJailCardsLabel = new javax.swing.JLabel();
        Review_ProposeePrompt = new javax.swing.JLabel();
        Review_AcceptButton = new javax.swing.JButton();
        Review_CounterOfferButton = new javax.swing.JButton();
        Review_DeclineButton = new javax.swing.JButton();
        Trade_BlankCard = new javax.swing.JPanel();
        DebtWindow = new javax.swing.JDialog();
        Debt_CardRegion = new javax.swing.JPanel();
        InDebtCard = new javax.swing.JPanel();
        Debt_TitleLabel = new javax.swing.JLabel();
        Debt_AmntOwedLabel = new javax.swing.JLabel();
        Debt_HousesButton = new javax.swing.JButton();
        Debt_MortgageButton = new javax.swing.JButton();
        Debt_TradeButton = new javax.swing.JButton();
        Debt_UpdateButton = new javax.swing.JButton();
        Debt_BankruptButton = new javax.swing.JButton();
        OutOfDebtCard = new javax.swing.JPanel();
        OutOfDebt_Label1 = new javax.swing.JLabel();
        OutOfDebt_Label2 = new javax.swing.JLabel();
        OutOfDebt_MoneyLabel = new javax.swing.JLabel();
        OutOfDebt_OKButton = new javax.swing.JButton();
        BankruptCard = new javax.swing.JPanel();
        Bankrupt_PlayerIcon = new javax.swing.JLabel();
        Bankrupt_Label1 = new javax.swing.JLabel();
        Bankrupt_Label2 = new javax.swing.JLabel();
        Bankrupt_Label3 = new javax.swing.JLabel();
        Bankrupt_Label4 = new javax.swing.JLabel();
        Bankrupt_ContinueButton = new javax.swing.JButton();
        FrameRegion = new javax.swing.JPanel();
        MainMenu = new javax.swing.JPanel();
        MainMenu_LogoImg = new javax.swing.JLabel();
        MainMenu_NumPlayers = new javax.swing.JLabel();
        String[] playerOptions = { "--", "2", "3", "4", "5", "6", "7", "8" };
        MainMenu_PlayersSelect = new javax.swing.JComboBox<>();
        MainMenu_PlayButton = new javax.swing.JButton();
        GameBoard = new javax.swing.JLayeredPane();
        GameBoard_Board = new javax.swing.JLabel();
        GameBoard_PlayerLabel = new javax.swing.JLabel();
        TokenP1 = new javax.swing.JLabel();
        TokenP2 = new javax.swing.JLabel();
        TokenP3 = new javax.swing.JLabel();
        TokenP4 = new javax.swing.JLabel();
        TokenP5 = new javax.swing.JLabel();
        TokenP6 = new javax.swing.JLabel();
        TokenP7 = new javax.swing.JLabel();
        TokenP8 = new javax.swing.JLabel();
        GameBoard_DiceCardRegion = new javax.swing.JPanel();
        GameBoard_RollDiceCard = new javax.swing.JPanel();
        GameBoard_DiceButton = new javax.swing.JButton();
        GameBoard_PayButton = new javax.swing.JButton();
        GameBoard_JailFreeCardButton = new javax.swing.JButton();
        GameBoard_MoveCard = new javax.swing.JPanel();
        RedDice = new javax.swing.JLabel();
        YellowDice = new javax.swing.JLabel();
        GameBoard_MoveButton = new javax.swing.JButton();
        GameBoard_NextPlayerButton = new javax.swing.JButton();
        GameBoard_ViewAssetsPanel = new javax.swing.JPanel();
        GameBoard_ViewAssetsLabel = new javax.swing.JLabel();
        GameBoard_P1Assets = new javax.swing.JLabel();
        GameBoard_P2Assets = new javax.swing.JLabel();
        GameBoard_P3Assets = new javax.swing.JLabel();
        GameBoard_P4Assets = new javax.swing.JLabel();
        GameBoard_P5Assets = new javax.swing.JLabel();
        GameBoard_P6Assets = new javax.swing.JLabel();
        GameBoard_P7Assets = new javax.swing.JLabel();
        GameBoard_P8Assets = new javax.swing.JLabel();
        GameBoard_HousesButton = new javax.swing.JButton();
        GameBoard_St0Houses = new javax.swing.JLabel();
        GameBoard_St1Houses = new javax.swing.JLabel();
        GameBoard_St2Houses = new javax.swing.JLabel();
        GameBoard_St3Houses = new javax.swing.JLabel();
        GameBoard_St4Houses = new javax.swing.JLabel();
        GameBoard_St5Houses = new javax.swing.JLabel();
        GameBoard_St6Houses = new javax.swing.JLabel();
        GameBoard_St7Houses = new javax.swing.JLabel();
        GameBoard_St8Houses = new javax.swing.JLabel();
        GameBoard_St9Houses = new javax.swing.JLabel();
        GameBoard_St10Houses = new javax.swing.JLabel();
        GameBoard_St11Houses = new javax.swing.JLabel();
        GameBoard_St12Houses = new javax.swing.JLabel();
        GameBoard_St13Houses = new javax.swing.JLabel();
        GameBoard_St14Houses = new javax.swing.JLabel();
        GameBoard_St15Houses = new javax.swing.JLabel();
        GameBoard_St16Houses = new javax.swing.JLabel();
        GameBoard_St17Houses = new javax.swing.JLabel();
        GameBoard_St18Houses = new javax.swing.JLabel();
        GameBoard_St19Houses = new javax.swing.JLabel();
        GameBoard_St20Houses = new javax.swing.JLabel();
        GameBoard_St21Houses = new javax.swing.JLabel();
        GameBoard_MortgageButton = new javax.swing.JButton();
        GameBoard_TradeButton = new javax.swing.JButton();
        EndScreen = new javax.swing.JPanel();
        End_WinnerIcon = new javax.swing.JLabel();
        End_Message1 = new javax.swing.JLabel();
        End_Message2 = new javax.swing.JLabel();
        End_MainMenuButton = new javax.swing.JButton();
        End_ExitButton = new javax.swing.JButton();

        PropertyWindow.setBackground(new java.awt.Color(69, 69, 100));
        PropertyWindow.setMinimumSize(new java.awt.Dimension(700, 450));
        PropertyWindow.setResizable(false);
        PropertyWindow.setSize(new java.awt.Dimension(700, 450));
        PropertyWindow.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PropertyWindowComponentShown(evt);
            }
        });

        PropertyPanel.setLayout(null);

        Property_Container.setBackground(new java.awt.Color(255, 255, 255));
        Property_Container.setMaximumSize(new java.awt.Dimension(280, 430));
        Property_Container.setMinimumSize(new java.awt.Dimension(280, 430));
        Property_Container.setPreferredSize(new java.awt.Dimension(280, 430));
        Property_Container.setRequestFocusEnabled(false);
        Property_Container.setLayout(new java.awt.GridBagLayout());

        Property_PropCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/St13.png"))); // NOI18N
        Property_Container.add(Property_PropCard, new java.awt.GridBagConstraints());

        PropertyPanel.add(Property_Container);
        Property_Container.setBounds(420, 0, 280, 430);

        Property_CardRegion.setLayout(new java.awt.CardLayout());

        Property_BuyCard.setBackground(new java.awt.Color(69, 69, 100));
        Property_BuyCard.setLayout(null);

        Property_Label1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Property_Label1.setForeground(new java.awt.Color(255, 255, 255));
        Property_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_Label1.setText("Would you like to purchase");
        Property_Label1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Property_BuyCard.add(Property_Label1);
        Property_Label1.setBounds(0, 30, 420, 40);

        Property_Label2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Property_Label2.setForeground(new java.awt.Color(255, 255, 255));
        Property_Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_Label2.setText("this property?");
        Property_BuyCard.add(Property_Label2);
        Property_Label2.setBounds(0, 80, 420, 40);

        Property_CostLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Property_CostLabel.setForeground(new java.awt.Color(220, 220, 220));
        Property_CostLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_CostLabel.setText("Cost:");
        Property_BuyCard.add(Property_CostLabel);
        Property_CostLabel.setBounds(0, 150, 420, 40);

        Property_YouHaveLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Property_YouHaveLabel.setForeground(new java.awt.Color(220, 220, 220));
        Property_YouHaveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_YouHaveLabel.setText("You Have:");
        Property_BuyCard.add(Property_YouHaveLabel);
        Property_YouHaveLabel.setBounds(0, 190, 420, 40);

        Property_Label3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Property_Label3.setForeground(new java.awt.Color(220, 220, 220));
        Property_Label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_Label3.setText("If you choose not to buy this property");
        Property_BuyCard.add(Property_Label3);
        Property_Label3.setBounds(0, 250, 420, 40);

        Property_Label4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Property_Label4.setForeground(new java.awt.Color(220, 220, 220));
        Property_Label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_Label4.setText("now, it will go to auction.");
        Property_BuyCard.add(Property_Label4);
        Property_Label4.setBounds(0, 290, 420, 40);

        Property_BuyButton.setBackground(new java.awt.Color(20, 20, 20));
        Property_BuyButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Property_BuyButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_BuyButton.setText("Buy");
        Property_BuyButton.setPreferredSize(new java.awt.Dimension(140, 40));
        Property_BuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_BuyButtonActionPerformed(evt);
            }
        });
        Property_BuyCard.add(Property_BuyButton);
        Property_BuyButton.setBounds(50, 360, 140, 40);

        Property_AuctionButton.setBackground(new java.awt.Color(20, 20, 20));
        Property_AuctionButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Property_AuctionButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_AuctionButton.setText("Auction it!");
        Property_AuctionButton.setPreferredSize(new java.awt.Dimension(140, 40));
        Property_AuctionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_AuctionButtonActionPerformed(evt);
            }
        });
        Property_BuyCard.add(Property_AuctionButton);
        Property_AuctionButton.setBounds(230, 360, 140, 40);

        Property_CardRegion.add(Property_BuyCard, "Buy");

        Property_AuctionCard.setBackground(new java.awt.Color(45, 45, 45));
        Property_AuctionCard.setLayout(null);

        Property_AuctionLabel.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Property_AuctionLabel.setForeground(new java.awt.Color(255, 255, 255));
        Property_AuctionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_AuctionLabel.setText("Auction");
        Property_AuctionCard.add(Property_AuctionLabel);
        Property_AuctionLabel.setBounds(0, 20, 420, 50);

        Property_P1AuctionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P1AuctionLabel.setForeground(new java.awt.Color(255, 255, 255));
        Property_P1AuctionLabel.setText("Player 1:");
        Property_P1AuctionLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        Property_P1AuctionLabel.setSize(new java.awt.Dimension(80, 30));
        Property_AuctionCard.add(Property_P1AuctionLabel);
        Property_P1AuctionLabel.setBounds(70, 80, 80, 30);

        Property_P2AuctionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P2AuctionLabel.setForeground(new java.awt.Color(255, 255, 255));
        Property_P2AuctionLabel.setText("Player 2:");
        Property_P2AuctionLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        Property_P2AuctionLabel.setSize(new java.awt.Dimension(80, 30));
        Property_AuctionCard.add(Property_P2AuctionLabel);
        Property_P2AuctionLabel.setBounds(70, 115, 80, 30);

        Property_P3AuctionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P3AuctionLabel.setForeground(new java.awt.Color(255, 255, 255));
        Property_P3AuctionLabel.setText("Player 3:");
        Property_P3AuctionLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        Property_P3AuctionLabel.setSize(new java.awt.Dimension(80, 30));
        Property_AuctionCard.add(Property_P3AuctionLabel);
        Property_P3AuctionLabel.setBounds(70, 150, 80, 30);

        Property_P4AuctionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P4AuctionLabel.setForeground(new java.awt.Color(255, 255, 255));
        Property_P4AuctionLabel.setText("Player 4:");
        Property_P4AuctionLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        Property_P4AuctionLabel.setSize(new java.awt.Dimension(80, 30));
        Property_AuctionCard.add(Property_P4AuctionLabel);
        Property_P4AuctionLabel.setBounds(70, 185, 80, 30);

        Property_P5AuctionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P5AuctionLabel.setForeground(new java.awt.Color(255, 255, 255));
        Property_P5AuctionLabel.setText("Player 5:");
        Property_P5AuctionLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        Property_P5AuctionLabel.setSize(new java.awt.Dimension(80, 30));
        Property_AuctionCard.add(Property_P5AuctionLabel);
        Property_P5AuctionLabel.setBounds(70, 220, 80, 30);

        Property_P6AuctionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P6AuctionLabel.setForeground(new java.awt.Color(255, 255, 255));
        Property_P6AuctionLabel.setText("Player 6:");
        Property_P6AuctionLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        Property_P6AuctionLabel.setSize(new java.awt.Dimension(80, 30));
        Property_AuctionCard.add(Property_P6AuctionLabel);
        Property_P6AuctionLabel.setBounds(70, 255, 80, 30);

        Property_P7AuctionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P7AuctionLabel.setForeground(new java.awt.Color(255, 255, 255));
        Property_P7AuctionLabel.setText("Player 7:");
        Property_P7AuctionLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        Property_P7AuctionLabel.setSize(new java.awt.Dimension(80, 30));
        Property_AuctionCard.add(Property_P7AuctionLabel);
        Property_P7AuctionLabel.setBounds(70, 290, 80, 30);

        Property_P8AuctionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P8AuctionLabel.setForeground(new java.awt.Color(255, 255, 255));
        Property_P8AuctionLabel.setText("Player 8:");
        Property_P8AuctionLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        Property_P8AuctionLabel.setSize(new java.awt.Dimension(80, 30));
        Property_AuctionCard.add(Property_P8AuctionLabel);
        Property_P8AuctionLabel.setBounds(70, 325, 80, 30);

        Property_P1BidPrice.setBackground(new java.awt.Color(255, 255, 255));
        Property_P1BidPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P1BidPrice.setForeground(new java.awt.Color(0, 0, 0));
        Property_P1BidPrice.setPreferredSize(new java.awt.Dimension(80, 30));
        Property_AuctionCard.add(Property_P1BidPrice);
        Property_P1BidPrice.setBounds(150, 80, 50, 30);

        Property_P2BidPrice.setBackground(new java.awt.Color(255, 255, 255));
        Property_P2BidPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P2BidPrice.setForeground(new java.awt.Color(0, 0, 0));
        Property_P2BidPrice.setPreferredSize(new java.awt.Dimension(93, 30));
        Property_AuctionCard.add(Property_P2BidPrice);
        Property_P2BidPrice.setBounds(150, 115, 50, 30);

        Property_P3BidPrice.setBackground(new java.awt.Color(255, 255, 255));
        Property_P3BidPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P3BidPrice.setForeground(new java.awt.Color(0, 0, 0));
        Property_P3BidPrice.setPreferredSize(new java.awt.Dimension(93, 30));
        Property_AuctionCard.add(Property_P3BidPrice);
        Property_P3BidPrice.setBounds(150, 150, 50, 30);

        Property_P4BidPrice.setBackground(new java.awt.Color(255, 255, 255));
        Property_P4BidPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P4BidPrice.setForeground(new java.awt.Color(0, 0, 0));
        Property_P4BidPrice.setPreferredSize(new java.awt.Dimension(93, 30));
        Property_AuctionCard.add(Property_P4BidPrice);
        Property_P4BidPrice.setBounds(150, 185, 50, 30);

        Property_P5BidPrice.setBackground(new java.awt.Color(255, 255, 255));
        Property_P5BidPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P5BidPrice.setForeground(new java.awt.Color(0, 0, 0));
        Property_P5BidPrice.setPreferredSize(new java.awt.Dimension(93, 30));
        Property_AuctionCard.add(Property_P5BidPrice);
        Property_P5BidPrice.setBounds(150, 220, 50, 30);

        Property_P6BidPrice.setBackground(new java.awt.Color(255, 255, 255));
        Property_P6BidPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P6BidPrice.setForeground(new java.awt.Color(0, 0, 0));
        Property_P6BidPrice.setPreferredSize(new java.awt.Dimension(93, 30));
        Property_AuctionCard.add(Property_P6BidPrice);
        Property_P6BidPrice.setBounds(150, 255, 50, 30);

        Property_P7BidPrice.setBackground(new java.awt.Color(255, 255, 255));
        Property_P7BidPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P7BidPrice.setForeground(new java.awt.Color(0, 0, 0));
        Property_P7BidPrice.setPreferredSize(new java.awt.Dimension(93, 30));
        Property_AuctionCard.add(Property_P7BidPrice);
        Property_P7BidPrice.setBounds(150, 290, 50, 30);

        Property_P8BidPrice.setBackground(new java.awt.Color(255, 255, 255));
        Property_P8BidPrice.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Property_P8BidPrice.setForeground(new java.awt.Color(0, 0, 0));
        Property_P8BidPrice.setPreferredSize(new java.awt.Dimension(93, 30));
        Property_AuctionCard.add(Property_P8BidPrice);
        Property_P8BidPrice.setBounds(150, 325, 50, 30);

        Property_P1BidButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P1BidButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P1BidButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P1BidButton.setText("Bid");
        Property_P1BidButton.setPreferredSize(new java.awt.Dimension(70, 30));
        Property_P1BidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P1BidButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P1BidButton);
        Property_P1BidButton.setBounds(210, 80, 70, 30);

        Property_P2BidButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P2BidButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P2BidButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P2BidButton.setText("Bid");
        Property_P2BidButton.setPreferredSize(new java.awt.Dimension(70, 30));
        Property_P2BidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P2BidButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P2BidButton);
        Property_P2BidButton.setBounds(210, 115, 70, 30);

        Property_P3BidButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P3BidButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P3BidButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P3BidButton.setText("Bid");
        Property_P3BidButton.setPreferredSize(new java.awt.Dimension(70, 30));
        Property_P3BidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P3BidButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P3BidButton);
        Property_P3BidButton.setBounds(210, 150, 70, 30);

        Property_P4BidButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P4BidButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P4BidButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P4BidButton.setText("Bid");
        Property_P4BidButton.setPreferredSize(new java.awt.Dimension(70, 30));
        Property_P4BidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P4BidButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P4BidButton);
        Property_P4BidButton.setBounds(210, 185, 70, 30);

        Property_P5BidButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P5BidButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P5BidButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P5BidButton.setText("Bid");
        Property_P5BidButton.setPreferredSize(new java.awt.Dimension(70, 30));
        Property_P5BidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P5BidButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P5BidButton);
        Property_P5BidButton.setBounds(210, 220, 70, 30);

        Property_P6BidButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P6BidButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P6BidButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P6BidButton.setText("Bid");
        Property_P6BidButton.setPreferredSize(new java.awt.Dimension(70, 30));
        Property_P6BidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P6BidButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P6BidButton);
        Property_P6BidButton.setBounds(210, 255, 70, 30);

        Property_P7BidButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P7BidButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P7BidButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P7BidButton.setText("Bid");
        Property_P7BidButton.setPreferredSize(new java.awt.Dimension(70, 30));
        Property_P7BidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P7BidButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P7BidButton);
        Property_P7BidButton.setBounds(210, 290, 70, 30);

        Property_P8BidButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P8BidButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P8BidButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P8BidButton.setText("Bid");
        Property_P8BidButton.setPreferredSize(new java.awt.Dimension(70, 30));
        Property_P8BidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P8BidButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P8BidButton);
        Property_P8BidButton.setBounds(210, 325, 70, 30);

        Property_P8PassButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P8PassButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P8PassButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P8PassButton.setText("Pass");
        Property_P8PassButton.setPreferredSize(new java.awt.Dimension(100, 30));
        Property_P8PassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P8PassButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P8PassButton);
        Property_P8PassButton.setBounds(290, 325, 70, 30);

        Property_P7PassButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P7PassButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P7PassButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P7PassButton.setText("Pass");
        Property_P7PassButton.setPreferredSize(new java.awt.Dimension(100, 30));
        Property_P7PassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P7PassButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P7PassButton);
        Property_P7PassButton.setBounds(290, 290, 70, 30);

        Property_P6PassButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P6PassButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P6PassButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P6PassButton.setText("Pass");
        Property_P6PassButton.setPreferredSize(new java.awt.Dimension(100, 30));
        Property_P6PassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P6PassButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P6PassButton);
        Property_P6PassButton.setBounds(290, 255, 70, 30);

        Property_P5PassButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P5PassButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P5PassButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P5PassButton.setText("Pass");
        Property_P5PassButton.setPreferredSize(new java.awt.Dimension(100, 30));
        Property_P5PassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P5PassButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P5PassButton);
        Property_P5PassButton.setBounds(290, 220, 70, 30);

        Property_P4PassButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P4PassButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P4PassButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P4PassButton.setText("Pass");
        Property_P4PassButton.setPreferredSize(new java.awt.Dimension(100, 30));
        Property_P4PassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P4PassButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P4PassButton);
        Property_P4PassButton.setBounds(290, 185, 70, 30);

        Property_P3PassButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P3PassButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P3PassButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P3PassButton.setText("Pass");
        Property_P3PassButton.setPreferredSize(new java.awt.Dimension(100, 30));
        Property_P3PassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P3PassButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P3PassButton);
        Property_P3PassButton.setBounds(290, 150, 70, 30);

        Property_P2PassButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P2PassButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P2PassButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P2PassButton.setText("Pass");
        Property_P2PassButton.setPreferredSize(new java.awt.Dimension(100, 30));
        Property_P2PassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P2PassButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P2PassButton);
        Property_P2PassButton.setBounds(290, 115, 70, 30);

        Property_P1PassButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_P1PassButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_P1PassButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_P1PassButton.setText("Pass");
        Property_P1PassButton.setPreferredSize(new java.awt.Dimension(100, 30));
        Property_P1PassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_P1PassButtonActionPerformed(evt);
            }
        });
        Property_AuctionCard.add(Property_P1PassButton);
        Property_P1PassButton.setBounds(290, 80, 70, 30);

        Property_CurrentBidLabel.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Property_CurrentBidLabel.setForeground(new java.awt.Color(255, 255, 255));
        Property_CurrentBidLabel.setText("CURRENT BID:");
        Property_CurrentBidLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Property_AuctionCard.add(Property_CurrentBidLabel);
        Property_CurrentBidLabel.setBounds(10, 380, 230, 40);

        Property_CurrentBidValue.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Property_CurrentBidValue.setForeground(new java.awt.Color(255, 255, 255));
        Property_CurrentBidValue.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Property_CurrentBidValue.setText("0");
        Property_CurrentBidValue.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Property_CurrentBidValue.setPreferredSize(new java.awt.Dimension(100, 40));
        Property_AuctionCard.add(Property_CurrentBidValue);
        Property_CurrentBidValue.setBounds(240, 380, 170, 40);

        Property_CardRegion.add(Property_AuctionCard, "Auction");

        Property_WinnerCard.setBackground(new java.awt.Color(45, 45, 45));
        Property_WinnerCard.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Property_WinnerCardComponentShown(evt);
            }
        });
        Property_WinnerCard.setLayout(null);

        Property_WinningBidder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerimages/P1.png"))); // NOI18N
        Property_WinningBidder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Property_WinningBidder.setSize(new java.awt.Dimension(182, 242));
        Property_WinnerCard.add(Property_WinningBidder);
        Property_WinningBidder.setBounds(119, 29, 182, 242);

        Property_WinningBidLabel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Property_WinningBidLabel.setForeground(new java.awt.Color(255, 255, 255));
        Property_WinningBidLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_WinningBidLabel.setText("Winning Bid:");
        Property_WinningBidLabel.setPreferredSize(new java.awt.Dimension(240, 50));
        Property_WinnerCard.add(Property_WinningBidLabel);
        Property_WinningBidLabel.setBounds(0, 290, 420, 50);

        Property_WinningBidOKButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_WinningBidOKButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_WinningBidOKButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_WinningBidOKButton.setText("OK");
        Property_WinningBidOKButton.setPreferredSize(new java.awt.Dimension(80, 30));
        Property_WinningBidOKButton.setSize(new java.awt.Dimension(80, 30));
        Property_WinningBidOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_WinningBidOKButtonActionPerformed(evt);
            }
        });
        Property_WinnerCard.add(Property_WinningBidOKButton);
        Property_WinningBidOKButton.setBounds(170, 360, 80, 30);

        Property_CardRegion.add(Property_WinnerCard, "Winner");

        Property_PayRentCard.setBackground(new java.awt.Color(133, 66, 64));
        Property_PayRentCard.setLayout(null);

        Property_PayRentLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Property_PayRentLabel1.setForeground(new java.awt.Color(255, 255, 255));
        Property_PayRentLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_PayRentLabel1.setText("This property is owned by");
        Property_PayRentLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Property_PayRentCard.add(Property_PayRentLabel1);
        Property_PayRentLabel1.setBounds(0, 20, 420, 50);

        Property_RentOwedLabel.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Property_RentOwedLabel.setForeground(new java.awt.Color(255, 255, 255));
        Property_RentOwedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_RentOwedLabel.setText("Rent owed:");
        Property_RentOwedLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Property_PayRentCard.add(Property_RentOwedLabel);
        Property_RentOwedLabel.setBounds(0, 160, 420, 50);

        Property_PayRentYourMoney.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Property_PayRentYourMoney.setForeground(new java.awt.Color(255, 255, 255));
        Property_PayRentYourMoney.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_PayRentYourMoney.setText("You have:");
        Property_PayRentYourMoney.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Property_PayRentCard.add(Property_PayRentYourMoney);
        Property_PayRentYourMoney.setBounds(0, 220, 420, 50);

        Property_PayRentButton.setBackground(new java.awt.Color(0, 0, 0));
        Property_PayRentButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_PayRentButton.setForeground(new java.awt.Color(255, 255, 255));
        Property_PayRentButton.setText("Pay");
        Property_PayRentButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Property_PayRentButton.setPreferredSize(new java.awt.Dimension(100, 40));
        Property_PayRentButton.setSize(new java.awt.Dimension(100, 40));
        Property_PayRentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_PayRentButtonActionPerformed(evt);
            }
        });
        Property_PayRentCard.add(Property_PayRentButton);
        Property_PayRentButton.setBounds(160, 310, 100, 40);

        Property_PayRentLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Property_PayRentLabel2.setForeground(new java.awt.Color(255, 255, 255));
        Property_PayRentLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_PayRentLabel2.setText("player...");
        Property_PayRentCard.add(Property_PayRentLabel2);
        Property_PayRentLabel2.setBounds(0, 70, 420, 60);

        Property_CardRegion.add(Property_PayRentCard, "PayRent");

        Property_NoRentCard.setBackground(new java.awt.Color(209, 239, 203));
        Property_NoRentCard.setLayout(null);

        Property_NoRentLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Property_NoRentLabel1.setForeground(new java.awt.Color(0, 0, 0));
        Property_NoRentLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_NoRentLabel1.setText("You own this property.");
        Property_NoRentCard.add(Property_NoRentLabel1);
        Property_NoRentLabel1.setBounds(0, 90, 420, 50);

        Property_NoRentOKButton.setBackground(new java.awt.Color(255, 255, 255));
        Property_NoRentOKButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Property_NoRentOKButton.setForeground(new java.awt.Color(0, 0, 0));
        Property_NoRentOKButton.setText("OK");
        Property_NoRentOKButton.setPreferredSize(new java.awt.Dimension(80, 40));
        Property_NoRentOKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Property_NoRentOKButtonActionPerformed(evt);
            }
        });
        Property_NoRentCard.add(Property_NoRentOKButton);
        Property_NoRentOKButton.setBounds(170, 270, 80, 30);

        Property_NoRentLabel2.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Property_NoRentLabel2.setForeground(new java.awt.Color(0, 0, 0));
        Property_NoRentLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Property_NoRentLabel2.setText("You own this property.");
        Property_NoRentLabel2.setPreferredSize(new java.awt.Dimension(420, 50));
        Property_NoRentCard.add(Property_NoRentLabel2);
        Property_NoRentLabel2.setBounds(0, 140, 420, 50);

        Property_CardRegion.add(Property_NoRentCard, "NoRent");

        PropertyPanel.add(Property_CardRegion);
        Property_CardRegion.setBounds(0, 0, 420, 430);

        javax.swing.GroupLayout PropertyWindowLayout = new javax.swing.GroupLayout(PropertyWindow.getContentPane());
        PropertyWindow.getContentPane().setLayout(PropertyWindowLayout);
        PropertyWindowLayout.setHorizontalGroup(
            PropertyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PropertyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PropertyWindowLayout.setVerticalGroup(
            PropertyWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PropertyWindowLayout.createSequentialGroup()
                .addComponent(PropertyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        ViewAssetsWindow.setBackground(new java.awt.Color(45, 45, 45));
        ViewAssetsWindow.setResizable(false);
        ViewAssetsWindow.setSize(new java.awt.Dimension(1200, 800));

        ViewAssetsPanel.setPreferredSize(new java.awt.Dimension(1200, 750));
        ViewAssetsPanel.setLayout(null);

        ViewAssets_TitlePanel.setBackground(new java.awt.Color(0, 0, 0));
        ViewAssets_TitlePanel.setLayout(null);

        ViewAssets_TitleLabel.setFont(new java.awt.Font("Arial", 1, 60)); // NOI18N
        ViewAssets_TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        ViewAssets_TitleLabel.setText("Player 0 Assets");
        ViewAssets_TitlePanel.add(ViewAssets_TitleLabel);
        ViewAssets_TitleLabel.setBounds(20, 0, 530, 100);

        ViewAssets_MoneyIcon.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ViewAssets_MoneyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Money.png"))); // NOI18N
        ViewAssets_TitlePanel.add(ViewAssets_MoneyIcon);
        ViewAssets_MoneyIcon.setBounds(1100, 8, 84, 84);

        ViewAssets_MoneyLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ViewAssets_MoneyLabel.setForeground(new java.awt.Color(255, 255, 255));
        ViewAssets_MoneyLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ViewAssets_MoneyLabel.setText("1000");
        ViewAssets_TitlePanel.add(ViewAssets_MoneyLabel);
        ViewAssets_MoneyLabel.setBounds(980, 0, 110, 100);

        ViewAssets_OOJLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ViewAssets_OOJLabel.setForeground(new java.awt.Color(255, 255, 255));
        ViewAssets_OOJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ViewAssets_OOJLabel.setText("5");
        ViewAssets_OOJLabel.setPreferredSize(new java.awt.Dimension(130, 40));
        ViewAssets_TitlePanel.add(ViewAssets_OOJLabel);
        ViewAssets_OOJLabel.setBounds(700, 0, 130, 100);

        ViewAssets_OOJIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OutOfJail.png"))); // NOI18N
        ViewAssets_OOJIcon.setToolTipText("");
        ViewAssets_OOJIcon.setSize(new java.awt.Dimension(95, 75));
        ViewAssets_TitlePanel.add(ViewAssets_OOJIcon);
        ViewAssets_OOJIcon.setBounds(840, 13, 95, 75);

        ViewAssetsPanel.add(ViewAssets_TitlePanel);
        ViewAssets_TitlePanel.setBounds(0, 0, 1200, 100);

        ViewAssets_CardRegion.setBackground(new java.awt.Color(45, 45, 45));
        ViewAssets_CardRegion.setLayout(new java.awt.CardLayout());

        ViewAssets_Pg1Panel.setBackground(new java.awt.Color(40, 40, 40));
        ViewAssets_Pg1Panel.setLayout(null);

        ViewAssets_St0Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St0Card.setToolTipText("");
        ViewAssets_St0Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St0Card);
        ViewAssets_St0Card.setBounds(77, 50, 120, 192);

        ViewAssets_St1Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St1Card.setToolTipText("");
        ViewAssets_St1Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St1Card);
        ViewAssets_St1Card.setBounds(202, 50, 120, 192);

        ViewAssets_St2Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St2Card.setToolTipText("");
        ViewAssets_St2Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St2Card);
        ViewAssets_St2Card.setBounds(352, 50, 120, 192);

        ViewAssets_St3Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St3Card.setToolTipText("");
        ViewAssets_St3Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St3Card);
        ViewAssets_St3Card.setBounds(477, 50, 120, 192);

        ViewAssets_St4Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St4Card.setToolTipText("");
        ViewAssets_St4Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St4Card);
        ViewAssets_St4Card.setBounds(602, 50, 120, 192);

        ViewAssets_St5Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St5Card.setToolTipText("");
        ViewAssets_St5Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St5Card);
        ViewAssets_St5Card.setBounds(752, 50, 120, 192);

        ViewAssets_St6Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St6Card.setToolTipText("");
        ViewAssets_St6Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St6Card);
        ViewAssets_St6Card.setBounds(877, 50, 120, 192);

        ViewAssets_St7Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St7Card.setToolTipText("");
        ViewAssets_St7Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St7Card);
        ViewAssets_St7Card.setBounds(1002, 50, 120, 192);

        ViewAssets_St8Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St8Card.setToolTipText("");
        ViewAssets_St8Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St8Card);
        ViewAssets_St8Card.setBounds(215, 350, 120, 192);

        ViewAssets_St9Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St9Card.setToolTipText("");
        ViewAssets_St9Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St9Card);
        ViewAssets_St9Card.setBounds(340, 350, 120, 192);

        ViewAssets_St10Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St10Card.setToolTipText("");
        ViewAssets_St10Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St10Card);
        ViewAssets_St10Card.setBounds(465, 350, 120, 192);

        ViewAssets_St11Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St11Card.setToolTipText("");
        ViewAssets_St11Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St11Card);
        ViewAssets_St11Card.setBounds(615, 350, 120, 192);

        ViewAssets_St12Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St12Card.setToolTipText("");
        ViewAssets_St12Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St12Card);
        ViewAssets_St12Card.setBounds(740, 350, 120, 192);

        ViewAssets_St13Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St13Card.setToolTipText("");
        ViewAssets_St13Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg1Panel.add(ViewAssets_St13Card);
        ViewAssets_St13Card.setBounds(865, 350, 120, 192);

        ViewAssets_St0RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St0RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St0RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St0RentLabel.setText("Rent:");
        ViewAssets_St0RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St0RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St0RentLabel);
        ViewAssets_St0RentLabel.setBounds(77, 242, 120, 30);

        ViewAssets_St1RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St1RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St1RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St1RentLabel.setText("Rent:");
        ViewAssets_St1RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St1RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St1RentLabel);
        ViewAssets_St1RentLabel.setBounds(202, 242, 120, 30);

        ViewAssets_St2RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St2RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St2RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St2RentLabel.setText("Rent:");
        ViewAssets_St2RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St2RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St2RentLabel);
        ViewAssets_St2RentLabel.setBounds(352, 242, 120, 30);

        ViewAssets_St3RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St3RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St3RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St3RentLabel.setText("Rent:");
        ViewAssets_St3RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St3RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St3RentLabel);
        ViewAssets_St3RentLabel.setBounds(477, 242, 120, 30);

        ViewAssets_St4RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St4RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St4RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St4RentLabel.setText("Rent:");
        ViewAssets_St4RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St4RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St4RentLabel);
        ViewAssets_St4RentLabel.setBounds(602, 242, 120, 30);

        ViewAssets_St5RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St5RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St5RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St5RentLabel.setText("Rent:");
        ViewAssets_St5RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St5RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St5RentLabel);
        ViewAssets_St5RentLabel.setBounds(752, 242, 120, 30);

        ViewAssets_St6RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St6RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St6RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St6RentLabel.setText("Rent:");
        ViewAssets_St6RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St6RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St6RentLabel);
        ViewAssets_St6RentLabel.setBounds(877, 242, 120, 30);

        ViewAssets_St7RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St7RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St7RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St7RentLabel.setText("Rent:");
        ViewAssets_St7RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St7RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St7RentLabel);
        ViewAssets_St7RentLabel.setBounds(1002, 242, 120, 30);

        ViewAssets_St8RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St8RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St8RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St8RentLabel.setText("Rent:");
        ViewAssets_St8RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St8RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St8RentLabel);
        ViewAssets_St8RentLabel.setBounds(215, 542, 120, 30);

        ViewAssets_St9RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St9RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St9RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St9RentLabel.setText("Rent:");
        ViewAssets_St9RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St9RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St9RentLabel);
        ViewAssets_St9RentLabel.setBounds(340, 542, 120, 30);

        ViewAssets_St10RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St10RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St10RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St10RentLabel.setText("Rent:");
        ViewAssets_St10RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St10RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St10RentLabel);
        ViewAssets_St10RentLabel.setBounds(465, 542, 120, 30);

        ViewAssets_St11RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St11RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St11RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St11RentLabel.setText("Rent:");
        ViewAssets_St11RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St11RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St11RentLabel);
        ViewAssets_St11RentLabel.setBounds(615, 542, 120, 30);

        ViewAssets_St12RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St12RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St12RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St12RentLabel.setText("Rent:");
        ViewAssets_St12RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St12RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St12RentLabel);
        ViewAssets_St12RentLabel.setBounds(740, 542, 120, 30);

        ViewAssets_St13RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St13RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St13RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St13RentLabel.setText("Rent:");
        ViewAssets_St13RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St13RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg1Panel.add(ViewAssets_St13RentLabel);
        ViewAssets_St13RentLabel.setBounds(865, 542, 120, 30);

        ViewAssets_St0HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St0HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St0HousesLabel);
        ViewAssets_St0HousesLabel.setBounds(77, 10, 120, 40);

        ViewAssets_St1HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St1HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St1HousesLabel);
        ViewAssets_St1HousesLabel.setBounds(202, 10, 120, 40);

        ViewAssets_St2HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St2HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St2HousesLabel);
        ViewAssets_St2HousesLabel.setBounds(352, 10, 120, 40);

        ViewAssets_St3HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St3HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St3HousesLabel);
        ViewAssets_St3HousesLabel.setBounds(477, 10, 120, 40);

        ViewAssets_St4HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St4HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St4HousesLabel);
        ViewAssets_St4HousesLabel.setBounds(602, 10, 120, 40);

        ViewAssets_St5HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St5HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St5HousesLabel);
        ViewAssets_St5HousesLabel.setBounds(752, 10, 120, 40);

        ViewAssets_St6HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St6HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St6HousesLabel);
        ViewAssets_St6HousesLabel.setBounds(877, 10, 120, 40);

        ViewAssets_St7HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St7HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St7HousesLabel);
        ViewAssets_St7HousesLabel.setBounds(1002, 10, 120, 40);

        ViewAssets_St8HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St8HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St8HousesLabel);
        ViewAssets_St8HousesLabel.setBounds(215, 310, 120, 40);

        ViewAssets_St9HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St9HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St9HousesLabel);
        ViewAssets_St9HousesLabel.setBounds(340, 310, 120, 40);

        ViewAssets_St10HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St10HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St10HousesLabel);
        ViewAssets_St10HousesLabel.setBounds(465, 310, 120, 40);

        ViewAssets_St11HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St11HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St11HousesLabel);
        ViewAssets_St11HousesLabel.setBounds(615, 310, 120, 40);

        ViewAssets_St12HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St12HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St12HousesLabel);
        ViewAssets_St12HousesLabel.setBounds(740, 310, 120, 40);

        ViewAssets_St13HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St13HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg1Panel.add(ViewAssets_St13HousesLabel);
        ViewAssets_St13HousesLabel.setBounds(865, 310, 120, 40);

        ViewAssets_CardRegion.add(ViewAssets_Pg1Panel, "Pg1");

        ViewAssets_Pg2Panel.setBackground(new java.awt.Color(40, 40, 40));
        ViewAssets_Pg2Panel.setLayout(null);

        ViewAssets_St14Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St14Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_St14Card);
        ViewAssets_St14Card.setBounds(77, 50, 120, 192);

        ViewAssets_St15Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St15Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_St15Card);
        ViewAssets_St15Card.setBounds(202, 50, 120, 192);

        ViewAssets_St16Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St16Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_St16Card);
        ViewAssets_St16Card.setBounds(327, 50, 120, 192);

        ViewAssets_St17Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St17Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_St17Card);
        ViewAssets_St17Card.setBounds(477, 50, 120, 192);

        ViewAssets_St18Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St18Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_St18Card);
        ViewAssets_St18Card.setBounds(602, 50, 120, 192);

        ViewAssets_St19Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St19Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_St19Card);
        ViewAssets_St19Card.setBounds(727, 50, 120, 192);

        ViewAssets_St20Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St20Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_St20Card);
        ViewAssets_St20Card.setBounds(877, 50, 120, 192);

        ViewAssets_St21Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_St21Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_St21Card);
        ViewAssets_St21Card.setBounds(1002, 50, 120, 192);

        ViewAssets_RR0Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_RR0Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_RR0Card);
        ViewAssets_RR0Card.setBounds(215, 350, 120, 192);

        ViewAssets_RR1Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_RR1Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_RR1Card);
        ViewAssets_RR1Card.setBounds(340, 350, 120, 192);

        ViewAssets_RR2Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_RR2Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_RR2Card);
        ViewAssets_RR2Card.setBounds(465, 350, 120, 192);

        ViewAssets_RR3Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_RR3Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_RR3Card);
        ViewAssets_RR3Card.setBounds(590, 350, 120, 192);

        ViewAssets_Ut0Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_Ut0Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_Ut0Card);
        ViewAssets_Ut0Card.setBounds(740, 350, 120, 192);

        ViewAssets_Ut1Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        ViewAssets_Ut1Card.setSize(new java.awt.Dimension(120, 192));
        ViewAssets_Pg2Panel.add(ViewAssets_Ut1Card);
        ViewAssets_Ut1Card.setBounds(865, 350, 120, 192);

        ViewAssets_St14RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St14RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St14RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St14RentLabel.setText("Rent:");
        ViewAssets_St14RentLabel.setToolTipText("");
        ViewAssets_St14RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St14RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg2Panel.add(ViewAssets_St14RentLabel);
        ViewAssets_St14RentLabel.setBounds(77, 242, 120, 30);

        ViewAssets_St15RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St15RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St15RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St15RentLabel.setText("Rent:");
        ViewAssets_St15RentLabel.setToolTipText("");
        ViewAssets_St15RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St15RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg2Panel.add(ViewAssets_St15RentLabel);
        ViewAssets_St15RentLabel.setBounds(202, 242, 120, 30);

        ViewAssets_St16RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St16RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St16RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St16RentLabel.setText("Rent:");
        ViewAssets_St16RentLabel.setToolTipText("");
        ViewAssets_St16RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St16RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg2Panel.add(ViewAssets_St16RentLabel);
        ViewAssets_St16RentLabel.setBounds(327, 242, 120, 30);

        ViewAssets_St17RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St17RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St17RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St17RentLabel.setText("Rent:");
        ViewAssets_St17RentLabel.setToolTipText("");
        ViewAssets_St17RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St17RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg2Panel.add(ViewAssets_St17RentLabel);
        ViewAssets_St17RentLabel.setBounds(477, 242, 120, 30);

        ViewAssets_St18RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St18RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St18RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St18RentLabel.setText("Rent:");
        ViewAssets_St18RentLabel.setToolTipText("");
        ViewAssets_St18RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St18RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg2Panel.add(ViewAssets_St18RentLabel);
        ViewAssets_St18RentLabel.setBounds(602, 242, 120, 30);

        ViewAssets_St19RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St19RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St19RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St19RentLabel.setText("Rent:");
        ViewAssets_St19RentLabel.setToolTipText("");
        ViewAssets_St19RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St19RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg2Panel.add(ViewAssets_St19RentLabel);
        ViewAssets_St19RentLabel.setBounds(727, 242, 120, 30);

        ViewAssets_St20RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St20RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St20RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St20RentLabel.setText("Rent:");
        ViewAssets_St20RentLabel.setToolTipText("");
        ViewAssets_St20RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St20RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg2Panel.add(ViewAssets_St20RentLabel);
        ViewAssets_St20RentLabel.setBounds(877, 242, 120, 30);

        ViewAssets_St21RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_St21RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_St21RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_St21RentLabel.setText("Rent:");
        ViewAssets_St21RentLabel.setToolTipText("");
        ViewAssets_St21RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_St21RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg2Panel.add(ViewAssets_St21RentLabel);
        ViewAssets_St21RentLabel.setBounds(1002, 242, 120, 30);

        ViewAssets_RR0RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_RR0RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_RR0RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_RR0RentLabel.setText("Rent:");
        ViewAssets_RR0RentLabel.setToolTipText("");
        ViewAssets_RR0RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_RR0RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg2Panel.add(ViewAssets_RR0RentLabel);
        ViewAssets_RR0RentLabel.setBounds(215, 542, 120, 30);

        ViewAssets_RR1RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_RR1RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_RR1RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_RR1RentLabel.setText("Rent:");
        ViewAssets_RR1RentLabel.setToolTipText("");
        ViewAssets_RR1RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_RR1RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg2Panel.add(ViewAssets_RR1RentLabel);
        ViewAssets_RR1RentLabel.setBounds(340, 542, 120, 30);

        ViewAssets_RR2RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_RR2RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_RR2RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_RR2RentLabel.setText("Rent:");
        ViewAssets_RR2RentLabel.setToolTipText("");
        ViewAssets_RR2RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_RR2RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg2Panel.add(ViewAssets_RR2RentLabel);
        ViewAssets_RR2RentLabel.setBounds(465, 542, 120, 30);

        ViewAssets_RR3RentLabel.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ViewAssets_RR3RentLabel.setForeground(new java.awt.Color(230, 230, 230));
        ViewAssets_RR3RentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewAssets_RR3RentLabel.setText("Rent:");
        ViewAssets_RR3RentLabel.setToolTipText("");
        ViewAssets_RR3RentLabel.setPreferredSize(new java.awt.Dimension(120, 30));
        ViewAssets_RR3RentLabel.setSize(new java.awt.Dimension(120, 30));
        ViewAssets_Pg2Panel.add(ViewAssets_RR3RentLabel);
        ViewAssets_RR3RentLabel.setBounds(590, 542, 120, 30);

        ViewAssets_St14HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St14HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg2Panel.add(ViewAssets_St14HousesLabel);
        ViewAssets_St14HousesLabel.setBounds(77, 10, 120, 40);

        ViewAssets_St15HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St15HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg2Panel.add(ViewAssets_St15HousesLabel);
        ViewAssets_St15HousesLabel.setBounds(202, 10, 120, 40);

        ViewAssets_St16HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St16HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg2Panel.add(ViewAssets_St16HousesLabel);
        ViewAssets_St16HousesLabel.setBounds(327, 10, 120, 40);

        ViewAssets_St17HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St17HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg2Panel.add(ViewAssets_St17HousesLabel);
        ViewAssets_St17HousesLabel.setBounds(477, 10, 120, 40);

        ViewAssets_St18HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St18HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg2Panel.add(ViewAssets_St18HousesLabel);
        ViewAssets_St18HousesLabel.setBounds(602, 10, 120, 40);

        ViewAssets_St19HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St19HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg2Panel.add(ViewAssets_St19HousesLabel);
        ViewAssets_St19HousesLabel.setBounds(727, 10, 120, 40);

        ViewAssets_St20HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St20HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg2Panel.add(ViewAssets_St20HousesLabel);
        ViewAssets_St20HousesLabel.setBounds(877, 10, 120, 40);

        ViewAssets_St21HousesLabel.setPreferredSize(new java.awt.Dimension(120, 40));
        ViewAssets_St21HousesLabel.setSize(new java.awt.Dimension(120, 40));
        ViewAssets_Pg2Panel.add(ViewAssets_St21HousesLabel);
        ViewAssets_St21HousesLabel.setBounds(1002, 10, 120, 40);

        ViewAssets_CardRegion.add(ViewAssets_Pg2Panel, "Pg2");

        ViewAssetsPanel.add(ViewAssets_CardRegion);
        ViewAssets_CardRegion.setBounds(0, 100, 1200, 590);

        ViewAssets_BottomPanel.setBackground(new java.awt.Color(0, 0, 0));
        ViewAssets_BottomPanel.setLayout(null);

        ViewAssets_PageChangerButton.setBackground(new java.awt.Color(45, 45, 45));
        ViewAssets_PageChangerButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ViewAssets_PageChangerButton.setForeground(new java.awt.Color(255, 255, 255));
        ViewAssets_PageChangerButton.setText("Next Page");
        ViewAssets_PageChangerButton.setPreferredSize(new java.awt.Dimension(160, 30));
        ViewAssets_PageChangerButton.setSize(new java.awt.Dimension(160, 30));
        ViewAssets_PageChangerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAssets_PageChangerButtonActionPerformed(evt);
            }
        });
        ViewAssets_BottomPanel.add(ViewAssets_PageChangerButton);
        ViewAssets_PageChangerButton.setBounds(520, 40, 160, 30);

        ViewAssetsPanel.add(ViewAssets_BottomPanel);
        ViewAssets_BottomPanel.setBounds(0, 690, 1200, 110);

        javax.swing.GroupLayout ViewAssetsWindowLayout = new javax.swing.GroupLayout(ViewAssetsWindow.getContentPane());
        ViewAssetsWindow.getContentPane().setLayout(ViewAssetsWindowLayout);
        ViewAssetsWindowLayout.setHorizontalGroup(
            ViewAssetsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewAssetsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ViewAssetsWindowLayout.setVerticalGroup(
            ViewAssetsWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewAssetsWindowLayout.createSequentialGroup()
                .addComponent(ViewAssetsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        NeutralSpaceWindow.setResizable(false);
        NeutralSpaceWindow.setSize(new java.awt.Dimension(700, 450));
        NeutralSpaceWindow.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                NeutralSpaceWindowComponentShown(evt);
            }
        });

        NeutralSpacePanel.setBackground(new java.awt.Color(209, 239, 203));
        NeutralSpacePanel.setLayout(null);

        NeutralSpace_Message.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        NeutralSpace_Message.setForeground(new java.awt.Color(0, 0, 0));
        NeutralSpace_Message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NeutralSpace_Message.setText("Free Parking");
        NeutralSpacePanel.add(NeutralSpace_Message);
        NeutralSpace_Message.setBounds(0, 10, 700, 60);

        NeutralSpace_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NeutralSpace_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/FreeParking.png"))); // NOI18N
        NeutralSpacePanel.add(NeutralSpace_Icon);
        NeutralSpace_Icon.setBounds(0, 80, 700, 300);

        NeutralSpace_OKButton.setBackground(new java.awt.Color(255, 255, 255));
        NeutralSpace_OKButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NeutralSpace_OKButton.setForeground(new java.awt.Color(0, 0, 0));
        NeutralSpace_OKButton.setText("OK");
        NeutralSpace_OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeutralSpace_OKButtonActionPerformed(evt);
            }
        });
        NeutralSpacePanel.add(NeutralSpace_OKButton);
        NeutralSpace_OKButton.setBounds(310, 390, 80, 30);

        javax.swing.GroupLayout NeutralSpaceWindowLayout = new javax.swing.GroupLayout(NeutralSpaceWindow.getContentPane());
        NeutralSpaceWindow.getContentPane().setLayout(NeutralSpaceWindowLayout);
        NeutralSpaceWindowLayout.setHorizontalGroup(
            NeutralSpaceWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NeutralSpacePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        NeutralSpaceWindowLayout.setVerticalGroup(
            NeutralSpaceWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NeutralSpacePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JailWindow.setResizable(false);
        JailWindow.setSize(new java.awt.Dimension(700, 450));

        JailPanel.setBackground(new java.awt.Color(66, 112, 178));
        JailPanel.setLayout(null);

        Jail_Message.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Jail_Message.setForeground(new java.awt.Color(255, 255, 255));
        Jail_Message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jail_Message.setText("Go to Jail!");
        JailPanel.add(Jail_Message);
        Jail_Message.setBounds(0, 10, 700, 60);

        Jail_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jail_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GoJail.png"))); // NOI18N
        Jail_Icon.setToolTipText("");
        JailPanel.add(Jail_Icon);
        Jail_Icon.setBounds(0, 80, 700, 300);

        Jail_OKButton.setBackground(new java.awt.Color(255, 255, 255));
        Jail_OKButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Jail_OKButton.setForeground(new java.awt.Color(0, 0, 0));
        Jail_OKButton.setText("OK");
        Jail_OKButton.setPreferredSize(new java.awt.Dimension(80, 30));
        Jail_OKButton.setSize(new java.awt.Dimension(80, 30));
        Jail_OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jail_OKButtonActionPerformed(evt);
            }
        });
        JailPanel.add(Jail_OKButton);
        Jail_OKButton.setBounds(310, 390, 80, 30);

        javax.swing.GroupLayout JailWindowLayout = new javax.swing.GroupLayout(JailWindow.getContentPane());
        JailWindow.getContentPane().setLayout(JailWindowLayout);
        JailWindowLayout.setHorizontalGroup(
            JailWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );
        JailWindowLayout.setVerticalGroup(
            JailWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        ChanceWindow.setResizable(false);
        ChanceWindow.setSize(new java.awt.Dimension(700, 473));
        ChanceWindow.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ChanceWindowComponentShown(evt);
            }
        });

        Chance_CardRegion.setLayout(new java.awt.CardLayout());

        Chance_InitialCard.setPreferredSize(new java.awt.Dimension(700, 473));

        Chance_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Chance.png"))); // NOI18N
        Chance_InitialCard.setLayer(Chance_Background, 1);
        Chance_InitialCard.add(Chance_Background);
        Chance_Background.setBounds(0, 0, 700, 450);

        Chance_TurnOverButton.setBackground(new java.awt.Color(255, 255, 255));
        Chance_TurnOverButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Chance_TurnOverButton.setForeground(new java.awt.Color(0, 0, 0));
        Chance_TurnOverButton.setText("Turn Over");
        Chance_TurnOverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chance_TurnOverButtonActionPerformed(evt);
            }
        });
        Chance_InitialCard.setLayer(Chance_TurnOverButton, 2);
        Chance_InitialCard.add(Chance_TurnOverButton);
        Chance_TurnOverButton.setBounds(560, 390, 110, 30);

        Chance_CardRegion.add(Chance_InitialCard, "Initial");
        Chance_InitialCard.getAccessibleContext().setAccessibleName("");

        Chance_RevealCard.setBackground(new java.awt.Color(209, 239, 203));
        Chance_RevealCard.setLayout(null);

        Chance_TitlePanel.setBackground(new java.awt.Color(45, 45, 45));
        Chance_TitlePanel.setLayout(new java.awt.GridBagLayout());

        Chance_TitleLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Chance_TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        Chance_TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Chance_TitleLabel.setText("Chance");
        Chance_TitlePanel.add(Chance_TitleLabel, new java.awt.GridBagConstraints());

        Chance_RevealCard.add(Chance_TitlePanel);
        Chance_TitlePanel.setBounds(0, 0, 700, 80);

        Chance_EffectMessage1.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Chance_EffectMessage1.setForeground(new java.awt.Color(0, 0, 0));
        Chance_EffectMessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Chance_EffectMessage1.setText("I haven't coded this yet lol");
        Chance_RevealCard.add(Chance_EffectMessage1);
        Chance_EffectMessage1.setBounds(0, 140, 700, 40);

        Chance_EffectMessage2.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Chance_EffectMessage2.setForeground(new java.awt.Color(0, 0, 0));
        Chance_EffectMessage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Chance_EffectMessage2.setText("I haven't coded this yet lol");
        Chance_RevealCard.add(Chance_EffectMessage2);
        Chance_EffectMessage2.setBounds(0, 180, 700, 40);

        Chance_EffectMessage3.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Chance_EffectMessage3.setForeground(new java.awt.Color(0, 0, 0));
        Chance_EffectMessage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Chance_EffectMessage3.setText("I haven't coded this yet lol");
        Chance_RevealCard.add(Chance_EffectMessage3);
        Chance_EffectMessage3.setBounds(0, 220, 700, 40);

        Chance_OKButton.setBackground(new java.awt.Color(255, 255, 255));
        Chance_OKButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Chance_OKButton.setForeground(new java.awt.Color(0, 0, 0));
        Chance_OKButton.setText("OK");
        Chance_OKButton.setPreferredSize(new java.awt.Dimension(80, 30));
        Chance_OKButton.setSize(new java.awt.Dimension(80, 30));
        Chance_OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chance_OKButtonActionPerformed(evt);
            }
        });
        Chance_RevealCard.add(Chance_OKButton);
        Chance_OKButton.setBounds(310, 370, 80, 30);

        Chance_CardRegion.add(Chance_RevealCard, "Reveal");

        javax.swing.GroupLayout ChanceWindowLayout = new javax.swing.GroupLayout(ChanceWindow.getContentPane());
        ChanceWindow.getContentPane().setLayout(ChanceWindowLayout);
        ChanceWindowLayout.setHorizontalGroup(
            ChanceWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Chance_CardRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ChanceWindowLayout.setVerticalGroup(
            ChanceWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Chance_CardRegion, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        TaxWindow.setResizable(false);
        TaxWindow.setSize(new java.awt.Dimension(700, 450));
        TaxWindow.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                TaxWindowComponentShown(evt);
            }
        });

        TaxPanel.setBackground(new java.awt.Color(209, 239, 203));
        TaxPanel.setPreferredSize(new java.awt.Dimension(700, 450));
        TaxPanel.setSize(new java.awt.Dimension(700, 473));
        TaxPanel.setLayout(null);

        Tax_TitleLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        Tax_TitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        Tax_TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tax_TitleLabel.setText("Income Tax");
        TaxPanel.add(Tax_TitleLabel);
        Tax_TitleLabel.setBounds(0, 10, 700, 70);

        Tax_MessageLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Tax_MessageLabel.setForeground(new java.awt.Color(0, 0, 0));
        Tax_MessageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tax_MessageLabel.setText("You owe 200");
        TaxPanel.add(Tax_MessageLabel);
        Tax_MessageLabel.setBounds(0, 80, 700, 40);

        Tax_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tax_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LuxuryTax.png"))); // NOI18N
        TaxPanel.add(Tax_Icon);
        Tax_Icon.setBounds(0, 120, 700, 240);

        Tax_OKButton.setBackground(new java.awt.Color(255, 255, 255));
        Tax_OKButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Tax_OKButton.setForeground(new java.awt.Color(0, 0, 0));
        Tax_OKButton.setText("OK");
        Tax_OKButton.setPreferredSize(new java.awt.Dimension(80, 30));
        Tax_OKButton.setSize(new java.awt.Dimension(80, 30));
        Tax_OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tax_OKButtonActionPerformed(evt);
            }
        });
        TaxPanel.add(Tax_OKButton);
        Tax_OKButton.setBounds(310, 390, 80, 30);

        javax.swing.GroupLayout TaxWindowLayout = new javax.swing.GroupLayout(TaxWindow.getContentPane());
        TaxWindow.getContentPane().setLayout(TaxWindowLayout);
        TaxWindowLayout.setHorizontalGroup(
            TaxWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TaxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TaxWindowLayout.setVerticalGroup(
            TaxWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TaxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 441, Short.MAX_VALUE)
        );

        HousesWindow.setResizable(false);
        HousesWindow.setSize(new java.awt.Dimension(800, 623));
        HousesWindow.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                HousesWindowComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                HousesWindowComponentShown(evt);
            }
        });

        HousesPanel.setBackground(new java.awt.Color(209, 239, 203));
        HousesPanel.setLayout(null);

        Houses_TitleLabel.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Houses_TitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        Houses_TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Houses_TitleLabel.setText("Which full set would you like to develop?");
        HousesPanel.add(Houses_TitleLabel);
        Houses_TitleLabel.setBounds(0, 0, 800, 80);

        Houses_RemainingLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Houses_RemainingLabel.setForeground(new java.awt.Color(0, 0, 0));
        Houses_RemainingLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Houses_RemainingLabel.setText("Houses remaining:");
        HousesPanel.add(Houses_RemainingLabel);
        Houses_RemainingLabel.setBounds(10, 100, 190, 20);

        Houses_BrownButton.setBackground(new java.awt.Color(209, 239, 203));
        FullSetsButtonGroup.add(Houses_BrownButton);
        Houses_BrownButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Houses_BrownButton.setForeground(new java.awt.Color(0, 0, 0));
        Houses_BrownButton.setText("Brown");
        Houses_BrownButton.setPreferredSize(new java.awt.Dimension(150, 30));
        Houses_BrownButton.setSize(new java.awt.Dimension(150, 30));
        Houses_BrownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Houses_BrownButtonActionPerformed(evt);
            }
        });
        HousesPanel.add(Houses_BrownButton);
        Houses_BrownButton.setBounds(30, 140, 150, 30);

        Houses_LightBlueButton.setBackground(new java.awt.Color(209, 239, 203));
        FullSetsButtonGroup.add(Houses_LightBlueButton);
        Houses_LightBlueButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Houses_LightBlueButton.setForeground(new java.awt.Color(0, 0, 0));
        Houses_LightBlueButton.setText("Light Blue");
        Houses_LightBlueButton.setPreferredSize(new java.awt.Dimension(150, 30));
        Houses_LightBlueButton.setSize(new java.awt.Dimension(150, 30));
        Houses_LightBlueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Houses_LightBlueButtonActionPerformed(evt);
            }
        });
        HousesPanel.add(Houses_LightBlueButton);
        Houses_LightBlueButton.setBounds(30, 190, 150, 30);

        Houses_PinkButton.setBackground(new java.awt.Color(209, 239, 203));
        FullSetsButtonGroup.add(Houses_PinkButton);
        Houses_PinkButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Houses_PinkButton.setForeground(new java.awt.Color(0, 0, 0));
        Houses_PinkButton.setText("Pink");
        Houses_PinkButton.setPreferredSize(new java.awt.Dimension(150, 30));
        Houses_PinkButton.setSize(new java.awt.Dimension(150, 30));
        Houses_PinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Houses_PinkButtonActionPerformed(evt);
            }
        });
        HousesPanel.add(Houses_PinkButton);
        Houses_PinkButton.setBounds(30, 240, 150, 30);

        Houses_OrangeButton.setBackground(new java.awt.Color(209, 239, 203));
        FullSetsButtonGroup.add(Houses_OrangeButton);
        Houses_OrangeButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Houses_OrangeButton.setForeground(new java.awt.Color(0, 0, 0));
        Houses_OrangeButton.setText("Orange");
        Houses_OrangeButton.setPreferredSize(new java.awt.Dimension(150, 30));
        Houses_OrangeButton.setSize(new java.awt.Dimension(150, 30));
        Houses_OrangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Houses_OrangeButtonActionPerformed(evt);
            }
        });
        HousesPanel.add(Houses_OrangeButton);
        Houses_OrangeButton.setBounds(30, 290, 150, 30);

        Houses_RedButton.setBackground(new java.awt.Color(209, 239, 203));
        FullSetsButtonGroup.add(Houses_RedButton);
        Houses_RedButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Houses_RedButton.setForeground(new java.awt.Color(0, 0, 0));
        Houses_RedButton.setText("Red");
        Houses_RedButton.setPreferredSize(new java.awt.Dimension(150, 30));
        Houses_RedButton.setSize(new java.awt.Dimension(150, 30));
        Houses_RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Houses_RedButtonActionPerformed(evt);
            }
        });
        HousesPanel.add(Houses_RedButton);
        Houses_RedButton.setBounds(30, 340, 150, 30);

        Houses_YellowButton.setBackground(new java.awt.Color(209, 239, 203));
        FullSetsButtonGroup.add(Houses_YellowButton);
        Houses_YellowButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Houses_YellowButton.setForeground(new java.awt.Color(0, 0, 0));
        Houses_YellowButton.setText("Yellow");
        Houses_YellowButton.setPreferredSize(new java.awt.Dimension(150, 30));
        Houses_YellowButton.setSize(new java.awt.Dimension(150, 30));
        Houses_YellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Houses_YellowButtonActionPerformed(evt);
            }
        });
        HousesPanel.add(Houses_YellowButton);
        Houses_YellowButton.setBounds(30, 390, 150, 30);

        Houses_GreenButton.setBackground(new java.awt.Color(209, 239, 203));
        FullSetsButtonGroup.add(Houses_GreenButton);
        Houses_GreenButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Houses_GreenButton.setForeground(new java.awt.Color(0, 0, 0));
        Houses_GreenButton.setText("Green");
        Houses_GreenButton.setPreferredSize(new java.awt.Dimension(150, 30));
        Houses_GreenButton.setSize(new java.awt.Dimension(150, 30));
        Houses_GreenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Houses_GreenButtonActionPerformed(evt);
            }
        });
        HousesPanel.add(Houses_GreenButton);
        Houses_GreenButton.setBounds(30, 440, 150, 30);

        Houses_BlueButton.setBackground(new java.awt.Color(209, 239, 203));
        FullSetsButtonGroup.add(Houses_BlueButton);
        Houses_BlueButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Houses_BlueButton.setForeground(new java.awt.Color(0, 0, 0));
        Houses_BlueButton.setText("Blue");
        Houses_BlueButton.setPreferredSize(new java.awt.Dimension(150, 30));
        Houses_BlueButton.setSize(new java.awt.Dimension(150, 30));
        Houses_BlueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Houses_BlueButtonActionPerformed(evt);
            }
        });
        HousesPanel.add(Houses_BlueButton);
        Houses_BlueButton.setBounds(30, 490, 150, 30);

        Houses_CardRegion.setLayout(new java.awt.CardLayout());

        Houses_BlankCard.setBackground(new java.awt.Color(255, 255, 255));
        Houses_BlankCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout Houses_BlankCardLayout = new javax.swing.GroupLayout(Houses_BlankCard);
        Houses_BlankCard.setLayout(Houses_BlankCardLayout);
        Houses_BlankCardLayout.setHorizontalGroup(
            Houses_BlankCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        Houses_BlankCardLayout.setVerticalGroup(
            Houses_BlankCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );

        Houses_CardRegion.add(Houses_BlankCard, "Blank");

        Houses_BuyCard1.setBackground(new java.awt.Color(255, 255, 0));
        Houses_BuyCard1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Houses_BuyCard1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Houses_BuyCard1ComponentShown(evt);
            }
        });
        Houses_BuyCard1.setLayout(null);

        Houses_BuyProperty1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smallpropertycards/St15.png"))); // NOI18N
        Houses_BuyCard1.add(Houses_BuyProperty1);
        Houses_BuyProperty1.setBounds(80, 100, 120, 192);

        Houses_BuyProperty2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smallpropertycards/St16.png"))); // NOI18N
        Houses_BuyCard1.add(Houses_BuyProperty2);
        Houses_BuyProperty2.setBounds(230, 100, 120, 192);

        Houses_BuyProperty3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smallpropertycards/St17.png"))); // NOI18N
        Houses_BuyCard1.add(Houses_BuyProperty3);
        Houses_BuyProperty3.setBounds(380, 100, 120, 192);

        Houses_BuyHouses1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houseimages/4House.png"))); // NOI18N
        Houses_BuyHouses1.setSize(new java.awt.Dimension(120, 30));
        Houses_BuyCard1.add(Houses_BuyHouses1);
        Houses_BuyHouses1.setBounds(80, 65, 120, 30);

        Houses_BuyHouses2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houseimages/4House.png"))); // NOI18N
        Houses_BuyHouses2.setSize(new java.awt.Dimension(120, 30));
        Houses_BuyCard1.add(Houses_BuyHouses2);
        Houses_BuyHouses2.setBounds(230, 65, 120, 30);

        Houses_BuyHouses3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/houseimages/4House.png"))); // NOI18N
        Houses_BuyHouses3.setSize(new java.awt.Dimension(120, 30));
        Houses_BuyCard1.add(Houses_BuyHouses3);
        Houses_BuyHouses3.setBounds(380, 65, 120, 30);

        Houses_BuySlider.setMaximum(10);
        Houses_BuySlider.setMinorTickSpacing(1);
        Houses_BuySlider.setPaintLabels(true);
        Houses_BuySlider.setPaintTicks(true);
        Houses_BuySlider.setSnapToTicks(true);
        Houses_BuySlider.setValue(0);
        Houses_BuySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Houses_BuySliderStateChanged(evt);
            }
        });
        Houses_BuyCard1.add(Houses_BuySlider);
        Houses_BuySlider.setBounds(40, 20, 500, 27);

        Houses_QuantityLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Houses_QuantityLabel.setForeground(new java.awt.Color(0, 0, 0));
        Houses_QuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Houses_QuantityLabel.setText("4 Houses");
        Houses_QuantityLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        Houses_BuyCard1.add(Houses_QuantityLabel);
        Houses_QuantityLabel.setBounds(0, 300, 580, 30);

        Houses_CostLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Houses_CostLabel.setForeground(new java.awt.Color(0, 0, 0));
        Houses_CostLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Houses_CostLabel.setText("Cost: 600");
        Houses_CostLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        Houses_BuyCard1.add(Houses_CostLabel);
        Houses_CostLabel.setBounds(0, 330, 580, 30);

        Houses_PlayerMoneyLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Houses_PlayerMoneyLabel.setForeground(new java.awt.Color(0, 0, 0));
        Houses_PlayerMoneyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Houses_PlayerMoneyLabel.setText("You have: 1000");
        Houses_PlayerMoneyLabel.setPreferredSize(new java.awt.Dimension(100, 30));
        Houses_BuyCard1.add(Houses_PlayerMoneyLabel);
        Houses_PlayerMoneyLabel.setBounds(0, 360, 580, 30);

        Houses_BuyButton.setBackground(new java.awt.Color(255, 255, 255));
        Houses_BuyButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Houses_BuyButton.setForeground(new java.awt.Color(0, 0, 0));
        Houses_BuyButton.setText("Buy");
        Houses_BuyButton.setPreferredSize(new java.awt.Dimension(80, 35));
        Houses_BuyButton.setSize(new java.awt.Dimension(80, 35));
        Houses_BuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Houses_BuyButtonActionPerformed(evt);
            }
        });
        Houses_BuyCard1.add(Houses_BuyButton);
        Houses_BuyButton.setBounds(250, 400, 80, 35);

        Houses_CardRegion.add(Houses_BuyCard1, "Buy1");

        Houses_SellHotelCard.setBackground(new java.awt.Color(255, 255, 255));
        Houses_SellHotelCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Houses_SellHotelCard.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Houses_SellHotelCardComponentShown(evt);
            }
        });
        Houses_SellHotelCard.setLayout(null);

        Houses_SellHotelTitleLabel.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Houses_SellHotelTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        Houses_SellHotelTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Houses_SellHotelTitleLabel.setText("You have hotels on this full set.");
        Houses_SellHotelCard.add(Houses_SellHotelTitleLabel);
        Houses_SellHotelTitleLabel.setBounds(0, 20, 580, 50);

        Houses_SellHotelMessage1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Houses_SellHotelMessage1.setForeground(new java.awt.Color(0, 0, 0));
        Houses_SellHotelMessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Houses_SellHotelMessage1.setText("You cannot sell hotels individually.");
        Houses_SellHotelMessage1.setPreferredSize(new java.awt.Dimension(360, 30));
        Houses_SellHotelCard.add(Houses_SellHotelMessage1);
        Houses_SellHotelMessage1.setBounds(0, 100, 580, 30);

        Houses_SellHotelMessage2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Houses_SellHotelMessage2.setForeground(new java.awt.Color(0, 0, 0));
        Houses_SellHotelMessage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Houses_SellHotelMessage2.setText("In order to sell hotels, you must clear the");
        Houses_SellHotelCard.add(Houses_SellHotelMessage2);
        Houses_SellHotelMessage2.setBounds(0, 160, 580, 30);

        Houses_SellHotelMessage3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Houses_SellHotelMessage3.setForeground(new java.awt.Color(0, 0, 0));
        Houses_SellHotelMessage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Houses_SellHotelMessage3.setText("entire set.");
        Houses_SellHotelCard.add(Houses_SellHotelMessage3);
        Houses_SellHotelMessage3.setBounds(0, 200, 580, 30);

        Houses_SellHotelCheckbox.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Houses_SellHotelCheckbox.setForeground(new java.awt.Color(0, 0, 0));
        Houses_SellHotelCheckbox.setText("Clear set");
        Houses_SellHotelCheckbox.setSize(new java.awt.Dimension(140, 40));
        Houses_SellHotelCheckbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Houses_SellHotelCheckboxItemStateChanged(evt);
            }
        });
        Houses_SellHotelCard.add(Houses_SellHotelCheckbox);
        Houses_SellHotelCheckbox.setBounds(220, 260, 140, 40);

        Houses_SellHotelButton.setBackground(new java.awt.Color(255, 255, 255));
        Houses_SellHotelButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Houses_SellHotelButton.setForeground(new java.awt.Color(0, 0, 0));
        Houses_SellHotelButton.setText("Sell");
        Houses_SellHotelButton.setToolTipText("");
        Houses_SellHotelButton.setSize(new java.awt.Dimension(100, 35));
        Houses_SellHotelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Houses_SellHotelButtonActionPerformed(evt);
            }
        });
        Houses_SellHotelCard.add(Houses_SellHotelButton);
        Houses_SellHotelButton.setBounds(450, 385, 100, 35);

        Houses_SellHotelEarningsLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Houses_SellHotelEarningsLabel.setForeground(new java.awt.Color(0, 0, 0));
        Houses_SellHotelEarningsLabel.setText("Earnings:");
        Houses_SellHotelEarningsLabel.setPreferredSize(new java.awt.Dimension(300, 30));
        Houses_SellHotelEarningsLabel.setSize(new java.awt.Dimension(300, 30));
        Houses_SellHotelCard.add(Houses_SellHotelEarningsLabel);
        Houses_SellHotelEarningsLabel.setBounds(30, 340, 300, 30);

        Houses_SellHotelYouHaveLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Houses_SellHotelYouHaveLabel.setForeground(new java.awt.Color(0, 0, 0));
        Houses_SellHotelYouHaveLabel.setText("You have:");
        Houses_SellHotelYouHaveLabel.setPreferredSize(new java.awt.Dimension(300, 30));
        Houses_SellHotelYouHaveLabel.setSize(new java.awt.Dimension(300, 30));
        Houses_SellHotelCard.add(Houses_SellHotelYouHaveLabel);
        Houses_SellHotelYouHaveLabel.setBounds(30, 390, 300, 30);

        Houses_CardRegion.add(Houses_SellHotelCard, "SellHotel");

        HousesPanel.add(Houses_CardRegion);
        Houses_CardRegion.setBounds(200, 80, 580, 450);

        Houses_SwitchBuySell.setBackground(new java.awt.Color(255, 255, 255));
        Houses_SwitchBuySell.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Houses_SwitchBuySell.setForeground(new java.awt.Color(0, 0, 0));
        Houses_SwitchBuySell.setText("Sell Menu");
        Houses_SwitchBuySell.setPreferredSize(new java.awt.Dimension(100, 35));
        Houses_SwitchBuySell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Houses_SwitchBuySellActionPerformed(evt);
            }
        });
        HousesPanel.add(Houses_SwitchBuySell);
        Houses_SwitchBuySell.setBounds(340, 550, 120, 35);

        javax.swing.GroupLayout HousesWindowLayout = new javax.swing.GroupLayout(HousesWindow.getContentPane());
        HousesWindow.getContentPane().setLayout(HousesWindowLayout);
        HousesWindowLayout.setHorizontalGroup(
            HousesWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HousesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        HousesWindowLayout.setVerticalGroup(
            HousesWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HousesWindowLayout.createSequentialGroup()
                .addComponent(HousesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MortgageWindow.setResizable(false);
        MortgageWindow.setSize(new java.awt.Dimension(800, 623));
        MortgageWindow.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                MortgageWindowComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                MortgageWindowComponentShown(evt);
            }
        });

        MortgagePanel.setBackground(new java.awt.Color(209, 239, 203));
        MortgagePanel.setLayout(null);

        Mortgage_TitleLabel.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Mortgage_TitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        Mortgage_TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mortgage_TitleLabel.setText("Which properties would you like to mortgage?");
        Mortgage_TitleLabel.setPreferredSize(new java.awt.Dimension(800, 60));
        MortgagePanel.add(Mortgage_TitleLabel);
        Mortgage_TitleLabel.setBounds(0, 10, 800, 60);

        Mortgage_ScrollPane.setPreferredSize(new java.awt.Dimension(300, 500));

        Mortgage_ScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        Mortgage_ScrollPanel.setMaximumSize(new java.awt.Dimension(250, 1400));
        Mortgage_ScrollPanel.setMinimumSize(new java.awt.Dimension(250, 1400));
        Mortgage_ScrollPanel.setPreferredSize(new java.awt.Dimension(250, 1400));
        Mortgage_ScrollPanel.setSize(new java.awt.Dimension(250, 1400));
        Mortgage_ScrollPanel.setLayout(null);

        Mortgage_CheckBox0.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox0.setText("Property");
        Mortgage_CheckBox0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox0ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox0);
        Mortgage_CheckBox0.setBounds(10, 10, 230, 35);

        Mortgage_CheckBox1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox1.setText("Property");
        Mortgage_CheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox1ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox1);
        Mortgage_CheckBox1.setBounds(10, 60, 230, 35);

        Mortgage_CheckBox2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox2.setText("Property");
        Mortgage_CheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox2ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox2);
        Mortgage_CheckBox2.setBounds(10, 110, 230, 35);

        Mortgage_CheckBox3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox3.setText("Property");
        Mortgage_CheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox3ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox3);
        Mortgage_CheckBox3.setBounds(10, 160, 230, 35);

        Mortgage_CheckBox4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox4.setText("Property");
        Mortgage_CheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox4ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox4);
        Mortgage_CheckBox4.setBounds(10, 210, 230, 35);

        Mortgage_CheckBox5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox5.setText("Property");
        Mortgage_CheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox5ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox5);
        Mortgage_CheckBox5.setBounds(10, 260, 230, 35);

        Mortgage_CheckBox6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox6.setText("Property");
        Mortgage_CheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox6ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox6);
        Mortgage_CheckBox6.setBounds(10, 310, 230, 35);

        Mortgage_CheckBox7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox7.setText("Property");
        Mortgage_CheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox7ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox7);
        Mortgage_CheckBox7.setBounds(10, 360, 230, 35);

        Mortgage_CheckBox8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox8.setText("Property");
        Mortgage_CheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox8ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox8);
        Mortgage_CheckBox8.setBounds(10, 410, 230, 35);

        Mortgage_CheckBox9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox9.setText("Property");
        Mortgage_CheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox9ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox9);
        Mortgage_CheckBox9.setBounds(10, 460, 230, 35);

        Mortgage_CheckBox10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox10.setText("Property");
        Mortgage_CheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox10ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox10);
        Mortgage_CheckBox10.setBounds(10, 510, 230, 35);

        Mortgage_CheckBox11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox11.setText("Property");
        Mortgage_CheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox11ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox11);
        Mortgage_CheckBox11.setBounds(10, 560, 230, 35);

        Mortgage_CheckBox12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox12.setText("Property");
        Mortgage_CheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox12ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox12);
        Mortgage_CheckBox12.setBounds(10, 610, 230, 35);

        Mortgage_CheckBox13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox13.setText("Property");
        Mortgage_CheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox13ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox13);
        Mortgage_CheckBox13.setBounds(10, 660, 230, 35);

        Mortgage_CheckBox14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox14.setText("Property");
        Mortgage_CheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox14ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox14);
        Mortgage_CheckBox14.setBounds(10, 710, 230, 35);

        Mortgage_CheckBox15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox15.setText("Property");
        Mortgage_CheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox15ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox15);
        Mortgage_CheckBox15.setBounds(10, 760, 230, 35);

        Mortgage_CheckBox16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox16.setText("Property");
        Mortgage_CheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox16ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox16);
        Mortgage_CheckBox16.setBounds(10, 810, 230, 35);

        Mortgage_CheckBox17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox17.setText("Property");
        Mortgage_CheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox17ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox17);
        Mortgage_CheckBox17.setBounds(10, 860, 230, 35);

        Mortgage_CheckBox18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox18.setText("Property");
        Mortgage_CheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox18ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox18);
        Mortgage_CheckBox18.setBounds(10, 910, 230, 35);

        Mortgage_CheckBox19.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox19.setText("Property");
        Mortgage_CheckBox19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox19ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox19);
        Mortgage_CheckBox19.setBounds(10, 960, 230, 35);

        Mortgage_CheckBox20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox20.setText("Property");
        Mortgage_CheckBox20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox20ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox20);
        Mortgage_CheckBox20.setBounds(10, 1010, 230, 35);

        Mortgage_CheckBox21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox21.setText("Property");
        Mortgage_CheckBox21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox21ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox21);
        Mortgage_CheckBox21.setBounds(10, 1060, 230, 35);

        Mortgage_CheckBox22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox22.setText("Property");
        Mortgage_CheckBox22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox22ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox22);
        Mortgage_CheckBox22.setBounds(10, 1110, 230, 35);

        Mortgage_CheckBox23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox23.setText("Property");
        Mortgage_CheckBox23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox23ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox23);
        Mortgage_CheckBox23.setBounds(10, 1160, 230, 35);

        Mortgage_CheckBox24.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox24.setText("Property");
        Mortgage_CheckBox24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox24ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox24);
        Mortgage_CheckBox24.setBounds(10, 1210, 230, 35);

        Mortgage_CheckBox25.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox25.setText("Property");
        Mortgage_CheckBox25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox25ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox25);
        Mortgage_CheckBox25.setBounds(10, 1260, 230, 35);

        Mortgage_CheckBox26.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox26.setText("Property");
        Mortgage_CheckBox26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox26ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox26);
        Mortgage_CheckBox26.setBounds(10, 1310, 230, 35);

        Mortgage_CheckBox27.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Mortgage_CheckBox27.setText("Property");
        Mortgage_CheckBox27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_CheckBox27ActionPerformed(evt);
            }
        });
        Mortgage_ScrollPanel.add(Mortgage_CheckBox27);
        Mortgage_CheckBox27.setBounds(10, 1360, 230, 35);

        Mortgage_ScrollPane.setViewportView(Mortgage_ScrollPanel);

        MortgagePanel.add(Mortgage_ScrollPane);
        Mortgage_ScrollPane.setBounds(20, 80, 300, 500);

        Mortgage_SwitchMenusButton.setBackground(new java.awt.Color(255, 255, 255));
        Mortgage_SwitchMenusButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Mortgage_SwitchMenusButton.setForeground(new java.awt.Color(0, 0, 0));
        Mortgage_SwitchMenusButton.setText("Switch Menus");
        Mortgage_SwitchMenusButton.setPreferredSize(new java.awt.Dimension(160, 35));
        Mortgage_SwitchMenusButton.setSize(new java.awt.Dimension(160, 35));
        Mortgage_SwitchMenusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_SwitchMenusButtonActionPerformed(evt);
            }
        });
        MortgagePanel.add(Mortgage_SwitchMenusButton);
        Mortgage_SwitchMenusButton.setBounds(480, 545, 160, 35);

        Mortgage_Message1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Mortgage_Message1.setForeground(new java.awt.Color(0, 0, 0));
        Mortgage_Message1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mortgage_Message1.setText("You can mortgage properties and receive half of");
        MortgagePanel.add(Mortgage_Message1);
        Mortgage_Message1.setBounds(320, 80, 480, 40);

        Mortgage_Message2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Mortgage_Message2.setForeground(new java.awt.Color(0, 0, 0));
        Mortgage_Message2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mortgage_Message2.setText("each property's mortgage cost.");
        MortgagePanel.add(Mortgage_Message2);
        Mortgage_Message2.setBounds(320, 120, 480, 40);

        Mortgage_Message3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Mortgage_Message3.setForeground(new java.awt.Color(0, 0, 0));
        Mortgage_Message3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mortgage_Message3.setText("To unmortgage a property later, you must pay an");
        MortgagePanel.add(Mortgage_Message3);
        Mortgage_Message3.setBounds(320, 180, 480, 40);

        Mortgage_Message4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Mortgage_Message4.setForeground(new java.awt.Color(0, 0, 0));
        Mortgage_Message4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mortgage_Message4.setText("additional 10% fee with your principal.");
        MortgagePanel.add(Mortgage_Message4);
        Mortgage_Message4.setBounds(320, 220, 480, 40);

        Mortgage_EarningsLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Mortgage_EarningsLabel.setForeground(new java.awt.Color(0, 0, 0));
        Mortgage_EarningsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mortgage_EarningsLabel.setText("Earnings:");
        Mortgage_EarningsLabel.setPreferredSize(new java.awt.Dimension(90, 30));
        MortgagePanel.add(Mortgage_EarningsLabel);
        Mortgage_EarningsLabel.setBounds(320, 290, 240, 30);

        Mortgage_EarningsValueLabel.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        Mortgage_EarningsValueLabel.setForeground(new java.awt.Color(0, 0, 0));
        Mortgage_EarningsValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mortgage_EarningsValueLabel.setText("--");
        Mortgage_EarningsValueLabel.setPreferredSize(new java.awt.Dimension(300, 130));
        MortgagePanel.add(Mortgage_EarningsValueLabel);
        Mortgage_EarningsValueLabel.setBounds(320, 320, 240, 100);

        Mortgage_Button.setBackground(new java.awt.Color(255, 255, 255));
        Mortgage_Button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Mortgage_Button.setForeground(new java.awt.Color(0, 0, 0));
        Mortgage_Button.setText("Mortgage");
        Mortgage_Button.setPreferredSize(new java.awt.Dimension(150, 35));
        Mortgage_Button.setSize(new java.awt.Dimension(140, 35));
        Mortgage_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mortgage_ButtonActionPerformed(evt);
            }
        });
        MortgagePanel.add(Mortgage_Button);
        Mortgage_Button.setBounds(490, 470, 140, 35);

        Mortgage_YouHaveLabel.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Mortgage_YouHaveLabel.setForeground(new java.awt.Color(0, 0, 0));
        Mortgage_YouHaveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mortgage_YouHaveLabel.setText("You have:");
        Mortgage_YouHaveLabel.setPreferredSize(new java.awt.Dimension(240, 30));
        Mortgage_YouHaveLabel.setSize(new java.awt.Dimension(240, 30));
        MortgagePanel.add(Mortgage_YouHaveLabel);
        Mortgage_YouHaveLabel.setBounds(560, 290, 240, 30);

        Mortgage_YouHaveValueLabel.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        Mortgage_YouHaveValueLabel.setForeground(new java.awt.Color(0, 0, 0));
        Mortgage_YouHaveValueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mortgage_YouHaveValueLabel.setText("--");
        MortgagePanel.add(Mortgage_YouHaveValueLabel);
        Mortgage_YouHaveValueLabel.setBounds(560, 320, 240, 100);

        javax.swing.GroupLayout MortgageWindowLayout = new javax.swing.GroupLayout(MortgageWindow.getContentPane());
        MortgageWindow.getContentPane().setLayout(MortgageWindowLayout);
        MortgageWindowLayout.setHorizontalGroup(
            MortgageWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MortgagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
        );
        MortgageWindowLayout.setVerticalGroup(
            MortgageWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MortgagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        TradeWindow.setResizable(false);
        TradeWindow.setSize(new java.awt.Dimension(800, 723));
        TradeWindow.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                TradeWindowComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                TradeWindowComponentShown(evt);
            }
        });

        Trade_CardRegion.setBackground(new java.awt.Color(158, 225, 226));
        Trade_CardRegion.setLayout(new java.awt.CardLayout());

        Trade_ProposalCard.setBackground(new java.awt.Color(158, 225, 226));
        Trade_ProposalCard.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Trade_ProposalCardComponentShown(evt);
            }
        });
        Trade_ProposalCard.setLayout(null);

        Proposer_NameLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Proposer_NameLabel.setForeground(new java.awt.Color(0, 0, 0));
        Proposer_NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Proposer_NameLabel.setText("Proposer Trades:");
        Proposer_NameLabel.setPreferredSize(new java.awt.Dimension(300, 25));
        Trade_ProposalCard.add(Proposer_NameLabel);
        Proposer_NameLabel.setBounds(90, 110, 300, 30);

        Proposee_NameLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Proposee_NameLabel.setForeground(new java.awt.Color(0, 0, 0));
        Proposee_NameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Proposee_NameLabel.setText("Proposee Trades:");
        Proposee_NameLabel.setPreferredSize(new java.awt.Dimension(300, 25));
        Trade_ProposalCard.add(Proposee_NameLabel);
        Proposee_NameLabel.setBounds(410, 110, 300, 30);

        ProposerAssets.setBackground(new java.awt.Color(40, 40, 40));
        ProposerAssets.setLayout(null);

        Proposer_OutOfJailIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Proposer_OutOfJailIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OutOfJailSmall.png"))); // NOI18N
        Proposer_OutOfJailIcon.setPreferredSize(new java.awt.Dimension(60, 50));
        Proposer_OutOfJailIcon.setSize(new java.awt.Dimension(60, 50));
        ProposerAssets.add(Proposer_OutOfJailIcon);
        Proposer_OutOfJailIcon.setBounds(0, 400, 60, 50);

        Proposer_OutOfJailCardsLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Proposer_OutOfJailCardsLabel.setForeground(new java.awt.Color(255, 255, 255));
        Proposer_OutOfJailCardsLabel.setText("/ 2");
        Proposer_OutOfJailCardsLabel.setPreferredSize(new java.awt.Dimension(80, 50));
        ProposerAssets.add(Proposer_OutOfJailCardsLabel);
        Proposer_OutOfJailCardsLabel.setBounds(90, 400, 30, 50);

        Proposer_MoneyLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Proposer_MoneyLabel.setForeground(new java.awt.Color(255, 255, 255));
        Proposer_MoneyLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Proposer_MoneyLabel.setText("/ 99999");
        Proposer_MoneyLabel.setPreferredSize(new java.awt.Dimension(75, 50));
        ProposerAssets.add(Proposer_MoneyLabel);
        Proposer_MoneyLabel.setBounds(190, 400, 65, 50);

        Proposer_MoneyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Proposer_MoneyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneySmall.png"))); // NOI18N
        Proposer_MoneyIcon.setPreferredSize(new java.awt.Dimension(50, 50));
        Proposer_MoneyIcon.setSize(new java.awt.Dimension(50, 50));
        ProposerAssets.add(Proposer_MoneyIcon);
        Proposer_MoneyIcon.setBounds(250, 400, 50, 50);

        Proposer_OutOfJailField.setBackground(new java.awt.Color(255, 255, 255));
        Proposer_OutOfJailField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Proposer_OutOfJailField.setForeground(new java.awt.Color(0, 0, 0));
        Proposer_OutOfJailField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Proposer_OutOfJailField.setText("0");
        Proposer_OutOfJailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150), 2));
        Proposer_OutOfJailField.setPreferredSize(new java.awt.Dimension(25, 30));
        Proposer_OutOfJailField.setSize(new java.awt.Dimension(25, 30));
        ProposerAssets.add(Proposer_OutOfJailField);
        Proposer_OutOfJailField.setBounds(60, 410, 25, 30);

        Proposer_MoneyField.setBackground(new java.awt.Color(255, 255, 255));
        Proposer_MoneyField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Proposer_MoneyField.setForeground(new java.awt.Color(0, 0, 0));
        Proposer_MoneyField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Proposer_MoneyField.setText("0");
        Proposer_MoneyField.setToolTipText("");
        Proposer_MoneyField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150), 2));
        Proposer_MoneyField.setPreferredSize(new java.awt.Dimension(60, 30));
        ProposerAssets.add(Proposer_MoneyField);
        Proposer_MoneyField.setBounds(125, 410, 60, 30);

        ProposerScrollPane.setPreferredSize(new java.awt.Dimension(300, 400));
        ProposerScrollPane.setSize(new java.awt.Dimension(300, 400));

        ProposerPanel.setBackground(new java.awt.Color(255, 255, 255));
        ProposerPanel.setPreferredSize(new java.awt.Dimension(250, 1400));
        ProposerPanel.setSize(new java.awt.Dimension(250, 1400));
        ProposerPanel.setLayout(null);

        Proposer_CheckBox0.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox0.setText("Property");
        Proposer_CheckBox0.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox0.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox0);
        Proposer_CheckBox0.setBounds(10, 10, 230, 35);

        Proposer_CheckBox1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox1.setText("Property");
        Proposer_CheckBox1.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox1.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox1);
        Proposer_CheckBox1.setBounds(10, 60, 230, 35);

        Proposer_CheckBox2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox2.setText("Property");
        Proposer_CheckBox2.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox2.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox2);
        Proposer_CheckBox2.setBounds(10, 110, 230, 35);

        Proposer_CheckBox3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox3.setText("Property");
        Proposer_CheckBox3.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox3.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox3);
        Proposer_CheckBox3.setBounds(10, 160, 230, 35);

        Proposer_CheckBox4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox4.setText("Property");
        Proposer_CheckBox4.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox4.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox4);
        Proposer_CheckBox4.setBounds(10, 210, 230, 35);

        Proposer_CheckBox5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox5.setText("Property");
        Proposer_CheckBox5.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox5.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox5);
        Proposer_CheckBox5.setBounds(10, 260, 230, 35);

        Proposer_CheckBox6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox6.setText("Property");
        Proposer_CheckBox6.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox6.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox6);
        Proposer_CheckBox6.setBounds(10, 310, 230, 35);

        Proposer_CheckBox7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox7.setText("Property");
        Proposer_CheckBox7.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox7.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox7);
        Proposer_CheckBox7.setBounds(10, 360, 230, 35);

        Proposer_CheckBox8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox8.setText("Property");
        Proposer_CheckBox8.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox8.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox8);
        Proposer_CheckBox8.setBounds(10, 410, 230, 35);

        Proposer_CheckBox9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox9.setText("Property");
        Proposer_CheckBox9.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox9.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox9);
        Proposer_CheckBox9.setBounds(10, 460, 230, 35);

        Proposer_CheckBox10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox10.setText("Property");
        Proposer_CheckBox10.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox10.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox10);
        Proposer_CheckBox10.setBounds(10, 510, 230, 35);

        Proposer_CheckBox11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox11.setText("Property");
        Proposer_CheckBox11.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox11.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox11);
        Proposer_CheckBox11.setBounds(10, 560, 230, 35);

        Proposer_CheckBox12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox12.setText("Property");
        Proposer_CheckBox12.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox12.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox12);
        Proposer_CheckBox12.setBounds(10, 610, 230, 35);

        Proposer_CheckBox13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox13.setText("Property");
        Proposer_CheckBox13.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox13.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox13);
        Proposer_CheckBox13.setBounds(10, 660, 230, 35);

        Proposer_CheckBox14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox14.setText("Property");
        Proposer_CheckBox14.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox14.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox14);
        Proposer_CheckBox14.setBounds(10, 710, 230, 35);

        Proposer_CheckBox15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox15.setText("Property");
        Proposer_CheckBox15.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox15.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox15);
        Proposer_CheckBox15.setBounds(10, 760, 230, 35);

        Proposer_CheckBox16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox16.setText("Property");
        Proposer_CheckBox16.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox16.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox16);
        Proposer_CheckBox16.setBounds(10, 810, 230, 35);

        Proposer_CheckBox17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox17.setText("Property");
        Proposer_CheckBox17.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox17.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox17);
        Proposer_CheckBox17.setBounds(10, 860, 230, 35);

        Proposer_CheckBox18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox18.setText("Property");
        Proposer_CheckBox18.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox18.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox18);
        Proposer_CheckBox18.setBounds(10, 910, 230, 35);

        Proposer_CheckBox19.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox19.setText("Property");
        Proposer_CheckBox19.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox19.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox19);
        Proposer_CheckBox19.setBounds(10, 960, 230, 35);

        Proposer_CheckBox20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox20.setText("Property");
        Proposer_CheckBox20.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox20.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox20);
        Proposer_CheckBox20.setBounds(10, 1010, 230, 35);

        Proposer_CheckBox21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox21.setText("Property");
        Proposer_CheckBox21.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox21.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox21);
        Proposer_CheckBox21.setBounds(10, 1060, 230, 35);

        Proposer_CheckBox22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox22.setText("Property");
        Proposer_CheckBox22.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox22.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox22);
        Proposer_CheckBox22.setBounds(10, 1110, 230, 35);

        Proposer_CheckBox23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox23.setText("Property");
        Proposer_CheckBox23.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox23.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox23);
        Proposer_CheckBox23.setBounds(10, 1160, 230, 35);

        Proposer_CheckBox24.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox24.setText("Property");
        Proposer_CheckBox24.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox24.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox24);
        Proposer_CheckBox24.setBounds(10, 1210, 230, 35);

        Proposer_CheckBox25.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox25.setText("Property");
        Proposer_CheckBox25.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox25.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox25);
        Proposer_CheckBox25.setBounds(10, 1260, 230, 35);

        Proposer_CheckBox26.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox26.setText("Property");
        Proposer_CheckBox26.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox26.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox26);
        Proposer_CheckBox26.setBounds(10, 1310, 230, 35);

        Proposer_CheckBox27.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposer_CheckBox27.setText("Property");
        Proposer_CheckBox27.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposer_CheckBox27.setSize(new java.awt.Dimension(230, 35));
        ProposerPanel.add(Proposer_CheckBox27);
        Proposer_CheckBox27.setBounds(10, 1360, 230, 35);

        ProposerScrollPane.setViewportView(ProposerPanel);

        ProposerAssets.add(ProposerScrollPane);
        ProposerScrollPane.setBounds(0, 0, 300, 400);

        Trade_ProposalCard.add(ProposerAssets);
        ProposerAssets.setBounds(90, 140, 300, 450);

        ProposeeAssets.setBackground(new java.awt.Color(40, 40, 40));
        ProposeeAssets.setLayout(null);

        Proposee_OutOfJailIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Proposee_OutOfJailIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OutOfJailSmall.png"))); // NOI18N
        Proposee_OutOfJailIcon.setPreferredSize(new java.awt.Dimension(60, 50));
        Proposee_OutOfJailIcon.setSize(new java.awt.Dimension(60, 50));
        ProposeeAssets.add(Proposee_OutOfJailIcon);
        Proposee_OutOfJailIcon.setBounds(0, 400, 60, 50);

        Proposee_OutOfJailCardsLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Proposee_OutOfJailCardsLabel.setForeground(new java.awt.Color(255, 255, 255));
        Proposee_OutOfJailCardsLabel.setText("/ 2");
        Proposee_OutOfJailCardsLabel.setPreferredSize(new java.awt.Dimension(30, 50));
        Proposee_OutOfJailCardsLabel.setSize(new java.awt.Dimension(30, 50));
        ProposeeAssets.add(Proposee_OutOfJailCardsLabel);
        Proposee_OutOfJailCardsLabel.setBounds(90, 400, 30, 50);

        Proposee_MoneyLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Proposee_MoneyLabel.setForeground(new java.awt.Color(255, 255, 255));
        Proposee_MoneyLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Proposee_MoneyLabel.setText("/ 99999");
        Proposee_MoneyLabel.setPreferredSize(new java.awt.Dimension(65, 50));
        Proposee_MoneyLabel.setSize(new java.awt.Dimension(65, 50));
        ProposeeAssets.add(Proposee_MoneyLabel);
        Proposee_MoneyLabel.setBounds(190, 400, 65, 50);

        Proposee_MoneyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Proposee_MoneyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoneySmall.png"))); // NOI18N
        Proposee_MoneyIcon.setPreferredSize(new java.awt.Dimension(50, 50));
        Proposee_MoneyIcon.setSize(new java.awt.Dimension(50, 50));
        ProposeeAssets.add(Proposee_MoneyIcon);
        Proposee_MoneyIcon.setBounds(250, 400, 50, 50);

        Proposee_OutOfJailField.setBackground(new java.awt.Color(255, 255, 255));
        Proposee_OutOfJailField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Proposee_OutOfJailField.setForeground(new java.awt.Color(0, 0, 0));
        Proposee_OutOfJailField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Proposee_OutOfJailField.setText("0");
        Proposee_OutOfJailField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150), 2));
        Proposee_OutOfJailField.setPreferredSize(new java.awt.Dimension(25, 30));
        Proposee_OutOfJailField.setSize(new java.awt.Dimension(25, 30));
        ProposeeAssets.add(Proposee_OutOfJailField);
        Proposee_OutOfJailField.setBounds(60, 410, 25, 30);

        Proposee_MoneyField.setBackground(new java.awt.Color(255, 255, 255));
        Proposee_MoneyField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Proposee_MoneyField.setForeground(new java.awt.Color(0, 0, 0));
        Proposee_MoneyField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Proposee_MoneyField.setText("0");
        Proposee_MoneyField.setToolTipText("");
        Proposee_MoneyField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(150, 150, 150), 2));
        Proposee_MoneyField.setPreferredSize(new java.awt.Dimension(60, 30));
        ProposeeAssets.add(Proposee_MoneyField);
        Proposee_MoneyField.setBounds(125, 410, 60, 30);

        ProposeeScrollPane.setPreferredSize(new java.awt.Dimension(300, 400));

        ProposeePanel.setBackground(new java.awt.Color(255, 255, 255));
        ProposeePanel.setPreferredSize(new java.awt.Dimension(250, 1400));
        ProposeePanel.setSize(new java.awt.Dimension(250, 1400));
        ProposeePanel.setLayout(null);

        Proposee_CheckBox0.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox0.setText("Property");
        Proposee_CheckBox0.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox0.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox0);
        Proposee_CheckBox0.setBounds(10, 10, 230, 35);

        Proposee_CheckBox1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox1.setText("Property");
        Proposee_CheckBox1.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox1.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox1);
        Proposee_CheckBox1.setBounds(10, 60, 230, 35);

        Proposee_CheckBox2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox2.setText("Property");
        Proposee_CheckBox2.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox2.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox2);
        Proposee_CheckBox2.setBounds(10, 110, 230, 35);

        Proposee_CheckBox3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox3.setText("Property");
        Proposee_CheckBox3.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox3.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox3);
        Proposee_CheckBox3.setBounds(10, 160, 230, 35);

        Proposee_CheckBox4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox4.setText("Property");
        Proposee_CheckBox4.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox4.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox4);
        Proposee_CheckBox4.setBounds(10, 210, 230, 35);

        Proposee_CheckBox5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox5.setText("Property");
        Proposee_CheckBox5.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox5.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox5);
        Proposee_CheckBox5.setBounds(10, 260, 230, 35);

        Proposee_CheckBox6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox6.setText("Property");
        Proposee_CheckBox6.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox6.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox6);
        Proposee_CheckBox6.setBounds(10, 310, 230, 35);

        Proposee_CheckBox7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox7.setText("Property");
        Proposee_CheckBox7.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox7.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox7);
        Proposee_CheckBox7.setBounds(10, 360, 230, 35);

        Proposee_CheckBox8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox8.setText("Property");
        Proposee_CheckBox8.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox8.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox8);
        Proposee_CheckBox8.setBounds(10, 410, 230, 35);

        Proposee_CheckBox9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox9.setText("Property");
        Proposee_CheckBox9.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox9.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox9);
        Proposee_CheckBox9.setBounds(10, 460, 230, 35);

        Proposee_CheckBox10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox10.setText("Property");
        Proposee_CheckBox10.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox10.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox10);
        Proposee_CheckBox10.setBounds(10, 510, 230, 35);

        Proposee_CheckBox11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox11.setText("Property");
        Proposee_CheckBox11.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox11.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox11);
        Proposee_CheckBox11.setBounds(10, 560, 230, 35);

        Proposee_CheckBox12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox12.setText("Property");
        Proposee_CheckBox12.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox12.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox12);
        Proposee_CheckBox12.setBounds(10, 610, 230, 35);

        Proposee_CheckBox13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox13.setText("Property");
        Proposee_CheckBox13.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox13.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox13);
        Proposee_CheckBox13.setBounds(10, 660, 230, 35);

        Proposee_CheckBox14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox14.setText("Property");
        Proposee_CheckBox14.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox14.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox14);
        Proposee_CheckBox14.setBounds(10, 710, 230, 35);

        Proposee_CheckBox15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox15.setText("Property");
        Proposee_CheckBox15.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox15.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox15);
        Proposee_CheckBox15.setBounds(10, 760, 230, 35);

        Proposee_CheckBox16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox16.setText("Property");
        Proposee_CheckBox16.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox16.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox16);
        Proposee_CheckBox16.setBounds(10, 810, 230, 35);

        Proposee_CheckBox17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox17.setText("Property");
        Proposee_CheckBox17.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox17.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox17);
        Proposee_CheckBox17.setBounds(10, 860, 230, 35);

        Proposee_CheckBox18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox18.setText("Property");
        Proposee_CheckBox18.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox18.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox18);
        Proposee_CheckBox18.setBounds(10, 910, 230, 35);

        Proposee_CheckBox19.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox19.setText("Property");
        Proposee_CheckBox19.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox19.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox19);
        Proposee_CheckBox19.setBounds(10, 960, 230, 35);

        Proposee_CheckBox20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox20.setText("Property");
        Proposee_CheckBox20.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox20.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox20);
        Proposee_CheckBox20.setBounds(10, 1010, 230, 35);

        Proposee_CheckBox21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox21.setText("Property");
        Proposee_CheckBox21.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox21.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox21);
        Proposee_CheckBox21.setBounds(10, 1060, 230, 35);

        Proposee_CheckBox22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox22.setText("Property");
        Proposee_CheckBox22.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox22.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox22);
        Proposee_CheckBox22.setBounds(10, 1110, 230, 35);

        Proposee_CheckBox23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox23.setText("Property");
        Proposee_CheckBox23.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox23.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox23);
        Proposee_CheckBox23.setBounds(10, 1160, 230, 35);

        Proposee_CheckBox24.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox24.setText("Property");
        Proposee_CheckBox24.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox24.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox24);
        Proposee_CheckBox24.setBounds(10, 1210, 230, 35);

        Proposee_CheckBox25.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox25.setText("Property");
        Proposee_CheckBox25.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox25.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox25);
        Proposee_CheckBox25.setBounds(10, 1260, 230, 35);

        Proposee_CheckBox26.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox26.setText("Property");
        Proposee_CheckBox26.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox26.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox26);
        Proposee_CheckBox26.setBounds(10, 1310, 230, 35);

        Proposee_CheckBox27.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Proposee_CheckBox27.setText("Property");
        Proposee_CheckBox27.setPreferredSize(new java.awt.Dimension(230, 35));
        Proposee_CheckBox27.setSize(new java.awt.Dimension(230, 35));
        ProposeePanel.add(Proposee_CheckBox27);
        Proposee_CheckBox27.setBounds(10, 1360, 230, 35);

        ProposeeScrollPane.setViewportView(ProposeePanel);

        ProposeeAssets.add(ProposeeScrollPane);
        ProposeeScrollPane.setBounds(0, 0, 300, 400);

        Trade_ProposalCard.add(ProposeeAssets);
        ProposeeAssets.setBounds(410, 140, 300, 450);

        Trade_ProposeButton.setBackground(new java.awt.Color(255, 255, 255));
        Trade_ProposeButton.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Trade_ProposeButton.setForeground(new java.awt.Color(0, 0, 0));
        Trade_ProposeButton.setText("Propose");
        Trade_ProposeButton.setPreferredSize(new java.awt.Dimension(130, 40));
        Trade_ProposeButton.setSize(new java.awt.Dimension(130, 40));
        Trade_ProposeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Trade_ProposeButtonActionPerformed(evt);
            }
        });
        Trade_ProposalCard.add(Trade_ProposeButton);
        Trade_ProposeButton.setBounds(335, 620, 130, 40);

        Proposal_CancelButton.setBackground(new java.awt.Color(255, 255, 255));
        Proposal_CancelButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Proposal_CancelButton.setForeground(new java.awt.Color(0, 0, 0));
        Proposal_CancelButton.setText("Cancel");
        Proposal_CancelButton.setPreferredSize(new java.awt.Dimension(80, 30));
        Proposal_CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proposal_CancelButtonActionPerformed(evt);
            }
        });
        Trade_ProposalCard.add(Proposal_CancelButton);
        Proposal_CancelButton.setBounds(690, 650, 90, 30);

        Proposal_TitleCardRegion.setLayout(new java.awt.CardLayout());

        Proposal_InitialCard.setBackground(new java.awt.Color(158, 225, 226));
        Proposal_InitialCard.setLayout(null);

        Proposal_TitleLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        Proposal_TitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        Proposal_TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Proposal_TitleLabel.setText("Player 1 Trade Proposal to:");
        Proposal_TitleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Proposal_TitleLabel.setPreferredSize(new java.awt.Dimension(800, 80));
        Proposal_InitialCard.add(Proposal_TitleLabel);
        Proposal_TitleLabel.setBounds(30, 30, 530, 50);

        Proposal_PlayersComboBox.setBackground(new java.awt.Color(255, 255, 255));
        Proposal_PlayersComboBox.setFont(new java.awt.Font("Arial", 0, 40)); // NOI18N
        Proposal_PlayersComboBox.setForeground(new java.awt.Color(0, 0, 0));
        Proposal_PlayersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Proposal_PlayersComboBox.setPreferredSize(new java.awt.Dimension(100, 50));
        Proposal_PlayersComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proposal_PlayersComboBoxActionPerformed(evt);
            }
        });
        Proposal_InitialCard.add(Proposal_PlayersComboBox);
        Proposal_PlayersComboBox.setBounds(560, 6, 210, 74);

        Proposal_TitleCardRegion.add(Proposal_InitialCard, "Initial");

        Proposal_CounterCard.setBackground(new java.awt.Color(158, 225, 226));
        Proposal_CounterCard.setLayout(null);

        Proposal_CounterTitleLabel.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        Proposal_CounterTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        Proposal_CounterTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Proposal_CounterTitleLabel.setText("Player 1 Counter-Offer to Player 2");
        Proposal_CounterTitleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Proposal_CounterTitleLabel.setPreferredSize(new java.awt.Dimension(800, 80));
        Proposal_CounterCard.add(Proposal_CounterTitleLabel);
        Proposal_CounterTitleLabel.setBounds(0, 30, 800, 50);

        Proposal_TitleCardRegion.add(Proposal_CounterCard, "Counter");

        Trade_ProposalCard.add(Proposal_TitleCardRegion);
        Proposal_TitleCardRegion.setBounds(0, 0, 800, 100);

        Trade_CardRegion.add(Trade_ProposalCard, "Proposal");

        Trade_ReviewCard.setBackground(new java.awt.Color(158, 225, 226));
        Trade_ReviewCard.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                Trade_ReviewCardComponentShown(evt);
            }
        });
        Trade_ReviewCard.setLayout(null);

        Review_TitleLabel.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Review_TitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        Review_TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Review_TitleLabel.setText("Proposed Trade from Player 1");
        Trade_ReviewCard.add(Review_TitleLabel);
        Review_TitleLabel.setBounds(0, 20, 800, 50);

        Review_ProposerScroll.setPreferredSize(new java.awt.Dimension(600, 235));
        Review_ProposerScroll.setSize(new java.awt.Dimension(600, 235));

        Review_ProposerPanel.setBackground(new java.awt.Color(255, 255, 255));
        Review_ProposerPanel.setPreferredSize(new java.awt.Dimension(3650, 210));
        Review_ProposerPanel.setLayout(null);

        Review_ProposerPropIcon0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPanel.add(Review_ProposerPropIcon0);
        Review_ProposerPropIcon0.setBounds(10, 9, 120, 192);

        Review_ProposerPropIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon1.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon1);
        Review_ProposerPropIcon1.setBounds(140, 9, 120, 192);

        Review_ProposerPropIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon2.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon2);
        Review_ProposerPropIcon2.setBounds(270, 9, 120, 192);

        Review_ProposerPropIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon3.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon3);
        Review_ProposerPropIcon3.setBounds(400, 9, 120, 192);

        Review_ProposerPropIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon4.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon4);
        Review_ProposerPropIcon4.setBounds(530, 9, 120, 192);

        Review_ProposerPropIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon5.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon5);
        Review_ProposerPropIcon5.setBounds(660, 9, 120, 192);

        Review_ProposerPropIcon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon6.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon6);
        Review_ProposerPropIcon6.setBounds(790, 9, 120, 192);

        Review_ProposerPropIcon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon7.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon7);
        Review_ProposerPropIcon7.setBounds(920, 9, 120, 192);

        Review_ProposerPropIcon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon8.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon8);
        Review_ProposerPropIcon8.setBounds(1050, 9, 120, 192);

        Review_ProposerPropIcon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon9.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon9);
        Review_ProposerPropIcon9.setBounds(1180, 9, 120, 192);

        Review_ProposerPropIcon10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon10.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon10);
        Review_ProposerPropIcon10.setBounds(1310, 9, 120, 192);

        Review_ProposerPropIcon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon11.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon11);
        Review_ProposerPropIcon11.setBounds(1440, 9, 120, 192);

        Review_ProposerPropIcon12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon12.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon12);
        Review_ProposerPropIcon12.setBounds(1570, 9, 120, 192);

        Review_ProposerPropIcon13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon13.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon13);
        Review_ProposerPropIcon13.setBounds(1700, 9, 120, 192);

        Review_ProposerPropIcon14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon14.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon14);
        Review_ProposerPropIcon14.setBounds(1830, 9, 120, 192);

        Review_ProposerPropIcon15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon15.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon15);
        Review_ProposerPropIcon15.setBounds(1960, 9, 120, 192);

        Review_ProposerPropIcon16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon16.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon16);
        Review_ProposerPropIcon16.setBounds(2090, 9, 120, 192);

        Review_ProposerPropIcon17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon17.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon17);
        Review_ProposerPropIcon17.setBounds(2220, 9, 120, 192);

        Review_ProposerPropIcon18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon18.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon18);
        Review_ProposerPropIcon18.setBounds(2350, 9, 120, 192);

        Review_ProposerPropIcon19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon19.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon19);
        Review_ProposerPropIcon19.setBounds(2480, 9, 120, 192);

        Review_ProposerPropIcon20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon20.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon20);
        Review_ProposerPropIcon20.setBounds(2610, 9, 120, 192);

        Review_ProposerPropIcon21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon21.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon21);
        Review_ProposerPropIcon21.setBounds(2740, 9, 120, 192);

        Review_ProposerPropIcon22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon22.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon22);
        Review_ProposerPropIcon22.setBounds(2870, 9, 120, 192);

        Review_ProposerPropIcon23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon23.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon23);
        Review_ProposerPropIcon23.setBounds(3000, 9, 120, 192);

        Review_ProposerPropIcon24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon24.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon24);
        Review_ProposerPropIcon24.setBounds(3130, 9, 120, 192);

        Review_ProposerPropIcon25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon25.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon25);
        Review_ProposerPropIcon25.setBounds(3260, 9, 120, 192);

        Review_ProposerPropIcon26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon26.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon26);
        Review_ProposerPropIcon26.setBounds(3390, 9, 120, 192);

        Review_ProposerPropIcon27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposerPropIcon27.setSize(new java.awt.Dimension(120, 192));
        Review_ProposerPanel.add(Review_ProposerPropIcon27);
        Review_ProposerPropIcon27.setBounds(3520, 9, 120, 192);

        Review_ProposerScroll.setViewportView(Review_ProposerPanel);

        Trade_ReviewCard.add(Review_ProposerScroll);
        Review_ProposerScroll.setBounds(30, 100, 600, 235);

        Review_ProposeeScroll.setPreferredSize(new java.awt.Dimension(600, 235));
        Review_ProposeeScroll.setSize(new java.awt.Dimension(600, 235));

        Review_ProposeePanel.setBackground(new java.awt.Color(255, 255, 255));
        Review_ProposeePanel.setPreferredSize(new java.awt.Dimension(3650, 212));
        Review_ProposeePanel.setLayout(null);

        Review_ProposeePropIcon0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePanel.add(Review_ProposeePropIcon0);
        Review_ProposeePropIcon0.setBounds(10, 10, 120, 192);

        Review_ProposeePropIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon1.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon1);
        Review_ProposeePropIcon1.setBounds(140, 10, 120, 192);

        Review_ProposeePropIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon2.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon2);
        Review_ProposeePropIcon2.setBounds(270, 10, 120, 192);

        Review_ProposeePropIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon3.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon3);
        Review_ProposeePropIcon3.setBounds(400, 10, 120, 192);

        Review_ProposeePropIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon4.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon4);
        Review_ProposeePropIcon4.setBounds(530, 10, 120, 192);

        Review_ProposeePropIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon5.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon5);
        Review_ProposeePropIcon5.setBounds(660, 10, 120, 192);

        Review_ProposeePropIcon6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon6.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon6);
        Review_ProposeePropIcon6.setBounds(790, 10, 120, 192);

        Review_ProposeePropIcon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon7.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon7);
        Review_ProposeePropIcon7.setBounds(920, 10, 120, 192);

        Review_ProposeePropIcon8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon8.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon8);
        Review_ProposeePropIcon8.setBounds(1050, 10, 120, 192);

        Review_ProposeePropIcon9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon9.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon9);
        Review_ProposeePropIcon9.setBounds(1180, 10, 120, 192);

        Review_ProposeePropIcon10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon10.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon10);
        Review_ProposeePropIcon10.setBounds(1310, 10, 120, 192);

        Review_ProposeePropIcon11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon11.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon11);
        Review_ProposeePropIcon11.setBounds(1440, 10, 120, 192);

        Review_ProposeePropIcon12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon12.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon12);
        Review_ProposeePropIcon12.setBounds(1570, 10, 120, 192);

        Review_ProposeePropIcon13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon13.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon13);
        Review_ProposeePropIcon13.setBounds(1700, 10, 120, 192);

        Review_ProposeePropIcon14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon14.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon14);
        Review_ProposeePropIcon14.setBounds(1830, 10, 120, 192);

        Review_ProposeePropIcon15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon15.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon15);
        Review_ProposeePropIcon15.setBounds(1960, 10, 120, 192);

        Review_ProposeePropIcon16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon16.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon16);
        Review_ProposeePropIcon16.setBounds(2090, 10, 120, 192);

        Review_ProposeePropIcon17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon17.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon17);
        Review_ProposeePropIcon17.setBounds(2220, 10, 120, 192);

        Review_ProposeePropIcon18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon18.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon18);
        Review_ProposeePropIcon18.setBounds(2350, 10, 120, 192);

        Review_ProposeePropIcon19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon19.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon19);
        Review_ProposeePropIcon19.setBounds(2480, 10, 120, 192);

        Review_ProposeePropIcon20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon20.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon20);
        Review_ProposeePropIcon20.setBounds(2610, 10, 120, 192);

        Review_ProposeePropIcon21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon21.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon21);
        Review_ProposeePropIcon21.setBounds(2740, 10, 120, 192);

        Review_ProposeePropIcon22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon22.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon22);
        Review_ProposeePropIcon22.setBounds(2870, 10, 120, 192);

        Review_ProposeePropIcon23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon23.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon23);
        Review_ProposeePropIcon23.setBounds(3000, 10, 120, 192);

        Review_ProposeePropIcon24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon24.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon24);
        Review_ProposeePropIcon24.setBounds(3130, 10, 120, 192);

        Review_ProposeePropIcon25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon25.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon25);
        Review_ProposeePropIcon25.setBounds(3260, 10, 120, 192);

        Review_ProposeePropIcon26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon26.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon26);
        Review_ProposeePropIcon26.setBounds(3390, 10, 120, 192);

        Review_ProposeePropIcon27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/propertycards/BlankAsset.png"))); // NOI18N
        Review_ProposeePropIcon27.setSize(new java.awt.Dimension(120, 192));
        Review_ProposeePanel.add(Review_ProposeePropIcon27);
        Review_ProposeePropIcon27.setBounds(3520, 10, 120, 192);

        Review_ProposeeScroll.setViewportView(Review_ProposeePanel);

        Trade_ReviewCard.add(Review_ProposeeScroll);
        Review_ProposeeScroll.setBounds(30, 380, 600, 235);

        Review_ProposerLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Review_ProposerLabel.setForeground(new java.awt.Color(0, 0, 0));
        Review_ProposerLabel.setText("Proposer Receives:");
        Review_ProposerLabel.setPreferredSize(new java.awt.Dimension(200, 20));
        Review_ProposerLabel.setSize(new java.awt.Dimension(200, 20));
        Trade_ReviewCard.add(Review_ProposerLabel);
        Review_ProposerLabel.setBounds(30, 80, 200, 20);

        Review_ProposeeLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Review_ProposeeLabel.setForeground(new java.awt.Color(0, 0, 0));
        Review_ProposeeLabel.setText("Proposee Receives:");
        Review_ProposeeLabel.setPreferredSize(new java.awt.Dimension(200, 20));
        Review_ProposeeLabel.setSize(new java.awt.Dimension(200, 20));
        Trade_ReviewCard.add(Review_ProposeeLabel);
        Review_ProposeeLabel.setBounds(30, 360, 200, 20);

        Review_ProposerMoneyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Review_ProposerMoneyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Money.png"))); // NOI18N
        Trade_ReviewCard.add(Review_ProposerMoneyIcon);
        Review_ProposerMoneyIcon.setBounds(630, 120, 170, 84);

        Review_ProposerMoneyLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Review_ProposerMoneyLabel.setForeground(new java.awt.Color(0, 0, 0));
        Review_ProposerMoneyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Review_ProposerMoneyLabel.setText("99999");
        Trade_ReviewCard.add(Review_ProposerMoneyLabel);
        Review_ProposerMoneyLabel.setBounds(630, 210, 170, 40);

        Review_ProposerOutOfJailIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Review_ProposerOutOfJailIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OutOfJailSmall.png"))); // NOI18N
        Review_ProposerOutOfJailIcon.setPreferredSize(new java.awt.Dimension(50, 40));
        Review_ProposerOutOfJailIcon.setSize(new java.awt.Dimension(50, 40));
        Trade_ReviewCard.add(Review_ProposerOutOfJailIcon);
        Review_ProposerOutOfJailIcon.setBounds(670, 270, 50, 40);

        Review_ProposerOutOfJailCardsLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Review_ProposerOutOfJailCardsLabel.setForeground(new java.awt.Color(0, 0, 0));
        Review_ProposerOutOfJailCardsLabel.setText("0");
        Review_ProposerOutOfJailCardsLabel.setPreferredSize(new java.awt.Dimension(30, 40));
        Review_ProposerOutOfJailCardsLabel.setSize(new java.awt.Dimension(30, 40));
        Trade_ReviewCard.add(Review_ProposerOutOfJailCardsLabel);
        Review_ProposerOutOfJailCardsLabel.setBounds(730, 270, 30, 40);

        Review_ProposeeMoneyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Review_ProposeeMoneyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Money.png"))); // NOI18N
        Trade_ReviewCard.add(Review_ProposeeMoneyIcon);
        Review_ProposeeMoneyIcon.setBounds(630, 400, 170, 84);

        Review_ProposeeMoneyLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Review_ProposeeMoneyLabel.setForeground(new java.awt.Color(0, 0, 0));
        Review_ProposeeMoneyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Review_ProposeeMoneyLabel.setText("99999");
        Trade_ReviewCard.add(Review_ProposeeMoneyLabel);
        Review_ProposeeMoneyLabel.setBounds(630, 490, 170, 40);

        Review_ProposeeOutOfJailIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Review_ProposeeOutOfJailIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OutOfJailSmall.png"))); // NOI18N
        Review_ProposeeOutOfJailIcon.setMaximumSize(new java.awt.Dimension(50, 40));
        Review_ProposeeOutOfJailIcon.setMinimumSize(new java.awt.Dimension(50, 40));
        Review_ProposeeOutOfJailIcon.setPreferredSize(new java.awt.Dimension(50, 40));
        Review_ProposeeOutOfJailIcon.setSize(new java.awt.Dimension(50, 40));
        Trade_ReviewCard.add(Review_ProposeeOutOfJailIcon);
        Review_ProposeeOutOfJailIcon.setBounds(670, 550, 50, 40);

        Review_ProposeeOutOfJailCardsLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        Review_ProposeeOutOfJailCardsLabel.setForeground(new java.awt.Color(0, 0, 0));
        Review_ProposeeOutOfJailCardsLabel.setText("0");
        Review_ProposeeOutOfJailCardsLabel.setPreferredSize(new java.awt.Dimension(30, 40));
        Trade_ReviewCard.add(Review_ProposeeOutOfJailCardsLabel);
        Review_ProposeeOutOfJailCardsLabel.setBounds(730, 550, 30, 40);

        Review_ProposeePrompt.setBackground(new java.awt.Color(255, 255, 255));
        Review_ProposeePrompt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Review_ProposeePrompt.setForeground(new java.awt.Color(0, 0, 0));
        Review_ProposeePrompt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Review_ProposeePrompt.setText("Proposee, please decide:");
        Review_ProposeePrompt.setPreferredSize(new java.awt.Dimension(100, 35));
        Trade_ReviewCard.add(Review_ProposeePrompt);
        Review_ProposeePrompt.setBounds(80, 640, 270, 35);

        Review_AcceptButton.setBackground(new java.awt.Color(102, 255, 102));
        Review_AcceptButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Review_AcceptButton.setForeground(new java.awt.Color(0, 0, 0));
        Review_AcceptButton.setText("Accept");
        Review_AcceptButton.setPreferredSize(new java.awt.Dimension(100, 35));
        Review_AcceptButton.setSize(new java.awt.Dimension(100, 35));
        Review_AcceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Review_AcceptButtonActionPerformed(evt);
            }
        });
        Trade_ReviewCard.add(Review_AcceptButton);
        Review_AcceptButton.setBounds(380, 640, 100, 35);

        Review_CounterOfferButton.setBackground(new java.awt.Color(255, 255, 255));
        Review_CounterOfferButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Review_CounterOfferButton.setForeground(new java.awt.Color(0, 0, 0));
        Review_CounterOfferButton.setText("Counter-Offer");
        Review_CounterOfferButton.setPreferredSize(new java.awt.Dimension(100, 35));
        Review_CounterOfferButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Review_CounterOfferButtonActionPerformed(evt);
            }
        });
        Trade_ReviewCard.add(Review_CounterOfferButton);
        Review_CounterOfferButton.setBounds(500, 640, 160, 35);

        Review_DeclineButton.setBackground(new java.awt.Color(255, 0, 51));
        Review_DeclineButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Review_DeclineButton.setForeground(new java.awt.Color(0, 0, 0));
        Review_DeclineButton.setText("Decline");
        Review_DeclineButton.setPreferredSize(new java.awt.Dimension(100, 35));
        Review_DeclineButton.setSize(new java.awt.Dimension(100, 35));
        Review_DeclineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Review_DeclineButtonActionPerformed(evt);
            }
        });
        Trade_ReviewCard.add(Review_DeclineButton);
        Review_DeclineButton.setBounds(680, 640, 100, 35);

        Trade_CardRegion.add(Trade_ReviewCard, "Review");

        Trade_BlankCard.setBackground(new java.awt.Color(158, 225, 226));

        javax.swing.GroupLayout Trade_BlankCardLayout = new javax.swing.GroupLayout(Trade_BlankCard);
        Trade_BlankCard.setLayout(Trade_BlankCardLayout);
        Trade_BlankCardLayout.setHorizontalGroup(
            Trade_BlankCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        Trade_BlankCardLayout.setVerticalGroup(
            Trade_BlankCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        Trade_CardRegion.add(Trade_BlankCard, "Blank");

        javax.swing.GroupLayout TradeWindowLayout = new javax.swing.GroupLayout(TradeWindow.getContentPane());
        TradeWindow.getContentPane().setLayout(TradeWindowLayout);
        TradeWindowLayout.setHorizontalGroup(
            TradeWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Trade_CardRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TradeWindowLayout.setVerticalGroup(
            TradeWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Trade_CardRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        DebtWindow.setResizable(false);
        DebtWindow.setSize(new java.awt.Dimension(900, 623));
        DebtWindow.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                DebtWindowComponentShown(evt);
            }
        });

        Debt_CardRegion.setBackground(new java.awt.Color(139, 26, 17));
        Debt_CardRegion.setLayout(new java.awt.CardLayout());

        InDebtCard.setBackground(new java.awt.Color(139, 26, 17));
        InDebtCard.setLayout(null);

        Debt_TitleLabel.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        Debt_TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        Debt_TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Debt_TitleLabel.setText("Player 3, you're out of money!");
        InDebtCard.add(Debt_TitleLabel);
        Debt_TitleLabel.setBounds(0, 0, 900, 120);

        Debt_AmntOwedLabel.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Debt_AmntOwedLabel.setForeground(new java.awt.Color(255, 255, 255));
        Debt_AmntOwedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Debt_AmntOwedLabel.setText("Your remaining debt to Player 1 is 1000.");
        InDebtCard.add(Debt_AmntOwedLabel);
        Debt_AmntOwedLabel.setBounds(0, 120, 900, 47);

        Debt_HousesButton.setBackground(new java.awt.Color(255, 255, 255));
        Debt_HousesButton.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Debt_HousesButton.setForeground(new java.awt.Color(0, 0, 0));
        Debt_HousesButton.setText("Sell Houses / Hotels");
        Debt_HousesButton.setToolTipText("");
        Debt_HousesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Debt_HousesButtonActionPerformed(evt);
            }
        });
        InDebtCard.add(Debt_HousesButton);
        Debt_HousesButton.setBounds(280, 200, 340, 50);

        Debt_MortgageButton.setBackground(new java.awt.Color(255, 255, 255));
        Debt_MortgageButton.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Debt_MortgageButton.setForeground(new java.awt.Color(0, 0, 0));
        Debt_MortgageButton.setText("Mortgage Properties");
        Debt_MortgageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Debt_MortgageButtonActionPerformed(evt);
            }
        });
        InDebtCard.add(Debt_MortgageButton);
        Debt_MortgageButton.setBounds(280, 290, 340, 50);

        Debt_TradeButton.setBackground(new java.awt.Color(255, 255, 255));
        Debt_TradeButton.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Debt_TradeButton.setForeground(new java.awt.Color(0, 0, 0));
        Debt_TradeButton.setText("Propose a Trade");
        Debt_TradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Debt_TradeButtonActionPerformed(evt);
            }
        });
        InDebtCard.add(Debt_TradeButton);
        Debt_TradeButton.setBounds(280, 380, 340, 50);

        Debt_UpdateButton.setBackground(new java.awt.Color(0, 255, 0));
        Debt_UpdateButton.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Debt_UpdateButton.setForeground(new java.awt.Color(0, 0, 0));
        Debt_UpdateButton.setText("Update Debt Value");
        Debt_UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Debt_UpdateButtonActionPerformed(evt);
            }
        });
        InDebtCard.add(Debt_UpdateButton);
        Debt_UpdateButton.setBounds(50, 500, 310, 50);

        Debt_BankruptButton.setBackground(new java.awt.Color(255, 0, 0));
        Debt_BankruptButton.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        Debt_BankruptButton.setForeground(new java.awt.Color(255, 255, 255));
        Debt_BankruptButton.setText("Declare Bankruptcy");
        Debt_BankruptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Debt_BankruptButtonActionPerformed(evt);
            }
        });
        InDebtCard.add(Debt_BankruptButton);
        Debt_BankruptButton.setBounds(520, 500, 330, 50);

        Debt_CardRegion.add(InDebtCard, "InDebt");

        OutOfDebtCard.setBackground(new java.awt.Color(20, 230, 20));
        OutOfDebtCard.setLayout(null);

        OutOfDebt_Label1.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        OutOfDebt_Label1.setForeground(new java.awt.Color(0, 0, 0));
        OutOfDebt_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OutOfDebt_Label1.setText("You're out of");
        OutOfDebt_Label1.setPreferredSize(new java.awt.Dimension(900, 120));
        OutOfDebt_Label1.setSize(new java.awt.Dimension(900, 120));
        OutOfDebtCard.add(OutOfDebt_Label1);
        OutOfDebt_Label1.setBounds(0, 60, 900, 120);

        OutOfDebt_Label2.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        OutOfDebt_Label2.setForeground(new java.awt.Color(0, 0, 0));
        OutOfDebt_Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OutOfDebt_Label2.setText("debt!!");
        OutOfDebt_Label2.setPreferredSize(new java.awt.Dimension(900, 120));
        OutOfDebt_Label2.setSize(new java.awt.Dimension(900, 120));
        OutOfDebtCard.add(OutOfDebt_Label2);
        OutOfDebt_Label2.setBounds(0, 180, 900, 120);

        OutOfDebt_MoneyLabel.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        OutOfDebt_MoneyLabel.setForeground(new java.awt.Color(0, 0, 0));
        OutOfDebt_MoneyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OutOfDebt_MoneyLabel.setText("Your balance is 100.");
        OutOfDebtCard.add(OutOfDebt_MoneyLabel);
        OutOfDebt_MoneyLabel.setBounds(0, 340, 900, 50);

        OutOfDebt_OKButton.setBackground(new java.awt.Color(255, 255, 255));
        OutOfDebt_OKButton.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        OutOfDebt_OKButton.setForeground(new java.awt.Color(0, 0, 0));
        OutOfDebt_OKButton.setText("Phew!");
        OutOfDebt_OKButton.setPreferredSize(new java.awt.Dimension(180, 60));
        OutOfDebt_OKButton.setSize(new java.awt.Dimension(180, 60));
        OutOfDebt_OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutOfDebt_OKButtonActionPerformed(evt);
            }
        });
        OutOfDebtCard.add(OutOfDebt_OKButton);
        OutOfDebt_OKButton.setBounds(360, 480, 180, 60);

        Debt_CardRegion.add(OutOfDebtCard, "OutOfDebt");

        BankruptCard.setBackground(new java.awt.Color(255, 0, 0));
        BankruptCard.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                BankruptCardComponentShown(evt);
            }
        });
        BankruptCard.setLayout(null);

        Bankrupt_PlayerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bigplayerimages/P3.png"))); // NOI18N
        Bankrupt_PlayerIcon.setRequestFocusEnabled(false);
        Bankrupt_PlayerIcon.setSize(new java.awt.Dimension(360, 480));
        BankruptCard.add(Bankrupt_PlayerIcon);
        Bankrupt_PlayerIcon.setBounds(20, 20, 360, 480);

        Bankrupt_Label1.setFont(new java.awt.Font("Arial", 1, 80)); // NOI18N
        Bankrupt_Label1.setForeground(new java.awt.Color(255, 255, 255));
        Bankrupt_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bankrupt_Label1.setText("Player 3 is");
        Bankrupt_Label1.setPreferredSize(new java.awt.Dimension(900, 120));
        BankruptCard.add(Bankrupt_Label1);
        Bankrupt_Label1.setBounds(380, 40, 520, 120);

        Bankrupt_Label2.setFont(new java.awt.Font("Arial", 1, 80)); // NOI18N
        Bankrupt_Label2.setForeground(new java.awt.Color(255, 255, 255));
        Bankrupt_Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bankrupt_Label2.setText("bankrupt!");
        Bankrupt_Label2.setPreferredSize(new java.awt.Dimension(900, 120));
        BankruptCard.add(Bankrupt_Label2);
        Bankrupt_Label2.setBounds(380, 160, 520, 120);

        Bankrupt_Label3.setFont(new java.awt.Font("Arial", 0, 40)); // NOI18N
        Bankrupt_Label3.setForeground(new java.awt.Color(255, 255, 255));
        Bankrupt_Label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bankrupt_Label3.setText("Player 2 receives all of");
        BankruptCard.add(Bankrupt_Label3);
        Bankrupt_Label3.setBounds(380, 340, 520, 47);

        Bankrupt_Label4.setFont(new java.awt.Font("Arial", 0, 40)); // NOI18N
        Bankrupt_Label4.setForeground(new java.awt.Color(255, 255, 255));
        Bankrupt_Label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bankrupt_Label4.setText("Player 3's assets.");
        BankruptCard.add(Bankrupt_Label4);
        Bankrupt_Label4.setBounds(380, 400, 520, 47);

        Bankrupt_ContinueButton.setBackground(new java.awt.Color(255, 255, 255));
        Bankrupt_ContinueButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Bankrupt_ContinueButton.setForeground(new java.awt.Color(0, 0, 0));
        Bankrupt_ContinueButton.setText("Continue");
        Bankrupt_ContinueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bankrupt_ContinueButtonActionPerformed(evt);
            }
        });
        BankruptCard.add(Bankrupt_ContinueButton);
        Bankrupt_ContinueButton.setBounds(370, 530, 160, 50);

        Debt_CardRegion.add(BankruptCard, "Bankrupt");

        javax.swing.GroupLayout DebtWindowLayout = new javax.swing.GroupLayout(DebtWindow.getContentPane());
        DebtWindow.getContentPane().setLayout(DebtWindowLayout);
        DebtWindowLayout.setHorizontalGroup(
            DebtWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Debt_CardRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DebtWindowLayout.setVerticalGroup(
            DebtWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Debt_CardRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 23, 1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        FrameRegion.setLayout(new java.awt.CardLayout());

        MainMenu.setBackground(new java.awt.Color(209, 239, 203));
        MainMenu.setLayout(null);

        MainMenu_LogoImg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MainMenu_LogoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        MainMenu_LogoImg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        MainMenu.add(MainMenu_LogoImg);
        MainMenu_LogoImg.setBounds(70, 20, 1050, 400);

        MainMenu_NumPlayers.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        MainMenu_NumPlayers.setForeground(new java.awt.Color(0, 0, 0));
        MainMenu_NumPlayers.setText("How many players?");
        MainMenu.add(MainMenu_NumPlayers);
        MainMenu_NumPlayers.setBounds(360, 440, 350, 50);

        MainMenu_PlayersSelect.setBackground(new java.awt.Color(255, 255, 255));
        MainMenu_PlayersSelect.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        MainMenu_PlayersSelect.setForeground(new java.awt.Color(0, 0, 0));
        MainMenu_PlayersSelect.setModel(new javax.swing.DefaultComboBoxModel<>(playerOptions));
        MainMenu_PlayersSelect.setToolTipText("");
        MainMenu.add(MainMenu_PlayersSelect);
        MainMenu_PlayersSelect.setBounds(710, 440, 70, 50);

        MainMenu_PlayButton.setBackground(new java.awt.Color(230, 230, 230));
        MainMenu_PlayButton.setFont(new java.awt.Font("Arial", 1, 70)); // NOI18N
        MainMenu_PlayButton.setForeground(new java.awt.Color(182, 37, 25));
        MainMenu_PlayButton.setText("PLAY");
        MainMenu_PlayButton.setToolTipText("");
        MainMenu_PlayButton.setPreferredSize(new java.awt.Dimension(280, 120));
        MainMenu_PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenu_PlayButtonActionPerformed(evt);
            }
        });
        MainMenu.add(MainMenu_PlayButton);
        MainMenu_PlayButton.setBounds(460, 540, 280, 120);

        FrameRegion.add(MainMenu, "MainMenu");

        GameBoard.setBackground(new java.awt.Color(220, 220, 220));
        GameBoard.setForeground(new java.awt.Color(240, 240, 240));

        GameBoard_Board.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Board.jpg"))); // NOI18N
        GameBoard_Board.setText("jLabel1");
        GameBoard_Board.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        GameBoard_Board.setPreferredSize(new java.awt.Dimension(800, 800));
        GameBoard.setLayer(GameBoard_Board, 1);
        GameBoard.add(GameBoard_Board);
        GameBoard_Board.setBounds(0, 0, 800, 800);

        GameBoard_PlayerLabel.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        GameBoard_PlayerLabel.setForeground(new java.awt.Color(0, 0, 0));
        GameBoard_PlayerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard_PlayerLabel.setText("Player Label");
        GameBoard.add(GameBoard_PlayerLabel);
        GameBoard_PlayerLabel.setBounds(800, 10, 400, 60);

        TokenP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerimages/TokenP1.png"))); // NOI18N
        GameBoard.setLayer(TokenP1, 2);
        GameBoard.add(TokenP1);
        TokenP1.setBounds(800, 0, 20, 20);

        TokenP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerimages/TokenP2.png"))); // NOI18N
        GameBoard.setLayer(TokenP2, 2);
        GameBoard.add(TokenP2);
        TokenP2.setBounds(820, 0, 20, 20);

        TokenP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerimages/TokenP3.png"))); // NOI18N
        GameBoard.setLayer(TokenP3, 2);
        GameBoard.add(TokenP3);
        TokenP3.setBounds(800, 20, 20, 20);

        TokenP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerimages/TokenP4.png"))); // NOI18N
        GameBoard.setLayer(TokenP4, 2);
        GameBoard.add(TokenP4);
        TokenP4.setBounds(820, 20, 20, 20);

        TokenP5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerimages/TokenP5.png"))); // NOI18N
        GameBoard.setLayer(TokenP5, 2);
        GameBoard.add(TokenP5);
        TokenP5.setBounds(800, 40, 20, 20);

        TokenP6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerimages/TokenP6.png"))); // NOI18N
        GameBoard.setLayer(TokenP6, 2);
        GameBoard.add(TokenP6);
        TokenP6.setBounds(820, 40, 20, 20);

        TokenP7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerimages/TokenP7.png"))); // NOI18N
        GameBoard.setLayer(TokenP7, 2);
        GameBoard.add(TokenP7);
        TokenP7.setBounds(800, 60, 20, 20);

        TokenP8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playerimages/TokenP8.png"))); // NOI18N
        GameBoard.setLayer(TokenP8, 2);
        GameBoard.add(TokenP8);
        TokenP8.setBounds(820, 60, 20, 20);

        GameBoard_DiceCardRegion.setMinimumSize(new java.awt.Dimension(220, 220));
        GameBoard_DiceCardRegion.setPreferredSize(new java.awt.Dimension(220, 220));
        GameBoard_DiceCardRegion.setRequestFocusEnabled(false);
        GameBoard_DiceCardRegion.setSize(new java.awt.Dimension(220, 220));
        GameBoard_DiceCardRegion.setLayout(new java.awt.CardLayout());

        GameBoard_RollDiceCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GameBoard_RollDiceCard.setLayout(null);

        GameBoard_DiceButton.setBackground(new java.awt.Color(255, 255, 255));
        GameBoard_DiceButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        GameBoard_DiceButton.setForeground(new java.awt.Color(0, 0, 0));
        GameBoard_DiceButton.setText("Roll Dice");
        GameBoard_DiceButton.setPreferredSize(new java.awt.Dimension(120, 40));
        GameBoard_DiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameBoard_DiceButtonActionPerformed(evt);
            }
        });
        GameBoard_RollDiceCard.add(GameBoard_DiceButton);
        GameBoard_DiceButton.setBounds(50, 90, 120, 40);

        GameBoard_PayButton.setBackground(new java.awt.Color(255, 255, 255));
        GameBoard_PayButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        GameBoard_PayButton.setForeground(new java.awt.Color(0, 0, 0));
        GameBoard_PayButton.setText("Pay 50");
        GameBoard_PayButton.setPreferredSize(new java.awt.Dimension(120, 40));
        GameBoard_PayButton.setSize(new java.awt.Dimension(120, 40));
        GameBoard_PayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameBoard_PayButtonActionPerformed(evt);
            }
        });
        GameBoard_RollDiceCard.add(GameBoard_PayButton);
        GameBoard_PayButton.setBounds(50, 150, 120, 40);

        GameBoard_JailFreeCardButton.setBackground(new java.awt.Color(255, 255, 255));
        GameBoard_JailFreeCardButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        GameBoard_JailFreeCardButton.setForeground(new java.awt.Color(0, 0, 0));
        GameBoard_JailFreeCardButton.setText("Get Out Free!");
        GameBoard_JailFreeCardButton.setPreferredSize(new java.awt.Dimension(120, 40));
        GameBoard_JailFreeCardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameBoard_JailFreeCardButtonActionPerformed(evt);
            }
        });
        GameBoard_RollDiceCard.add(GameBoard_JailFreeCardButton);
        GameBoard_JailFreeCardButton.setBounds(40, 30, 140, 40);

        GameBoard_DiceCardRegion.add(GameBoard_RollDiceCard, "RollDice");

        GameBoard_MoveCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GameBoard_MoveCard.setLayout(null);

        RedDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diceimages/R1.png"))); // NOI18N
        RedDice.setSize(new java.awt.Dimension(75, 75));
        GameBoard_MoveCard.add(RedDice);
        RedDice.setBounds(25, 40, 75, 75);

        YellowDice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diceimages/Y1.png"))); // NOI18N
        YellowDice.setSize(new java.awt.Dimension(75, 75));
        GameBoard_MoveCard.add(YellowDice);
        YellowDice.setBounds(120, 40, 75, 75);

        GameBoard_MoveButton.setBackground(new java.awt.Color(255, 255, 255));
        GameBoard_MoveButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        GameBoard_MoveButton.setForeground(new java.awt.Color(0, 0, 0));
        GameBoard_MoveButton.setText("Move");
        GameBoard_MoveButton.setSize(new java.awt.Dimension(120, 40));
        GameBoard_MoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameBoard_MoveButtonActionPerformed(evt);
            }
        });
        GameBoard_MoveCard.add(GameBoard_MoveButton);
        GameBoard_MoveButton.setBounds(50, 150, 120, 40);

        GameBoard_DiceCardRegion.add(GameBoard_MoveCard, "Move");

        GameBoard.add(GameBoard_DiceCardRegion);
        GameBoard_DiceCardRegion.setBounds(890, 80, 220, 220);

        GameBoard_NextPlayerButton.setBackground(new java.awt.Color(255, 255, 255));
        GameBoard_NextPlayerButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        GameBoard_NextPlayerButton.setForeground(new java.awt.Color(0, 0, 0));
        GameBoard_NextPlayerButton.setText("Next Player");
        GameBoard_NextPlayerButton.setEnabled(false);
        GameBoard_NextPlayerButton.setPreferredSize(new java.awt.Dimension(140, 40));
        GameBoard_NextPlayerButton.setSize(new java.awt.Dimension(140, 40));
        GameBoard_NextPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameBoard_NextPlayerButtonActionPerformed(evt);
            }
        });
        GameBoard.add(GameBoard_NextPlayerButton);
        GameBoard_NextPlayerButton.setBounds(930, 450, 140, 40);

        GameBoard_ViewAssetsPanel.setBackground(new java.awt.Color(45, 45, 45));
        GameBoard_ViewAssetsPanel.setLayout(null);

        GameBoard_ViewAssetsLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        GameBoard_ViewAssetsLabel.setForeground(new java.awt.Color(230, 230, 230));
        GameBoard_ViewAssetsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard_ViewAssetsLabel.setText("VIEW ASSETS");
        GameBoard_ViewAssetsPanel.add(GameBoard_ViewAssetsLabel);
        GameBoard_ViewAssetsLabel.setBounds(0, 0, 400, 50);

        GameBoard_P1Assets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        GameBoard_P1Assets.setPreferredSize(new java.awt.Dimension(90, 120));
        GameBoard_P1Assets.setSize(new java.awt.Dimension(90, 120));
        GameBoard_P1Assets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GameBoard_P1AssetsMouseClicked(evt);
            }
        });
        GameBoard_ViewAssetsPanel.add(GameBoard_P1Assets);
        GameBoard_P1Assets.setBounds(20, 50, 90, 120);

        GameBoard_P2Assets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        GameBoard_P2Assets.setPreferredSize(new java.awt.Dimension(90, 120));
        GameBoard_P2Assets.setSize(new java.awt.Dimension(90, 120));
        GameBoard_P2Assets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GameBoard_P2AssetsMouseClicked(evt);
            }
        });
        GameBoard_ViewAssetsPanel.add(GameBoard_P2Assets);
        GameBoard_P2Assets.setBounds(110, 50, 90, 120);

        GameBoard_P3Assets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        GameBoard_P3Assets.setPreferredSize(new java.awt.Dimension(90, 120));
        GameBoard_P3Assets.setSize(new java.awt.Dimension(90, 120));
        GameBoard_P3Assets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GameBoard_P3AssetsMouseClicked(evt);
            }
        });
        GameBoard_ViewAssetsPanel.add(GameBoard_P3Assets);
        GameBoard_P3Assets.setBounds(200, 50, 90, 120);

        GameBoard_P4Assets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        GameBoard_P4Assets.setPreferredSize(new java.awt.Dimension(90, 120));
        GameBoard_P4Assets.setSize(new java.awt.Dimension(90, 120));
        GameBoard_P4Assets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GameBoard_P4AssetsMouseClicked(evt);
            }
        });
        GameBoard_ViewAssetsPanel.add(GameBoard_P4Assets);
        GameBoard_P4Assets.setBounds(290, 50, 90, 120);

        GameBoard_P5Assets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        GameBoard_P5Assets.setPreferredSize(new java.awt.Dimension(90, 120));
        GameBoard_P5Assets.setSize(new java.awt.Dimension(90, 120));
        GameBoard_P5Assets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GameBoard_P5AssetsMouseClicked(evt);
            }
        });
        GameBoard_ViewAssetsPanel.add(GameBoard_P5Assets);
        GameBoard_P5Assets.setBounds(20, 170, 90, 120);

        GameBoard_P6Assets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        GameBoard_P6Assets.setPreferredSize(new java.awt.Dimension(90, 120));
        GameBoard_P6Assets.setSize(new java.awt.Dimension(90, 120));
        GameBoard_P6Assets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GameBoard_P6AssetsMouseClicked(evt);
            }
        });
        GameBoard_ViewAssetsPanel.add(GameBoard_P6Assets);
        GameBoard_P6Assets.setBounds(110, 170, 90, 120);

        GameBoard_P7Assets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        GameBoard_P7Assets.setPreferredSize(new java.awt.Dimension(90, 120));
        GameBoard_P7Assets.setSize(new java.awt.Dimension(90, 120));
        GameBoard_P7Assets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GameBoard_P7AssetsMouseClicked(evt);
            }
        });
        GameBoard_ViewAssetsPanel.add(GameBoard_P7Assets);
        GameBoard_P7Assets.setBounds(200, 170, 90, 120);

        GameBoard_P8Assets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        GameBoard_P8Assets.setPreferredSize(new java.awt.Dimension(90, 120));
        GameBoard_P8Assets.setSize(new java.awt.Dimension(90, 120));
        GameBoard_P8Assets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GameBoard_P8AssetsMouseClicked(evt);
            }
        });
        GameBoard_ViewAssetsPanel.add(GameBoard_P8Assets);
        GameBoard_P8Assets.setBounds(290, 170, 90, 120);

        GameBoard.add(GameBoard_ViewAssetsPanel);
        GameBoard_ViewAssetsPanel.setBounds(800, 500, 400, 300);

        GameBoard_HousesButton.setBackground(new java.awt.Color(255, 255, 255));
        GameBoard_HousesButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        GameBoard_HousesButton.setForeground(new java.awt.Color(0, 0, 0));
        GameBoard_HousesButton.setText("Houses/Hotels");
        GameBoard_HousesButton.setPreferredSize(new java.awt.Dimension(140, 40));
        GameBoard_HousesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameBoard_HousesButtonActionPerformed(evt);
            }
        });
        GameBoard.add(GameBoard_HousesButton);
        GameBoard_HousesButton.setBounds(920, 320, 160, 40);

        GameBoard_St0Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St0Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St0Houses, 3);
        GameBoard.add(GameBoard_St0Houses);
        GameBoard_St0Houses.setBounds(634, 697, 60, 20);

        GameBoard_St1Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St1Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St1Houses, 3);
        GameBoard.add(GameBoard_St1Houses);
        GameBoard_St1Houses.setBounds(503, 697, 60, 20);

        GameBoard_St2Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St2Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St2Houses, 3);
        GameBoard.add(GameBoard_St2Houses);
        GameBoard_St2Houses.setBounds(306, 697, 60, 20);

        GameBoard_St3Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St3Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St3Houses, 3);
        GameBoard.add(GameBoard_St3Houses);
        GameBoard_St3Houses.setBounds(175, 697, 60, 20);

        GameBoard_St4Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St4Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St4Houses, 3);
        GameBoard.add(GameBoard_St4Houses);
        GameBoard_St4Houses.setBounds(110, 697, 60, 20);

        GameBoard_St5Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St5Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard_St5Houses.setPreferredSize(new java.awt.Dimension(20, 60));
        GameBoard_St5Houses.setSize(new java.awt.Dimension(20, 60));
        GameBoard.setLayer(GameBoard_St5Houses, 3);
        GameBoard.add(GameBoard_St5Houses);
        GameBoard_St5Houses.setBounds(85, 632, 20, 60);

        GameBoard_St6Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St6Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard_St6Houses.setPreferredSize(new java.awt.Dimension(20, 60));
        GameBoard_St6Houses.setSize(new java.awt.Dimension(20, 60));
        GameBoard.setLayer(GameBoard_St6Houses, 3);
        GameBoard.add(GameBoard_St6Houses);
        GameBoard_St6Houses.setBounds(85, 501, 20, 60);

        GameBoard_St7Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St7Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard_St7Houses.setPreferredSize(new java.awt.Dimension(20, 60));
        GameBoard_St7Houses.setSize(new java.awt.Dimension(20, 60));
        GameBoard.setLayer(GameBoard_St7Houses, 3);
        GameBoard.add(GameBoard_St7Houses);
        GameBoard_St7Houses.setBounds(85, 435, 20, 60);

        GameBoard_St8Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St8Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard_St8Houses.setPreferredSize(new java.awt.Dimension(20, 60));
        GameBoard_St8Houses.setSize(new java.awt.Dimension(20, 60));
        GameBoard.setLayer(GameBoard_St8Houses, 3);
        GameBoard.add(GameBoard_St8Houses);
        GameBoard_St8Houses.setBounds(85, 304, 20, 60);

        GameBoard_St9Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St9Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard_St9Houses.setPreferredSize(new java.awt.Dimension(20, 60));
        GameBoard_St9Houses.setSize(new java.awt.Dimension(20, 60));
        GameBoard.setLayer(GameBoard_St9Houses, 3);
        GameBoard.add(GameBoard_St9Houses);
        GameBoard_St9Houses.setBounds(85, 173, 20, 60);

        GameBoard_St10Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St10Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard_St10Houses.setPreferredSize(new java.awt.Dimension(20, 60));
        GameBoard_St10Houses.setSize(new java.awt.Dimension(20, 60));
        GameBoard.setLayer(GameBoard_St10Houses, 3);
        GameBoard.add(GameBoard_St10Houses);
        GameBoard_St10Houses.setBounds(85, 108, 20, 60);

        GameBoard_St11Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St11Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St11Houses, 3);
        GameBoard.add(GameBoard_St11Houses);
        GameBoard_St11Houses.setBounds(110, 83, 60, 20);

        GameBoard_St12Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St12Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St12Houses, 3);
        GameBoard.add(GameBoard_St12Houses);
        GameBoard_St12Houses.setBounds(241, 83, 60, 20);

        GameBoard_St13Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St13Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St13Houses, 3);
        GameBoard.add(GameBoard_St13Houses);
        GameBoard_St13Houses.setBounds(306, 83, 60, 20);

        GameBoard_St14Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St14Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St14Houses, 3);
        GameBoard.add(GameBoard_St14Houses);
        GameBoard_St14Houses.setBounds(438, 83, 60, 20);

        GameBoard_St15Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St15Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St15Houses, 3);
        GameBoard.add(GameBoard_St15Houses);
        GameBoard_St15Houses.setBounds(503, 83, 60, 20);

        GameBoard_St16Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St16Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St16Houses, 3);
        GameBoard.add(GameBoard_St16Houses);
        GameBoard_St16Houses.setBounds(634, 83, 60, 20);

        GameBoard_St17Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St17Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St17Houses, 3);
        GameBoard.add(GameBoard_St17Houses);
        GameBoard_St17Houses.setBounds(699, 108, 20, 60);

        GameBoard_St18Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St18Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St18Houses, 3);
        GameBoard.add(GameBoard_St18Houses);
        GameBoard_St18Houses.setBounds(699, 173, 20, 60);

        GameBoard_St19Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St19Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St19Houses, 3);
        GameBoard.add(GameBoard_St19Houses);
        GameBoard_St19Houses.setBounds(699, 304, 20, 60);

        GameBoard_St20Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St20Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St20Houses, 3);
        GameBoard.add(GameBoard_St20Houses);
        GameBoard_St20Houses.setBounds(699, 501, 20, 60);

        GameBoard_St21Houses.setBackground(new java.awt.Color(0, 0, 0));
        GameBoard_St21Houses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameBoard.setLayer(GameBoard_St21Houses, 3);
        GameBoard.add(GameBoard_St21Houses);
        GameBoard_St21Houses.setBounds(699, 632, 20, 60);

        GameBoard_MortgageButton.setBackground(new java.awt.Color(255, 255, 255));
        GameBoard_MortgageButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        GameBoard_MortgageButton.setForeground(new java.awt.Color(0, 0, 0));
        GameBoard_MortgageButton.setText("Mortgage");
        GameBoard_MortgageButton.setPreferredSize(new java.awt.Dimension(79, 40));
        GameBoard_MortgageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameBoard_MortgageButtonActionPerformed(evt);
            }
        });
        GameBoard.add(GameBoard_MortgageButton);
        GameBoard_MortgageButton.setBounds(830, 380, 160, 40);

        GameBoard_TradeButton.setBackground(new java.awt.Color(255, 255, 255));
        GameBoard_TradeButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        GameBoard_TradeButton.setForeground(new java.awt.Color(0, 0, 0));
        GameBoard_TradeButton.setText("Trading");
        GameBoard_TradeButton.setToolTipText("");
        GameBoard_TradeButton.setPreferredSize(new java.awt.Dimension(79, 40));
        GameBoard_TradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameBoard_TradeButtonActionPerformed(evt);
            }
        });
        GameBoard.add(GameBoard_TradeButton);
        GameBoard_TradeButton.setBounds(1010, 380, 160, 40);

        FrameRegion.add(GameBoard, "GameBoard");

        EndScreen.setBackground(new java.awt.Color(255, 255, 255));
        EndScreen.setLayout(null);

        End_WinnerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bigplayerimages/P1.png"))); // NOI18N
        EndScreen.add(End_WinnerIcon);
        End_WinnerIcon.setBounds(50, 160, 360, 480);

        End_Message1.setFont(new java.awt.Font("Arial", 1, 80)); // NOI18N
        End_Message1.setForeground(new java.awt.Color(0, 150, 0));
        End_Message1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        End_Message1.setText("Congratulations!");
        EndScreen.add(End_Message1);
        End_Message1.setBounds(410, 230, 790, 130);

        End_Message2.setFont(new java.awt.Font("Arial", 1, 80)); // NOI18N
        End_Message2.setForeground(new java.awt.Color(0, 150, 0));
        End_Message2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        End_Message2.setText("You win!");
        EndScreen.add(End_Message2);
        End_Message2.setBounds(410, 390, 790, 130);

        End_MainMenuButton.setBackground(new java.awt.Color(255, 255, 255));
        End_MainMenuButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        End_MainMenuButton.setForeground(new java.awt.Color(0, 0, 0));
        End_MainMenuButton.setText("Main Menu");
        End_MainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                End_MainMenuButtonActionPerformed(evt);
            }
        });
        EndScreen.add(End_MainMenuButton);
        End_MainMenuButton.setBounds(380, 690, 170, 50);

        End_ExitButton.setBackground(new java.awt.Color(255, 255, 255));
        End_ExitButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        End_ExitButton.setForeground(new java.awt.Color(0, 0, 0));
        End_ExitButton.setText("Exit Game");
        End_ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                End_ExitButtonActionPerformed(evt);
            }
        });
        EndScreen.add(End_ExitButton);
        End_ExitButton.setBounds(650, 690, 170, 50);

        FrameRegion.add(EndScreen, "End");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrameRegion, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FrameRegion, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenu_PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenu_PlayButtonActionPerformed
        int option = MainMenu_PlayersSelect.getSelectedIndex();
        
        if (option != 0) {  
            game.beginGame(option + 1);
            syncAllProperties();
            syncAllPlayerComponents();
            game.clearHouseLabels();
            TokenP1.setLocation(740, 720);
            TokenP2.setLocation(740, 740);
            TokenP3.setLocation(740, 760);
            TokenP4.setLocation(720, 720);
            TokenP5.setLocation(720, 740);
            TokenP6.setLocation(720, 760);
            TokenP7.setLocation(760, 730);
            TokenP8.setLocation(760, 750);
            
            GameBoard_P1Assets.setIcon(game.players[0].getPlayerCardSmall());
            GameBoard_P2Assets.setIcon(game.players[1].getPlayerCardSmall());
            GameBoard_P1Assets.setVisible(true);
            GameBoard_P2Assets.setVisible(true);
            TokenP1.setVisible(true);
            TokenP2.setVisible(true);
            
            if (game.players.length < 3) {
                TokenP3.setVisible(false);
                GameBoard_P3Assets.setVisible(false);
            } else {
                TokenP3.setVisible(true);
                GameBoard_P3Assets.setVisible(true);
                GameBoard_P3Assets.setIcon(game.players[2].getPlayerCardSmall());
            }
            
            if (game.players.length < 4) {
                TokenP4.setVisible(false);
                GameBoard_P4Assets.setVisible(false);
            } else {
                TokenP4.setVisible(true);
                GameBoard_P4Assets.setVisible(true);
                GameBoard_P4Assets.setIcon(game.players[3].getPlayerCardSmall());
            }
            
            if (game.players.length < 5) {
                TokenP5.setVisible(false);
                GameBoard_P5Assets.setVisible(false);
            } else {
                TokenP5.setVisible(true);
                GameBoard_P5Assets.setVisible(true);
                GameBoard_P5Assets.setIcon(game.players[4].getPlayerCardSmall());
            }
            
            if (game.players.length < 6) {
                TokenP6.setVisible(false);
                GameBoard_P6Assets.setVisible(false);
            } else {
                TokenP6.setVisible(true);
                GameBoard_P6Assets.setVisible(true);
                GameBoard_P6Assets.setIcon(game.players[5].getPlayerCardSmall());
            }
            
            if (game.players.length < 7) {
                TokenP7.setVisible(false);
                GameBoard_P7Assets.setVisible(false);
            } else {
                TokenP7.setVisible(true);
                GameBoard_P7Assets.setVisible(true);
                GameBoard_P7Assets.setIcon(game.players[6].getPlayerCardSmall());
            }
            
            if (game.players.length < 8) {
                TokenP8.setVisible(false);
                GameBoard_P8Assets.setVisible(false);
            } else {
                TokenP8.setVisible(true);
                GameBoard_P8Assets.setVisible(true);
                GameBoard_P8Assets.setIcon(game.players[7].getPlayerCardSmall());
            }

            enableButtons();
            
            GameBoard_PlayerLabel.setText(game.playerLabelText());
            GameBoard_PayButton.setText("Pay " + String.valueOf(game.JAIL_COST));
            GameBoard_PayButton.setVisible(false);
            GameBoard_JailFreeCardButton.setVisible(false);
            CardLayout card = (CardLayout)FrameRegion.getLayout();
            card.show(FrameRegion, "GameBoard");
            CardLayout card2 = (CardLayout)GameBoard_DiceCardRegion.getLayout();
            card2.show(GameBoard_DiceCardRegion, "RollDice");

        }
    }//GEN-LAST:event_MainMenu_PlayButtonActionPerformed

    private void GameBoard_DiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameBoard_DiceButtonActionPerformed
        
        disableButtons();
        
        RedDiceResult = game.RollDice();
        YellowDiceResult = game.RollDice();
        
        RedDice.setIcon(game.RedDices[RedDiceResult - 1]);
        YellowDice.setIcon(game.YellowDices[YellowDiceResult - 1]);
        
        if (RedDiceResult == YellowDiceResult) {
            numDoubles++;
            if (numDoubles == 3) {
                GameBoard_MoveButton.setText("Uh oh!!!");
            } else if (game.activePlayer.getInJail()) {
                game.activePlayer.getOutOfJail();
                game.activePlayer.getToken().setLocation(game.tokenLocation(game.activePlayer));
                GameBoard_MoveButton.setEnabled(true);
                numDoubles = 0;
            } else {
                GameBoard_NextPlayerButton.setText("Roll Again!"); 
            }
        } else {
            numDoubles = 0;
            if (game.activePlayer.getInJail()) {
                if (game.activePlayer.jailTurns()) {
                    game.activePlayer.getOutOfJail();
                    game.activePlayer.getToken().setLocation(game.tokenLocation(game.activePlayer));
                    game.activePlayer.changeMoney(-game.JAIL_COST);
                    if (game.activePlayer.getDebtOwed() > 0) {
                        goInDebt(game.activePlayer);
                    }
                    
                } else {
                    GameBoard_MoveButton.setEnabled(false);
                    GameBoard_NextPlayerButton.setEnabled(true);
                }
            }
        }
        
        CardLayout card = (CardLayout)GameBoard_DiceCardRegion.getLayout();
        card.show(GameBoard_DiceCardRegion, "Move");
        
        if (!game.activePlayer.getInJail()) {
            GameBoard_MoveButton.setVisible(true);
            GameBoard_MoveButton.setEnabled(true);
        }
    }//GEN-LAST:event_GameBoard_DiceButtonActionPerformed

    private void GameBoard_MoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameBoard_MoveButtonActionPerformed
        
        game.playerMoved = true;
        
        GameBoard_MoveButton.setEnabled(false);
        GameBoard_MoveButton.setVisible(false);
        GameBoard_MoveButton.setVisible(true);
        
        if (numDoubles == 3) {
            JailWindow.setVisible(true);
            GameBoard_MoveButton.setText("Move");
            numDoubles = 0;
                      
        } else {
            game.activePlayer.move(RedDiceResult + YellowDiceResult);
            if (game.activePlayer.passedGO()) {
                game.activePlayer.changeMoney(200);
            }
            
            game.activePlayer.getToken().setLocation(game.tokenLocation(game.activePlayer));
            
            game.spaceEffect = game.activeSpace().getEffect();
        
            switch (game.spaceEffect) {
                case 0:
                    PropertyWindow.setVisible(true);           
                    break;
                    
                case 1:
                case 2:
                case 3:
                    NeutralSpaceWindow.setVisible(true);
                    break;
                    
                case 4:
                    JailWindow.setVisible(true);
                    break;
                    
                case 5:
                case 6:
                    ChanceWindow.setVisible(true);
                    break;
                    
                case 7:
                case 8:
                    TaxWindow.setVisible(true);
                    break;
            }
        }
    }//GEN-LAST:event_GameBoard_MoveButtonActionPerformed

    private void GameBoard_NextPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameBoard_NextPlayerButtonActionPerformed
        game.playerMoved = false;
        enableButtons();
        
        if (!GameBoard_NextPlayerButton.getText().equals("Roll Again!")) {
            numDoubles = 0;
            GameBoard.setLayer(game.activePlayer.getToken(), 2);
            game.nextPlayer();
            GameBoard.setLayer(game.activePlayer.getToken(), 3);
            GameBoard_PlayerLabel.setText(game.playerLabelText());
        }
        
        GameBoard_NextPlayerButton.setText("Next Player");
        
        GameBoard_NextPlayerButton.setEnabled(false);
        GameBoard_NextPlayerButton.setVisible(false);
        GameBoard_NextPlayerButton.setVisible(true);
        GameBoard_JailFreeCardButton.setVisible(false);
        
        if (game.activePlayer.getInJail()) {
            GameBoard_PayButton.setVisible(true);
            if (game.activePlayer.getJailFreeCards() > 0) {
                GameBoard_JailFreeCardButton.setVisible(true);
            }
            if (game.activePlayer.getMoney() >= 50) {
                GameBoard_PayButton.setEnabled(true);
            } else {
                GameBoard_PayButton.setEnabled(false);
            }
        } else {
            GameBoard_PayButton.setVisible(false);
        }
        
        CardLayout card = (CardLayout)GameBoard_DiceCardRegion.getLayout();
        card.show(GameBoard_DiceCardRegion, "RollDice");
    }//GEN-LAST:event_GameBoard_NextPlayerButtonActionPerformed

    private void PropertyWindowComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PropertyWindowComponentShown
        Property_PropCard.setIcon(game.activeSpace().getProp().getCardBig());
        
        CardLayout card = (CardLayout)Property_CardRegion.getLayout();
        
        if (game.activeSpace().getProp().getOwner() == null) {
            card.show(Property_CardRegion, "Buy");
            cost = game.activeSpace().getProp().getCost();
            playerMoney = game.activePlayer.getMoney();
        
            Property_BuyButton.setEnabled(cost <= playerMoney);
        
            Property_CostLabel.setText("Cost: " + String.valueOf(cost));
            Property_YouHaveLabel.setText("You Have: " + String.valueOf(playerMoney));
            
        } else if (game.rentOwedPlayer() == game.activePlayer) {
            card.show(Property_CardRegion, "NoRent");
            Property_NoRentLabel1.setText("");
            Property_NoRentLabel2.setText("You own this property.");
            
        } else if (game.activeSpace().getProp().isMortgaged()) {
            card.show(Property_CardRegion, "NoRent");
            Property_NoRentLabel1.setText("This property is");
            Property_NoRentLabel2.setText("mortgaged.");
            
        } else {
            card.show(Property_CardRegion, "PayRent");
            Property_PayRentLabel2.setText("Player " + String.valueOf(game.rentOwedPlayer().getNumber()) + "!");
            Property_RentOwedLabel.setText("Rent Owed: " + String.valueOf(game.rent()));
            Property_PayRentYourMoney.setText("You Have: " + String.valueOf(game.activePlayer.getMoney()));
        }
    }//GEN-LAST:event_PropertyWindowComponentShown

    private void Property_BuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_BuyButtonActionPerformed
        game.buyProperty(game.activePlayer, game.activeSpace().getProp(), cost);
        PropertyWindow.setVisible(false);
        enableButtons();
    }//GEN-LAST:event_Property_BuyButtonActionPerformed

    private void Property_AuctionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_AuctionButtonActionPerformed
        CardLayout card = (CardLayout)Property_CardRegion.getLayout();
        card.show(Property_CardRegion, "Auction");
        game.startAuction();
                
        if (!game.isPlayerHere(1)) {
            Property_P1AuctionLabel.setVisible(false);
            Property_P1BidPrice.setVisible(false);
            Property_P1BidButton.setVisible(false);
            Property_P1PassButton.setVisible(false);
        }
        if (!game.isPlayerHere(2)) {
            Property_P2AuctionLabel.setVisible(false);
            Property_P2BidPrice.setVisible(false);
            Property_P2BidButton.setVisible(false);
            Property_P2PassButton.setVisible(false);
        }
        if (!game.isPlayerHere(3)) {
            Property_P3AuctionLabel.setVisible(false);
            Property_P3BidPrice.setVisible(false);
            Property_P3BidButton.setVisible(false);
            Property_P3PassButton.setVisible(false);
        }
        if (!game.isPlayerHere(4)) {
            Property_P4AuctionLabel.setVisible(false);
            Property_P4BidPrice.setVisible(false);
            Property_P4BidButton.setVisible(false);
            Property_P4PassButton.setVisible(false);
        }
        if (!game.isPlayerHere(5)) {
            Property_P5AuctionLabel.setVisible(false);
            Property_P5BidPrice.setVisible(false);
            Property_P5BidButton.setVisible(false);
            Property_P5PassButton.setVisible(false);
        }
        if (!game.isPlayerHere(6)) {
            Property_P6AuctionLabel.setVisible(false);
            Property_P6BidPrice.setVisible(false);
            Property_P6BidButton.setVisible(false);
            Property_P6PassButton.setVisible(false);
        }
        if (!game.isPlayerHere(7)) {
            Property_P7AuctionLabel.setVisible(false);
            Property_P7BidPrice.setVisible(false);
            Property_P7BidButton.setVisible(false);
            Property_P7PassButton.setVisible(false);
        }
        if (!game.isPlayerHere(8)) {
            Property_P8AuctionLabel.setVisible(false);
            Property_P8BidPrice.setVisible(false);
            Property_P8BidButton.setVisible(false);
            Property_P8PassButton.setVisible(false);
        }
        
        Property_P1BidPrice.setForeground(Color.black);
        Property_P2BidPrice.setForeground(Color.black);
        Property_P3BidPrice.setForeground(Color.black);
        Property_P4BidPrice.setForeground(Color.black);
        Property_P5BidPrice.setForeground(Color.black);
        Property_P6BidPrice.setForeground(Color.black);
        Property_P7BidPrice.setForeground(Color.black);
        Property_P8BidPrice.setForeground(Color.black);
        
        Property_CurrentBidValue.setText(String.valueOf(game.bidPrice));
        
    }//GEN-LAST:event_Property_AuctionButtonActionPerformed

    private void Property_P1BidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P1BidButtonActionPerformed
        if (game.validateBid(game.players[0])) {
            Property_CurrentBidValue.setText(String.valueOf(game.bidPrice));
            game.newHighBidder();          
        } else {
            Property_P1BidPrice.setForeground(Color.red);
        }
    }//GEN-LAST:event_Property_P1BidButtonActionPerformed

    private void Property_P2BidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P2BidButtonActionPerformed
        if (game.validateBid(game.players[1])) {
            Property_CurrentBidValue.setText(String.valueOf(game.bidPrice));
            game.newHighBidder();          
        } else {
            Property_P2BidPrice.setForeground(Color.red);
        }
    }//GEN-LAST:event_Property_P2BidButtonActionPerformed

    private void Property_P3BidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P3BidButtonActionPerformed
        if (game.validateBid(game.players[2])) {
            Property_CurrentBidValue.setText(String.valueOf(game.bidPrice));
            game.newHighBidder();          
        } else {
            Property_P3BidPrice.setForeground(Color.red);
        }
    }//GEN-LAST:event_Property_P3BidButtonActionPerformed

    private void Property_P4BidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P4BidButtonActionPerformed
        if (game.validateBid(game.players[3])) {
            Property_CurrentBidValue.setText(String.valueOf(game.bidPrice));
            game.newHighBidder();          
        } else {
            Property_P4BidPrice.setForeground(Color.red);
        }
    }//GEN-LAST:event_Property_P4BidButtonActionPerformed

    private void Property_P5BidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P5BidButtonActionPerformed
        if (game.validateBid(game.players[4])) {
            Property_CurrentBidValue.setText(String.valueOf(game.bidPrice));
            game.newHighBidder();          
        } else {
            Property_P5BidPrice.setForeground(Color.red);
        }
    }//GEN-LAST:event_Property_P5BidButtonActionPerformed

    private void Property_P6BidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P6BidButtonActionPerformed
        if (game.validateBid(game.players[5])) {
            Property_CurrentBidValue.setText(String.valueOf(game.bidPrice));
            game.newHighBidder();          
        } else {
            Property_P6BidPrice.setForeground(Color.red);
        }
    }//GEN-LAST:event_Property_P6BidButtonActionPerformed

    private void Property_P7BidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P7BidButtonActionPerformed
        if (game.validateBid(game.players[6])) {
            Property_CurrentBidValue.setText(String.valueOf(game.bidPrice));
            game.newHighBidder();          
        } else {
            Property_P7BidPrice.setForeground(Color.red);
        }
    }//GEN-LAST:event_Property_P7BidButtonActionPerformed

    private void Property_P8BidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P8BidButtonActionPerformed
        if (game.validateBid(game.players[7])) {
            Property_CurrentBidValue.setText(String.valueOf(game.bidPrice));
            game.newHighBidder();          
        } else {
            Property_P8BidPrice.setForeground(Color.red);
        }
    }//GEN-LAST:event_Property_P8BidButtonActionPerformed

    private void Property_P1PassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P1PassButtonActionPerformed
        game.players[0].pass();
        if (game.auctionWon()) {
                CardLayout card = (CardLayout)Property_CardRegion.getLayout();
                card.show(Property_CardRegion, "Winner");
        }
    }//GEN-LAST:event_Property_P1PassButtonActionPerformed

    private void Property_P2PassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P2PassButtonActionPerformed
        game.players[1].pass();
        if (game.auctionWon()) {
                CardLayout card = (CardLayout)Property_CardRegion.getLayout();
                card.show(Property_CardRegion, "Winner");
        }
    }//GEN-LAST:event_Property_P2PassButtonActionPerformed

    private void Property_P3PassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P3PassButtonActionPerformed
        game.players[2].pass();
        if (game.auctionWon()) {
                CardLayout card = (CardLayout)Property_CardRegion.getLayout();
                card.show(Property_CardRegion, "Winner");
        }
    }//GEN-LAST:event_Property_P3PassButtonActionPerformed

    private void Property_P4PassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P4PassButtonActionPerformed
        game.players[3].pass();
        if (game.auctionWon()) {
                CardLayout card = (CardLayout)Property_CardRegion.getLayout();
                card.show(Property_CardRegion, "Winner");
        }
    }//GEN-LAST:event_Property_P4PassButtonActionPerformed

    private void Property_P5PassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P5PassButtonActionPerformed
        game.players[4].pass();
        if (game.auctionWon()) {
                CardLayout card = (CardLayout)Property_CardRegion.getLayout();
                card.show(Property_CardRegion, "Winner");
        }
    }//GEN-LAST:event_Property_P5PassButtonActionPerformed

    private void Property_P6PassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P6PassButtonActionPerformed
        game.players[5].pass();
        if (game.auctionWon()) {
                CardLayout card = (CardLayout)Property_CardRegion.getLayout();
                card.show(Property_CardRegion, "Winner");
        }
    }//GEN-LAST:event_Property_P6PassButtonActionPerformed

    private void Property_P7PassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P7PassButtonActionPerformed
        game.players[6].pass();
        if (game.auctionWon()) {
                CardLayout card = (CardLayout)Property_CardRegion.getLayout();
                card.show(Property_CardRegion, "Winner");
        }
    }//GEN-LAST:event_Property_P7PassButtonActionPerformed

    private void Property_P8PassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_P8PassButtonActionPerformed
        game.players[7].pass();
        if (game.auctionWon()) {
                CardLayout card = (CardLayout)Property_CardRegion.getLayout();
                card.show(Property_CardRegion, "Winner");
        }
    }//GEN-LAST:event_Property_P8PassButtonActionPerformed

    private void Property_WinningBidOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_WinningBidOKButtonActionPerformed
         game.buyProperty(game.highestBidder, game.activeSpace().getProp(), game.bidPrice);
         PropertyWindow.setVisible(false);
         enableButtons();
    }//GEN-LAST:event_Property_WinningBidOKButtonActionPerformed

    private void Property_WinnerCardComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Property_WinnerCardComponentShown
        Property_WinningBidder.setIcon(game.highestBidder.getPlayerCardBig());
        Property_WinningBidLabel.setText("Winning Bid: " + String.valueOf(game.bidPrice));
    }//GEN-LAST:event_Property_WinnerCardComponentShown

    private void Property_PayRentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_PayRentButtonActionPerformed
        game.activePlayer.pay(game.rentOwedPlayer(), game.rent());
        PropertyWindow.setVisible(false);
        enableButtons();
        if (game.activePlayer.getDebtOwed() > 0) {
            game.owedPlayer = game.rentOwedPlayer();
            goInDebt(game.activePlayer);
        }
    }//GEN-LAST:event_Property_PayRentButtonActionPerformed

    private void Property_NoRentOKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Property_NoRentOKButtonActionPerformed
        PropertyWindow.setVisible(false);
        enableButtons();
    }//GEN-LAST:event_Property_NoRentOKButtonActionPerformed

    private void GameBoard_P1AssetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GameBoard_P1AssetsMouseClicked
        game.assetsPlayer = game.players[0];
        showViewAssets();
    }//GEN-LAST:event_GameBoard_P1AssetsMouseClicked

    private void GameBoard_P2AssetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GameBoard_P2AssetsMouseClicked
        game.assetsPlayer = game.players[1];
        showViewAssets();
    }//GEN-LAST:event_GameBoard_P2AssetsMouseClicked

    private void GameBoard_P3AssetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GameBoard_P3AssetsMouseClicked
        game.assetsPlayer = game.players[2];
        showViewAssets();
    }//GEN-LAST:event_GameBoard_P3AssetsMouseClicked

    private void GameBoard_P4AssetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GameBoard_P4AssetsMouseClicked
        game.assetsPlayer = game.players[3];
        showViewAssets();
    }//GEN-LAST:event_GameBoard_P4AssetsMouseClicked

    private void GameBoard_P5AssetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GameBoard_P5AssetsMouseClicked
        game.assetsPlayer = game.players[4];
        showViewAssets();
    }//GEN-LAST:event_GameBoard_P5AssetsMouseClicked

    private void GameBoard_P6AssetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GameBoard_P6AssetsMouseClicked
        game.assetsPlayer = game.players[5];
        showViewAssets();
    }//GEN-LAST:event_GameBoard_P6AssetsMouseClicked

    private void GameBoard_P7AssetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GameBoard_P7AssetsMouseClicked
        game.assetsPlayer = game.players[6];
        showViewAssets();
    }//GEN-LAST:event_GameBoard_P7AssetsMouseClicked

    private void GameBoard_P8AssetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GameBoard_P8AssetsMouseClicked
        game.assetsPlayer = game.players[7];
        showViewAssets();
    }//GEN-LAST:event_GameBoard_P8AssetsMouseClicked

    private void ViewAssets_PageChangerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAssets_PageChangerButtonActionPerformed
        CardLayout card = (CardLayout)ViewAssets_CardRegion.getLayout();
        if (ViewAssets_PageChangerButton.isSelected()) {
            card.show(ViewAssets_CardRegion, "Pg2");
            ViewAssets_PageChangerButton.setText("Previous Page");
        } else {
            card.show(ViewAssets_CardRegion, "Pg1");
            ViewAssets_PageChangerButton.setText("Next Page");
        }
    }//GEN-LAST:event_ViewAssets_PageChangerButtonActionPerformed

    private void NeutralSpace_OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeutralSpace_OKButtonActionPerformed
        NeutralSpaceWindow.setVisible(false);
        enableButtons();
    }//GEN-LAST:event_NeutralSpace_OKButtonActionPerformed

    private void Jail_OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jail_OKButtonActionPerformed
        JailWindow.setVisible(false);
        game.activePlayer.goToJail();
        game.activePlayer.getToken().setLocation(game.tokenLocation(game.activePlayer));
        GameBoard_NextPlayerButton.setText("Next Player");
        enableButtons();
    }//GEN-LAST:event_Jail_OKButtonActionPerformed

    private void NeutralSpaceWindowComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_NeutralSpaceWindowComponentShown
        switch (game.spaceEffect) {
            case 1:
                NeutralSpace_Message.setText("Pass GO");
                NeutralSpace_Icon.setIcon(game.GOImage);
                break;
                
            case 2:
                NeutralSpace_Message.setText("Just Visiting");
                NeutralSpace_Icon.setIcon(game.JustVisitingImage);
                break;
                
            case 3:
                NeutralSpace_Message.setText("Free Parking");
                NeutralSpace_Icon.setIcon(game.FreeParkingImage);
                break;
        }
    }//GEN-LAST:event_NeutralSpaceWindowComponentShown

    private void Chance_TurnOverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chance_TurnOverButtonActionPerformed
        CardLayout card = (CardLayout)Chance_CardRegion.getLayout();
        card.show(Chance_CardRegion, "Reveal");

        Chance_EffectMessage1.setText("");
        Chance_EffectMessage2.setText("");
        
        Chance_EffectMessage3.setText(game.activeCard.getEffect()[game.activeCard.getEffect().length - 1]);
        if (game.activeCard.getEffect().length > 1) {
            Chance_EffectMessage2.setText(game.activeCard.getEffect()[game.activeCard.getEffect().length - 2]);
            if (game.activeCard.getEffect().length > 2) {
                Chance_EffectMessage1.setText(game.activeCard.getEffect()[game.activeCard.getEffect().length - 3]);
            }
        }
        
    }//GEN-LAST:event_Chance_TurnOverButtonActionPerformed

    private void Chance_OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chance_OKButtonActionPerformed
        game.activeCard.doThing(game.activePlayer, game.players, game.St);
        
        game.activePlayer.getToken().setLocation(game.tokenLocation(game.activePlayer));
        if (game.activeCard.getType() == 5) {
            GameBoard_NextPlayerButton.setText("Next Player");
        } else if (game.activeCard.getType() == 3 || game.activeCard.getType() == 4) {
            game.spaceEffect = game.activeSpace().getEffect();
        
            switch (game.spaceEffect) {
                case 0:
                    PropertyWindow.setVisible(true);           
                    break;
                case 1:
                case 2:
                case 3:
                    NeutralSpaceWindow.setVisible(true);
                    break;                   
                case 4:
                    JailWindow.setVisible(true);
                    break;                   
                case 5:
                case 6:
                    ChanceWindow.setVisible(true);
                    break;                  
                case 7:
                case 8:
                    TaxWindow.setVisible(true);
                    break;
            }
        }

        ChanceWindow.setVisible(false);
        enableButtons();
        
        for (Player p : game.players) {
            if (p.getDebtOwed() > 0 && p.getPlaying()) {
                if (p != game.activePlayer) {
                    game.owedPlayer = game.activePlayer;
                } else {
                    game.owedPlayer = null;
                }
                goInDebt(p);
                break;
            }
        }
    }//GEN-LAST:event_Chance_OKButtonActionPerformed

    private void ChanceWindowComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ChanceWindowComponentShown
        if (game.spaceEffect == 5) {
            Chance_Background.setIcon(game.ChanceBackground);
            Chance_TitleLabel.setText("Chance");
            game.activeCard = game.RandomChanceCard();
        } else {
            Chance_Background.setIcon(game.CommunityChestBackground);
            Chance_TitleLabel.setText("Community Chest");
            game.activeCard = game.RandomCommChestCard();
        }
        
        CardLayout card = (CardLayout)Chance_CardRegion.getLayout();
        card.show(Chance_CardRegion, "Initial");
    }//GEN-LAST:event_ChanceWindowComponentShown

    private void TaxWindowComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TaxWindowComponentShown
        if (game.spaceEffect == 7) {
            Tax_TitleLabel.setText("Luxury Tax");
            Tax_MessageLabel.setText("You owe " + String.valueOf(game.LUXURY_TAX));
            Tax_Icon.setIcon(game.LuxuryTaxImage);
        } else {
            Tax_TitleLabel.setText("Income Tax");
            Tax_MessageLabel.setText("You owe " + String.valueOf(game.INCOME_TAX));
            Tax_Icon.setIcon(game.IncomeTaxImage);
        }
    }//GEN-LAST:event_TaxWindowComponentShown

    private void Tax_OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tax_OKButtonActionPerformed
        if (game.spaceEffect == 7) {
            game.activePlayer.changeMoney(-game.LUXURY_TAX);
            
        } else {
            game.activePlayer.changeMoney(-game.INCOME_TAX);
        }
        TaxWindow.setVisible(false);
        enableButtons();
        if (game.activePlayer.getDebtOwed() > 0) {
            goInDebt(game.activePlayer);
        }
    }//GEN-LAST:event_Tax_OKButtonActionPerformed

    private void GameBoard_PayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameBoard_PayButtonActionPerformed
        game.activePlayer.getOutOfJail();
        game.activePlayer.changeMoney(-50);
        game.activePlayer.getToken().setLocation(game.tokenLocation(game.activePlayer));
        GameBoard_JailFreeCardButton.setVisible(false);
        GameBoard_PayButton.setVisible(false);
    }//GEN-LAST:event_GameBoard_PayButtonActionPerformed

    private void GameBoard_HousesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameBoard_HousesButtonActionPerformed
        HousesWindow.setVisible(true);
        disableButtons();
    }//GEN-LAST:event_GameBoard_HousesButtonActionPerformed

    private void Houses_BrownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Houses_BrownButtonActionPerformed
        Houses_BuyCard1.setBackground(game.brown);
        game.fullSetUsed = game.St[0].getGroup();
        
        CardLayout card = (CardLayout)Houses_CardRegion.getLayout();
        card.show(Houses_CardRegion, "Blank");
        card.show(Houses_CardRegion, "Buy1");
    }//GEN-LAST:event_Houses_BrownButtonActionPerformed

    private void Houses_LightBlueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Houses_LightBlueButtonActionPerformed
        Houses_BuyCard1.setBackground(game.lightBlue);
        game.fullSetUsed = game.St[2].getGroup();
        
        CardLayout card = (CardLayout)Houses_CardRegion.getLayout();
        card.show(Houses_CardRegion, "Blank");
        card.show(Houses_CardRegion, "Buy1");
    }//GEN-LAST:event_Houses_LightBlueButtonActionPerformed

    private void Houses_PinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Houses_PinkButtonActionPerformed
        Houses_BuyCard1.setBackground(game.pink);
        game.fullSetUsed = game.St[5].getGroup();
        
        CardLayout card = (CardLayout)Houses_CardRegion.getLayout();
        card.show(Houses_CardRegion, "Blank");
        card.show(Houses_CardRegion, "Buy1");
    }//GEN-LAST:event_Houses_PinkButtonActionPerformed

    private void Houses_OrangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Houses_OrangeButtonActionPerformed
        Houses_BuyCard1.setBackground(game.orange);
        game.fullSetUsed = game.St[8].getGroup();
        
        CardLayout card = (CardLayout)Houses_CardRegion.getLayout();
        card.show(Houses_CardRegion, "Blank");
        card.show(Houses_CardRegion, "Buy1");
    }//GEN-LAST:event_Houses_OrangeButtonActionPerformed

    private void Houses_RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Houses_RedButtonActionPerformed
        Houses_BuyCard1.setBackground(game.red);
        game.fullSetUsed = game.St[11].getGroup();
        
        CardLayout card = (CardLayout)Houses_CardRegion.getLayout();
        card.show(Houses_CardRegion, "Blank");
        card.show(Houses_CardRegion, "Buy1");
    }//GEN-LAST:event_Houses_RedButtonActionPerformed

    private void Houses_YellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Houses_YellowButtonActionPerformed
        Houses_BuyCard1.setBackground(game.yellow);
        game.fullSetUsed = game.St[14].getGroup();
        
        CardLayout card = (CardLayout)Houses_CardRegion.getLayout();
        card.show(Houses_CardRegion, "Blank");
        card.show(Houses_CardRegion, "Buy1");
    }//GEN-LAST:event_Houses_YellowButtonActionPerformed

    private void Houses_GreenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Houses_GreenButtonActionPerformed
        Houses_BuyCard1.setBackground(game.green);
        game.fullSetUsed = game.St[17].getGroup();
        
        CardLayout card = (CardLayout)Houses_CardRegion.getLayout();
        card.show(Houses_CardRegion, "Blank");
        card.show(Houses_CardRegion, "Buy1");
    }//GEN-LAST:event_Houses_GreenButtonActionPerformed

    private void Houses_BlueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Houses_BlueButtonActionPerformed
        Houses_BuyCard1.setBackground(game.blue);
        game.fullSetUsed = game.St[20].getGroup();
        
        CardLayout card = (CardLayout)Houses_CardRegion.getLayout();
        card.show(Houses_CardRegion, "Blank");
        card.show(Houses_CardRegion, "Buy1");
    }//GEN-LAST:event_Houses_BlueButtonActionPerformed

    private void Houses_BuyCard1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Houses_BuyCard1ComponentShown
        Houses_BuySlider.setValue(0);
        
        game.fullStreetSet[0] = (Street)game.fullSetUsed[0];
        game.fullStreetSet[1] = (Street)game.fullSetUsed[1];
        if (game.fullSetUsed.length == 3) {
            game.fullStreetSet[2] = (Street)game.fullSetUsed[2];
        }
        
        if (game.fullStreetSet[0].groupHouses() > 4 * game.fullSetUsed.length && Houses_SwitchBuySell.isSelected()) {
            CardLayout card = (CardLayout)Houses_CardRegion.getLayout();
            card.show(Houses_CardRegion, "SellHotel");
        }
        
        Houses_QuantityLabel.setText(String.valueOf(Houses_BuySlider.getValue()) + " Houses");
        Houses_PlayerMoneyLabel.setText("You have: " + String.valueOf(game.activePlayer.getMoney()));
    
        if (game.fullSetUsed.length == 3) {
            Houses_BuyProperty1.setLocation(80, 100);
            Houses_BuyProperty2.setLocation(230, 100);
            Houses_BuyProperty3.setLocation(380, 100);
            Houses_BuyProperty3.setVisible(true);      
            Houses_BuyHouses1.setLocation(80, 65);
            Houses_BuyHouses2.setLocation(230, 65);
            Houses_BuyHouses3.setLocation(380, 65);
            Houses_BuyHouses3.setVisible(true);
            
            Houses_BuyProperty3.setIcon(game.fullSetUsed[2].getCardSmall());
            Houses_BuyHouses3.setIcon(game.Houses[game.fullStreetSet[2].getHouses()]);
            
        } else {
            Houses_BuyProperty1.setLocation(155, 100);
            Houses_BuyProperty2.setLocation(305, 100);
            Houses_BuyProperty3.setVisible(false);
            Houses_BuyHouses1.setLocation(155, 65);
            Houses_BuyHouses2.setLocation(305, 65);
            Houses_BuyHouses3.setVisible(false);
        }

        Houses_BuyProperty1.setIcon(game.fullSetUsed[0].getCardSmall());
        Houses_BuyHouses1.setIcon(game.Houses[game.fullStreetSet[0].getHouses()]);
        
        Houses_BuyProperty2.setIcon(game.fullSetUsed[1].getCardSmall());
        Houses_BuyHouses2.setIcon(game.Houses[game.fullStreetSet[1].getHouses()]);
        
        Houses_BuySlider.setMinimum(0);
        
        if (Houses_SwitchBuySell.isSelected()) {
            Houses_CostLabel.setText("Earnings: " + String.valueOf(Houses_BuySlider.getValue()
                    * game.fullStreetSet[0].getHouseCost() / 2));
        
            Houses_BuySlider.setMaximum(game.fullStreetSet[0].groupHouses());
        } else {
            Houses_CostLabel.setText("Cost: " + String.valueOf(Houses_BuySlider.getValue()
                    * game.fullStreetSet[0].getHouseCost()));
        
            if (game.fullStreetSet[0].groupHouses() >= 4 * game.fullSetUsed.length) {
                Houses_BuySlider.setMaximum(5 * game.fullSetUsed.length - game.fullStreetSet[0].groupHouses());
            } else {
                Houses_BuySlider.setMaximum(java.lang.Math.min(5 * game.fullSetUsed.length
                        - game.fullStreetSet[0].groupHouses(), game.housesLeft));
            }
        }
        
    }//GEN-LAST:event_Houses_BuyCard1ComponentShown

    private void Houses_BuySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Houses_BuySliderStateChanged
        
        if (Houses_SwitchBuySell.isSelected()) {
            game.futureHouses = -Houses_BuySlider.getValue() + game.fullStreetSet[0].groupHouses();
            game.futureHouseCost = -Houses_BuySlider.getValue() * game.fullStreetSet[0].getHouseCost();
        } else {
            game.futureHouses = Houses_BuySlider.getValue() + game.fullStreetSet[0].groupHouses();
            game.futureHouseCost = Houses_BuySlider.getValue() * game.fullStreetSet[0].getHouseCost();
        }
        
        if (game.numHousesBought() > 0) {
            Houses_QuantityLabel.setText(String.valueOf(game.numHousesBought()) + " Houses");
        } else {
            Houses_QuantityLabel.setText("");
        }
        
        if (game.numHotelsBought() > 0) {
            if (!Houses_QuantityLabel.getText().equals("")) {
                Houses_QuantityLabel.setText(Houses_QuantityLabel.getText() + ", ");
            }
            Houses_QuantityLabel.setText(Houses_QuantityLabel.getText() + game.numHotelsBought() + " Hotels");
        }

        if (Houses_SwitchBuySell.isSelected()) {
            Houses_CostLabel.setText("Earnings: " + String.valueOf(-game.futureHouseCost / 2));
        } else {
            Houses_CostLabel.setText("Cost: " + String.valueOf(game.futureHouseCost));
        }

        Houses_BuyButton.setEnabled(game.futureHouseCost <= game.activePlayer.getMoney());
        
        if (game.fullSetUsed.length == 3) {
            game.futurePropHouses[0] = game.futureHouses / 3;
            
            if (game.futureHouses % 3 == 2) {
                game.futurePropHouses[1] = game.futureHouses / 3 + 1;
            } else {
                game.futurePropHouses[1] = game.futureHouses / 3;
            }
            
            if (game.futureHouses % 3 == 0) {
                game.futurePropHouses[2] = game.futureHouses / 3;
            } else {
                game.futurePropHouses[2] = game.futureHouses / 3 + 1;
            }
            
            Houses_BuyHouses3.setIcon(game.Houses[game.futurePropHouses[2]]);

        } else {
            game.futurePropHouses[0] = game.futureHouses / 2;
       
            if (game.futureHouses % 2 == 1) {
                game.futurePropHouses[1] = game.futureHouses / 2 + 1;
            } else {
                game.futurePropHouses[1] = game.futureHouses / 2;
            }
        }
        
        Houses_BuyHouses1.setIcon(game.Houses[game.futurePropHouses[0]]);            
        Houses_BuyHouses2.setIcon(game.Houses[game.futurePropHouses[1]]); 
    }//GEN-LAST:event_Houses_BuySliderStateChanged

    private void Houses_BuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Houses_BuyButtonActionPerformed
        game.housesLeft += (5 * game.numHotelsBought()) - (game.futureHouseCost / game.fullStreetSet[0].getHouseCost());
        Houses_RemainingLabel.setText("Houses remaining: " + String.valueOf(game.housesLeft));
        
        game.fullStreetSet[0].setHouses(game.futurePropHouses[0]);
        game.fullStreetSet[1].setHouses(game.futurePropHouses[1]);
        if (game.fullSetUsed.length == 3) {
            game.fullStreetSet[2].setHouses(game.futurePropHouses[2]);
        }
  
        switch (game.fullStreetSet[0].getHouseOrientation()) {
            case 1:
                game.BoardHouses = game.BoardBottomHouses;
                break;
            case 2:
                game.BoardHouses = game.BoardLeftHouses;
                break;
            case 3:
                game.BoardHouses = game.BoardTopHouses;
                break;
            case 4:
                game.BoardHouses = game.BoardRightHouses;
                break;
        }
        
        for (int i = 0; i < game.fullSetUsed.length; i++) {
            ((Street)game.fullSetUsed[i]).getBoardHousesLabel().setIcon(game.BoardHouses[game.futurePropHouses[i]]);
        } 
        
        if (Houses_SwitchBuySell.isSelected()) {
            game.activePlayer.changeMoney(-game.futureHouseCost / 2);
        } else {
            game.activePlayer.changeMoney(-game.futureHouseCost);
        }
        
        Houses_BuySlider.setValue(0);
        Houses_QuantityLabel.setText(String.valueOf(Houses_BuySlider.getValue()) + " Houses");
        Houses_PlayerMoneyLabel.setText("You have: " + String.valueOf(game.activePlayer.getMoney()));
        
        if (Houses_SwitchBuySell.isSelected()) {
            Houses_CostLabel.setText("Earnings: " + String.valueOf(Houses_BuySlider.getValue()
                    * game.fullStreetSet[0].getHouseCost() / 2));
        
            Houses_BuySlider.setMaximum(game.fullStreetSet[0].groupHouses());
        } else {
            Houses_CostLabel.setText("Cost: " + String.valueOf(game.futureHouseCost));
            if (game.fullStreetSet[0].groupHouses() >= 4 * game.fullSetUsed.length) {
                Houses_BuySlider.setMaximum(5 * game.fullSetUsed.length - game.fullStreetSet[0].groupHouses());
            } else {
                Houses_BuySlider.setMaximum(java.lang.Math.min(5 * game.fullSetUsed.length
                        - game.fullStreetSet[0].groupHouses(), game.housesLeft));
            }
        }
    }//GEN-LAST:event_Houses_BuyButtonActionPerformed

    private void Houses_SwitchBuySellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Houses_SwitchBuySellActionPerformed
        CardLayout card = (CardLayout)Houses_CardRegion.getLayout();
        if (Houses_SwitchBuySell.isSelected()) {
            
            Houses_TitleLabel.setText("Which full set would you like to sell from?");
            Houses_SwitchBuySell.setText("Buy Menu");

            Houses_BuyButton.setText("Sell");
            game.setHouseSellButtonsActive();
            
            if (Houses_BuyCard1.isVisible()) {
                Houses_BuySlider.setMaximum(game.fullStreetSet[0].groupHouses());
                Houses_CostLabel.setText("Earnings: " + String.valueOf(Houses_BuySlider.getValue()
                    * game.fullStreetSet[0].getHouseCost() / 2));
                if (game.fullStreetSet[0].groupHouses() > 4 * game.fullSetUsed.length) {
                    card.show(Houses_CardRegion, "SellHotel");
                }
            }

        } else {
            if (Houses_SellHotelCard.isVisible()) {   
                card.show(Houses_CardRegion, "Buy1");
            }
            Houses_TitleLabel.setText("Which full set would you like to develop?");
            Houses_SwitchBuySell.setText("Sell Menu");
            Houses_BuyButton.setText("Buy");
            game.setHouseBuyButtonsActive();
            
            if (Houses_BuyCard1.isVisible()) {
                if (game.fullStreetSet[0].groupHouses() >= 4 * game.fullSetUsed.length) {
                    Houses_BuySlider.setMaximum(5 * game.fullSetUsed.length - game.fullStreetSet[0].groupHouses());
                } else {
                    Houses_BuySlider.setMaximum(java.lang.Math.min(5 * game.fullSetUsed.length
                            - game.fullStreetSet[0].groupHouses(), game.housesLeft));
                }
                Houses_CostLabel.setText("Cost: " + String.valueOf(Houses_BuySlider.getValue()
                    * game.fullStreetSet[0].getHouseCost()));
            }   

        }
    }//GEN-LAST:event_Houses_SwitchBuySellActionPerformed

    private void Houses_SellHotelCardComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Houses_SellHotelCardComponentShown
        Houses_SellHotelCard.setBackground(Houses_BuyCard1.getBackground());
        Houses_SellHotelEarningsLabel.setText("Earnings: 0");
        Houses_SellHotelYouHaveLabel.setText("You have: " + String.valueOf(game.activePlayer.getMoney()));
    }//GEN-LAST:event_Houses_SellHotelCardComponentShown

    private void Houses_SellHotelCheckboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Houses_SellHotelCheckboxItemStateChanged
        if (Houses_SellHotelCheckbox.isSelected()) {
            game.futureHouseCost = game.fullStreetSet[0].groupHouses() * game.fullStreetSet[0].getHouseCost() / 2;
            game.futureHouses = 0;
        } else {
            game.futureHouseCost = 0;
        }
        
        Houses_SellHotelEarningsLabel.setText("Earnings: " + String.valueOf(game.futureHouseCost));
        Houses_SellHotelYouHaveLabel.setText("You have: " + String.valueOf(game.activePlayer.getMoney()));
    }//GEN-LAST:event_Houses_SellHotelCheckboxItemStateChanged

    private void Houses_SellHotelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Houses_SellHotelButtonActionPerformed
        
        if (Houses_SellHotelCheckbox.isSelected()) {
        
            game.activePlayer.changeMoney(game.futureHouseCost);
            game.housesLeft += 4 * ((5 * game.fullSetUsed.length) - game.fullStreetSet[0].groupHouses());
            Houses_RemainingLabel.setText("Houses remaining: " + String.valueOf(game.housesLeft));

            switch (game.fullStreetSet[0].getHouseOrientation()) {
                case 1:
                    game.BoardHouses = game.BoardBottomHouses;
                    break;
                case 2:
                    game.BoardHouses = game.BoardLeftHouses;
                    break;
                case 3:
                    game.BoardHouses = game.BoardTopHouses;
                    break;
                case 4:
                    game.BoardHouses = game.BoardRightHouses;
                    break;
            }

            for (Property p : game.fullSetUsed) {
                ((Street)p).setHouses(0);
                ((Street)p).getBoardHousesLabel().setIcon(game.BoardHouses[0]);
            }

            Houses_SellHotelCheckbox.setSelected(false);

            CardLayout card = (CardLayout)Houses_CardRegion.getLayout();
            card.show(Houses_CardRegion, "Blank");
            
            game.setHouseSellButtonsActive();
        }
    }//GEN-LAST:event_Houses_SellHotelButtonActionPerformed

    private void GameBoard_MortgageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameBoard_MortgageButtonActionPerformed
        MortgageWindow.setVisible(true);
        disableButtons();
    }//GEN-LAST:event_GameBoard_MortgageButtonActionPerformed

    private void HousesWindowComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_HousesWindowComponentShown
        CardLayout card = (CardLayout)Houses_CardRegion.getLayout();
        card.show(Houses_CardRegion, "Blank");                                          
        
        if (Houses_SwitchBuySell.isSelected()) {
            game.setHouseSellButtonsActive();
        } else {
            game.setHouseBuyButtonsActive();
        }
        
        Houses_RemainingLabel.setText("Houses remaining: " + String.valueOf(game.housesLeft));
    }//GEN-LAST:event_HousesWindowComponentShown

    private void MortgageWindowComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_MortgageWindowComponentShown
        disableButtons();
        
        for (javax.swing.JCheckBox cb : game.PropertyBoxes) {
            cb.setSelected(false);
        }
        
        Mortgage_ScrollPanel.setPreferredSize(new java.awt.Dimension(250, game.setupMortgageMenu(
                Mortgage_SwitchMenusButton.isSelected()) * 50 + 20));
        
        setMortgageValueButton();
        
        if (Mortgage_SwitchMenusButton.isSelected()) {
            Mortgage_TitleLabel.setText("Which properties would you like to unmortgage?");
            Mortgage_EarningsLabel.setText("Cost:");
        } else {
            Mortgage_TitleLabel.setText("Which properties would you like to mortgage?");
            Mortgage_EarningsLabel.setText("Earnings:");
        }
        
        Mortgage_YouHaveValueLabel.setText(String.valueOf(game.activePlayer.getMoney()));
    }//GEN-LAST:event_MortgageWindowComponentShown

    private void Mortgage_CheckBox0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox0ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox0ActionPerformed

    private void Mortgage_CheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox1ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox1ActionPerformed

    private void Mortgage_CheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox2ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox2ActionPerformed

    private void Mortgage_CheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox3ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox3ActionPerformed

    private void Mortgage_CheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox4ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox4ActionPerformed

    private void Mortgage_CheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox5ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox5ActionPerformed

    private void Mortgage_CheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox6ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox6ActionPerformed

    private void Mortgage_CheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox7ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox7ActionPerformed

    private void Mortgage_CheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox8ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox8ActionPerformed

    private void Mortgage_CheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox9ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox9ActionPerformed

    private void Mortgage_CheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox10ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox10ActionPerformed

    private void Mortgage_CheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox11ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox11ActionPerformed

    private void Mortgage_CheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox12ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox12ActionPerformed

    private void Mortgage_CheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox13ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox13ActionPerformed

    private void Mortgage_CheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox14ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox14ActionPerformed

    private void Mortgage_CheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox15ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox15ActionPerformed

    private void Mortgage_CheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox16ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox16ActionPerformed

    private void Mortgage_CheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox17ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox17ActionPerformed

    private void Mortgage_CheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox18ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox18ActionPerformed

    private void Mortgage_CheckBox19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox19ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox19ActionPerformed

    private void Mortgage_CheckBox20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox20ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox20ActionPerformed

    private void Mortgage_CheckBox21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox21ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox21ActionPerformed

    private void Mortgage_CheckBox22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox22ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox22ActionPerformed

    private void Mortgage_CheckBox23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox23ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox23ActionPerformed

    private void Mortgage_CheckBox24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox24ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox24ActionPerformed

    private void Mortgage_CheckBox25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox25ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox25ActionPerformed

    private void Mortgage_CheckBox26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox26ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox26ActionPerformed

    private void Mortgage_CheckBox27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_CheckBox27ActionPerformed
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_CheckBox27ActionPerformed

    private void Mortgage_SwitchMenusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_SwitchMenusButtonActionPerformed
        for (javax.swing.JCheckBox cb : game.PropertyBoxes) {
            cb.setSelected(false);
        }
        
        Mortgage_ScrollPanel.setPreferredSize(new java.awt.Dimension(250, java.lang.Math.max(
                game.setupMortgageMenu(Mortgage_SwitchMenusButton.isSelected()) * 50 + 20, 400)));
        
        setMortgageValueButton();
        
        if (Mortgage_SwitchMenusButton.isSelected()) {
            Mortgage_TitleLabel.setText("Which properties would you like to unmortgage?");
            Mortgage_EarningsLabel.setText("Cost:");
            Mortgage_Button.setText("Unmortgage");
        } else {
            Mortgage_TitleLabel.setText("Which properties would you like to mortgage?");
            Mortgage_EarningsLabel.setText("Earnings:");
            Mortgage_Button.setText("Mortgage");
        }
    }//GEN-LAST:event_Mortgage_SwitchMenusButtonActionPerformed

    private void Mortgage_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mortgage_ButtonActionPerformed
        if (Mortgage_SwitchMenusButton.isSelected()) {
            game.activePlayer.changeMoney(-game.mortgageValue(true));
            game.mortgageProperties(true);
        } else {
            game.activePlayer.changeMoney(game.mortgageValue(false));
            game.mortgageProperties(false);
        }
        
        for (javax.swing.JCheckBox cb : game.PropertyBoxes) {
            cb.setSelected(false);
        }
        
        Mortgage_ScrollPanel.setPreferredSize(new java.awt.Dimension(250, java.lang.Math.max(
                game.setupMortgageMenu(Mortgage_SwitchMenusButton.isSelected()) * 50 + 20, 400)));
        
        Mortgage_YouHaveValueLabel.setText(String.valueOf(game.activePlayer.getMoney()));
        setMortgageValueButton();
    }//GEN-LAST:event_Mortgage_ButtonActionPerformed

    private void HousesWindowComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_HousesWindowComponentHidden
        if (game.playerInDebt) {
            enableDebtButtons();
        } else {
            enableButtons();
        }
    }//GEN-LAST:event_HousesWindowComponentHidden

    private void MortgageWindowComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_MortgageWindowComponentHidden
        if (game.playerInDebt) {
            enableDebtButtons();
        } else {
            enableButtons();
        }
    }//GEN-LAST:event_MortgageWindowComponentHidden

    private void GameBoard_TradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameBoard_TradeButtonActionPerformed
        TradeWindow.setVisible(true);
        disableButtons();
    }//GEN-LAST:event_GameBoard_TradeButtonActionPerformed

    private void TradeWindowComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TradeWindowComponentShown
        Proposer_MoneyField.setText("0");
        Proposer_OutOfJailField.setText("0");
        Proposee_MoneyField.setText("0");
        Proposee_OutOfJailField.setText("0");
        CardLayout card = (CardLayout)Trade_CardRegion.getLayout();
        card.show(Trade_CardRegion, "Blank");
        card.show(Trade_CardRegion, "Proposal");
    }//GEN-LAST:event_TradeWindowComponentShown

    private void TradeWindowComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TradeWindowComponentHidden
        game.cancelTrade();
        if (game.playerInDebt) {
            enableDebtButtons();
        } else {
            enableButtons();
        }
    }//GEN-LAST:event_TradeWindowComponentHidden

    private void Proposal_PlayersComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proposal_PlayersComboBoxActionPerformed
        game.tradeProposee = game.tradePartners()[Proposal_PlayersComboBox.getSelectedIndex()];
        
        ProposerPanel.setPreferredSize(new java.awt.Dimension(250, game.setupProposerList() * 120 + 20));
        ProposeePanel.setPreferredSize(new java.awt.Dimension(250, game.setupProposeeList() * 120 + 20));
        Proposee_NameLabel.setText(game.tradeProposee.toString() + " trades:");
        Proposee_MoneyLabel.setText("/ " + String.valueOf(game.tradeProposee.getMoney()));
        Proposee_OutOfJailCardsLabel.setText("/ " + String.valueOf(game.tradeProposee.getJailFreeCards()));
    }//GEN-LAST:event_Proposal_PlayersComboBoxActionPerformed

    private void Trade_ProposeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Trade_ProposeButtonActionPerformed
        if (game.proposeTrade(Proposer_MoneyField, Proposer_OutOfJailField, Proposee_MoneyField, Proposee_OutOfJailField)) {
            CardLayout card = (CardLayout)Trade_CardRegion.getLayout();
            card.show(Trade_CardRegion, "Review");
        }
    }//GEN-LAST:event_Trade_ProposeButtonActionPerformed

    private void Proposal_CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proposal_CancelButtonActionPerformed
        TradeWindow.setVisible(false);
    }//GEN-LAST:event_Proposal_CancelButtonActionPerformed

    private void Trade_ProposalCardComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Trade_ProposalCardComponentShown
        CardLayout card = (CardLayout)Proposal_TitleCardRegion.getLayout();
        if (game.tradeCounter == 0) {
            Proposal_PlayersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(game.otherPlayerNamesArray()));
            Proposal_TitleLabel.setText(game.activePlayer.toString() + " Trade Proposal to:");
            game.tradeProposee = game.tradePartners()[Proposal_PlayersComboBox.getSelectedIndex()];
            ProposerPanel.setPreferredSize(new java.awt.Dimension(250, game.setupProposerList() * 50 + 20));
            ProposeePanel.setPreferredSize(new java.awt.Dimension(250, game.setupProposeeList() * 50 + 20));
            Proposer_NameLabel.setText(game.activePlayer.toString() + " trades:");
            Proposee_NameLabel.setText(game.tradeProposee.toString() + " trades:");
            Proposer_MoneyLabel.setText("/ " + String.valueOf(game.activePlayer.getMoney()));
            Proposer_OutOfJailCardsLabel.setText("/ " + String.valueOf(game.activePlayer.getJailFreeCards()));
            Proposee_MoneyLabel.setText("/ " + String.valueOf(game.tradeProposee.getMoney()));
            Proposee_OutOfJailCardsLabel.setText("/ " + String.valueOf(game.tradeProposee.getJailFreeCards()));
            card.show(Proposal_TitleCardRegion, "Initial");
        } else {
            if (game.tradeCounter % 2 == 0) {
                Proposal_CounterTitleLabel.setText(game.activePlayer.toString() + " Counter-Offer to " + game.tradeProposee.toString());
            } else {
                Proposal_CounterTitleLabel.setText(game.tradeProposee.toString() + " Counter-Offer to " + game.activePlayer.toString());
            }
            card.show(Proposal_TitleCardRegion, "Counter");
        }   
    }//GEN-LAST:event_Trade_ProposalCardComponentShown

    private void Trade_ReviewCardComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Trade_ReviewCardComponentShown
        if (game.tradeCounter % 2 == 0) {
            Review_TitleLabel.setText("Proposed Trade from " + game.activePlayer.toString());
        } else {
            Review_TitleLabel.setText("Proposed Trade from " + game.tradeProposee.toString());
        }
        Review_ProposerLabel.setText(game.activePlayer.toString() + " Receives:");
        Review_ProposeeLabel.setText(game.tradeProposee.toString() + " Receives:");
        
        Review_ProposerPanel.setPreferredSize(new java.awt.Dimension(game.setupProposerReviewCards() * 130 + 10, 210));
        Review_ProposeePanel.setPreferredSize(new java.awt.Dimension(game.setupProposeeReviewCards() * 130 + 10, 210));
        
        Review_ProposerMoneyLabel.setText(String.valueOf(game.proposeeTradedMoney));
        Review_ProposeeMoneyLabel.setText(String.valueOf(game.proposerTradedMoney));
        Review_ProposerOutOfJailCardsLabel.setText(String.valueOf(game.proposeeTradedOutOfJailCards));
        Review_ProposeeOutOfJailCardsLabel.setText(String.valueOf(game.proposerTradedOutOfJailCards));
        if (game.tradeCounter % 2 == 0) {
            Review_ProposeePrompt.setText(game.tradeProposee.toString() + ", please decide:");
        } else {
            Review_ProposeePrompt.setText(game.activePlayer.toString() + ", please decide:");
        }  
    }//GEN-LAST:event_Trade_ReviewCardComponentShown

    private void Review_AcceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Review_AcceptButtonActionPerformed
        game.trade();
        TradeWindow.setVisible(false);
    }//GEN-LAST:event_Review_AcceptButtonActionPerformed

    private void Review_DeclineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Review_DeclineButtonActionPerformed
        TradeWindow.setVisible(false);
    }//GEN-LAST:event_Review_DeclineButtonActionPerformed

    private void Review_CounterOfferButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Review_CounterOfferButtonActionPerformed
        game.tradeCounter++;
        CardLayout card = (CardLayout)Trade_CardRegion.getLayout();
        card.show(Trade_CardRegion, "Proposal");
    }//GEN-LAST:event_Review_CounterOfferButtonActionPerformed

    private void Debt_HousesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Debt_HousesButtonActionPerformed
        disableDebtButtons();
        HousesWindow.setVisible(true);
    }//GEN-LAST:event_Debt_HousesButtonActionPerformed

    private void DebtWindowComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_DebtWindowComponentShown
        Debt_TitleLabel.setText(game.activePlayer.toString() + ", you're out of money!");
        if (game.owedPlayer == null) {
            Debt_AmntOwedLabel.setText("Your remaining debt to the bank is " + String.valueOf(game.activePlayer.getDebtOwed()));
        } else {
            Debt_AmntOwedLabel.setText("Your remaining debt to " + game.owedPlayer.toString()
                    + " is " + String.valueOf(game.activePlayer.getDebtOwed()));
        }
    }//GEN-LAST:event_DebtWindowComponentShown

    private void Debt_MortgageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Debt_MortgageButtonActionPerformed
        disableDebtButtons();
        MortgageWindow.setVisible(true);
    }//GEN-LAST:event_Debt_MortgageButtonActionPerformed

    private void Debt_TradeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Debt_TradeButtonActionPerformed
        disableDebtButtons();
        TradeWindow.setVisible(true);
    }//GEN-LAST:event_Debt_TradeButtonActionPerformed

    private void Debt_UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Debt_UpdateButtonActionPerformed
        if (game.activePlayer.getMoney() >= game.activePlayer.getDebtOwed()) {
            game.activePlayer.changeMoney(-game.activePlayer.getDebtOwed());
            if (game.owedPlayer != null) {
                game.owedPlayer.changeMoney(game.activePlayer.getDebtOwed());
            }
            game.activePlayer.setDebtOwed(0);
            CardLayout card = (CardLayout)Debt_CardRegion.getLayout();
            OutOfDebt_MoneyLabel.setText("Your balance is " + String.valueOf(game.activePlayer.getMoney()) + ".");
            card.show(Debt_CardRegion, "OutOfDebt");
        } else {
            game.activePlayer.setDebtOwed(game.activePlayer.getDebtOwed() - game.activePlayer.getMoney());
            if (game.owedPlayer != null) {
                game.owedPlayer.changeMoney(game.activePlayer.getMoney());
            }
            game.activePlayer.changeMoney(-game.activePlayer.getMoney());
            if (game.owedPlayer == null) {
                Debt_AmntOwedLabel.setText("Your remaining debt to the bank is " + String.valueOf(game.activePlayer.getDebtOwed()));
            } else {
                Debt_AmntOwedLabel.setText("Your remaining debt to " + game.owedPlayer.toString()
                         + " is " + String.valueOf(game.activePlayer.getDebtOwed()));
            }
        }
    }//GEN-LAST:event_Debt_UpdateButtonActionPerformed

    private void OutOfDebt_OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutOfDebt_OKButtonActionPerformed
        game.playerInDebt = false;
        game.owedPlayer = null;
        game.activePlayer = game.storedActivePlayer;
        game.storedActivePlayer = null;
        DebtWindow.setVisible(false);
        enableButtons();
        for (Player p : game.players) {
            if (p.getDebtOwed() > 0 && p.getPlaying()) {
                if (p != game.activePlayer) {
                    game.owedPlayer = game.activePlayer;
                } else {
                    game.owedPlayer = null;
                }
                goInDebt(p);
                break;
            }
        }
    }//GEN-LAST:event_OutOfDebt_OKButtonActionPerformed

    private void Debt_BankruptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Debt_BankruptButtonActionPerformed
        CardLayout card = (CardLayout)Debt_CardRegion.getLayout();
        card.show(Debt_CardRegion, "Bankrupt");
    }//GEN-LAST:event_Debt_BankruptButtonActionPerformed

    private void BankruptCardComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BankruptCardComponentShown
        Bankrupt_PlayerIcon.setIcon(game.activePlayer.getPlayerCardHuge());
        Bankrupt_Label1.setText(game.activePlayer.toString() + " is");
        Bankrupt_Label2.setText("bankrupt!");
        if (game.owedPlayer == null) {
            Bankrupt_Label3.setText("The bank receives all of");
        } else {
            Bankrupt_Label3.setText(game.owedPlayer.toString() + " receives all of");
        }
        Bankrupt_Label4.setText(game.activePlayer.toString() + "'s assets.");
    }//GEN-LAST:event_BankruptCardComponentShown

    private void Bankrupt_ContinueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bankrupt_ContinueButtonActionPerformed
        game.bankrupt();
        
        switch (game.activePlayer.getNumber()) {
            case 1:
                GameBoard_P1Assets.setVisible(false);
                break;
                
            case 2:
                GameBoard_P2Assets.setVisible(false);
                break;
                
            case 3:
                GameBoard_P3Assets.setVisible(false);
                break;
                
            case 4:
                GameBoard_P4Assets.setVisible(false);
                break;
                
            case 5:
                GameBoard_P5Assets.setVisible(false);
                break;
                
            case 6:
                GameBoard_P6Assets.setVisible(false);
                break;
                
            case 7:
                GameBoard_P7Assets.setVisible(false);
                break;
                
            case 8:
                GameBoard_P8Assets.setVisible(false);
                break; 
        }
                
        game.playerInDebt = false;
        game.owedPlayer = null;
        game.activePlayer = game.storedActivePlayer;
        game.storedActivePlayer = null;
        DebtWindow.setVisible(false);
        
        if (game.winner() != null) {
            CardLayout card = (CardLayout)FrameRegion.getLayout();
            End_WinnerIcon.setIcon(game.winner().getPlayerCardHuge());
            card.show(FrameRegion, "End");
        } else {
            
            if (RedDiceResult == YellowDiceResult) {
                GameBoard_NextPlayerButton.setText("Next Player");
            }
            GameBoard_NextPlayerButton.setEnabled(true);
            
            for (Player p : game.players) {
                if (p.getDebtOwed() > 0 && p.getPlaying()) {
                    if (p != game.activePlayer) {
                        game.owedPlayer = game.activePlayer;
                    } else {
                        game.owedPlayer = null;
                    }
                    goInDebt(p);
                    break;
                }
            }
        }
    }//GEN-LAST:event_Bankrupt_ContinueButtonActionPerformed

    private void End_MainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_End_MainMenuButtonActionPerformed
        CardLayout card = (CardLayout)FrameRegion.getLayout();
        MainMenu_PlayersSelect.setSelectedIndex(0);
        card.show(FrameRegion, "MainMenu");
    }//GEN-LAST:event_End_MainMenuButtonActionPerformed

    private void End_ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_End_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_End_ExitButtonActionPerformed

    private void GameBoard_JailFreeCardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameBoard_JailFreeCardButtonActionPerformed
        game.activePlayer.getOutOfJail();
        game.activePlayer.changeJailFreeCards(-1);
        game.activePlayer.getToken().setLocation(game.tokenLocation(game.activePlayer));
        GameBoard_JailFreeCardButton.setVisible(false);
        GameBoard_PayButton.setVisible(false);
    }//GEN-LAST:event_GameBoard_JailFreeCardButtonActionPerformed

	public Monopoly() {
		initComponents();
        setLocationRelativeTo(null);

        initMortgageCheckBoxes();
        initCheckBoxes();
        initReviewCards();
        
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        PropertyWindow.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        NeutralSpaceWindow.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        JailWindow.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        ChanceWindow.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        TaxWindow.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        TradeWindow.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        DebtWindow.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        PropertyWindow.setLocationRelativeTo(null);
        NeutralSpaceWindow.setLocationRelativeTo(null);
        JailWindow.setLocationRelativeTo(null);
        ChanceWindow.setLocationRelativeTo(null);
        TaxWindow.setLocationRelativeTo(null);
        ViewAssetsWindow.setLocationRelativeTo(null);
        HousesWindow.setLocationRelativeTo(null);
        MortgageWindow.setLocationRelativeTo(null);
        TradeWindow.setLocationRelativeTo(null);
        DebtWindow.setLocationRelativeTo(null);
	}

	public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Monopoly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monopoly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monopoly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monopoly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monopoly().setVisible(true);
            }
        });
    }
    
    private javax.swing.JPanel BankruptCard;
    private javax.swing.JButton Bankrupt_ContinueButton;
    private javax.swing.JLabel Bankrupt_Label1;
    private javax.swing.JLabel Bankrupt_Label2;
    private javax.swing.JLabel Bankrupt_Label3;
    private javax.swing.JLabel Bankrupt_Label4;
    private javax.swing.JLabel Bankrupt_PlayerIcon;
    private javax.swing.JDialog ChanceWindow;
    private javax.swing.JLabel Chance_Background;
    private javax.swing.JPanel Chance_CardRegion;
    private javax.swing.JLabel Chance_EffectMessage1;
    private javax.swing.JLabel Chance_EffectMessage2;
    private javax.swing.JLabel Chance_EffectMessage3;
    private javax.swing.JLayeredPane Chance_InitialCard;
    private javax.swing.JButton Chance_OKButton;
    private javax.swing.JPanel Chance_RevealCard;
    private javax.swing.JLabel Chance_TitleLabel;
    private javax.swing.JPanel Chance_TitlePanel;
    private javax.swing.JButton Chance_TurnOverButton;
    private javax.swing.JDialog DebtWindow;
    private javax.swing.JLabel Debt_AmntOwedLabel;
    private javax.swing.JButton Debt_BankruptButton;
    private javax.swing.JPanel Debt_CardRegion;
    private javax.swing.JButton Debt_HousesButton;
    private javax.swing.JButton Debt_MortgageButton;
    private javax.swing.JLabel Debt_TitleLabel;
    private javax.swing.JButton Debt_TradeButton;
    private javax.swing.JButton Debt_UpdateButton;
    private javax.swing.JPanel EndScreen;
    private javax.swing.JButton End_ExitButton;
    private javax.swing.JButton End_MainMenuButton;
    private javax.swing.JLabel End_Message1;
    private javax.swing.JLabel End_Message2;
    private javax.swing.JLabel End_WinnerIcon;
    private javax.swing.JPanel FrameRegion;
    private javax.swing.ButtonGroup FullSetsButtonGroup;
    private javax.swing.JLayeredPane GameBoard;
    private javax.swing.JLabel GameBoard_Board;
    private javax.swing.JButton GameBoard_DiceButton;
    private javax.swing.JPanel GameBoard_DiceCardRegion;
    private javax.swing.JButton GameBoard_HousesButton;
    private javax.swing.JButton GameBoard_JailFreeCardButton;
    private javax.swing.JButton GameBoard_MortgageButton;
    private javax.swing.JButton GameBoard_MoveButton;
    private javax.swing.JPanel GameBoard_MoveCard;
    private javax.swing.JButton GameBoard_NextPlayerButton;
    private javax.swing.JLabel GameBoard_P1Assets;
    private javax.swing.JLabel GameBoard_P2Assets;
    private javax.swing.JLabel GameBoard_P3Assets;
    private javax.swing.JLabel GameBoard_P4Assets;
    private javax.swing.JLabel GameBoard_P5Assets;
    private javax.swing.JLabel GameBoard_P6Assets;
    private javax.swing.JLabel GameBoard_P7Assets;
    private javax.swing.JLabel GameBoard_P8Assets;
    private javax.swing.JButton GameBoard_PayButton;
    private javax.swing.JLabel GameBoard_PlayerLabel;
    private javax.swing.JPanel GameBoard_RollDiceCard;
    private javax.swing.JLabel GameBoard_St0Houses;
    private javax.swing.JLabel GameBoard_St10Houses;
    private javax.swing.JLabel GameBoard_St11Houses;
    private javax.swing.JLabel GameBoard_St12Houses;
    private javax.swing.JLabel GameBoard_St13Houses;
    private javax.swing.JLabel GameBoard_St14Houses;
    private javax.swing.JLabel GameBoard_St15Houses;
    private javax.swing.JLabel GameBoard_St16Houses;
    private javax.swing.JLabel GameBoard_St17Houses;
    private javax.swing.JLabel GameBoard_St18Houses;
    private javax.swing.JLabel GameBoard_St19Houses;
    private javax.swing.JLabel GameBoard_St1Houses;
    private javax.swing.JLabel GameBoard_St20Houses;
    private javax.swing.JLabel GameBoard_St21Houses;
    private javax.swing.JLabel GameBoard_St2Houses;
    private javax.swing.JLabel GameBoard_St3Houses;
    private javax.swing.JLabel GameBoard_St4Houses;
    private javax.swing.JLabel GameBoard_St5Houses;
    private javax.swing.JLabel GameBoard_St6Houses;
    private javax.swing.JLabel GameBoard_St7Houses;
    private javax.swing.JLabel GameBoard_St8Houses;
    private javax.swing.JLabel GameBoard_St9Houses;
    private javax.swing.JButton GameBoard_TradeButton;
    private javax.swing.JLabel GameBoard_ViewAssetsLabel;
    private javax.swing.JPanel GameBoard_ViewAssetsPanel;
    private javax.swing.JPanel HousesPanel;
    private javax.swing.JDialog HousesWindow;
    private javax.swing.JPanel Houses_BlankCard;
    private javax.swing.JRadioButton Houses_BlueButton;
    private javax.swing.JRadioButton Houses_BrownButton;
    private javax.swing.JButton Houses_BuyButton;
    private javax.swing.JPanel Houses_BuyCard1;
    private javax.swing.JLabel Houses_BuyHouses1;
    private javax.swing.JLabel Houses_BuyHouses2;
    private javax.swing.JLabel Houses_BuyHouses3;
    private javax.swing.JLabel Houses_BuyProperty1;
    private javax.swing.JLabel Houses_BuyProperty2;
    private javax.swing.JLabel Houses_BuyProperty3;
    private javax.swing.JSlider Houses_BuySlider;
    private javax.swing.JPanel Houses_CardRegion;
    private javax.swing.JLabel Houses_CostLabel;
    private javax.swing.JRadioButton Houses_GreenButton;
    private javax.swing.JRadioButton Houses_LightBlueButton;
    private javax.swing.JRadioButton Houses_OrangeButton;
    private javax.swing.JRadioButton Houses_PinkButton;
    private javax.swing.JLabel Houses_PlayerMoneyLabel;
    private javax.swing.JLabel Houses_QuantityLabel;
    private javax.swing.JRadioButton Houses_RedButton;
    private javax.swing.JLabel Houses_RemainingLabel;
    private javax.swing.JButton Houses_SellHotelButton;
    private javax.swing.JPanel Houses_SellHotelCard;
    private javax.swing.JCheckBox Houses_SellHotelCheckbox;
    private javax.swing.JLabel Houses_SellHotelEarningsLabel;
    private javax.swing.JLabel Houses_SellHotelMessage1;
    private javax.swing.JLabel Houses_SellHotelMessage2;
    private javax.swing.JLabel Houses_SellHotelMessage3;
    private javax.swing.JLabel Houses_SellHotelTitleLabel;
    private javax.swing.JLabel Houses_SellHotelYouHaveLabel;
    private javax.swing.JToggleButton Houses_SwitchBuySell;
    private javax.swing.JLabel Houses_TitleLabel;
    private javax.swing.JRadioButton Houses_YellowButton;
    private javax.swing.JPanel InDebtCard;
    private javax.swing.JPanel JailPanel;
    private javax.swing.JDialog JailWindow;
    private javax.swing.JLabel Jail_Icon;
    private javax.swing.JLabel Jail_Message;
    private javax.swing.JButton Jail_OKButton;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JLabel MainMenu_LogoImg;
    private javax.swing.JLabel MainMenu_NumPlayers;
    private javax.swing.JButton MainMenu_PlayButton;
    private javax.swing.JComboBox<String> MainMenu_PlayersSelect;
    private javax.swing.JPanel MortgagePanel;
    private javax.swing.JDialog MortgageWindow;
    private javax.swing.JButton Mortgage_Button;
    private javax.swing.JCheckBox Mortgage_CheckBox0;
    private javax.swing.JCheckBox Mortgage_CheckBox1;
    private javax.swing.JCheckBox Mortgage_CheckBox10;
    private javax.swing.JCheckBox Mortgage_CheckBox11;
    private javax.swing.JCheckBox Mortgage_CheckBox12;
    private javax.swing.JCheckBox Mortgage_CheckBox13;
    private javax.swing.JCheckBox Mortgage_CheckBox14;
    private javax.swing.JCheckBox Mortgage_CheckBox15;
    private javax.swing.JCheckBox Mortgage_CheckBox16;
    private javax.swing.JCheckBox Mortgage_CheckBox17;
    private javax.swing.JCheckBox Mortgage_CheckBox18;
    private javax.swing.JCheckBox Mortgage_CheckBox19;
    private javax.swing.JCheckBox Mortgage_CheckBox2;
    private javax.swing.JCheckBox Mortgage_CheckBox20;
    private javax.swing.JCheckBox Mortgage_CheckBox21;
    private javax.swing.JCheckBox Mortgage_CheckBox22;
    private javax.swing.JCheckBox Mortgage_CheckBox23;
    private javax.swing.JCheckBox Mortgage_CheckBox24;
    private javax.swing.JCheckBox Mortgage_CheckBox25;
    private javax.swing.JCheckBox Mortgage_CheckBox26;
    private javax.swing.JCheckBox Mortgage_CheckBox27;
    private javax.swing.JCheckBox Mortgage_CheckBox3;
    private javax.swing.JCheckBox Mortgage_CheckBox4;
    private javax.swing.JCheckBox Mortgage_CheckBox5;
    private javax.swing.JCheckBox Mortgage_CheckBox6;
    private javax.swing.JCheckBox Mortgage_CheckBox7;
    private javax.swing.JCheckBox Mortgage_CheckBox8;
    private javax.swing.JCheckBox Mortgage_CheckBox9;
    private javax.swing.JLabel Mortgage_EarningsLabel;
    private javax.swing.JLabel Mortgage_EarningsValueLabel;
    private javax.swing.JLabel Mortgage_Message1;
    private javax.swing.JLabel Mortgage_Message2;
    private javax.swing.JLabel Mortgage_Message3;
    private javax.swing.JLabel Mortgage_Message4;
    private javax.swing.JScrollPane Mortgage_ScrollPane;
    private javax.swing.JPanel Mortgage_ScrollPanel;
    private javax.swing.JToggleButton Mortgage_SwitchMenusButton;
    private javax.swing.JLabel Mortgage_TitleLabel;
    private javax.swing.JLabel Mortgage_YouHaveLabel;
    private javax.swing.JLabel Mortgage_YouHaveValueLabel;
    private javax.swing.JPanel NeutralSpacePanel;
    private javax.swing.JDialog NeutralSpaceWindow;
    private javax.swing.JLabel NeutralSpace_Icon;
    private javax.swing.JLabel NeutralSpace_Message;
    private javax.swing.JButton NeutralSpace_OKButton;
    private javax.swing.JPanel OutOfDebtCard;
    private javax.swing.JLabel OutOfDebt_Label1;
    private javax.swing.JLabel OutOfDebt_Label2;
    private javax.swing.JLabel OutOfDebt_MoneyLabel;
    private javax.swing.JButton OutOfDebt_OKButton;
    private javax.swing.JPanel PropertyPanel;
    private javax.swing.JDialog PropertyWindow;
    private javax.swing.JButton Property_AuctionButton;
    private javax.swing.JPanel Property_AuctionCard;
    private javax.swing.JLabel Property_AuctionLabel;
    private javax.swing.JButton Property_BuyButton;
    private javax.swing.JPanel Property_BuyCard;
    private javax.swing.JPanel Property_CardRegion;
    private javax.swing.JPanel Property_Container;
    private javax.swing.JLabel Property_CostLabel;
    private javax.swing.JLabel Property_CurrentBidLabel;
    private javax.swing.JLabel Property_CurrentBidValue;
    private javax.swing.JLabel Property_Label1;
    private javax.swing.JLabel Property_Label2;
    private javax.swing.JLabel Property_Label3;
    private javax.swing.JLabel Property_Label4;
    private javax.swing.JPanel Property_NoRentCard;
    private javax.swing.JLabel Property_NoRentLabel1;
    private javax.swing.JLabel Property_NoRentLabel2;
    private javax.swing.JButton Property_NoRentOKButton;
    private javax.swing.JLabel Property_P1AuctionLabel;
    private javax.swing.JButton Property_P1BidButton;
    private javax.swing.JTextField Property_P1BidPrice;
    private javax.swing.JButton Property_P1PassButton;
    private javax.swing.JLabel Property_P2AuctionLabel;
    private javax.swing.JButton Property_P2BidButton;
    private javax.swing.JTextField Property_P2BidPrice;
    private javax.swing.JButton Property_P2PassButton;
    private javax.swing.JLabel Property_P3AuctionLabel;
    private javax.swing.JButton Property_P3BidButton;
    private javax.swing.JTextField Property_P3BidPrice;
    private javax.swing.JButton Property_P3PassButton;
    private javax.swing.JLabel Property_P4AuctionLabel;
    private javax.swing.JButton Property_P4BidButton;
    private javax.swing.JTextField Property_P4BidPrice;
    private javax.swing.JButton Property_P4PassButton;
    private javax.swing.JLabel Property_P5AuctionLabel;
    private javax.swing.JButton Property_P5BidButton;
    private javax.swing.JTextField Property_P5BidPrice;
    private javax.swing.JButton Property_P5PassButton;
    private javax.swing.JLabel Property_P6AuctionLabel;
    private javax.swing.JButton Property_P6BidButton;
    private javax.swing.JTextField Property_P6BidPrice;
    private javax.swing.JButton Property_P6PassButton;
    private javax.swing.JLabel Property_P7AuctionLabel;
    private javax.swing.JButton Property_P7BidButton;
    private javax.swing.JTextField Property_P7BidPrice;
    private javax.swing.JButton Property_P7PassButton;
    private javax.swing.JLabel Property_P8AuctionLabel;
    private javax.swing.JButton Property_P8BidButton;
    private javax.swing.JTextField Property_P8BidPrice;
    private javax.swing.JButton Property_P8PassButton;
    private javax.swing.JButton Property_PayRentButton;
    private javax.swing.JPanel Property_PayRentCard;
    private javax.swing.JLabel Property_PayRentLabel1;
    private javax.swing.JLabel Property_PayRentLabel2;
    private javax.swing.JLabel Property_PayRentYourMoney;
    private javax.swing.JLabel Property_PropCard;
    private javax.swing.JLabel Property_RentOwedLabel;
    private javax.swing.JPanel Property_WinnerCard;
    private javax.swing.JLabel Property_WinningBidLabel;
    private javax.swing.JButton Property_WinningBidOKButton;
    private javax.swing.JLabel Property_WinningBidder;
    private javax.swing.JLabel Property_YouHaveLabel;
    private javax.swing.JButton Proposal_CancelButton;
    private javax.swing.JPanel Proposal_CounterCard;
    private javax.swing.JLabel Proposal_CounterTitleLabel;
    private javax.swing.JPanel Proposal_InitialCard;
    private javax.swing.JComboBox<String> Proposal_PlayersComboBox;
    private javax.swing.JPanel Proposal_TitleCardRegion;
    private javax.swing.JLabel Proposal_TitleLabel;
    private javax.swing.JPanel ProposeeAssets;
    private javax.swing.JPanel ProposeePanel;
    private javax.swing.JScrollPane ProposeeScrollPane;
    private javax.swing.JCheckBox Proposee_CheckBox0;
    private javax.swing.JCheckBox Proposee_CheckBox1;
    private javax.swing.JCheckBox Proposee_CheckBox10;
    private javax.swing.JCheckBox Proposee_CheckBox11;
    private javax.swing.JCheckBox Proposee_CheckBox12;
    private javax.swing.JCheckBox Proposee_CheckBox13;
    private javax.swing.JCheckBox Proposee_CheckBox14;
    private javax.swing.JCheckBox Proposee_CheckBox15;
    private javax.swing.JCheckBox Proposee_CheckBox16;
    private javax.swing.JCheckBox Proposee_CheckBox17;
    private javax.swing.JCheckBox Proposee_CheckBox18;
    private javax.swing.JCheckBox Proposee_CheckBox19;
    private javax.swing.JCheckBox Proposee_CheckBox2;
    private javax.swing.JCheckBox Proposee_CheckBox20;
    private javax.swing.JCheckBox Proposee_CheckBox21;
    private javax.swing.JCheckBox Proposee_CheckBox22;
    private javax.swing.JCheckBox Proposee_CheckBox23;
    private javax.swing.JCheckBox Proposee_CheckBox24;
    private javax.swing.JCheckBox Proposee_CheckBox25;
    private javax.swing.JCheckBox Proposee_CheckBox26;
    private javax.swing.JCheckBox Proposee_CheckBox27;
    private javax.swing.JCheckBox Proposee_CheckBox3;
    private javax.swing.JCheckBox Proposee_CheckBox4;
    private javax.swing.JCheckBox Proposee_CheckBox5;
    private javax.swing.JCheckBox Proposee_CheckBox6;
    private javax.swing.JCheckBox Proposee_CheckBox7;
    private javax.swing.JCheckBox Proposee_CheckBox8;
    private javax.swing.JCheckBox Proposee_CheckBox9;
    private javax.swing.JTextField Proposee_MoneyField;
    private javax.swing.JLabel Proposee_MoneyIcon;
    private javax.swing.JLabel Proposee_MoneyLabel;
    private javax.swing.JLabel Proposee_NameLabel;
    private javax.swing.JLabel Proposee_OutOfJailCardsLabel;
    private javax.swing.JTextField Proposee_OutOfJailField;
    private javax.swing.JLabel Proposee_OutOfJailIcon;
    private javax.swing.JPanel ProposerAssets;
    private javax.swing.JPanel ProposerPanel;
    private javax.swing.JScrollPane ProposerScrollPane;
    private javax.swing.JCheckBox Proposer_CheckBox0;
    private javax.swing.JCheckBox Proposer_CheckBox1;
    private javax.swing.JCheckBox Proposer_CheckBox10;
    private javax.swing.JCheckBox Proposer_CheckBox11;
    private javax.swing.JCheckBox Proposer_CheckBox12;
    private javax.swing.JCheckBox Proposer_CheckBox13;
    private javax.swing.JCheckBox Proposer_CheckBox14;
    private javax.swing.JCheckBox Proposer_CheckBox15;
    private javax.swing.JCheckBox Proposer_CheckBox16;
    private javax.swing.JCheckBox Proposer_CheckBox17;
    private javax.swing.JCheckBox Proposer_CheckBox18;
    private javax.swing.JCheckBox Proposer_CheckBox19;
    private javax.swing.JCheckBox Proposer_CheckBox2;
    private javax.swing.JCheckBox Proposer_CheckBox20;
    private javax.swing.JCheckBox Proposer_CheckBox21;
    private javax.swing.JCheckBox Proposer_CheckBox22;
    private javax.swing.JCheckBox Proposer_CheckBox23;
    private javax.swing.JCheckBox Proposer_CheckBox24;
    private javax.swing.JCheckBox Proposer_CheckBox25;
    private javax.swing.JCheckBox Proposer_CheckBox26;
    private javax.swing.JCheckBox Proposer_CheckBox27;
    private javax.swing.JCheckBox Proposer_CheckBox3;
    private javax.swing.JCheckBox Proposer_CheckBox4;
    private javax.swing.JCheckBox Proposer_CheckBox5;
    private javax.swing.JCheckBox Proposer_CheckBox6;
    private javax.swing.JCheckBox Proposer_CheckBox7;
    private javax.swing.JCheckBox Proposer_CheckBox8;
    private javax.swing.JCheckBox Proposer_CheckBox9;
    private javax.swing.JTextField Proposer_MoneyField;
    private javax.swing.JLabel Proposer_MoneyIcon;
    private javax.swing.JLabel Proposer_MoneyLabel;
    private javax.swing.JLabel Proposer_NameLabel;
    private javax.swing.JLabel Proposer_OutOfJailCardsLabel;
    private javax.swing.JTextField Proposer_OutOfJailField;
    private javax.swing.JLabel Proposer_OutOfJailIcon;
    private javax.swing.JLabel RedDice;
    private javax.swing.JButton Review_AcceptButton;
    private javax.swing.JButton Review_CounterOfferButton;
    private javax.swing.JButton Review_DeclineButton;
    private javax.swing.JLabel Review_ProposeeLabel;
    private javax.swing.JLabel Review_ProposeeMoneyIcon;
    private javax.swing.JLabel Review_ProposeeMoneyLabel;
    private javax.swing.JLabel Review_ProposeeOutOfJailCardsLabel;
    private javax.swing.JLabel Review_ProposeeOutOfJailIcon;
    private javax.swing.JPanel Review_ProposeePanel;
    private javax.swing.JLabel Review_ProposeePrompt;
    private javax.swing.JLabel Review_ProposeePropIcon0;
    private javax.swing.JLabel Review_ProposeePropIcon1;
    private javax.swing.JLabel Review_ProposeePropIcon10;
    private javax.swing.JLabel Review_ProposeePropIcon11;
    private javax.swing.JLabel Review_ProposeePropIcon12;
    private javax.swing.JLabel Review_ProposeePropIcon13;
    private javax.swing.JLabel Review_ProposeePropIcon14;
    private javax.swing.JLabel Review_ProposeePropIcon15;
    private javax.swing.JLabel Review_ProposeePropIcon16;
    private javax.swing.JLabel Review_ProposeePropIcon17;
    private javax.swing.JLabel Review_ProposeePropIcon18;
    private javax.swing.JLabel Review_ProposeePropIcon19;
    private javax.swing.JLabel Review_ProposeePropIcon2;
    private javax.swing.JLabel Review_ProposeePropIcon20;
    private javax.swing.JLabel Review_ProposeePropIcon21;
    private javax.swing.JLabel Review_ProposeePropIcon22;
    private javax.swing.JLabel Review_ProposeePropIcon23;
    private javax.swing.JLabel Review_ProposeePropIcon24;
    private javax.swing.JLabel Review_ProposeePropIcon25;
    private javax.swing.JLabel Review_ProposeePropIcon26;
    private javax.swing.JLabel Review_ProposeePropIcon27;
    private javax.swing.JLabel Review_ProposeePropIcon3;
    private javax.swing.JLabel Review_ProposeePropIcon4;
    private javax.swing.JLabel Review_ProposeePropIcon5;
    private javax.swing.JLabel Review_ProposeePropIcon6;
    private javax.swing.JLabel Review_ProposeePropIcon7;
    private javax.swing.JLabel Review_ProposeePropIcon8;
    private javax.swing.JLabel Review_ProposeePropIcon9;
    private javax.swing.JScrollPane Review_ProposeeScroll;
    private javax.swing.JLabel Review_ProposerLabel;
    private javax.swing.JLabel Review_ProposerMoneyIcon;
    private javax.swing.JLabel Review_ProposerMoneyLabel;
    private javax.swing.JLabel Review_ProposerOutOfJailCardsLabel;
    private javax.swing.JLabel Review_ProposerOutOfJailIcon;
    private javax.swing.JPanel Review_ProposerPanel;
    private javax.swing.JLabel Review_ProposerPropIcon0;
    private javax.swing.JLabel Review_ProposerPropIcon1;
    private javax.swing.JLabel Review_ProposerPropIcon10;
    private javax.swing.JLabel Review_ProposerPropIcon11;
    private javax.swing.JLabel Review_ProposerPropIcon12;
    private javax.swing.JLabel Review_ProposerPropIcon13;
    private javax.swing.JLabel Review_ProposerPropIcon14;
    private javax.swing.JLabel Review_ProposerPropIcon15;
    private javax.swing.JLabel Review_ProposerPropIcon16;
    private javax.swing.JLabel Review_ProposerPropIcon17;
    private javax.swing.JLabel Review_ProposerPropIcon18;
    private javax.swing.JLabel Review_ProposerPropIcon19;
    private javax.swing.JLabel Review_ProposerPropIcon2;
    private javax.swing.JLabel Review_ProposerPropIcon20;
    private javax.swing.JLabel Review_ProposerPropIcon21;
    private javax.swing.JLabel Review_ProposerPropIcon22;
    private javax.swing.JLabel Review_ProposerPropIcon23;
    private javax.swing.JLabel Review_ProposerPropIcon24;
    private javax.swing.JLabel Review_ProposerPropIcon25;
    private javax.swing.JLabel Review_ProposerPropIcon26;
    private javax.swing.JLabel Review_ProposerPropIcon27;
    private javax.swing.JLabel Review_ProposerPropIcon3;
    private javax.swing.JLabel Review_ProposerPropIcon4;
    private javax.swing.JLabel Review_ProposerPropIcon5;
    private javax.swing.JLabel Review_ProposerPropIcon6;
    private javax.swing.JLabel Review_ProposerPropIcon7;
    private javax.swing.JLabel Review_ProposerPropIcon8;
    private javax.swing.JLabel Review_ProposerPropIcon9;
    private javax.swing.JScrollPane Review_ProposerScroll;
    private javax.swing.JLabel Review_TitleLabel;
    private javax.swing.JPanel TaxPanel;
    private javax.swing.JDialog TaxWindow;
    private javax.swing.JLabel Tax_Icon;
    private javax.swing.JLabel Tax_MessageLabel;
    private javax.swing.JButton Tax_OKButton;
    private javax.swing.JLabel Tax_TitleLabel;
    private javax.swing.JLabel TokenP1;
    private javax.swing.JLabel TokenP2;
    private javax.swing.JLabel TokenP3;
    private javax.swing.JLabel TokenP4;
    private javax.swing.JLabel TokenP5;
    private javax.swing.JLabel TokenP6;
    private javax.swing.JLabel TokenP7;
    private javax.swing.JLabel TokenP8;
    private javax.swing.JDialog TradeWindow;
    private javax.swing.JPanel Trade_BlankCard;
    private javax.swing.JPanel Trade_CardRegion;
    private javax.swing.JPanel Trade_ProposalCard;
    private javax.swing.JButton Trade_ProposeButton;
    private javax.swing.JPanel Trade_ReviewCard;
    private javax.swing.JPanel ViewAssetsPanel;
    private javax.swing.JDialog ViewAssetsWindow;
    private javax.swing.JPanel ViewAssets_BottomPanel;
    private javax.swing.JPanel ViewAssets_CardRegion;
    private javax.swing.JLabel ViewAssets_MoneyIcon;
    private javax.swing.JLabel ViewAssets_MoneyLabel;
    private javax.swing.JLabel ViewAssets_OOJIcon;
    private javax.swing.JLabel ViewAssets_OOJLabel;
    private javax.swing.JToggleButton ViewAssets_PageChangerButton;
    private javax.swing.JPanel ViewAssets_Pg1Panel;
    private javax.swing.JPanel ViewAssets_Pg2Panel;
    private javax.swing.JLabel ViewAssets_RR0Card;
    private javax.swing.JLabel ViewAssets_RR0RentLabel;
    private javax.swing.JLabel ViewAssets_RR1Card;
    private javax.swing.JLabel ViewAssets_RR1RentLabel;
    private javax.swing.JLabel ViewAssets_RR2Card;
    private javax.swing.JLabel ViewAssets_RR2RentLabel;
    private javax.swing.JLabel ViewAssets_RR3Card;
    private javax.swing.JLabel ViewAssets_RR3RentLabel;
    private javax.swing.JLabel ViewAssets_St0Card;
    private javax.swing.JLabel ViewAssets_St0HousesLabel;
    private javax.swing.JLabel ViewAssets_St0RentLabel;
    private javax.swing.JLabel ViewAssets_St10Card;
    private javax.swing.JLabel ViewAssets_St10HousesLabel;
    private javax.swing.JLabel ViewAssets_St10RentLabel;
    private javax.swing.JLabel ViewAssets_St11Card;
    private javax.swing.JLabel ViewAssets_St11HousesLabel;
    private javax.swing.JLabel ViewAssets_St11RentLabel;
    private javax.swing.JLabel ViewAssets_St12Card;
    private javax.swing.JLabel ViewAssets_St12HousesLabel;
    private javax.swing.JLabel ViewAssets_St12RentLabel;
    private javax.swing.JLabel ViewAssets_St13Card;
    private javax.swing.JLabel ViewAssets_St13HousesLabel;
    private javax.swing.JLabel ViewAssets_St13RentLabel;
    private javax.swing.JLabel ViewAssets_St14Card;
    private javax.swing.JLabel ViewAssets_St14HousesLabel;
    private javax.swing.JLabel ViewAssets_St14RentLabel;
    private javax.swing.JLabel ViewAssets_St15Card;
    private javax.swing.JLabel ViewAssets_St15HousesLabel;
    private javax.swing.JLabel ViewAssets_St15RentLabel;
    private javax.swing.JLabel ViewAssets_St16Card;
    private javax.swing.JLabel ViewAssets_St16HousesLabel;
    private javax.swing.JLabel ViewAssets_St16RentLabel;
    private javax.swing.JLabel ViewAssets_St17Card;
    private javax.swing.JLabel ViewAssets_St17HousesLabel;
    private javax.swing.JLabel ViewAssets_St17RentLabel;
    private javax.swing.JLabel ViewAssets_St18Card;
    private javax.swing.JLabel ViewAssets_St18HousesLabel;
    private javax.swing.JLabel ViewAssets_St18RentLabel;
    private javax.swing.JLabel ViewAssets_St19Card;
    private javax.swing.JLabel ViewAssets_St19HousesLabel;
    private javax.swing.JLabel ViewAssets_St19RentLabel;
    private javax.swing.JLabel ViewAssets_St1Card;
    private javax.swing.JLabel ViewAssets_St1HousesLabel;
    private javax.swing.JLabel ViewAssets_St1RentLabel;
    private javax.swing.JLabel ViewAssets_St20Card;
    private javax.swing.JLabel ViewAssets_St20HousesLabel;
    private javax.swing.JLabel ViewAssets_St20RentLabel;
    private javax.swing.JLabel ViewAssets_St21Card;
    private javax.swing.JLabel ViewAssets_St21HousesLabel;
    private javax.swing.JLabel ViewAssets_St21RentLabel;
    private javax.swing.JLabel ViewAssets_St2Card;
    private javax.swing.JLabel ViewAssets_St2HousesLabel;
    private javax.swing.JLabel ViewAssets_St2RentLabel;
    private javax.swing.JLabel ViewAssets_St3Card;
    private javax.swing.JLabel ViewAssets_St3HousesLabel;
    private javax.swing.JLabel ViewAssets_St3RentLabel;
    private javax.swing.JLabel ViewAssets_St4Card;
    private javax.swing.JLabel ViewAssets_St4HousesLabel;
    private javax.swing.JLabel ViewAssets_St4RentLabel;
    private javax.swing.JLabel ViewAssets_St5Card;
    private javax.swing.JLabel ViewAssets_St5HousesLabel;
    private javax.swing.JLabel ViewAssets_St5RentLabel;
    private javax.swing.JLabel ViewAssets_St6Card;
    private javax.swing.JLabel ViewAssets_St6HousesLabel;
    private javax.swing.JLabel ViewAssets_St6RentLabel;
    private javax.swing.JLabel ViewAssets_St7Card;
    private javax.swing.JLabel ViewAssets_St7HousesLabel;
    private javax.swing.JLabel ViewAssets_St7RentLabel;
    private javax.swing.JLabel ViewAssets_St8Card;
    private javax.swing.JLabel ViewAssets_St8HousesLabel;
    private javax.swing.JLabel ViewAssets_St8RentLabel;
    private javax.swing.JLabel ViewAssets_St9Card;
    private javax.swing.JLabel ViewAssets_St9HousesLabel;
    private javax.swing.JLabel ViewAssets_St9RentLabel;
    private javax.swing.JLabel ViewAssets_TitleLabel;
    private javax.swing.JPanel ViewAssets_TitlePanel;
    private javax.swing.JLabel ViewAssets_Ut0Card;
    private javax.swing.JLabel ViewAssets_Ut1Card;
    private javax.swing.JLabel YellowDice;
}
