package gameFiles;

public class ChanceCard {
    
    private String[] effect;
    
    private int type;
   /* 0: gain/lose money
    * 1: pay/take from others
    * 2: pay per house/hotel
    * 3: go to a space
    * 4: move x spaces
    * 5: go to jail
    * 6: get out of jail free
    */
    
    private int i1, i2;
    private int[] iArr;
    
    public ChanceCard(String[] Effect, int Type) {
        effect = Effect;
        type = Type;
    }
    
    public ChanceCard(String[] Effect, int Type, int I1) {
        this(Effect, Type);
        i1 = I1;
    }
    
    public ChanceCard(String[] Effect, int Type, int I1, int I2) {
        this(Effect, Type, I1);
        i2 = I2;
    }
    
    public ChanceCard(String[] Effect, int Type, int[] IArr) {
        this(Effect, Type);
        iArr = IArr;
    }
  
    public String[] getEffect() {
        return effect;
    }
    
    public int getType() {
        return type;
    }
    
    public void doThing(Player p, Player[] players, Street[] St) {
        switch (type) {
            case 0:
                p.changeMoney(i1);
                break;
            
            case 1:
                for (Player pl : players) {
                    if (pl.getPlaying()) {
                        pl.pay(p, i1);
                    }
                }
                break;
                
            case 2:
                for (Street s : St) {
                    if (s.getOwner() == p) {
                        p.changeMoney(-(i1 * (s.getHouses() % 5)) - (i2 * (s.getHouses()/5)));
                    }
                }
                break;
                
            case 3: 
                int newLocation = 100;
                int oldSpaceDiff;
                int newSpaceDiff;
                
                for (int i : iArr) {
                    if (p.getLocation() > i) {
                        newSpaceDiff = i - p.getLocation() + 40;
                    } else {
                        newSpaceDiff = i - p.getLocation();
                    }

                    if (p.getLocation() > newLocation) {
                        oldSpaceDiff = newLocation - p.getLocation() + 40;
                    } else {
                        oldSpaceDiff = newLocation - p.getLocation();
                    }
                    
                    if (newSpaceDiff < oldSpaceDiff || newLocation == 100) {
                        newLocation = i;
                    }
                }
                
                if (newLocation < p.getLocation()) {
                    p.changeMoney(200);
                }
                p.setLocation(newLocation);
                
                break;
                
            case 4:
                p.move(i1);
                break;
                
            case 5:
                p.goToJail();
                break;
            
            case 6:
                p.changeJailFreeCards(1);
                break;
                
        }
    }
    
}
