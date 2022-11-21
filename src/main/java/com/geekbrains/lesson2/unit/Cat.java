package com.geekbrains.lesson2.unit;

import com.geekbrains.lesson2.obstacle.Barrier;
import com.geekbrains.lesson2.obstacle.Obstacle;
import com.geekbrains.lesson2.obstacle.Track;

public class Cat implements Unit{

    private int maxJumpHeight;
    private int maxRunDistance;
    private int countDistance = 0;
    private boolean fail;

    public Cat(int maxJumpHeight, int maxRunDistance) {
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
        this.fail = false;
    }

    @Override
    public void jump(Barrier sizeOfBarrier) {
        if (maxJumpHeight >= sizeOfBarrier.getSizeOfObstacle()) {
            System.out.println("Кот перепрыгнул барьер высотой: "
                    + sizeOfBarrier.getSizeOfObstacle() + "м.");
//            return true;
        }
        else {
            System.out.println("Кот не справился с барьером высотой: "
                    + sizeOfBarrier.getSizeOfObstacle() + "м." + "Так как максимальная высота прыжка: " + maxJumpHeight + "м.");
            setFail(true);
//            return false;
        }
    }

    @Override
    public void run(Track sizeOfTrack) {
        countDistance = countDistance + sizeOfTrack.getSizeOfObstacle();
        if (maxRunDistance < countDistance) {
            System.out.println("Кот не справился с общей дистанцией " + countDistance + " м."
                    + " Так как максимально может пробежать " + maxRunDistance + "м.");
            setFail(false);
//            return false;
        } else {
            System.out.println("Кот пробежал дистанцию "
                    + sizeOfTrack.getSizeOfObstacle() + "м. "
                    + "(Пробежал всего: " + countDistance + "м.)");
//            return true;

        }
    }

    @Override
    public boolean isFail() {
        return fail;
    }

    private void setFail(boolean fail) {
        this.fail = fail;
    }
}
