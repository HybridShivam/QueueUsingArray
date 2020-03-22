public class QueueUsingArrayO1 {
    int[] data;
    int rear;
    int front;
    int noOfElements;

    public QueueUsingArrayO1(int size){
        data=new int[size];
        rear=0;
        front=0;
        noOfElements=0;
    }

    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue Full !!!");
        }
        else {
            rear=rear%data.length;
            data[rear] = element;
            rear++;
            noOfElements++;
        }
    }

    private boolean isFull() {
        if(noOfElements==data.length){
            return true;
        }
        else{
            return false;
        }
    }

    public int dequeue(){
        int res=0;
        if(isEmpty()){
            System.out.print("Delete : Queue Empty !!! ");
        }
        else{
            front=front%data.length;
            res=data[front];
            front++;
            noOfElements--;
        }
        return res;
    }

    private boolean isEmpty() {
        if(noOfElements==0){
            return true;
        }
        else
            return false;
    }

    public int front(){
        if(isEmpty()){
            System.out.print("Queue Empty !!! ");
            return 0;
        }
        return data[front%data.length];
    }
    public int rear(){
        if(isEmpty()){
            System.out.print("Queue Empty !!! ");
            return 0;
        }
        return data[rear-1];
    }

    public void Display(){
        if(isEmpty()){
            System.out.println("Display : Queue Empty !!!");
        }
        else {
            //front=front%data.length;
            //rear=rear%data.length;
            if(rear>front) {
                for (int i = front; i < rear; i++) {
                    System.out.print(data[i]);
                    if (i != rear - 1) {
                        System.out.print("<---");
                    }
                }
            }
            else{
                for (int i = front; i < data.length; i++) {
                    System.out.print(data[i]);
                    System.out.print("<---");
                }
                for (int i = 0; i < rear; i++) {
                    System.out.print(data[i]);
                    if (i != rear - 1) {
                        System.out.print("<---");
                    }
                }
            }
            System.out.println();
        }
    }
//    public boolean traverse(){
//
//    }


    public static void main(String[] args) {
        int queueSize=4;
        System.out.println("QueueSize "+queueSize);
        QueueUsingArrayO1 queue=new QueueUsingArrayO1(queueSize);
        queue.Display();
        System.out.println("Adding 5 Elements");
        queue.enqueue(1);queue.Display();
        queue.enqueue(2);queue.Display();
        queue.enqueue(3);queue.Display();
        queue.enqueue(4);queue.Display();
        queue.enqueue(5);queue.Display();
        System.out.println("Front Element "+queue.front());
        System.out.println("Rear Element "+queue.rear());
        System.out.println("Deleted "+queue.dequeue());
        System.out.println("Deleted "+queue.dequeue());
//        System.out.println("Deleted "+queue.dequeue());
//        System.out.println("Deleted "+queue.dequeue());
//        System.out.println("Deleted "+queue.dequeue());
//        System.out.println("Deleted "+queue.dequeue());
        System.out.println("Front Element "+queue.front());
        System.out.println("Rear Element "+queue.rear());
        queue.Display();
        System.out.println("Deleted "+queue.dequeue());
        System.out.println("Deleted "+queue.dequeue());
        System.out.println("Deleted "+queue.dequeue());
        System.out.println("Deleted "+queue.dequeue());
        queue.Display();
        queue.enqueue(10);queue.Display();
        queue.enqueue(20);queue.Display();
        queue.enqueue(30);queue.Display();
        queue.enqueue(40);queue.Display();
        System.out.println("Front Element "+queue.front());
        System.out.println("Rear Element "+queue.rear());
        queue.enqueue(50);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(60);
        queue.enqueue(70);
        queue.Display();
        System.out.println("Front: "+queue.front());
        System.out.println("Rear: "+queue.rear());
    }
}
