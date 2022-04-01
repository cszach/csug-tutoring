package PenguinSimulator;

import java.util.ArrayList;

class Penguin {
  public static final String FAMILY = "Spheniscidae";
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

  String getName() {
    return this.name;
  }

  void setName(String name) {
    this.name = name;
  }

  int getAge() {
    return this.age;
  }

  void setAge() {
    ++this.age;
  }

  void say(String something) {
    System.out.println(something);
  }

  void greet() {
    this.say("Hello, I'm " + this.name);
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
    System.out.println("Story of the " + Penguin.FAMILY);

    Penguin firstMalePenguin = new Penguin("Ano", Gender.MALE, 8);
    Penguin firstFemalePenguin = new Penguin("Emu", Gender.FEMALE, 5);

    firstMalePenguin.greet();
    firstFemalePenguin.greet();
  }
}
