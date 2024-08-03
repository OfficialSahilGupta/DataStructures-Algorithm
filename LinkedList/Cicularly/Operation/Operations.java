package Operation;

public class Operations{

    private Node head;
    private Node tail;
    private int size;

    public Operations(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    // public int delete(int value){
    //     int value2 = head.value;
    //     if(value == head.value){
    //         head = head.next;
    //         tail.next = head;
    //         size--;
    //         return value2;
    //     }

    //     if(value != head.value){
    //         Node temp = head;
    //         int ans = temp.value;
    //         Node n = temp.next;
    //         if(value == n.value){
    //             n.next = n.next.next;
    //             size--;
    //             return ans;           
    //         }
    //         n = n.next;
    //         temp = temp.next;
    //     }
    //     return -1;
    // }

    public void delete2(int value){
        Node node = head;
        if(node == null){
            return;
        }

        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        } while(node != head);
    }

    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value + " ->");
                temp = temp.next;
            } while(temp != head);
        }
    }

    public void display2(){
        Node node = head;
        while(node != tail){
            System.out.print(node.value + " ->");
            node = node.next;
        }
        System.out.println();
    }

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

}
