
/*
문제
꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!

입력
첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.

출력
A+B+C의 값을 출력한다.

예제 입력 1
77 77 7777
예제 출력 1
7931

*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum;
        long result = 0;
        try {
            for(int i =0; i<3; i++){
                sum = sc.nextLong();
                result += sum;
            }
            System.out.println(result);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}