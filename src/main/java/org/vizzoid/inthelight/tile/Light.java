package org.vizzoid.inthelight.tile;

public class Light implements Tile {

    private static final Light INSTANCE = new Light();

    public static Light getInstance() {
        return INSTANCE;
    }

}
