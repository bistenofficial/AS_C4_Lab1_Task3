package com.example.as_c4_lab1_task3;

public class Cook
{
    private String name; // название
    private int resource; // ресурс

    public Cook(String name, int res)
    {
        this.name=name;
        this.resource=res;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResource() {
        return this.resource;
    }

    public void setFlagResource(int flagResource) {
        this.resource = flagResource;
    }
}
