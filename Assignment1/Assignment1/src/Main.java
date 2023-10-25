import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> animal = new LinkedList<>();
        LinkedListADT.AddElement(animal);
        LinkedListADT.AddElementWithIndex(animal,0,"Tiger");
        LinkedListADT.getElementByIndex(animal,2);
        LinkedListADT.scanElementLinkedList(animal);

        Stack<Integer> numbers = new Stack<>();
        StackADT.stackPush(numbers);
        StackADT.stackPop(numbers);
        StackADT.stackPeek(numbers);
        StackADT.stackSearch(numbers, 2);
        StackADT.checkEmptyStack(numbers);


        Queue<String> fruit = new LinkedList<>();
        QueueLinkedListADT.queueAdd(fruit);
        Queue<Integer>number = new LinkedList<>();
        QueueLinkedListADT.queueOffer(number);
        QueueLinkedListADT.queuePeek(number);
        QueueLinkedListADT.queuePoll(number);


        int[] randomNumber = {100,3,1,20,5,4};
        BubbleSortALU.bubbleSort(randomNumber, randomNumber.length);
        BubbleSortALU.printResult(randomNumber);


        int[] randomNumbers2 = {100,3,1,20,5,4};
        insertionSort.insertionSort(randomNumbers2);
        insertionSort.printResult(randomNumbers2);

        int[] randomNumbers3 = {100,3,1,20,5,4};
        selecttionSortALU.selectionSort(randomNumbers3);
        selecttionSortALU.printResult(randomNumbers3);


        int [] randomNumbers4 = {100,3,1,20,5,4};
        MergeSortALU.sort(randomNumbers4,0,randomNumbers4.length-1);
        MergeSortALU.printResult(randomNumbers4);
        }
    }
