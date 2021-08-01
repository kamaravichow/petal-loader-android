package me.aravi.loader.components;

import androidx.annotation.Keep;

@Keep
public class Coodinator {

    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    public Coodinator(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }
}