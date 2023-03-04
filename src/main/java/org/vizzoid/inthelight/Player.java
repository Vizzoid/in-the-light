package org.vizzoid.inthelight;

public class Player {

    private final MoveablePoint position = new MoveablePoint();
    private int keyCount = 0;

    public Player() {

    }

    public MoveablePoint getPosition() {
        return position;
    }

    public int getKeyCount() {
        return keyCount;
    }

    public void collectKey() {
        keyCount++;
    }

    public double getX() {
        return position.getX();
    }

    public double getY() {
        return position.getY();
    }

}
