/* 큐 */

import java.util.LinkedList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> Queue = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
        String a = null;
        boolean check = true;

        while (check) {
            a = scanner.next();
            if (!a.equals("X")) {
                Queue.add(a);
            } else {
                check = false;
            }
        }
        check = true;
        while (check) {
            a = scanner.next();
            if (a.equals("X")) {
                check = false;
            } else if(Queue.isEmpty()) {
                System.out.println("리스트가 비어있습니다");
            } else if (a.equals("pop")) {
                Queue.remove(Queue.get(0));
            } else if (a.equals("print")) {
                System.out.println(Queue);
            } else if (a.equals("peek")) {
                System.out.println(Queue.get(Queue.size() - 1));
            }
        }
    }
}
