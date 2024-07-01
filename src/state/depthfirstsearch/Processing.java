package state.depthfirstsearch;

import java.util.List;

public class Processing implements State {

    @Override
    public void search(Node node, List<Node> nodes) {
        System.out.println("Node " + node + " Already processing");
    }

    @Override
    public void changed(Node node, List<Node> nodes) {
        for (Node child : node.getChildren()) {
            child.deepSearch(nodes);
        }
        node.setState(new Processed(), nodes);
    }

    @Override
    public String getName() {
        return "Processing";
    }

}
