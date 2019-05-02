package summercoding2017_primenumber;

public class solution1 {
    public int solution(int[] nums) {
        int answer = 0;
        boolean isPrime=true;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int number = nums[i]+nums[j]+nums[k];
                    System.out.println(number);
                    int l=2;
                    while(l<number){
                        if(number % l ==0 && number!=2) {
//                            System.out.println(l+"로 나눕니다.");
                            isPrime = false;
//                            System.out.println(number + "는 소수가 아닙니다.");
//                            l++;
                            break;
                        }else{
//                            System.out.println(number+ "는 소수 입니다.");
                            isPrime=true;
                        }
                        l++;
//

                    }  if(isPrime==true){
                        answer++;
//                        System.out.println("---------");
                    }

                }
            }
        }
        return answer;
    }
}
