package lv0;

//영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
//문자열 numbers가 매개변수로 주어질 때,
//numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

class Solution15 {
    public long solution(String numbers) {
        long answer = 0;
        String ss;
        
        ss = numbers.toLowerCase()
        					.replace("one", "1")
        				    .replace("two", "2")
					        .replace("three", "3")
					        .replace("four", "4")
					        .replace("five", "5")
					        .replace("six", "6")
					        .replace("seven", "7")
					        .replace("eight", "8")
					        .replace("nine", "9")
					        .replace("zero", "0");
        System.out.println(ss);
        return answer = Long.parseLong(ss);
	} // solution
} // class

public class p15_hate_english {

	public static void main(String[] args) {
		Solution15 solution = new Solution15();
		solution.solution("onetwothreefourfivesixseveneightnine");
		solution.solution("onefourzerosixseven");
	} // main

} // class
