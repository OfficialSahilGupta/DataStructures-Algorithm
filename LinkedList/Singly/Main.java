import Operation.Operations;

public class Main{
    public static void main(String[] a){

        Operations obj = new Operations();
        obj.insertBegin(14);
        obj.insertBegin(13);
        obj.insertBegin(12);
        obj.display();

        obj.insertEnd(90);
        obj.insertEnd(100);
        obj.insertEnd(110);
        obj.display();

        obj.insertIndex(15,3);
        obj.insertIndex(95,5);
        obj.insertIndex(105,7);
        obj.display();

        obj.deleteFirst();
        obj.display();

        obj.deleteEnd();
        obj.display();

        obj.deleteIndex(2);
        obj.display();
    }
}
