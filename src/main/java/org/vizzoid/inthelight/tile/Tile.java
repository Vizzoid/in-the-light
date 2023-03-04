package org.vizzoid.inthelight.tile;

import org.vizzoid.inthelight.Player;

public interface Tile {

    default Tile onTouch(Player player) {
        return this;
    }

    /**
     * @return this tile, or a different tile if tile changes
     */
    default Tile onWalk(Player player, int tileX, int tileY) {
        return this;
    }

    default boolean canWalkThrough() {
        return true;
    }

    static Key key() {
        return Key.getInstance();
    }

    static Light light() {
        return Light.getInstance();
    }

    static Wall wall() {
        return Wall.getInstance();
    }

    static Empty empty() {
        return Empty.getInstance();
    }

}
