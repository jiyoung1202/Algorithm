package Sort_level1;
import java.util.Arrays;
public class solution2 {
    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length]; //commands 길이에 해당하는 크기만큼 배열생성 여기서는 3이다.
        int [] temp = {};//임시로 저장될 temp 배열 생성

        for (int i=0; i< commands.length; i++){
            temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);//1을 빼는 이유는 배열은 0부터 시작하기 때문
            // 번호 2부터 자르는 경우라면, 배열번호 1번인곳부터 잘라지기 때문이다.
            //copyOfRange() 메소드는 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 봔환한다.
            //첫번째 매개변수로 복사의 대상이 될 원본 배열을 전달 받는다.
            //두번째 매개변수로 원본 배열에서 복사할 시작 인덱스를 전달받고,
            //세 번째 매개변수로 마지막으로 복사될 배열 요사의 바로 다음 인덱스를 전달받는다. 즉. 세번째 매개변수로 전달된 인덱스 바로전까지의 배열요소까지만 복사된다.

            Arrays.sort(temp); //정렬함.
            answer[i]=temp[commands[i][2]-1]; //commands[i][2] 위치의 원소의 위치가 마지막 결과이기 때문에 answer 배열에 저장

        }
        return answer;// 정답출력
    }

}
