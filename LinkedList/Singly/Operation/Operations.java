package Operation;
public class Operations{
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

    public Operations(){
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

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        size--;

        return val;
    }

    public int deleteEnd(){
        if(size <= 1){
            return deleteFirst();
        }
        Node temp = get(size - 2);
        int val = tail.value;
        tail = temp;
        tail.next = null;
        size--;

        return val;
    }

    public Node get(int index){
        Node temp = head;
        for(int i = 0; i < index ; i++){
            temp = temp.next;
        }
        return temp;
    }

    public int deleteIndex(int index){
        if(index == 0){
            return deleteFirst();
        }

        if(index == size){
            return deleteEnd();
        }

        Node temp = get(index - 1);
        int val = temp.value;
        temp.next = temp.next.next;
        size--;

        return val;
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
