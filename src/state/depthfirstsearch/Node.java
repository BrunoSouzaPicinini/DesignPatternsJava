package state.depthfirstsearch;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {
    private Set<Node> children = new HashSet<>();
    private State state;
    private String name;

    public Node(String name) {
        this.name = name;
        this.state = new NotProcessed();
    }

    public void deepSearch(List<Node> nodes) {
        state.search(this, nodes);
    }

    public Set<Node> getChildren() {
        return children;
    }

    public void addChild(Node child) {
        children.add(child);
    }
   
    public void setState(State state, List<Node> nodes) {
        this.state = state;
        System.out.println("Node " + name + " state changed to " + state.getName());
        state.changed(this, nodes);
    }
    public String toString() {
        return name;
    }
    



}
