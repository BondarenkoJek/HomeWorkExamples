package ua.bondarenkojek.hw2.serialization.util;

import ua.bondarenkojek.hw2.serialization.figure.Figure;
import ua.bondarenkojek.hw2.serialization.Group;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class XmlUtil {
    public static void writeToXml(File file, Group group) {
        StringBuilder xmlResult = new StringBuilder();
        xmlResult.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n");
        appendGroup(xmlResult, group, 0);



        try(FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(xmlResult.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void appendGroup(StringBuilder builder, Group group, int tabs) {
        //add tabs for formatting
        appendTabs(tabs, builder);

        builder.append("<group>\n");

        if (group.getFigures() != null) {
            for (Figure figure : group.getFigures()) {
//                String figureName = figure.getName();

//                if (figureName != null) {
//                    //add tabs for formatting
//                    appendTabs(tabs, builder);
//
//                    builder.append("\t<figure>\n");
//
//                    //add tabs for formatting
//                    appendTabs(tabs, builder);
//
//                    builder.append("\t\t<name>");
//                    builder.append(figureName);
//                    builder.append("</name>\n");
//
//                    //add tabs for formatting
//                    appendTabs(tabs, builder);
//
//                    builder.append("\t</figure>\n");
//                }
            }
        }

        //add tabs for formatting
        appendTabs(tabs, builder);

        if (group.getGroups() != null) {
            for (Group gr : group.getGroups()) {
                appendGroup(builder, gr, ++tabs);
            }
        }
        builder.append("</group>\n");
    }

    private static void appendTabs(int tabs, StringBuilder builder) {
        for (int i = 0; i < tabs; i++) {
            builder.append("\t");
        }
    }
}
