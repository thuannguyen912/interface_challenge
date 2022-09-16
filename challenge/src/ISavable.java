import java.util.List;

public interface ISavable {

    void pickUp(Item item);

    Item selectBestWeapon(List<Item> itemList);

    List<Item> getItem();

    void populateItem(List<Item> itemList);
}
