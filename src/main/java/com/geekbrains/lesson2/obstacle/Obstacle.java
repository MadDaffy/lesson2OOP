package com.geekbrains.lesson2.obstacle;

public abstract class Obstacle {

    protected int sizeOfObstacle;

    public Obstacle(int sizeOfObstacle) {
        this.sizeOfObstacle = sizeOfObstacle;
    }

    public int getSizeOfObstacle() {
        return sizeOfObstacle;
    }
}
