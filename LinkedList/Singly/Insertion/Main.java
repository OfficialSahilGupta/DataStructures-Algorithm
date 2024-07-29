import Insert.Insertion;

public class Main{
    public static void main(String[] a){

        Insertion obj = new Insertion();
        obj.insertBegin(14);
        obj.insertBegin(13);
        obj.display();

        obj.insertEnd(90);
        obj.insertEnd(100);
        obj.display();

        obj.insertIndex(15,2);
        obj.insertIndex(95,4);
        obj.display();

        


    }
}