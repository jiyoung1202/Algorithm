package DFS_BFS_level2;
//dfs를 통해 깊이 우선 탐색을 한다.
// 연산과정을 하나의 트리로 생각해 볼때, + 연산은 왼쪽 자식 노드로 '-'연산은 오른쪽 자식 노드로 내려가는 과정을 재귀 메소드를 이용.
//재귀함수를 사용하여 간단히 구현함.
public class solution1 {
    static int answer=0;
    public int solution(int[] numbers, int target) {
        dfs(target,numbers,0);//첫 루트노드는 0이되어야함.
        return answer;
    }
    public void dfs(int target,int [] numbers, int k){
        if(k==numbers.length){ //가지 뻗힌 개수가 노드와 동일해지면 합구하기 시작함.
            int sum=0;
            for(int i=0;i<numbers.length; i++){
                sum +=numbers[i]; //숫자 더함.
            }
            if(sum== target) answer++; //합이 타겟넘버랑 동일하면 답 증가.
            return;
        }else{//동시에 양쪽으로 가지를 뻗는다.
            //한쪽은 + 한쪽은 -로 재귀함수 이용해서 동시에 두갈래 가지 침
            numbers[k]*=1;//numbers[k]=numbers[k]*1
            dfs(target,numbers,k+1);

            numbers[k]*=-1;
            dfs(target,numbers,k+1);
        }
    }
}
