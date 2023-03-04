package org.vizzoid.inthelight.tile;

public class Wall implements Tile {

    private static final Wall INSTANCE = new Wall();

    private Wall() {

    }

    public static Wall getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean canWalkThrough() {
        return false;
    }
}
