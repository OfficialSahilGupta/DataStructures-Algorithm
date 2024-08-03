import Operation.Operations;

public class Main{
    public static void main(String[] a){
        Operations obj = new Operations();

        obj.insertFirst(12);
        obj.insertFirst(23);
        obj.insertFirst(34);
        obj.insertFirst(90);
        obj.insertFirst(56);
        obj.insertFirst(98);
        obj.display();
        System.out.println();

        obj.delete2(12);
        obj.display();

        obj.delete2(90);
        System.out.println();
        // System.out.println(obj.delete(1));
        // System.out.println(obj.delete(2));


    }
}
