public abstract class Square {
    private String name;
    public Square(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public abstract void landedON(Player gaymer);
}
