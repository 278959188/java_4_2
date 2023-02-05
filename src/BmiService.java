public class BmiService {
    public int calculate(int weight, double height) {
        double BMI = weight / height;
        return (int) BMI;
    }
}
