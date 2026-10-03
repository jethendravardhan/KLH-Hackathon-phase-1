import java.util.Scanner;

class Household {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int familyMembers;
        double waterConsumed;
        int houseNumber;
        char waterStatus;

        System.out.print("Enter number of family members: ");
        familyMembers = sc.nextInt();

        System.out.print("Enter water consumed in litres: ");
        waterConsumed = sc.nextDouble();

        System.out.print("Enter house number: ");
        houseNumber = sc.nextInt();

        System.out.print("Enter water usage status (A/N): ");
        waterStatus = sc.next().charAt(0);

        System.out.println("\n--- Household Details ---");
        System.out.println("Number of family members: " + familyMembers);
        System.out.println("Water consumed: " + waterConsumed + " litres");
        System.out.println("House number: " + houseNumber);
        System.out.println("Water usage status: " + waterStatus);

        sc.close();
    }
}