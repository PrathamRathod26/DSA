package Nodes;

public class Nodes {
    public int data;
    public Nodes next;

    public Nodes(){}
    public Nodes(int data){
        this.data = data;
        this.next = null;
    }
    public Nodes(int data, Nodes next){
        this.data = data;
        this.next = next;
    }

}
