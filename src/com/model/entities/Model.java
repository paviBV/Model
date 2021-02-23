package com.model.entities;

public class Model {

    int id;
    String name;
    String size;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcSize() {
        return size;
    }

    public void setcSize(String cSize) {
        this.size = cSize;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cSize='" + size + '\'' +
                '}';
    }
}
