package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BFSTest {

    public ArrayList<String> bfsFunc(HashMap<String, ArrayList<String>> graph, String startNode){
        ArrayList<String> visited = new ArrayList<String>();
        ArrayList<String> needVisit = new ArrayList<String>();

        needVisit.add(startNode);

        while(needVisit.size() > 0 ){ //needVisit에 아무런 값이 없을때까지 (더이상 방문할 값이 없을 때까지)
            String node = needVisit.remove(0); //첫 번재 값을 visit으로 보내주기 위함

            if(!visited.contains(node)) {  //아직 노드를 방문하지 않았다면
                visited.add(node); //해당 노드를 방문해라
                needVisit.addAll(graph.get(node));  //그리고 방문필요에 해당 노드와 연결된 노드들을 쭈르륵 나열
            }
    }
        return visited;
 }

    public static void main(String[] args) {
        BFSTest bfs = new BFSTest();
        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();
        graph.put("A", new ArrayList<String>(Arrays.asList("B", "C")));
        graph.put("B", new ArrayList<String>(Arrays.asList("A", "D")));
        graph.put("C", new ArrayList<String>(Arrays.asList("A", "G", "H", "I")));
    }
    }

