import java.util.ArrayDeque;

public class BoundedStack {
    private ArrayDeque<Spell> stack;

    public BoundedStack() {
        stack = new ArrayDeque<>();
    }

    public void load(Spell spell) {
        if (stack.size() >= 50) {
            stack.removeLast(); // Remove the least recently added spell from the bottom of the stack
        }
        stack.push(spell); // Add the new spell to the top of the stack
    }

    public Spell pop() {
        if (!stack.isEmpty()) {
            return stack.pop(); // Remove and return the top spell from the stack
        } else {
            return null; // Return null if the stack is empty
        }
    }

    public void unload() {
        while (!stack.isEmpty()) {
            Spell spell = stack.pop();
            System.out.println("Unloaded spell: " + spell.getSpell() + ", Potency: " + spell.getPotency());
        }
    }

    // Additional methods can be added here as per your game requirements
}
