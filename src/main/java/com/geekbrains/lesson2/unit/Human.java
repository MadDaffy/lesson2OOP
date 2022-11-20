package com.geekbrains.lesson2.unit;

import com.geekbrains.lesson2.obstacle.Barrier;
import com.geekbrains.lesson2.obstacle.Track;

public class Human implements Unit {


    private int maxJumpHeight;
    private int maxRunDistance;
    private int countDistance = 0;

    public Human(int maxJumpHeight, int maxRunDistance) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
    }

    @Override
    public boolean jump(Barrier sizeOfBarrier) {
        if (maxJumpHeight >= sizeOfBarrier.getSizeOfObstacle()) {
            System.out.println("Человек перепрыгнул барьер высотой: "
                    + sizeOfBarrier.getSizeOfObstacle() + "м.");
            return true;
        } else {
            System.out.println("Человек не справился с барьером высотой: "
                    + sizeOfBarrier.getSizeOfObstacle() + "м. " + "Так как максимальная высота прыжка: " + maxJumpHeight + "м.");
            return false;
        }
    }

    @Override
    public boolean run(Track sizeOfTrack) {

            countDistance = countDistance + sizeOfTrack.getSizeOfObstacle();
            if (maxRunDistance < countDistance) {
                System.out.println("Человек не справился с общей дистанцией " + countDistance + " м."
                        + " Так как максимально может пробежать " + maxRunDistance + "м.");
                return false;
            } else {
                System.out.println("Человек пробежал дистанцию "
                        + sizeOfTrack.getSizeOfObstacle() + "м. "
                        + "(Пробежал всего: " + countDistance + "м.)");
                return true;

            }
        }
    }


