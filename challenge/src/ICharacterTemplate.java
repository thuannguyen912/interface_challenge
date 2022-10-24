
import java.util.List;

public interface ICharacterTemplate {

    void pickUp(Item item);

    Item selectBestWeapon(List<Item> itemList);

    Item selectBestWeapon();

    List<Item> getItem();

    void populateItem(List<Item> itemList);

    List<String> write();

    void read(List<String> savedValues);
}
