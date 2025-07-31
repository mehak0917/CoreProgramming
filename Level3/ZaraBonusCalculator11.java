package JavaMethods.Level3;

public class ZaraBonusCalculator11 {

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10); // [][0]=salary, [][1]=years
        double[][] salaryBonusData = calculateBonusAndNewSalary(employeeData);
        printSalaryTable(employeeData, salaryBonusData);
    }

    // Generate salaries and years of service
    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2];

        for (int i = 0; i < n; i++) {
            int salary = (int) (Math.random() * 90000 + 10000); // 5-digit salary
            int years = (int) (Math.random() * 10 + 1); // 1-10 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        int n = employeeData.length;
        double[][] result = new double[n][2]; // [][0]=bonus, [][1]=new salary

        for (int i = 0; i < n; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }

        return result;
    }

    // Display the result in tabular format
    public static void printSalaryTable(int[][] employeeData, double[][] salaryBonusData) {
        int totalOldSalary = 0;
        double totalBonus = 0, totalNewSalary = 0;

        System.out.printf("%-10s %-12s %-10s %-12s %-12s\n", "Emp No", "Old Salary", "Years", "Bonus", "New Salary");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = salaryBonusData[i][0];
            double newSalary = salaryBonusData[i][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.printf("%-10d %-12d %-10d %-12.2f %-12.2f\n", i + 1, oldSalary, years, bonus, newSalary);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("TOTAL      %-12d %-10s %-12.2f %-12.2f\n", totalOldSalary, "--", totalBonus, totalNewSalary);
    }
}
