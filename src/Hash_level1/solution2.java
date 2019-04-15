package Hash_level1;
import java.util.*;

class solution2 {
    public String solution(String[] participant, String[] completion) {
    Arrays.sort(participant); // 참가자 이름 순 정렬
    Arrays.sort(completion); // 완주자 이름 순 정렬
    int i;
    for ( i=0; i<completion.length; i++){//참가자의 이름은 다 소문자로 되어있고
        // completion의 길이가 participant의 길이보다 무조건 1작다는 조건이 있기 때문에
        // 철자 한개씩의 비교가 가능하다.
        if (!participant[i].equals(completion[i])){ //철자가 달라지는 순간의 사람이름이 완주하지 못한 사람을 의미한다.
            return participant[i];
        }
    }
    return participant[i]; //완주하지 못한 사람 출력
}
}