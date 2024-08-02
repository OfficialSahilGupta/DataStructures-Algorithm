import Operation.Operations;

public class Main{

    public static void main(String[] a){

        Operations obj = new Operations();

        obj.insertFirst(100);
        obj.insertFirst(90);
        obj.insertFirst(80);
        obj.display();

        obj.insertEnd(110);
        obj.insertEnd(200);
        obj.display();

        obj.insertIndex(85,2);
        obj.insertIndex(95,3);
        obj.display();

        obj.deleteFirst();
        obj.display();

        obj.deleteEnd();
        obj.display();

        obj.deleteIndex(2);
        obj.display();
    }
}


