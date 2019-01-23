package ua.bondarenkojek.hw2.serialization.figure;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "group")
@XmlAccessorType(XmlAccessType.FIELD)
public class Group {
    @XmlElement(name = "figure")
    private List<Figure> figures;

    @XmlElement(name = "group")
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
