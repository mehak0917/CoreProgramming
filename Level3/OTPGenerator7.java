package JavaMethods.Level3;

public class OTPGenerator7 {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000; // Range: 100000–999999
    }

    // Method to check if OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All unique
    }

    // Main method
    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Display all OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check uniqueness
        if (areOTPsUnique(otps)) {
            System.out.println("\nAll OTPs are unique ✅");
        } else {
            System.out.println("\nSome OTPs are duplicated ❌");
        }
    }
}
