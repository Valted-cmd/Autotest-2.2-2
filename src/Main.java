public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double BMI = service.calculate(64,175);
        System.out.printf("%.2f",BMI);
    }
}