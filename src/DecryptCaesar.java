import java.util.Scanner;

public class DecryptCaesar {

  public void dekryptcaesar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Indtast beskeden du vil dekryptere!");
    String besked = scanner.nextLine();
    besked = besked.replaceAll("\\s", "");
    besked = besked.toUpperCase();

    System.out.println("Indtast hvor meget beskeden er shiftet");
    int shift = scanner.nextInt();
    int length = besked.length();

    System.out.println("Dekrypteret besked: \n");
    for (int i = 0; i < length; i++) {
      if (besked.charAt(i) < 91) {
        int krypteretbeskedital = besked.charAt(i) - shift;
        if (krypteretbeskedital < 65) krypteretbeskedital = krypteretbeskedital + 26;
        char krypteretbesked = (char) krypteretbeskedital;
        System.out.print(krypteretbesked);
      } else System.out.println("Skriv kun bogstaver fra A-Z!");
    }
  }
}
