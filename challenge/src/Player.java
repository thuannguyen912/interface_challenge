import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {

    private int life;

    // when player attack, energy increases by 30. If energy >= 90, next player's move will inflict double dmg
    // then energy decreases to 0.
    private int energyLevel;

    private List<Item> itemList = new ArrayList<>();


    public Player(int life) {
        this.life = life;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public void pickUp(Item item) {
        if (isAlive()) {
            if (this.itemList.size() == 0) {
                this.itemList.add(item);
                System.out.println(item.getWeaponType() + " is added to list.");
            } else {
                boolean hasExist = existItem(item);
                if (hasExist) {
                    System.out.println("Already picked up item.");
                } else {
                    this.itemList.add(item);
                    System.out.println(item.getWeaponType() + " is added to list.");
                }
            }
        } else {
            System.out.println("Player defeated.");
        }
    }

    @Override
    public Item selectBestWeapon(List<Item> itemList) {
        if (isAlive()) {
            Item bestWeapon = new Item();
            for (int i = 0; i < itemList.size(); i++) {
                Item currentWeapon = itemList.get(i);
                if (currentWeapon.getWeaponDmg() > bestWeapon.getWeaponDmg()) {
                    bestWeapon = currentWeapon;
                }
            }
            return bestWeapon;
        }

        System.out.println("Player defeated.");
        return null;
    }

    @Override
    public Item selectBestWeapon() {
        Item bestWeapon = new Item();
        for (int i = 0; i < this.itemList.size(); i++) {
            Item currentWeapon = this.itemList.get(i);
            if (currentWeapon.getWeaponDmg() > bestWeapon.getWeaponDmg()) {
                bestWeapon = currentWeapon;
            }
        }
        return bestWeapon;
    }

    public void attack(Monster monster) {
        if (isAlive()) {
            int playerWeaponDmg = selectBestWeapon(this.itemList).getWeaponDmg();
            int monsterWeaponDmg = monster.selectBestWeapon().getWeaponDmg();

            if (playerWeaponDmg > monsterWeaponDmg) {
                int dmgReceived = playerWeaponDmg - monsterWeaponDmg;
                monster.setLife(monster.getLife() - dmgReceived);
                System.out.println("Attacked monster. Monster's life: " + monster.getLife() + " left.");
            } else {
                System.out.println("Cannot attack monster.");
            }
        } else {
            System.out.println("Player defeated.");
        }
    }

    private boolean isAlive() {
        return this.getLife() >= 0;
    }

    private boolean existItem(Item item) {
        for (Item checkedItem : this.itemList) {
            if (checkedItem.equals(item)) {
                return true;
            }
        }
        return false;
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
