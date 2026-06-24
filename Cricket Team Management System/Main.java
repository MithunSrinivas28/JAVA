public class Main {

    public static void main(String[] args) {

        Player p1 =
                new Batsman(
                        "Virat",
                        36,
                        18,
                        14000);

        Player p2 =
                new Bowler(
                        "Bumrah",
                        31,
                        93,
                        450);

        Player p3 =
                new AllRounder(
                        "Hardik",
                        31,
                        33,
                        5000,
                        180);

        p1.displayStats();
        p2.displayStats();
        p3.displayStats();
    }
}
