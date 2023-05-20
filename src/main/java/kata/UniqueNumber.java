package kata;

import java.util.Arrays;

public class UniqueNumber {

    private static final double PRECISION = 0.0000000000001;

    public static double findUniq(double[] arr) {
        Arrays.sort(arr);

        if (Math.abs(arr[0] - arr[1]) > PRECISION) {
            return arr[0];
        } else {
            return arr[arr.length - 1];
        }
    }

}
