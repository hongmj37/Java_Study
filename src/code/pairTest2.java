package code;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class pairTest2 {
    public static void main(String[] args) {
        int bufferSize = 3;
        int capacities = 15;
        int[] documents = new int[]{7, 4, 5, 6, 8};

        int output = queuePrinter(bufferSize, capacities, documents);
        System.out.println(output);
    }
    public static int queuePrinter(int bufferSize, int capacities, int[] documents) {
        Queue<Integer> queue = new LinkedList<>();
        int time = 0;
        for(int i = 0; i < bufferSize; i++) {
            queue.add(0);
        }
        queue.poll();
        queue.add(documents[0]);
        time++;
        documents = Arrays.copyOfRange(documents, 1, documents.length);

            for (int i = 0; i <documents.length; i++) {
                if(queue.size()>=bufferSize){
                    queue.poll();
                    time++;
                }
                int start = documents[i];
                queue.add(start);

                if(documents.length-1 != i) {
                    int value = 0;
                    value+=documents[i];

                        int next = documents[i + 1];

                        if (value + next > capacities) {
                            queue.add(0);
                        }
                }
                time++;
            }
        return time;
    }
}
