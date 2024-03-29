package org.xsteel;

import java.util.ArrayList;

public class TablePrinter {
    public static void print(double[] real,
                             double[] forward,
                             double[] backward,
                             double[] central,
                             double[] forwardError,
                             double[] backwardError,
                             double[] centralError
                             ){
        ArrayList<String> headers = new ArrayList<String>();
        headers.add("Real");
        headers.add("Forward");
        headers.add("Backward");
        headers.add("Central");
        headers.add("Error Forward (∆)");
        headers.add("Error Backward (∆)");
        headers.add("Error Central (∆)");


        ArrayList<ArrayList<String>> content = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < real.length; i++){
            ArrayList<String> temp = new ArrayList<String>();
            temp.add(Double.valueOf(real[i]).toString());
            temp.add(Double.valueOf(forward[i]).toString());
            temp.add(Double.valueOf(backward[i]).toString());
            temp.add(Double.valueOf(central[i]).toString());
            temp.add(Double.valueOf(forwardError[i]).toString());
            temp.add(Double.valueOf(backwardError[i]).toString());
            temp.add(Double.valueOf(centralError[i]).toString());
            content.add(temp);
        }

        ConsoleTable consoleTable = new ConsoleTable(headers, content);

        consoleTable.printTable();
    }
}
