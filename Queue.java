
public class Queue {

	int capacity;
	int front,rear,size;
	Object arr[];
	
	Queue(int kapasite)
	{
		this.capacity=kapasite;
		this.front=this.size=0;
		rear=capacity-1;
		arr= new Object[capacity];
	}
	
	boolean isEmpty(Queue kuyruk)
	{
		if(kuyruk.size==0) {
			return true;
		}
			
			else {
					return false;
			}
			
	}

	boolean isFull(Queue kuyruk)
	{
		if(kuyruk.size==kuyruk.capacity) {
			return true;
		}
		else {
			return false;
		}
	}

    void Enqueue(Object eleman)
    {
    	if(isFull(this)) {
    		System.out.println("Kuyruk doludur!");
    	}
    	else {
    		this.rear=(this.rear+1)%this.capacity;
    		this.arr[this.rear]=eleman;
    		this.size++;
    	}
    }

    String Dequeue()
    {
    	if(isEmpty(this))
    	{
    		return "Kuyruk boş";
    	}
    	else {
    		String temp= this.arr[this.front].toString();
    		
    		this.size=this.size-1;
    		this.front = (this.front+1)/this.capacity;
    		
    		return temp;
    		
    	}
    }

    String front()
    {
    	if(isEmpty(this))
    	{
    		return "Kuyruk boş!";
    	}
    	else {
    		
    		return arr[this.front].toString();
    	}
    }

    String rear()
    {
    	if(isEmpty(this))
    	{
    		return "Kuyruk boş";
    	}
    	else {
    		return arr[this.rear].toString();
    	}
    }

}
