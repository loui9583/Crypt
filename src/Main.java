import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    System.out.println("Velkommen til krypteringsprogrammet! Skriv valgmulighedens navn for at starte!(ignorerer upper og lowercase)\nDu har følgende valgmuligheder:\n\nCRYPTCAESAR:   Krypterer din besked med CaesarCipher!\n\nDECRYPTCAESAR: Dekrypterer et caesar cipher!\n\nCRYPTVIGE: Krypter en besked med Vigenère cipher!\n\nDECRYPTVIGE: Dekrypter et Vigenère cipher!");
    String menu = new Scanner(System.in).nextLine();
    menu = menu.toUpperCase();
    switch (menu) {
      case "CRYPTCAESAR":
        new CryptCaesar().kryptcaesar();
        break;
      case "DECRYPTCAESAR":
        new DecryptCaesar().dekryptcaesar();
        break;
      case "CRYPTVIGE": new CryptVige().cryptvige();
        break;
      case "DECRYPTVIGE": new DecryptVige().decryptvige();
        break;
    }
  }
}

