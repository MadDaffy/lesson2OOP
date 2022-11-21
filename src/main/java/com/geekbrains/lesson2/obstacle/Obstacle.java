package com.geekbrains.lesson2.obstacle;

import com.geekbrains.lesson2.unit.Unit;

public abstract class Obstacle {

    private final int sizeOfObstacle;

    public Obstacle(int sizeOfObstacle) {
        this.sizeOfObstacle = sizeOfObstacle;
    }

    public int getSizeOfObstacle() {
        return sizeOfObstacle;
    }

    public abstract void makeAction(Unit unit);
}
