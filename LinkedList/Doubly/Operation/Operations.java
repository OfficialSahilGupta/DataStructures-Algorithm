package Operation;

public class Operations{

    private Node head;
    private int size;

    public Operations(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(head != null){
            node.prev = head;
        }
        size++;
    }

    public void insertEnd(int value){
        if(size <=1){
            insertFirst(value);
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        node.next = null;
        node.prev = temp;
        size++;
    }

    public void insertIndex(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertEnd(value);
            return;
        }

        Node befIndex = head;
        for(int i = 1 ; i < index; i++){
            befIndex = befIndex.next;
        }

        Node node = new Node(value, befIndex.next);
        befIndex.next = node;
        node.prev = befIndex;
        size++;
    }

    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        size--;

        return value;
    }

    public int deleteEnd(){
        if(size <= 1){
            return deleteFirst();
        }

        Node temp = head;
        for(int i = 0; i < size - 2; i++){
            temp = temp.next;
        }

        int value = temp.value;
        temp.next = null;
        size--;

        return value;
    }

    public int deleteIndex(int index){
        if(index == 0){
            return deleteFirst();
        }

        if(index == size - 1){
            return deleteEnd();
        }

        Node befIndex = head;
        for(int i = 1; i<index; i++){
            befIndex = befIndex.next;
        }

        int value = befIndex.value;
        befIndex.next = befIndex.next.next;
        size--;

        return value;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private Node next;
        private Node prev;
        private int value;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}