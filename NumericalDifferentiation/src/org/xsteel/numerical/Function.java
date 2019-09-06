package org.xsteel.numerical;

public class Function {
    public double value(double x){ return 5 * Math.sin(x) + 6 * Math.cos(x); }
    public double derivative(double x){
        return 5 * Math.cos(x) - 6 * Math.sin(x);
    }

    public double[] derivatives(Partition partition){
        double[] solutions = new double[partition.length()];

        for (int i = 0; i < solutions.length; i++) {
            double x = partition.get(i);
            solutions[i] = derivative(x);
        }

        return solutions;
    }
}
