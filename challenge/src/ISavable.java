import java.util.List;

public interface ISavable {

    List<Item> getItem();

    void populateItem(List<Item> itemList);
}
