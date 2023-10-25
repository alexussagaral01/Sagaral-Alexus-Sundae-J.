import java.util.Scanner;

public class RoutesActivity {
    private static boolean routesDisplayed = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayRoutes("Route Finder App");
        displayDefaultRoutes();

        System.out.print("\nIs Barili obstructed? (1 = Yes, 0 = No): ");
        int isBariliObstructed = scanner.nextInt();

        int isSibongaObstructed = 0;

        double distance = 0;
        double speed = 0;
        double eta = 0;

        if (isBariliObstructed == 1) {
            System.out.print("Is Dumanjug obstructed? (1 = Yes, 0 = No): ");
            isSibongaObstructed = scanner.nextInt();

            if (isSibongaObstructed == 1) {
                distance = 101.5;
                System.out.print("Enter the speed (in km/h): ");
                speed = scanner.nextDouble();
                eta = distance / speed;
            } else {
                distance = 96.5;
                System.out.print("Enter the speed (in km/h): ");
                speed = scanner.nextDouble();
                eta = distance / speed;
            }
        } else {
            distance = 84.9;
            System.out.print("Enter the speed (in km/h): ");
            speed = scanner.nextDouble();
            eta = distance / speed;
        }

        int hours = (int) eta;
        int minutes = (int) ((eta - hours) * 60);

        if (isBariliObstructed == 1) {
            if (isSibongaObstructed == 1) {
                printRecommendedRoute(
                        "Cebu City (Start)", "Minglanilla (Route 1)", "San Fernando (Route 2)",
                        "Carcar (Route 3)", "Argao (Route 5)", "Ronda (Route 5.1)", "Alcantara (Route 5.2)",
                        "Moalboal (End)"
                );
            } else {
                printRecommendedRoute(
                        "Cebu City (Start)", "Minglanilla (Route 1)", "San Fernando (Route 2)",
                        "Carcar (Route 3)", "Sibonga (Route 4.2)", "Dumanjug (Route 4.2.1)",
                        "Alcantara (Route 4.2.2)", "Moalboal (End)"
                );
            }
        } else {
            printRecommendedRoute(
                    "Cebu City (Start)", "Minglanilla (Route 1)", "San Fernando (Route 2)",
                    "Carcar (Route 3)", "Barili (Route 4.1)", "Dumanjug (Route 4.1.1)",
                    "Moalboal (End)"
            );
        }

        System.out.println("==========Additional Data==========");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Estimated Time of Arrival (ETA): " + hours + " hours " + minutes + " minutes");

        scanner.close();
    }

    private static void displayRoutes(String routeName) {
        System.out.println(routeName + ":");
        if (!routesDisplayed) {
            System.out.println("The routes are:");
            routesDisplayed = true;
        }
    }

    private static void displayDefaultRoutes() {
        displayRoutes("====Default Routes=====");
        System.out.println("Cebu City (Start)");
        System.out.println("Minglanilla (Route 1)");
        System.out.println("San Fernando (Route 2)");
        System.out.println("Carcar (Route 3)");
        System.out.println("Barili (Route 4.1)");
        System.out.println("Dumanjug (Route 4.1.1)");
        System.out.println("Alcantara (Route 4.1.2)");
        System.out.println("Moalboal (End)");
    }

    private static void printRecommendedRoute(String... towns) {
        displayRoutes("====Recommended Route====");
        for (String town : towns) {
            System.out.println(town);
        }
    }
}
