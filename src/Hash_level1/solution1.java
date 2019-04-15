package Hash_level1;
import java.util.HashMap;

class solution1 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> participantMap = new HashMap<String, Integer>();
        String answer = "";
        for(String player: participant){ //참가자 list데이터 넣기
            if(participantMap.containsKey(player) == true){ //동명이인 확인해야함.
                int result = participantMap.get(player);
                participantMap.put(player,result+1); //동명이인이 있는경우 value에 숫자를 더해줌.
            } else{
                participantMap.put(player, 1); //value값에 1 입력
            }
        }
        for(String player: completion){ //완주자 데이터 넣기
            int result = participantMap.get(player);
            participantMap.put(player, result-1);//완주한 사람 value 1감소 (이때 핵심은 동명이인의 경우 해시맵이 여러개 생성되는것이 아니라 덮여씌워지는 개념)
            //따라서 동명이인이면
        }

        for(String player:participant){ //완주하지 못한 player 출력
            if(participantMap.get(player) != 0){
                answer = player;
            }
        }
        return answer;
    }
}
