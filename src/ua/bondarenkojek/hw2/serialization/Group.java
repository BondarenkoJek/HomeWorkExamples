package ua.bondarenkojek.hw2.serialization;

import ua.bondarenkojek.hw2.serialization.figure.Figure;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Figure> figures;
    private List<Group> groups;

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void addGroup(Group group) {
        if (groups == null) {
            groups = new ArrayList<>();
        }
        groups.add(group);
    }

    public void addFigure(Figure figure) {
        if (figures == null) {
            figures = new ArrayList<>();
        }
        figures.add(figure);
    }
}
