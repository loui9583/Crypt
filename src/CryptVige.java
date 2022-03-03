import java.util.Scanner;

public class CryptVige {

  Scanner scanner = new Scanner(System.in);

  public void cryptvige() {
    System.out.println("Indtast Key:\n");
    String key = scanner.nextLine();
    key = key.replaceAll("\\s", "");
    key = key.toUpperCase();
    System.out.println("Indtast besked der skal krypteres");
    String besked = scanner.nextLine();
    besked = besked.replaceAll("\\s", "");
    besked = besked.toUpperCase();
    key = key.toUpperCase();
    char[] ch = new char[key.length()];
    for (int i = 0; i < key.length(); i++) {
      ch[i] = key.charAt(i);
    }
    int[] keyint = new int[key.length()];

    for (int i = 0; i < ch.length; i++) {
      keyint[i] = (int) ch[i] - 'A';
    }
    int z = 0;
    int i = 0;
    int k = 0;
    System.out.println("Krypteret besked: \n");
    while (i < besked.length()) {
      if (z >= keyint.length) z = 0;
      int krypteretbeskedital = besked.charAt(k) + keyint[z];
      if (krypteretbeskedital > 90) krypteretbeskedital = krypteretbeskedital - 26;
      char krypteredbesked = (char) krypteretbeskedital;
      System.out.print(krypteredbesked);
      z++;
      i++;
      k++;
    }
  }
}