package OOP.encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Kinga";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Kinga", 50, "Sword");
//        System.out.println("Initial health is: " + player.getHealth());


        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int printedPages = printer.printPages(4);
        System.out.println("Pages printed was " + printedPages + " new total print count for printer = " + printer.getPagesPrinted());

        printedPages = printer.printPages(2);
        System.out.println("Pages printed was " + printedPages + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
