import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Create instances of the necessary objects
        BoundedStack stack = new BoundedStack();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt player 1 to add spells
        System.out.println(player1.getName() + ", it's your turn to add spells.");
        addSpells(scanner, player1, stack);

        // Prompt player 2 to add spells
        System.out.println(player2.getName() + ", it's your turn to add spells.");
        addSpells(scanner, player2, stack);

        // Simulate battles
        player1.participateInBattle(player2);

        // Display the results
        System.out.println(player1.getName() + " Score: " + player1.getScore());
        System.out.println(player2.getName() + " Score: " + player2.getScore());

        // Close the scanner
        scanner.close();
    }

    private static void addSpells(Scanner scanner, Player player, BoundedStack stack) {
        String input;
        do {
            System.out.print("Enter a spell name (or 'q' to stop): ");
            input = scanner.nextLine();

            if (!input.equals("q")) {
                System.out.print("Enter the spell potency: ");
                double potency = Double.parseDouble(scanner.nextLine());

                Spell spell = new Spell(input, potency);
                player.addSpell(spell);
                stack.load(spell);
            }
        } while (!input.equals("q"));
    }
}
