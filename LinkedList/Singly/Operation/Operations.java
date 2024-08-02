package Operation;

// declaration of the public class Operations having all the required opeartions for singly linkedlist.
public class Operations{
    // so it applied on all the nodes
    private int size;
    private Node head;
    private Node tail;

    // this is our user defined datatype which is Node made from private class
    private class Node{
        private Node next;
        private int value;

        // this constructor initialized the value.
        public Node(int value){
            this.value = value;
        }

        // this constructor initializes the value and reference next.
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    // this constructor initialize size of 0.
    public Operations(){
        this.size = 0;
    }

    // this method will calls when required for the insertion at the beginning.
    public void insertBegin(int value){
        // this edge case refers that if tail is null then tail = head;
        if(tail == null){
            tail = head;
        }

        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;

    }

    // this method will calls when required for the insertion at the end.
    public void insertEnd(int value){
        if(tail = null){
            insertBegin(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    // this method will calls when required for the insertion at the specific position in the sigly linkedlist
    public void insertIndex(int value, int index){
        // thie edge case says when the index is at 0th position calls insertFirst(value) method.
        if(index == 0){
            insertBegin(value);
            return;
        }

        // thie edge case says when the index is at the last position calls insertEnd(value) method.
        if(index == size - 1){
            insertEnd(value);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // this method will calls when required for the deletion at the beginning.
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        size--;

        return val;
    }

    // this method will calls when required for the deletion at the end.
    public int deleteEnd(){
        // thie edge case says when the index is at the first position calls insertFirst(value) method.
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
        // thie edge case says when the index is at the firsst position calls insertFirst(value) method
        if(index == 0){
            return deleteFirst();
        }

        if(index == size - 1){
            // thie edge case says when the index is at the last position calls insertEnd(value) method
            return deleteEnd();
        }

        Node temp = get(index - 1);
        int val = temp.value;
        temp.next = temp.next.next;
        size--;

        return val;
    }
    
    // this method will tranverse the linkedlist
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // method to search for a given value in the linkedlist or not.
    public boolean search(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // method to get the lenght of linkedlist.
    public int length(){
        return size;
    }
}
