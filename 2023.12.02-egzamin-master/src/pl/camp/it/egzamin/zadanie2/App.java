package pl.camp.it.egzamin.zadanie2;

public class App {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(9);
        binaryTree.add(10);
        binaryTree.add(1);
        binaryTree.add(2);

        System.out.println(binaryTree.contains(5));
        System.out.println(binaryTree.contains(9));
        System.out.println(binaryTree.contains(1));
        System.out.println(binaryTree.contains(100));
        System.out.println(binaryTree.contains(-8));

        System.out.println(binaryTree.min());
        System.out.println(binaryTree.max());

        System.out.println(binaryTree.maxNoR());
    }
}
