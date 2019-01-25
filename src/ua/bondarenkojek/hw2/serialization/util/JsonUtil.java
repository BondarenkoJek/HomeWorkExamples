package ua.bondarenkojek.hw2.serialization.util;

import ua.bondarenkojek.hw2.serialization.figure.Figure;
import ua.bondarenkojek.hw2.serialization.Group;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonUtil {
    public static void writeToJson(File file, Group group) {
        StringBuilder jsonResult = new StringBuilder();
        appendGroup(jsonResult, group, 0);

        try(FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(jsonResult.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void appendGroup(StringBuilder builder, Group group, int tabs) {
        builder.append("{");
        builder.append("\"figures\": [");
        if (group.getFigures() != null) {
            for (Figure figure : group.getFigures()) {
//                String figureName = figure.getName();
//
//                if (figureName != null) {
//                    builder.append("{");
//                    builder.append("\"name\": \"");
//                    builder.append(figureName);
//                    builder.append("\"},");
//                }
            }
            builder.deleteCharAt(builder.length()-1);
        }
        builder.append("],");
        if (group.getGroups() != null) {
            builder.append("\"groups\": [");
            for (Group gr : group.getGroups()) {
                appendGroup(builder, gr, ++tabs);
                builder.append(",");
            }
            builder.deleteCharAt(builder.length()-1);

        }
        builder.append("]");
        builder.append("}");
    }
}
