public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(200);
        Monster monster1 = new Monster(200);

        int playerLife = player1.getLife();
        System.out.println("The initial life of player is " + playerLife);
        int monsterLife = monster1.getLife();
        System.out.println("The initial life of monster is " + monsterLife);

        Item axe = new Item("Axe", 60);
        Item oneHandSword = new Item("One-handed sword", 30);
        Item twoHandSword = new Item("Two-handed sword", 65);
        Item mace = new Item("Mace", 40);

        player1.pickUp(axe);
        player1.pickUp(axe);
        player1.pickUp(twoHandSword);

        monster1.pickUp(mace);

        player1.populateItem(player1.getItem());

        player1.attack(monster1);
    }




}
