/* 스택 */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> stack = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String a = null;
        boolean check = true;

        while (check) {
            a = scanner.next();
            if (!a.equals("X")) {
                stack.add(a);
            } else {
                check = false;
            }
        }
        check = true;
        while (check){
            a = scanner.next();
            if (a.equals("X")) {
                check = false;
            } else if (stack.isEmpty()) {
                System.out.println("리스트가 비어있습니다");
            } else if (a.equals("pop")){
                stack.remove(stack.size()-1);
            } else if (a.equals("print")) {
                System.out.println(stack);
            } else if (a.equals("peek")) {
                System.out.println(stack.get(stack.size()-1));
            } else if (a.equals("X")) {
                check = false;
            }
        }
    }
}