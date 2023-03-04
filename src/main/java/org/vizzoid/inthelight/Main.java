package org.vizzoid.inthelight;

import org.vizzoid.inthelight.tile.Leyet;
import org.vizzoid.inthelight.tile.Tile;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Leyet leyet = new Leyet();

        System.out.println(leyet.onWalk(player, 0, 0) == Tile.empty());
        player.getPosition().set(5, 5);

        System.out.println(leyet.onWalk(player, 0, 0) == Tile.empty());
    }
}