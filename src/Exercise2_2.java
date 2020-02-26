public class Exercise2_2<E> extends Exercise2_LinkedList{

    public Node getKthToTheLastElement(int k){
        int kToTheLast = length()-k;
        Node n = head;
        for(int i = 0; i < kToTheLast; i++){
            n = n.next;
        }
        return n;
    }

    public Exercise2_2(E[] e) {
        super(e);
    }

    public Exercise2_2(){
        super();
    }
}
