package com.company;

public class Lemonade extends Food {
    private String taste;
    public Lemonade(String taste)
    {
        super("Лимонад");
        this.taste = taste;
    }

    public void consume() {
        System.out.println(this + " выпит");
    }


    public String getTaste()
    {
        return taste;
    }

    public void setTaste(String taste)
    {
        this.taste = taste;
    }

    public String toString()
    {
        return super.toString() + " вкуса " + taste.toUpperCase() + "'";
    }

}
