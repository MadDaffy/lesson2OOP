package com.geekbrains.lesson2.obstacle;

import com.geekbrains.lesson2.unit.Unit;

public class Track extends Obstacle{

    public Track(int sizeOfTrack) {
        super(sizeOfTrack);
    }

    @Override
    public void makeAction(Unit unit) {
         unit.run(this);
    }
}
