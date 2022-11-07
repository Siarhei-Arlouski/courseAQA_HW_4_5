package Resources;

public class Resources {
    private double wood;
    private double stone;
    private double metalFragments;
    private double metalPipe;
    private double metalBlade;

    public Resources(double wood, double stone, double metalFragments, double metalPipe, double metalBlade) {
        this.wood = wood * 0.02;
        this.stone = stone * 0.05;
        this.metalFragments = metalFragments * 0.1;
        this.metalPipe = metalPipe * 30;
        this.metalBlade = metalBlade * 15;
    }

    public double getWood() {
        return wood;
    }

    public double getStone() {
        return stone;
    }

    public double getMetalFragments() {
        return metalFragments;
    }

    public double getMetalPipe() {
        return metalPipe;
    }

    public double getMetalBlade() {
        return metalBlade;
    }
}