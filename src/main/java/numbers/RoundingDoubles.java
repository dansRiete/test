package numbers;

import java.text.DecimalFormat;

public class RoundingDoubles {

    private static final DecimalFormat AH_ACCURACY_DECIMAL_FORMAT = new DecimalFormat("0.00");


    public static void main(String[] args) {
        double v = -3.334000001;
        System.out.println(Math.round(v * 100) / 100F);
        System.out.println(Float.parseFloat(AH_ACCURACY_DECIMAL_FORMAT.format(v)));
    }

}
