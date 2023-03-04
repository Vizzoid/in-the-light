package org.vizzoid.inthelight;

import org.vizzoid.inthelight.tile.Tile;

public class Maze {

    private final Player player;
    private final Latice<Tile> tileLatice;

    public Maze(Player player) {
        this.player = player;
        this.tileLatice = new Latice<>(100);
    }

    public void onWalk() {
        int playerX;
        int playerY;
        {
            playerX = (int) player.getX();
            playerY = (int) player.getY();
        }
        for (int x = -5; x <= 5; x++) {
            for (int y = -5; y <= 5; y++) {
                int newX = x + playerX;
                int newY = y + playerY;
                int index = tileLatice.toIndex(newX, newY);
                Tile newTile = tileLatice.get(index).onWalk(player, newX, newY);
                tileLatice.set(index, newTile);
            }
        }

        int index = tileLatice.toIndex(playerX, playerY);
        Tile newTile = tileLatice.get(index).onTouch(player);
        tileLatice.set(index, newTile);
    }

}
