package com.mirea.work_10.task_2;

/**
 * Магический стул, особенностью является метод, делающий магию
 */
public class MagicChair implements Chair{
    public void doMagic() {
        System.out.println("Doing magic...");
    }

    @Override
    public boolean hasLegs() {
        return false;
    }
}
