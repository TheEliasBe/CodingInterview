import java.util.HashSet;
import java.util.LinkedList;

public class Exercise2_1<E> extends Exercise2_LinkedList{

    public Exercise2_1(E[] e){
        super(e);
    }

    public void removeDuplicates(){
        HashSet<E> seenItems = new HashSet<>();
        Node n = head;
        while (n != null){
            if(seenItems.contains(n.data)){
                remove(n.data);
            }
            seenItems.add((E) n.data);
            n = n.next;
        }
    }

    public void removeDuplicatesWithoutBuffer(){
        //approach sort the list and then check for adjacent duplicates

    }
}
