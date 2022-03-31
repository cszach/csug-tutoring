import java.util.Random;

class DiceHand {
  int[] dice;

  DiceHand() {
    this.dice = new int[5];
    Random random = new Random();

    int[] initialRolls = new int[5];

    this.dice[0] = random.nextInt(6) + 1;
    this.dice[1] = random.nextInt(6) + 1;
    this.dice[2] = random.nextInt(6) + 1;
    this.dice[3] = random.nextInt(6) + 1;
    this.dice[4] = random.nextInt(6) + 1;
  }

  DiceHand(int[] dice) {
    this.dice[0] = dice[0];
    this.dice[1] = dice[1];
    this.dice[2] = dice[2];
    this.dice[3] = dice[3];
    this.dice[4] = dice[4];
  }

  @Override
  public String toString() {
    return String.format(
        "%d %d %d %d %d", this.dice[0], this.dice[1], this.dice[2], this.dice[3], this.dice[4]);
  }

  public static void main(String[] args) {
    DiceHand hand = new DiceHand();

    System.out.println(hand);
  }
}
