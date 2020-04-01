package eg.edu.alexu.csd.datastructure.queue;

public class ArrayQueue implements IQueue, IArrayBased {
	
	private int f,r,count,n;
	private Object[] arr;
	
	
	public ArrayQueue(int n)
	{
		this.n=n;
		arr= new Object[n];
		f=n/2;
		r=f;
		count=0;
	}
	
	@Override
	public void enqueue(Object item) {
		// TODO Auto-generated method stub
		if(count==n){throw new IllegalStateException("Queue is full.");}
		arr[r]=item;
		if(r==n-1) {r=0;}
		else {r++;}
		count++;

	}

	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		if (isEmpty()) {throw new IllegalStateException("Queue is Empty.");}
		Object temp= arr[f];
		if(f==n-1) {f=0;}
		else {f++;}
		count--;
		return temp;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(count==0)
			return true;
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

}
