package InsertionStart;
public class InsertionStart{
    private int size;
    private Node head;
    private Node tail;

    private class Node{
        private Node next;
        private int value;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public InsertionStart(){
        this.size = 0;
    }

    public void insertBegin(int value){
        if(tail == null){
            tail = head;
        }

        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}