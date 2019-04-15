package Sort_level1;
import java.util.Arrays;
public class solution1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; //answer의 원소의 개수는 길이와 일치

        for(int i = 0; i<commands.length; i++){
            System.out.println("commands:"+ Arrays.toString(commands[i]));
            int first = commands[i][0];
            int second = commands[i][1];
            int third = commands[i][2];
            int temp[] = new int[second - first +1]; //잘라서 저장할 temp 만듬

            int l = 0;
            for(int j = first -1; j < second; j++){ // 잘라서temp에 저장..
                System.out.println(array[j]);
                temp[l] = array[j]; //temp저장....
                l++;
            }
            Arrays.sort(temp);
            answer[i] = temp[third-1];
        }

        return answer;
    }
}



