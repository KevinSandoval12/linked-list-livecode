public class MyLL<T> {
  private class Node<T> {
    public T value;
    public Node<T> next;
    public Node<T> prevNode;

    public Node(T value, Node<T> next, Node<T> prevNode){
      this.value = value;
      this.next = next;
      this.prevNode = prevNode;
    }
}

  private Node<T> head;

  public MyLL() {
    head = null;
  }

  public void printList(){
        Node<T> current = head;

        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void addToBack(T toAdd) {
        Node<T> newNode = new Node<>(toAdd, null, null);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> current = head;

        while (current.next != null) {
            current = current.next;
        }
        
        newNode.prevNode = current;
        current.next = newNode;
    }

    public boolean contains(T toFind) {
        Node<T> current = head;

        while (current != null) {
            if (current.value.equals(toFind)) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // remove the first node that has toRemove
    public T remove(T toRemove) {
        if (head == null) {
          return null;
        }

        if (head.value.equals(toRemove)) {
          head = head.next;
        }
        Node<T> current = head;

        while (current.next != null) {
            
            if (current.next.value.equals(toRemove)) {
                current.next = current.next.next;
                return toRemove;
            }

            current = current.next;
        }

        return null;
    }

  public void printListBackwards(){
        Node<T> current = head;

        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.println(current.value);
            current = current.prevNode;
        }

    }

}
