public class Exercise2_LinkedList<E> {
    // A simple singly linked list implementation for the following exercises

    Node head;

    public Exercise2_LinkedList(){
        head = null;
    }

    public Exercise2_LinkedList(E[] l) {
        for(E e : l){
            append(e);
        }
    }

    class Node<E>{
        Node next;
        E data;
        public Node(E d){
            data = d;
            next = null;
        }

        public boolean equals(Node n){
            return data.equals(n.data);
        }
    }

    void append(E d){
        Node newEnd = new Node(d);

        if(head == null){
            head = newEnd;
        }else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = newEnd;
        }

    }

    boolean remove(E d){
        Node n = head;
        //case empty list
        if(head == null){
            return false;
        }
        //case remove head
        if(head.data.equals(d)){
            head = head.next;
            return true;
        }
        // case in the list
        while(n.next != null){
            if(n.next.data.equals(d)){
                n.next = n.next.next;
                return true;
            }
            n = n.next;
        }
        return false;
    }

    int length(){
        int l = 0;
        Node n = head;
        while(n != null){
            n = n.next;
            l++;
        }
        return l;
    }

    boolean equals(Exercise2_LinkedList<E> list2){
        if(length() != list2.length()){
            return false;
        }
        Node n1 = head;
        Node n2 = list2.head;
        while(n1.next != null){
            if(!n1.data.equals(n2.data)){
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node n = head;
        if(n != null){
            sb.append(n.data.toString());
            sb.append(",");
        }
        n = n.next;
        while(n.next != null){
            sb.append(n.data.toString());
            sb.append(",");
            n = n.next;
        }
        sb.append(n.data.toString());
        sb.append("]");
        return sb.toString();
    }

    public void mergeSort(){

    }

    private Node mergeSortRef(Node a, Node b){
        if(a == null){
            return b;
        }
        if(b == null){
            return a;
        }
        return null;
    }

    private Node getMiddleNode(){
        int middle = (int) Math.floor(length());
        Node n = head;
        for(int i = 0; i < middle; i++){
            n = n.next;
        }
        return n;
    }
}
