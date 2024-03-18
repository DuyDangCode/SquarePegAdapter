public class Main {
    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(20);

        roundHole.fits(roundPeg);

        SquarePeg squarePeg = new SquarePeg(10);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);

        roundHole.fits(squarePegAdapter);




    }
}