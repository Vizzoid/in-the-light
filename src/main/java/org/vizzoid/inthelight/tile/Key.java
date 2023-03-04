package org.vizzoid.inthelight.tile;

import org.vizzoid.inthelight.Player;

public class Key implements Tile {

    private static final Key INSTANCE = new Key();

    public static Key getInstance() {
        return INSTANCE;
    }

    @Override
    public Tile onTouch(Player player) {
        player.collectKey();
        return Tile.light();
    }
}
