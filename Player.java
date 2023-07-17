public class Player {
    private String name;
    private int score;
    private BoundedStack boundedStack;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.boundedStack = new BoundedStack();
    }

    public void addSpell(Spell spell) {
        boundedStack.load(spell);
    }

    public void participateInBattle(Player opponent) {
        Spell playerSpell = boundedStack.pop();
        Spell opponentSpell = opponent.getBoundedStack().pop();

        if (playerSpell.getPotency() > opponentSpell.getPotency()) {
            this.score++;
        } else if (playerSpell.getPotency() < opponentSpell.getPotency()) {
            opponent.incrementScore();
        }
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public BoundedStack getBoundedStack() {
        return boundedStack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void incrementScore() {
        this.score++;
    }
}
