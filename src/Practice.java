public class Practice {
    public static void main(String[] args) {
        System.out.println("~linked lists practice~");
        
        Node head = new Node('g', null, null);
        Node ryan = new Node('s', null, null);
        head.next = ryan;
        ryan.next = new Node('t', null, null);
        ryan.next.next = new Node('x', null, null);

        System.out.println(contains(head, 'x'));
        System.out.println(contains(head, 'e'));

        remove(head, 't');

        MyLL<Character> list = new MyLL<>();

        list.addToBack('x');
        list.addToBack('m');
        list.addToBack('v');
        list.addToBack('q');

        list.printList();

        MyLL<Integer> intlist = new MyLL<>();

        intlist.addToBack(5);
        intlist.addToBack(99);
        intlist.addToBack(2);
        intlist.addToBack(-333333);
        intlist.addToBack(66);

        System.out.println();

        System.out.println("PRINT FORWARD");
        intlist.printList();

        System.out.println();

        System.out.println("PRINT BACKWARDS");
        intlist.printListBackwards();
    }

    public static void printList(Node start){
        Node current = start;

        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static boolean contains(Node start, char toFind) {
        Node current = start;

        while (current != null) {
            if (current.value == toFind) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // remove the first node that has toRemove
    public static char remove(Node head, char toRemove) {
        Node current = head;

        while (current.next != null) {
            
            if (current.next.value == toRemove) {
                current.next = current.next.next;
                return toRemove;
            }

            current = current.next;
        }

        return '\0';
    }
}
