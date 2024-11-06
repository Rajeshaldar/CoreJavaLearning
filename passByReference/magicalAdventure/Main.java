package magicalAdventure;

public class Main {
    public static void main(String[] args) {
        Potion magicPotion = new Potion();
        Wizard.usePotion(magicPotion); // Wizard uses the potion
        Dragon.usePotion(magicPotion); // Dragon uses the same potion
    }
}
