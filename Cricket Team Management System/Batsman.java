class Batsman extends Player { // inheritance implemented

    private int runs;

    public Batsman(
            String name,
            int age,
            int jerseyNumber,
            int runs) {

        super(name, age, jerseyNumber);//constructor chaining  using super keyword and calling all the player stuff here
 // i hope this is enough
        this.runs = runs;
    }

    @Override
    public void displayStats() {

        System.out.println(
            "Batsman: " +
            getName() +
            ", Runs: " +
            runs
        );
    }
}
