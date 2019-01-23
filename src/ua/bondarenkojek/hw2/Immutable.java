package ua.bondarenkojek.hw2;

import java.time.LocalDate;

public final class Immutable {
    private final String name;
    private final LocalDate date;

    public Immutable(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}
