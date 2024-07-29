import Operation.Operations;

public class Main{
    public static void main(String[] a){

        Operations obj = new Operations();
        // inserting three values at the beginning of the linkedlist.
        System.out.println("12, 13 & 14 inserted in the first place in linkedlist.");
        obj.insertBegin(14);
        obj.insertBegin(13);
        obj.insertBegin(12);

        // this method will traverse the linkedlist when obj.display() method invoked
        obj.display();
        System.out.println();

        // inserting three values at the last of the linkedlist.
        System.out.println("90, 100 & 110 inserted end at the linkedlist respectively");
        obj.insertEnd(90);
        obj.insertEnd(100);
        obj.insertEnd(110);
        obj.display();
        System.out.println();

        // inserting two values at the index 3, 5 & 7 respectivelyof the linkedlist.
        System.out.println("15, 95 & 105 inserted at the index 3, 5 & 7 respectively.");
        obj.insertIndex(15,3);
        obj.insertIndex(95,5);
        obj.insertIndex(105,7);
        obj.display();
        System.out.println();

        // deleting the value "12" at the beginning at the linkedlist.
        System.out.println("12 was deleted at the first position.");
        obj.deleteFirst();
        obj.display();
        System.out.println();

        // deleting the value "90" at the last of the linkedlist.
        System.out.println("110 was deleted at the last position.");
        obj.deleteEnd();
        obj.display();
        System.out.println();
        
        // deleting 15 at the index of 2 in the linkedlist.
        System.out.println("15 was deleted at the index 2.");
        obj.deleteIndex(2);
        obj.display();
        System.out.println();

        // Search for a value in the linked list
        System.out.println("Searching for value 40: " + obj.search(40));
        System.out.println();

        System.out.println("Searching for value 95: " + obj.search(95));
        System.out.println();

        // Get the length of the linked list
        System.out.println("Length of the linked list: " + obj.length());
        System.out.println();
    }
}
