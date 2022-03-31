import java.util.ArrayList;

class Penguin {
  public static String SPECIES = "H. sapiens";
  public static enum Gender {MALE, FEMALE, INTERSEX};
  private String name;
  private Gender gender;
  private int age;
  private boolean isLiving;
  private ArrayList<Human> friends;
  private ArrayList<Human> children;

  Human(String name, Gender gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.isLiving = true;
    this.friends = new ArrayList<Human>(0);
  }

  void say(String something) {
    System.out.println(something);
  }

  private void greet() {
    this.say("Hello, my name is " + this.name + ". Nice to meet you!");
  }

  void makeFriend(Human newFriend) {
    if (newFriend == this) return; // cannot make friend with oneself

    friends.add(newFriend);
  }

  Human makeBaby(Human partner) {
    // Only men and women can mate
    if (this.gender.equals(partner.gender)) return null;

    Human baby = new Human(
      null,
      (Math.random() < 0.5) ? Gender.MALE : Gender.FEMALE,
      0
    );

    this.children.add(baby);
    return baby;
  }

  void setName(Human child, String name) {
    if (this.children.contains(child)) {
      this.say("I will call you " + name);
      child.name = name;
    } else {
      this.say("You are not my child.");
    }
  }

  public static void main(String[] args) {
    ArrayList<Human> population = new ArrayList<Human>(0);

    Human firstMan = new Human("Adam");
    Human firstWoman = new Human("");
  }
}
