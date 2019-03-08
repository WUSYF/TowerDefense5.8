public abstract class Tower {
    int posX;
    int posY;
    int power;
    int reach;
    int cost;
    //TODO: int Bulletspeed

    public Tower(int power, int reach) {
        this.power = power;
        this.reach = reach;
    }

    public double getDistance(int x, int y){
        return Math.sqrt((Math.pow(this.posX - x, 2)) - (Math.pow(this.posY - y, 2)));
    }

    public int getCost() {
        return cost;
    }
}