package stack_queue_printer_level2;
import javax.print.Doc;
import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Document{
    int idx;
    int priority;
    public Document(int idx, int priority){
        this.idx = idx;
        this.priority = priority;
    }
}

public class solution1 {
    public int solution(int[] priorities, int location) {
        int answer =1;
        LinkedList <Document> list = new LinkedList<Document>();
        for(int i = 0; i<priorities.length; i++){
            list.add(new Document(i, priorities[i]));
        }
        Document firstDoc = null;

        while(list.size()>1){
            firstDoc = list.getFirst();
            for(int j=0; j<list.size(); j++){
                if(firstDoc.priority< list.get(j).priority){
                    list.addLast(firstDoc);
                    list.removeFirst();
                    break;
                }
            }
        }
//        PriorityQueue queue = new PriorityQueue<>(Collection.reverseOrder());
//
//        for(int task : priorities)
//            queue.add(task);
//
//        while(!queue.isEmpty()){
//            for(int i=0; i<priorities.length; i++){
//                if (priorities[i]==queue.peek()){
//
//                }
//            }
//        }
        return answer;
    }
}