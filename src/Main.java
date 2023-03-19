public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKilos = 55;
        double heightMeters = 1.63;
        int index = service.calculate(weightKilos, heightMeters);
        System.out.println(index);

    }

}
