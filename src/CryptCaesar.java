import java.util.Scanner;

public class CryptCaesar {

  public void kryptcaesar() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Indtast beskeden du vil kryptere! Brug kun A-Z");
    String besked = scanner.nextLine();
    besked = besked.replaceAll("\\s", "");
    besked = besked.toUpperCase();

    System.out.println("Indtast hvor meget du vil shifte beskeden");
    int shift = scanner.nextInt();
    int length = besked.length();

    System.out.println("Krypteret besked: \n");
    String krypteretbesked="";
    for (int i = 0; i < length; i++) {
      if (besked.charAt(i) < 91) {
        char krypteretbogstav = shiftmetode(besked.charAt(i),shift);
        krypteretbesked+=krypteretbogstav;
       // int krypteretbeskedital = besked.charAt(i) + shift;
        //if (krypteretbeskedital > 90) krypteretbeskedital = krypteretbeskedital - 26;
        //char krypteretbesked = (char) krypteretbeskedital;
      } else System.out.println("Skriv kun bogstaver fra A til Z");
    }
    System.out.println("\n\nUden for loop: "+krypteretbesked);
  }
  char shiftmetode (char c,int shiftvalue){
    int krypteretbeskedital = c + shiftvalue;
    if (krypteretbeskedital > 90) krypteretbeskedital = krypteretbeskedital - 26;
    char krypteretbesked = (char) krypteretbeskedital;
    return krypteretbesked;
  }
}
