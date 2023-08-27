
/*
문제
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

출력
입력으로 주어진 숫자 N개의 합을 출력한다.

예제 입력 1
1
1
예제 출력 1
1
예제 입력 2
5
54321
예제 출력 2
15
예제 입력 3
25
7000000000000000000000000
예제 출력 3
7
예제 입력 4
11
10987654321
예제 출력 4
46

*/
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String arrays = scanner.next(); // 스트링으로 변환
        char arrayc[] = arrays.toCharArray(); // 스트링을 캐릭터로 변환 후 배열에 집어넣음

        int result = 0;

        for (int i = 0;i<arrayc.length;i++){
            result += arrayc[i] - '0'; // arrayc[i] - '0' 아스키 코드로 정수로 변환
        }
        System.out.println(result);

    }
}
