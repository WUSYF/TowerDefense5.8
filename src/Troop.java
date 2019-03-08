public class Troop {
    int speed;
    int lives;
    int location;

    public Troop(int speed, int lives) {
        this.speed = speed;
        this.lives = lives;
        this.location = 0;
    }

    public void move(){
        location += speed;
    }


    public void hit(int power){
        this.lives -= power;
    }

    public int getLives() {
        return lives;
    }
}
