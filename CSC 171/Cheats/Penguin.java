import java.util.ArrayList;

class Penguin {
  public static String FAMILY = "Spheniscidae";
  public static enum Gender {MALE, FEMALE};
  private String name;
  private Gender gender;
  private int age;
  private boolean isLiving;
  private ArrayList<Penguin> friends;
  private ArrayList<Penguin> children;

  Penguin(String name, Gender gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.isLiving = true;
    this.friends = new ArrayList<Penguin>(0);
    this.children = new ArrayList<Penguin>(0);
  }

  void setName(String name) {
    this.name = name;
  }

  int age() {
    return ++this.age;
  }

  Penguin makeFriend(Penguin newFriend) {
    // Cannot make friend with oneself
    if (newFriend == this) return null; 
    // Can only make friend with a stranger
    if (this.friends.contains(newFriend)) return null;

    this.friends.add(newFriend);
    return newFriend;
  }

  Penguin makeBaby(Penguin partner) {
    if (this.gender.equals(partner.gender)) return null;
    if (this.age < 5 || partner.age < 5) return null;

    Penguin baby = new Penguin(
      null,
      (Math.random() < 0.5) ? Gender.MALE : Gender.FEMALE,
      0
    );

    this.children.add(baby);
    return baby;
  }

  public static void main(String[] args) {
  }
}
