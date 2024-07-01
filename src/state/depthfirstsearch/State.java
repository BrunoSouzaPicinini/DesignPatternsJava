package state.depthfirstsearch;

import java.util.List;

public interface State {
    void search(Node node, List<Node> nodes);
    void changed(Node node, List<Node> nodes);
    String getName();
}
