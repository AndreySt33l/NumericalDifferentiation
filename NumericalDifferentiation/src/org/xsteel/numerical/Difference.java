package org.xsteel.numerical;

public class Difference {
    /***
     *
     * @param u - function
     * @param partition - set of arguments
     * @return - array of differences
     */

    public static double[] forward(Function u, Partition partition) {
        double[] solutions = new double[partition.length()];

        for (int i = 0; i < solutions.length; i++){
            double x = partition.get(i);
            solutions[i] = (u.value(x + partition.getDelta()) - u.value(x))
                    / partition.getDelta();
        }

        return solutions;
    }

    public static double[] backward(Function u, Partition partition) {
        double[] solutions = new double[partition.length()];

        for (int i = 0; i < solutions.length; i++){
            double x = partition.get(i);
            solutions[i] = (u.value(x) - u.value(x - partition.getDelta()))
                    / partition.getDelta();
        }

        return solutions;
    }

    public static double[] central(Function u, Partition partition) {
        double[] solutions = new double[partition.length()];

        for (int i = 0; i < solutions.length; i++){
            double x = partition.get(i);
            solutions[i] = (u.value(x + partition.getDelta()) - u.value(x - partition.getDelta()))
                    / (2 * partition.getDelta());
        }

        return solutions;
    }

    private static double delta(double a, double b, int n){
        return (b - a) / (n - 1);
    }
}
