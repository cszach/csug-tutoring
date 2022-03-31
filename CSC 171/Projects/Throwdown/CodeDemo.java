import java.util.Random;

class CodeDemo {
  public static void main(String[] args) {
    final int LENGTH = 12;
    Random random = new Random();

    for (int i = 0; i < 30; i++) {
      for (int j = 0; j < LENGTH; j++) {
        System.out.printf("%c", (char) (97 + random.nextInt(26)));
      }

      try {
        Thread.sleep(100);
        for (int k = 0; k < LENGTH; k++) System.out.printf("\b");
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }

    System.out.println();
  }
}
