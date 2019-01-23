package ua.bondarenkojek.hw2.serialization;

import ua.bondarenkojek.hw2.serialization.figure.Circle;
import ua.bondarenkojek.hw2.serialization.figure.Group;
import ua.bondarenkojek.hw2.serialization.figure.Square;
import ua.bondarenkojek.hw2.serialization.figure.Triangle;
import ua.bondarenkojek.hw2.serialization.util.JsonUtil;
import ua.bondarenkojek.hw2.serialization.util.XmlUtil;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        group.addFigure(new Circle());
        group.addFigure(new Square());
        group.addFigure(new Triangle());
        group.addFigure(new Circle());

        Group group1 = new Group();
        group1.addFigure(new Circle());
        group1.addFigure(new Square());
        group1.addFigure(new Triangle());
        group1.addFigure(new Circle());

        group.addGroup(group1);

//        File file = new File("src/ua/bondarenkojek/hw2/serialization/group.xml");
//        XmlUtil.writeToXml(file, group);

        File fileJson = new File("src/ua/bondarenkojek/hw2/serialization/group.json");
        JsonUtil.writeToJson(fileJson, group);
    }
}
