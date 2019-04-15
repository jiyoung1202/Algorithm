package Hash_level2;
import java.util.Arrays;

public class solution1 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        //String temp="";
        Arrays.sort(phone_book); //정렬함으로서 가장 짧은 번호가 맨 앞에 오도록 하여 비교를 용이하게 한다.
        for(int i=0; i< phone_book.length-1; i++) {
            for (int j = i+1; j < phone_book.length; j++) {
                if (phone_book[j].startsWith(phone_book[i])) {//startWith함수를 이용하여 탐색
                    //이때 startsWith뒤에 있는 것이 비교대상접두어
                    //0-1,2,3.../1-2,3,... 비교
                    answer = false;
                    return answer;//비교해서 같으면 바로 return 해버림
                }
            }
        }
        //return true;
        return answer;
    }
}
