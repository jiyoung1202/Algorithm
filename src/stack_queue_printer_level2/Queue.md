### 큐 구현 클래스

- priorityQueue
  - PIPO(Priority-in, Priority-Out)
  - 정렬된 순서에 의해 반복
  - null요소를 허용하지 않음
- priorityBloackingQueue
  - Priority Queue의 동기화된 버전
  - 동기화 메소드 보유
  - PriorityQueue보다 느린 속도
  - null 요소를 허용하지 않음
- LinkedKist
  - 끝에 요소 추가 용이
  - List인터페이스 구현
  - 요소에 null 허용

#### LinkedList 클래스

```java
import java.util.LinkedList;
import java.util.Queue;

public class Test{
    public static void main(String[] args){
        Queue <String> queue = new LinkedList<String>();
        queue.add("JAVA");
        queue.add("SCRIPT");
        queue.add("JSP");
        
        while(!queue.isEmpty()){
            system.out.println(queue.remove());
        }
    }
}
```



#### PriorityQueue 클래스

```java
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test{
    public static void main(String[]args){
        Queue<String>queue = new PriorityQueue<String>(10,mycmp());
        
        queue.add("JAVA");
        queue.add("SCRIPT");
        queue.add("JSP");
        
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}

class mycmp implements Comparator <String>{
    public int compare(String s1, String s2){
        return s2.compareTo(s1);
    }
}
```

