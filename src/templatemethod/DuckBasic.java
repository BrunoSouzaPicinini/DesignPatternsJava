package templatemethod;

public class DuckBasic extends Duck{

    public DuckBasic(String name, int weight) {
        super(name, weight);
        //TODO Auto-generated constructor stub
    }

    public int compareTo(Duck object) {
        Duck otherDuck = object;

        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else { // this.weight > otherDuck.weight
            return 1;
        }
    }
    
}
