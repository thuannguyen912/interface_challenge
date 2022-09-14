import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {

    private int life;

    private List<Item> itemList = new ArrayList<>();

    public Player(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    public void pickUp(Item item) {

    }

    @Override
    public List<Item> getItem() {
        return null;
    }

    @Override
    public void populateItem(List<Item> itemList) {

    }
}
