package code;

import java.util.*;

public class PairTest {
    public static void main(String[] args) {
        Integer[] boxes = new Integer[]{ 5,45,5,0 ,6,5,3};
        int output = paveBox(boxes);
        System.out.println(output); // 3

    }

    public static int paveBox(Integer[] boxes){
        int start = boxes[0];
        Queue<Integer> queue = new LinkedList<>();

        for(int data : boxes){
            queue.add(data);
        }

        for(int i=0; i<boxes.length; i++){
            if(start < queue.peek()){
                break;
            }else{
                queue.poll();
            }
        }
        return boxes.length - queue.size();
    }
}