package state.depthfirstsearch;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");

        a.addChild(b);
        b.addChild(c);
        c.addChild(d);
        d.addChild(b);
        a.addChild(e);
        e.addChild(f);
        f.addChild(c);
        f.addChild(g);
        f.addChild(h);
        a.addChild(h);

        List<Node> l = new ArrayList<>();
        a.deepSearch(l);
        System.out.println("Nodes finished process in order");

        var iterable = l.iterator();
        while (iterable.hasNext()) {
            System.out.print(iterable.next());
            if (iterable.hasNext()) {
                System.out.print(",");
            } else {
                System.out.println();
            }
        }
    }
}
