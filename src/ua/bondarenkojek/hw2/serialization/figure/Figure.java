package ua.bondarenkojek.hw2.serialization.figure;

public abstract class Figure {
    private String name ;

    public Figure() {
    }

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
