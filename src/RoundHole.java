public class RoundHole {
    private double radius;
    public RoundHole(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public boolean fits(RoundPeg peg){
        if(peg.getRadius() < this.radius){
            System.out.println("This peg is fit");
            return true;
        }
        System.out.println("This peg is not fit");
        return false;
    }
}
