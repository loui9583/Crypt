import java.util.Scanner;

public class DecryptVige {

  Scanner scanner = new Scanner(System.in);

  public void decryptvige() {
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

    System.out.println("Dekrypteret besked: \n");
    int z = 0;
    int i = 0;
    int k = 0;
    while (i<besked.length()){
      if (z>= keyint.length) z=0;
      int krypteretbeskedital = besked.charAt(k) - keyint[z];
      if (krypteretbeskedital < 65) krypteretbeskedital = krypteretbeskedital + 26;
      char krypteretbesked = (char) krypteretbeskedital;
      System.out.print(krypteretbesked);
      z++;
      i++;
      k++;
    }
    new vildufortsætte().start();
  }
}