package Insert;
public class Insertion{
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

    public Insertion(){
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

    public void insertEnd(int value){
        if(tail == null){
            insertBegin(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertIndex(int value, int index){
        if(index == 0){
            insertBegin(value);
            return;
        }

        if(index == size){
            insertEnd(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
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