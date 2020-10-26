package com.mirea.work_10.task_2;


/**
 * Класс Фабрики стульев, может создавать стулья трех видов:
 * Викторианский стул {@link VictorianChair}
 * Функциональный стул {@link FunctionalChair}
 * Магический стул {@link MagicChair}
 */
public class ChairFactory implements AbstractChairFactory {

    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
