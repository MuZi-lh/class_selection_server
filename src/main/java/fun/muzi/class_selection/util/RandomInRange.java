package fun.muzi.class_selection.util;

import java.util.Random;

public class RandomInRange {
    public static Double bt = 36.3;
    public static Integer hr = 80;
    public static Double bo = 97.50;
    private static Random random = new Random();

    public static String getRandomBodyTemperature() {
        bt = bt + random.nextDouble() / 5 - 0.1;
        return String.format("%.1f", bt);
    }

    public static String getRandomHeartRate() {
        hr = hr + random.nextInt(7) - 3;
        return String.valueOf(hr);
    }

    public static String getRandomBloodOxygen(){
        bo = bo + random.nextDouble() / 10 - 0.05;
        if (bo > 99.5) {
            bo = 99.4;
        }
        return String.format("%.2f", bo);
    }
}
