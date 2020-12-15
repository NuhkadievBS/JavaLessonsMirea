package com.mirea.work_16.items;

public final class Dish extends Item {
    private Double cost;
    private String name;
    private String description;


    public Dish(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 0.0;
    }

    public Dish(Double cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
