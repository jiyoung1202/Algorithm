package BruteForceSearch_level1;
import java.util.ArrayList;
//ArrayList 공부해야할 듯...!!

public class solution1 {
    public int[] solution(int[] answers) {
        //int[] answer = {};
        int [][] pattern ={
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };//수포자 답 찍는 패턴 입력

        int [] correct = new int[3];
        for(int i= 0; i<answers.length; i++){ //패턴 반복해서 수포자학생들의 답을 만든다.
            if (pattern[0][i%5]==answers[i]){ //5개씩 반복
                correct[0] +=1;//정답 맞을 때마다, 첫번째 학생 점수 배열에 1을 더함
            }
            if (pattern[1][i%8]==answers[i]){ //답찍는 패턴 8개씩 반복
                correct[1] +=1; //점수 증가
            }
            if(pattern[2][i%10]==answers[i]){
                correct[2] +=1; // 점수 증가
            }
        }

        int max = correct[0];//첫번째 학생의 점수를 최댓값이라고 일단 초기화
        for(int j=0; j<correct.length; j++){ //최대 점수 맞추기
            if (max < correct[j]){ //최댓값이 새로운 학생의 점수보다 작으면
                max = correct[j]; //새로운 학생의 점수를 최댓값으로 갱신한다.
            }
            System.out.println(max);
        }

        ArrayList<Integer> answerlist = new ArrayList<Integer>();
        for(int k=0; k<correct.length; k++){ //최대점수 수포자 출력
            if(correct[k] == max){
               System.out.println(k+1);
               answerlist.add(k+1);//동적인 배열사용위해 Arraylist 만들어야한다는 판단
            }

        }
        int[] answer = new int[answerlist.size()];
        for(int l=0; l < answer.length; l++){ //ArrayList를 배열로 변경하는 for문
            answer[l] = answerlist.get(l);
        }


        return answer;
    }
}
