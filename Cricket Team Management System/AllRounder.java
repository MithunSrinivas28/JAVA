class AllRounder extends Player {

    private int runs;
    private int wickets;

    public AllRounder(
            String name,
            int age,
            int jerseyNumber,
            int runs,
            int wickets) {

        super(name, age, jerseyNumber);

        this.runs = runs;
        this.wickets = wickets;
    }

    @Override
    public void displayStats() {

        System.out.println(
                "AllRounder: " +
                getName() +
                ", Runs: " +
                runs +
                ", Wickets: " +
                wickets
        );
    }
}
