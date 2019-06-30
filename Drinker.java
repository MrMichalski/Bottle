public class Drinker {
    String name;
    int healthPoint;
    int bottlesCount;

    public Drinker (String name) {
        this.bottlesCount = 0;
        this.healthPoint = 100;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getBottlesCount() {
        return bottlesCount;
    }

    public void setBottlesCount(int bottlesCount) {
        this.bottlesCount = bottlesCount;
    }

    @Override
    public String toString() {
        return "Drinker{" +
                "name='" + name + '\'' +
                ", healthPoint=" + healthPoint +
                ", bottlesCount=" + bottlesCount +
                '}';
    }
}
