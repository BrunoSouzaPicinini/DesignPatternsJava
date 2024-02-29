package templatemethod;

public abstract class Duck implements Comparable<Duck>{
    String name;
    int weight;

    public Duck (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return name + " weighs " + weight;
    }
}
