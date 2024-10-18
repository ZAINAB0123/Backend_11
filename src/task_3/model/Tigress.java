package task_3.model;

public class Tigress {
    private static final int MAX_HEALTH = 100;
    private static final int MAX_ENERGY = 100;
    private static final double COEFFICIENT_OF_FANGS = 3.5;

    private static final int MIN_HEALTH = 0;
    private static final int MIN_ENERGY = 0;

    private int health = 100;
    private int energy = 100;


    public void setHealth(int health) {
        if (health <= MAX_HEALTH && health >= MIN_HEALTH) {
            this.health = health;
        } else if (health < MIN_HEALTH) {
            this.health = MIN_HEALTH;
        } else {
            this.health = MAX_HEALTH;
        }
    }

    public int getHealth() {
        return health;
    }

    public void setEnergy(int energy) {
        if (energy <= MAX_ENERGY && energy >= MIN_ENERGY ) {
            this.energy = energy;
        } else if (energy < MIN_ENERGY) {
            this.energy = MIN_ENERGY;
        } else {
            this.energy = MAX_ENERGY;
        }
    }

    public int getEnergy() {
        return energy;
    }

    public double getCoefficientOfFangs() {
        return COEFFICIENT_OF_FANGS;
    }


}
