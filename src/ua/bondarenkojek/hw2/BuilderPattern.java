package ua.bondarenkojek.hw2;

import java.time.LocalDate;

public class BuilderPattern {
    private String name;
    private LocalDate date;

    private BuilderPattern() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public BuilderPattern(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public static class Builder {
        private String name;
        private LocalDate date;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(name, date);
        }
    }
}
