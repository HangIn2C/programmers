package lv0;

//PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다.
//알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다.
//
//spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1,
//존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.

class Solution32 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (int i=0; i<dic.length; i++) {            
            for(int j=0; j<spell.length; j++) {
                if (dic[i].contains(spell[j]) == false) break;
                if (j==spell.length-1) answer = 1;
            }
        }
        System.out.println(answer);
        return answer;
	} // solution
} // class

public class p32_Alien_Dictionary {

	public static void main(String[] args) {
		Solution32 solution = new Solution32();
		solution.solution(new String[]{"p", "o", "s"}, new String[]{"sod", "eocd", "qixm", "adio", "soo"});
		solution.solution(new String[]{"z", "d", "x"}, new String[]{"def", "dww", "dzx", "loveaw"});
	} // main

} // class