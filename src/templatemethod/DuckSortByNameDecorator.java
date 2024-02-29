package templatemethod;

import java.text.Collator;
import java.util.Locale;

public class DuckSortByNameDecorator extends Duck{ 
    Duck duck;

    public DuckSortByNameDecorator(Duck duck) {
        super(duck.name, duck.weight);
        this.duck = duck;
    }

    @Override
    public int compareTo(Duck duckToComparObject) {
        var portugueseCollator = Collator.getInstance(Locale.of("pt", "BR"));

        return portugueseCollator.compare(this.duck.name, duckToComparObject.name);
    }
    


}
