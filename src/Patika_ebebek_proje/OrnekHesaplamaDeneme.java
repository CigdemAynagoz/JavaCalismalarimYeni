package Patika_ebebek_proje;

public class OrnekHesaplamaDeneme {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee("Çiğdem Aynagöz", 15000, 40, 2018);

        System.out.println(e1);
        System.out.println("Tax amount: " + e1.tax());
        System.out.println("Salary Bonus: " + e1.bonus());
        System.out.println("Salary Raise: " + e1.raiseSalary());
    }
}
