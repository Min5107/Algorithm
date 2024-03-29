/*
선택 정렬

문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

예제 입력 1
5
5
4
3
2
1
예제 출력 1
1
2
3
4
5
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        // 입력
        for (int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        // 로직
        for(int i = 0; i<arr.length; i++){
            int minarr = i;
            int min = arr[i];
            // 최소값 찾기
            for(int j = i; j<arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    minarr = j;
                }
            }
            // 교환
            int tmp = arr[i];
            arr[i] = arr[minarr];
            arr[minarr] = tmp;
        }

        // 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
