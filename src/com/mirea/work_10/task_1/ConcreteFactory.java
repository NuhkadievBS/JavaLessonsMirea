package com.mirea.work_10.task_1;

/**
 * Класс реализующий конкретную фабрику, создающую комплексные числа
 */
public class ConcreteFactory implements ComplexJavaFactory {

    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}
