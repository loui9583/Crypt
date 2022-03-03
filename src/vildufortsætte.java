import java.util.Scanner;

public class vildufortsætte {
  Scanner scanner = new Scanner(System.in);
  void start() {
    System.out.println("\n\n\n");
    System.out.println("Vil du fortsætte?(JA/NEJ)");
    String fortsæt = scanner.nextLine();
    fortsæt = fortsæt.toUpperCase();
    switch (fortsæt) {
      case "JA":
        break;
      case "NEJ":
        System.out.println("Programmet lukkes.");
        Main.loop=false;
    }
  }
}

