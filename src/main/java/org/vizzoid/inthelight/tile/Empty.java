package org.vizzoid.inthelight.tile;

public class Empty implements Tile {

    private static final Empty INSTANCE = new Empty();

    public static Empty getInstance() {
        return INSTANCE;
    }

}
