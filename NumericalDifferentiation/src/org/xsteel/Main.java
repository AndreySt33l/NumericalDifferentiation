package org.xsteel;

import org.xsteel.numerical.Difference;
import org.xsteel.numerical.Error;
import org.xsteel.numerical.Function;
import org.xsteel.numerical.Partition;

public class Main {
    public Main(){
        double a = 0, b = 10;
        int n = 10;

        Function function = new Function();
        Partition partition = new Partition(a, b, n);

        double[] derivatives = function.derivatives(partition);
        double[] forward = Difference.forward(function, partition);
        double[] backward = Difference.backward(function, partition);
        double[] central = Difference.central(function, partition);

        double[] forwardError = Error.accuracy(derivatives, forward);
        double[] backwardError = Error.accuracy(derivatives, backward);
        double[] centralError = Error.accuracy(derivatives, central);

        TablePrinter.print(derivatives, forward, backward, central,
                forwardError, backwardError, centralError);

        System.out.println("\u269B");
    }

    public static void main(String[] args) {
        new Main();
    }
}
