package org.vizzoid.inthelight.tile;

import org.lwjgl.glfw.GLFW;
import org.vizzoid.inthelight.Player;

public class Leyet implements Tile {

    @Override
    public Tile onWalk(Player player, int tileX, int tileY) {
        double xDiff = Math.abs(player.getX() - tileX);
        double yDiff = Math.abs(player.getY() - tileY);
        double smallestDiff = Math.min(xDiff, yDiff);
        return smallestDiff <= 3 ? Tile.empty() : this;
    }
}
