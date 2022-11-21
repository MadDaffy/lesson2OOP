package com.geekbrains.lesson2.unit;

import com.geekbrains.lesson2.obstacle.Barrier;
import com.geekbrains.lesson2.obstacle.Obstacle;
import com.geekbrains.lesson2.obstacle.Track;

public interface Unit {
    void jump(Barrier sizeOfBarrier);
    void run(Track sizeOfTrack);

    boolean isFail();
}
