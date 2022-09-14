import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable {

    private int life;

    private List<Item> itemList = new ArrayList<>();

    public Monster(int life) {
        this.life = life;
    }

    public int getLife() {
        return life;
    }

    @Override
    public List<Item> getItem() {
        return this.itemList;
    }

    @Override
    public void populateItem(List<Item> itemList) {
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }
}
