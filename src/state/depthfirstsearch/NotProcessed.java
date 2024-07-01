package state.depthfirstsearch;

import java.util.List;

public class NotProcessed implements State{

    @Override
    public void search(Node node, List<Node> nodes) {
        node.setState(new Processing(), nodes);
    }

    @Override
    public void changed(Node node, List<Node> nodes) {
        System.out.println("Do nothing");
    }

    @Override
    public String getName() {
        return "NotProcessed";
    }

}
