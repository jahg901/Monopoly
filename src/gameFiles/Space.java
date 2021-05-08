package gameFiles;

import java.awt.Point;

public class Space {
    
    private int index;
    private Point coords;
    private Property prop;
    
    private int effect;
   /* 0 for property, 1 for GO, 2 for Visiting, 3 for Free Parking,
    * 4 for Go To Jail, 5 for Chance, 6 for Community Chest, 7 for Luxury Tax,
    * 8 for Income Tax */
    
    public Space(int indx, int efct, int X, int Y) {
        index = indx;
        coords = new Point(X, Y);
        effect = efct;
    }
    
    public void setProp(Property p) {
        prop = p;
    }
    
    public Property getProp() {
        return prop;
    }
    
    public Point getCoords() {
        return coords;
    }
    
    public int numOccupants(Player[] pArr) {
        int i = 0;
        for (Player p : pArr) {
            if (p.getLocation() == index && p.getPlaying()) {
                i++;
            }
        }
        return i;
    }
    
    public int getEffect() {
        return effect;
    }
    
}
