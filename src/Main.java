public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 50;
        double height = 1.60;
        double BMI = service.calculate(weight, height);

        System.out.println("ИМТ: " + BMI);
    }
}
