public class BmiService {
    public int calculate(int weightKilos, double heightMeters) {
        return (int) (weightKilos / (heightMeters * heightMeters));

    }
}
