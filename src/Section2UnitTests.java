import org.junit.Assert;
import org.junit.Test;

public class Section2UnitTests {

    @Test
    public void testRemove(){
        Exercise2_LinkedList<Integer> l1 = new Exercise2_LinkedList<>(new Integer[]{1,2,3,4});
        Exercise2_LinkedList<Integer> l2 = new Exercise2_LinkedList<>(new Integer[]{2,3,4});
        l1.remove(1);
        Assert.assertEquals(l2,l1);
    }

    @Test
    public void testEqualsInteger(){
        Exercise2_LinkedList<Integer> l1 = new Exercise2_LinkedList<>(new Integer[]{1,2,3,4});
        Exercise2_LinkedList<Integer> l2 = new Exercise2_LinkedList<>(new Integer[]{1,2,3,4});
        Assert.assertEquals(true, l1.equals(l2));
    }

    @Test
    public void testToString(){
        Exercise2_LinkedList<Integer> l1 = new Exercise2_LinkedList<>(new Integer[]{1,2,3,4});
        Assert.assertEquals("[1,2,3,4]", l1.toString());
    }

    @Test
    public void testEqualsString(){
        Exercise2_LinkedList<String> l1 = new Exercise2_LinkedList<>(new String[]{"1","2","3","4"});
        Exercise2_LinkedList<String> l2 = new Exercise2_LinkedList<>(new String[]{"1","2","foo","4"});
        Assert.assertEquals(false, l1.equals(l2));
    }

    @Test
    public void testLength(){
        final int size = 4;
        Exercise2_LinkedList<Integer> l = new Exercise2_LinkedList<>(new Integer[]{1,2,3,4});
        Assert.assertEquals(size, l.length());
    }

    @Test
    public void testExercise2_1(){
        // test remove dulicates
        Exercise2_1<Integer> l1 = new Exercise2_1<>(new Integer[]{1,2,2,4,3,4});
        Exercise2_1<Integer> l2 = new Exercise2_1<>(new Integer[]{1,2,3,4});
        l1.removeDuplicates();
        Assert.assertEquals(l2.toString(), l1.toString());
    }

    @Test
    public void testExercise2_2(){
        Exercise2_2<Integer> l1 = new Exercise2_2<>(new Integer[]{1,2,2,5,3,4});
        Assert.assertEquals(5, l1.getKthToTheLastElement(3).data);
    }
}
