public class FizzBuzz {
    public static void main(String[] args) {
        // Schleife von 1 bis 100
        for (int i = 1; i <= 100; i++) {
            // Überprüfen, ob die Zahl ein Vielfaches von 3 und 5 ist
            if (i % 3 == 0 && i % 5 == 0) {
                // Ausgabe "FizzBuzz", wenn die Bedingung zutrifft
                System.out.println("FizzBuzz");
            }
            // Überprüfen, ob die Zahl nur ein Vielfaches von 3 ist
            else if (i % 3 == 0) {
                // Ausgabe "Fizz", wenn die Bedingung zutrifft
                System.out.println("Fizz");
            }
            // Überprüfen, ob die Zahl nur ein Vielfaches von 5 ist
            else if (i % 5 == 0) {
                // Ausgabe "Buzz", wenn die Bedingung zutrifft
                System.out.println("Buzz");
            }
            // Wenn keine der obigen Bedingungen erfüllt ist
            else {
                // Ausgabe der aktuellen Zahl
                System.out.println(i);
            }
        }
    }
}


