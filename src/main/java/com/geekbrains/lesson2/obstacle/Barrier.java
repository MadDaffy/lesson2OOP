package com.geekbrains.lesson2.obstacle;

import com.geekbrains.lesson2.unit.Unit;

public class Barrier extends Obstacle {

    public Barrier(int sizeOfBarrier) {
        super(sizeOfBarrier);
    }

    @Override
    public void makeAction(Unit unit) {
        unit.jump(this);
    }
}
