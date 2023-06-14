package Programmers.level1;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 1) {
                answer += i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        나머지가1이되는수찾기 num = new 나머지가1이되는수찾기();
        int solution = num.solution(12);
        System.out.println(solution);
    }

}
