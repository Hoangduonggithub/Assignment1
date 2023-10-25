import java.util.Queue;
public class QueueLinkedListADT {
    //add queue
    public static void queueAdd(Queue<String> queue){
        queue.add("apple");
        queue.add("Banana");
        queue.add("cherry");
        queue.add("lemon");
        System.out.println("Queue : "+ queue );
    }
    //offer
    public static void queueOffer(Queue<Integer>queue){
        for (int i = 0; i <= 10; i++){
            queue.offer(i);
        }
        System.out.println("Queue LinkedList : "+queue);
    }
    //peek
    public static void queuePeek(Queue<Integer>queue){
        int accessElement= queue.peek();
        System.out.println("accessElement Queue LinkedList : "+ accessElement);
        System.out.println("Queue LinkedList : "+ queue);
    }
    //poll
    public static void queuePoll(Queue<Integer>queue) {
        int element = queue.poll();
        System.out.println("Queue Poll element : " + element);
        System.out.println("Queue Poll : " + queue);
    }
    public static void queueSearch(Queue<Integer>queue,int value) {
        boolean check = queue.contains(value);
        if (check == false){
            System.out.println(value + " is not found");
        }else {
            System.out.println(value + " is found");
        }

    }
    public static void forQueue(Queue<Integer>queue) {
        for(int i:queue );

    }
}
