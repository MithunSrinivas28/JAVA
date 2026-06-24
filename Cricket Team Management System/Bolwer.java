class Bowler extends Player {

    private int wickets;

    public Bowler(
            String name,
            int age,
            int jerseyNumber,
            int wickets) {

        super(name, age, jerseyNumber);

        this.wickets = wickets;
    }

    @Override
    public void displayStats() {

        System.out.println(
                "Bowler: " +
                getName() +
                ", Wickets: " +
                wickets);
    }
}
