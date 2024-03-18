public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double radius = this.squarePeg.getWidth() * Math.sqrt(2) / 2;
        return radius;
    }
}
