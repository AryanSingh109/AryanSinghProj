import java.util.Random;

public class BackGroundCode {
    //storing of values, place to check if I exist and that I am okay. Also holds large
    //portions of code that is just text/ nonsense...

    public int aryHider(int location) {
        Random rand = new Random();
        location = rand.nextInt(10) + 1;
        return location;
    }

    public boolean checker(String location, String rightLoc) {
        location = location.toLowerCase();
        rightLoc = rightLoc.toLowerCase();
        return location.equals(rightLoc);
    }
    
}
