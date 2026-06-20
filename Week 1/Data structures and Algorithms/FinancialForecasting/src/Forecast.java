public class Forecast {

    public static double futureValue(double value, double rate, int years) {
        if (years == 0) {
            return value;
        }
        return futureValue(value * (1 + rate), rate, years - 1);
    }
}