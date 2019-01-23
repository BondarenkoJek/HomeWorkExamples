package ua.bondarenkojek.hw2.serialization.figure;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Triangle extends Figure {

    public Triangle() {
        super("Triangle");
    }
}
