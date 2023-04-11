package level0;

public class Programmers_문자반복출력하기 {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            char tmp = my_string.charAt(i);
            for(int j = 0; j < n; j++){
                answer += tmp;
            }
        }
    return answer;
}
}
