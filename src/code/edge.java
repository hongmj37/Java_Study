package code;

import java.util.Arrays;

public class edge implements Comparable<edge>{
    public Integer distance;
    public String vertex;

    public edge(Integer distance, String vertex){
        this.distance = distance;
        this.vertex = vertex;
    }

    @Override
    public int compareTo(edge e){
        return this.distance - e.distance;  //반대로 하면 내림차순
    }

    public static void main(String[] args) {
        edge edge1 = new edge(60, "A");
        edge edge2 = new edge(10, "A");
        edge edge3 = new edge(50, "A");
        edge[] edges = new edge[]{edge1, edge2, edge3};
        Arrays.sort(edges);
        for (int i = 0; i < edges.length; i++){
            System.out.println(edges[i].distance);
        }
    }
}




