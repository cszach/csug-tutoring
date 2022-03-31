import java.util.Random;

class Roll2 {
  public static void main(String[] args) {
    final int[] dice = {1, 2, 3, 4, 5, 6};
    int[] result = {3, 1, 2, 5, 3};
    Random random = new Random();

    for (int i = 0; i < 50; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.printf("%d ", dice[random.nextInt(dice.length)]);
      }
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      System.out.printf("\b\b\b\b\b\b\b\b\b\b");
    }

    for (int die : result) {
      System.out.printf("%d ", die);
    }
    System.out.println("Best score is 6 (sum3's)");
  }
}
