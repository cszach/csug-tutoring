class DelayDemo {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println("Wait for it...");
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }
}
