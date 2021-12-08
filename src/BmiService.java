public class BmiService {
        public double calculate(double weight, double height) {
        double height2 = height * height / Math.pow(10,4);
        double BMI =  weight / height2;
            return BMI;
        }
    }