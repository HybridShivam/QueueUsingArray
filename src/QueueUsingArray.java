public class QueueUsingArray {
    int[] data;
    int rear;
    int front;
    int noOfElements;

    public QueueUsingArray(int size){
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
            System.out.print("Queue Empty !!! ");
        }
        else{
            res=data[front];
            for (int i = 0; i < rear-1; i++) {
                data[i]=data[i+1];
            }
            rear--;
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
        return data[front];
    }

    public void Display(){
        if(isEmpty()){
            System.out.println("Display : Queue Empty !!!");
        }
        else {
            for (int i = front; i < rear; i++) {
                System.out.print(data[i]);
                if (i != rear - 1) {
                    System.out.print("--->");
                }
            }
        }
    }
//    public boolean traverse(){
//
//    }


    public static void main(String[] args) {
        int queueSize=10;
        System.out.println("QueueSize "+queueSize);
        QueueUsingArray queue=new QueueUsingArray(queueSize);
        System.out.println("Adding 5 Elements");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("Deleted "+queue.dequeue());
        System.out.println("Deleted "+queue.dequeue());
//        System.out.println("Deleted "+queue.dequeue());
//        System.out.println("Deleted "+queue.dequeue());
//        System.out.println("Deleted "+queue.dequeue());
//        System.out.println("Deleted "+queue.dequeue());
        System.out.println("Front Element "+queue.front());
        queue.Display();
    }
}
