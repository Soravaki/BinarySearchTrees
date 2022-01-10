public class Runner {
    public static void main(String[] args) {
        Main m = new Main(23);
        m.insert(45);
        m.insert(67);
        m.insert(11);
        m.insert(17);
        m.insert(7);
        m.insert(9);
        m.insert(27);
        System.out.println("PreOrder");
        m.printPreOrder();
        System.out.println("\nInOrder");
        m.printInOrder();
        System.out.println("\nPostOrder");
        m.printPostOrder();
        System.out.println("\nLevelOrder");
        m.printLevelOrder();

    }
}
