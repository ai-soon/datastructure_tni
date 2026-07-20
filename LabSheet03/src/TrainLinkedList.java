public class TrainLinkedList {
    static void main() {
        LinkedList greenline =new LinkedList();

        greenline.insert("Mo-shit");
        greenline.insert("Ari");
        greenline.insert("Sanam-Pao");

        System.out.println("All station  : " + greenline.traversal());

        greenline.insert(2,"Rachakru");
        System.out.println("All station  : " + greenline.traversal());

        System.out.println("Total station: " + greenline.lenght());

        System.out.println("First station: " + greenline.get(0));

        greenline.set(0,"Mo-chit (Central Ladprao)");
        System.out.println("All station  : " + greenline.traversal());

        greenline.remove(2);
        System.out.println("All station  : " + greenline.traversal());

        greenline.removeLastElement();
        System.out.println("All station  : " + greenline.traversal());

        greenline.clear();
        System.out.println("Total station: " + greenline.lenght());

        System.out.println("All station  : " + greenline.traversal());


    }
}
