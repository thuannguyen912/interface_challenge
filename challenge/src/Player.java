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

    public void pickUp(String weaponName) {
        Item currentItem = existItem(weaponName);
        if (currentItem != null) {
            this.itemList.add(currentItem);
        } else {
            System.out.println("Already pickup this item.");
        }
    }

    public void attack(Monster monster) {

    }

    private Item existItem(String weaponName) {
        for (Item checkedItem : this.itemList) {
            if (checkedItem.getWeaponType().equals(weaponName)) {
                return checkedItem;
            }
        }
        return null;
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
