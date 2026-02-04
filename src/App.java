public class App {
    public static void main(String[] args) throws Exception {
        
        DoublyLinkedList dl1 = new DoublyLinkedList();

        Node n1 = new Node('A');
        Node n2 = new Node('B');
        Node n3 = new Node('C');
        Node n4 = new Node('D');
        Node n5 = new Node('E');
        
        dl1.add(n1);
        dl1.add(n2);
        dl1.add(n3);
        dl1.print(true);
        dl1.print(false);

        // and so on...
    }
}
