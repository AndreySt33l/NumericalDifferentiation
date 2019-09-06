package org.xsteel.numerical;

import java.util.Arrays;

public class Partition {
    private double[] partition;
    private double delta;

    public Partition (double a, double b, int n){
        partition = new double[n];

        delta = (b - a)/ (n - 1);

        for (int i = 0; i < n; i++) {
            partition[i] = a + i*delta;
        }
    }

    public double[] getPartition() {
        return partition;
    }

    public int length(){
        return partition.length;
    }

    public double get(int i) {
        return partition[i];
    }

    public double getDelta() {
        return delta;
    }

    @Override
    public String toString() {
        return "P = " + Arrays.toString(partition) +
                "\nDelta = " + delta;
    }
}
