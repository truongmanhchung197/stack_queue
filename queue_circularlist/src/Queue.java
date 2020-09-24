public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(int data) {
        Node temp = new Node(data);
        if (this.front == null) {
            this.front = this.rear = temp;
        } else {
            this.rear.link = temp;
            this.rear = temp;
            this.rear.link = this.front;
        }
    }

    public void deQueue() {
        if (this.front == null) {
            System.out.println("null");
        } else {
            if (this.front == this.rear) {
                this.front = null;
                this.rear = null;
            } else {
                this.front = this.front.link;
                this.rear.link = this.front;
            }
        }
    }

    public void displayQueue(Queue queue) {
        while (queue.front != queue.rear) {
            System.out.println(queue.front.data);
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
        System.out.println(queue.front.data);
    }

}
