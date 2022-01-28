public class Ball implements Comparable {
    private int brightness;

    public Ball() {
        this((int) Math.floor(Math.random()*16));
    }

    public Ball(int brightness) {
        this.brightness = brightness%16;
    }

    public boolean brighterThan(Ball otherBall) {
        if(otherBall.brightness < this.brightness) {
            return true;
        } else {
            return false;
        }
    }

    //når man skriver metodens signatur skal den abstrakte metode ind som parameter?!
    public int compareTo(Object other){
        Ball otherBall = (Ball) other;
        if(this.brightness < otherBall.brightness){
        return -1;
        } else {
            return 1;
        }
    }

    public String toString() {
        return Integer.toString(brightness);
    }
}
