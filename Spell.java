public class Spell {
    private String spell;
    private double potency;

    // Constructor
    public Spell() {
        this.spell = "";
        this.potency = 0.0;
    }

    // Overloaded Constructor
    public Spell(String spell, double potency) {
        this.spell = spell;
        this.potency = potency;
    }

    // Getters
    public String getSpell() {
        return this.spell;
    }
    public double getPotency() {
        return this.potency;
    }

    // Setters
    public void setSpell(String spell) {
        this.spell = spell;
    }
    public void setPotency(double potency) {
        this.potency = potency;
    }

}
