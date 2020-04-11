package eg.edu.alexu.csd.datastructure.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayQueueTest {
ArrayQueue rq = new ArrayQueue(10);
    @org.junit.Test
    public void enqueue() {
        rq.enqueue(5);
        rq.enqueue("test");
        assertEquals(2,rq.size());
        rq.enqueue('m');
        assertEquals(3,rq.size());
    }

    @org.junit.Test
    public void dequeue() {
        rq.enqueue(1);
        rq.enqueue(5);
        assertEquals(1,rq.dequeue());
        assertEquals(5,rq.dequeue());
        assertEquals(0,rq.size());
        rq.enqueue('m');
        assertEquals(1,rq.size());
    }

    @org.junit.Test
    public void isEmpty() {
        assertEquals(true,rq.isEmpty());
        rq.enqueue(1);
        assertEquals(false,rq.isEmpty());
        rq.dequeue();
        assertEquals(true,rq.isEmpty());
    }

    @org.junit.Test
    public void size() {
        rq.enqueue(2);
        rq.enqueue("test");
        assertEquals(2,rq.size());
        rq.dequeue();
        assertEquals(1,rq.size());
    }
    @Test(expected = RuntimeException.class)
    public void Exception (){
        ArrayQueue rq2 = new ArrayQueue(2);
        rq2.dequeue();
        rq2.enqueue(5);
        rq2.enqueue(1);
        rq2.enqueue(18);
    }

}