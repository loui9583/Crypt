import java.util.Scanner;

public class Main {

  static boolean loop = true;

  public static void main(String[] args) {

    while (Main.loop == true) {
      new Main().start();
      new vildufortsætte().start();
    }
  }

  void start() {
    System.out.println("Velkommen til krypteringsprogrammet! Skriv valgmulighedens navn for at starte!" +
        "(ignorerer upper og lowercase)\nDu har følgende valgmuligheder:\n\n" +
        "CRYPTCAESAR:   " + "Krypterer din besked med CaesarCipher!\n\n" +
        "DECRYPTCAESAR: Dekrypterer et caesar cipher!\n\n" +
        "CRYPTVIGE: " +
        "Krypter en besked med Vigenère cipher!\n\n" +
        "DECRYPTVIGE: Dekrypter et Vigenère cipher!");

    String menu = new Scanner(System.in).nextLine();
    menu = menu.toUpperCase();
    switch (menu) {
      case "CRYPTCAESAR":
        new CryptCaesar().kryptcaesar();
        break;
      case "DECRYPTCAESAR":
        new DecryptCaesar().dekryptcaesar();
        break;
      case "CRYPTVIGE":
        new CryptVige().cryptvige();
        break;
      case "DECRYPTVIGE":
        new DecryptVige().decryptvige();
        break;
    }
  }
}

