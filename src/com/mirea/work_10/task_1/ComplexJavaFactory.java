package com.mirea.work_10.task_1;

/**
 * Абстрактная фабрика, декларирубщиая логику фабрик, создающих комплексные числа
 * Реализации фабрики:
 * {@link ConcreteFactory}
 */
public interface ComplexJavaFactory {

    Complex createComplex();

    Complex createComplex(int real, int image);

}
