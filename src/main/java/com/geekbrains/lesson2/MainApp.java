package com.geekbrains.lesson2;

import com.geekbrains.lesson2.obstacle.Barrier;
import com.geekbrains.lesson2.obstacle.Obstacle;
import com.geekbrains.lesson2.obstacle.Track;
import com.geekbrains.lesson2.unit.Cat;
import com.geekbrains.lesson2.unit.Human;
import com.geekbrains.lesson2.unit.Robot;
import com.geekbrains.lesson2.unit.Unit;

//        1. Продолжаем работать с участниками и выполнением действий. Создайте три класса Человек,
//        Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и
//        прыгать, все также с выводом информации о действии в консоль.
//        2. Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//        должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//        © ВТБ совместно с GeekBrains
//        7
//        печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
//        (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//        3. Создайте два массив: с участниками и препятствиями, и заставьте всех участников пройти
//        этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
//        списку он препятствий не идет.

public class MainApp {

    public static void main(String[] args) {
        Unit[] units = {
                new Cat(4, 2000),
                new Robot(2, 500),
                new Human(3, 10000)
        };
        Obstacle[] obstacles = {
                new Track(500),
                new Barrier(2),
                new Track(1000),
                new Barrier(3),
                new Track(1300),
                new Barrier(4)
        };

        for (Unit unit : units) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Barrier) {
                    if (!(unit.jump((Barrier) obstacle))) {
                        break;
                    }
                }
                if (obstacle instanceof Track) {
                    if (!unit.run((Track) obstacle)) {
                        break;
                    }
                }
            }
        }
    }
}
