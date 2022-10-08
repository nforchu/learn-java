package com.learnjava.students;

import java.util.Objects;

public class Drink implements Cloneable{

    public int id;
    public String name;
    public float price;
    public Drink() {}

    public Drink(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Object clone() {
        Object objct = null;
        try {
            objct = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return objct;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return id == drink.id && Float.compare(drink.price, price) == 0 && Objects.equals(name, drink.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
}
