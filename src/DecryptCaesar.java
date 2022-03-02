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

    for (int i = 0; i < length; i++) {
      if (besked.charAt(i) < 91) {
        int lol = besked.charAt(i) - shift;
        if (lol < 65) lol = lol + 26;
        char lol2 = (char) lol;
        System.out.print(lol2);
      } else System.out.println("Only enter letters from A to Z!");
    }
  }

}
