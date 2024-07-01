package state.depthfirstsearch;

import java.util.List;

public class Processed implements State{

    @Override
    public void search(Node node, List<Node> nodes) {
        System.out.println("Node " + node + " Already processed");
    }

    @Override
    public void changed(Node node, List<Node> nodes) {
        System.out.println("Node " + node + " execution done!");
        nodes.add(node);
    }

    @Override
    public String getName() {
        return "Processed";
    }

}
