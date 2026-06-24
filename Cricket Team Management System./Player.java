abstract class Player {
  private String name;
  private int age;
  private int jerseynumber;

  public Player(String name,int age,int jerseynumber){
    this.name = name;
    this.age = age;
    this.jerseynumber = jerseynumber;

  }

  public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public abstract void displayStats();
}
  
