package com.codegym;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        System.out.print(numbers.push(1)+" ");
        System.out.print(numbers.push(2)+" ");
        System.out.print(numbers.push(3)+" ");
        System.out.print(numbers.push(4)+" ");



        System.out.println();

        //đảo ngược mảng numbers
        System.out.print(numbers.pop() + " ");
        System.out.print(numbers.pop() + " ");
        System.out.print(numbers.pop() + " ");
        System.out.print(numbers.pop() + " ");

        System.out.println();


        // Đảo ngược 1 chuỗi
        Stack<String> stackChuoi = new Stack<String>();

        // stackChuoi.push("giatri") => đưa giá trị vào stack
        // stackChuoi.pop() => lấy giá trị ra, xóa khỏi stack
        // stackChuoi.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
        // stackChuoi.clear(); => xóa tất cả phần tử trong stack
        // stackChuoi.contains("giatri")=> xác định giá trị có tồn tại trong stack hay không
        // stackChuoi.size() => độ lớn của stack

        System.out.println("Nhập vào chuỗi: ");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i) + "");
        }
        System.out.println("Chuỗi đảo ngược: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackChuoi.pop());
        }
        System.out.println();
    }
}
