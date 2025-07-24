package Level1PracticePrograms;

public class Question7 {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double pi = Math.PI;

        // Volume of sphere formula: (4/3) * π * r³
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // 1 kilometer = 0.621371 miles, so 1 km³ = (0.621371)^3 mi³
        double conversionFactor = Math.pow(0.621371, 3);
        double volumeMi3 = volumeKm3 * conversionFactor;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                " and cubic miles is " + volumeMi3);
    }
}

