package summercoding2017_primenumber;

public class solution1 {
    public int solution(int[] nums) {
        int answer = -1;
        boolean isPrime=true;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int number = nums[i]+nums[j]+nums[k];
//                    System.out.println(number);
                    int l=2;
                    while(l<number){
//                    for(int l=2; l<number; l++){
                        if(number % l ==0) {
                            System.out.println(l+"로 나눕니다.");
                            isPrime = false;
                            System.out.println(number + "는 소수가 아닙니다.");
                            break;
                        }
                        l++;
//                        else{
//                            System.out.println(number+ "는 소수 입니다.");
//                            count++;
//                            System.out.println(count);
//                            answer = count;
//                            break;
//                        }
                    }
                    if(isPrime==true){
                        answer++;
                        System.out.println("---------");
                    }

                }
            }
        }

        return answer;
    }
}
