package lv0;

//프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
//쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고,
//서비스 치킨에도 쿠폰이 발급됩니다.
//시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는
//최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.

class Solution24 {
    public int solution(int chicken) {
        int answer = -1;
        int coupon = -1;
        
        if(chicken == 0) coupon = 0;

        while(true) {
        	if(chicken <= 0) {
        		answer = coupon;
        		break;
        	}
        	chicken -= 10;
        	coupon++;
        	chicken++;
        }
        System.out.println(answer);
        return answer;
	} // solution
} // class

public class p24_chiken_coupon {

	public static void main(String[] args) {
		Solution24 solution = new Solution24();
		solution.solution(100);
		solution.solution(0);
		solution.solution(1081);
		
	} // main

} // class