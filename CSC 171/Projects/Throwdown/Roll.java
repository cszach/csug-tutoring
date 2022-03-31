import java.util.Random;

class Roll {
  public static void main(String[] args) {
    final int[] dice = {1, 2, 3, 4, 5, 6};
    int[] result = {3, 1, 2, 5, 3};
    Random random = new Random();

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < 15; j++) {
        System.out.printf("%d", dice[random.nextInt(dice.length)]);
        try {
          Thread.sleep(70);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        System.out.printf("\b");
      }

      System.out.printf("%d ", result[i]);
    }
    System.out.println("Best score is 6 (sum3's)");
  }
}
