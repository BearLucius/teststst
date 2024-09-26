package edu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ввод название документа: ");
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine();
        System.out.println("Какого типа эта информация?");
        System.out.println("1.Открытая");
        System.out.println("2.Ограниченная");
        Integer vibor = scanner.nextInt();
        if (vibor>2){ System.out.println("Введите доступную цифру с опцией!");}
        else
        if (vibor==1) {
            System.out.println(text);
            System.out.println("Тип данных: Открытый");
        }

        if (vibor==2) {
            System.out.println("Какого типа эта ограниченная информация?");
            System.out.println("1.Открытая");
            System.out.println("2.Закрытая");
            Integer vibor2 = scanner.nextInt();
            if (vibor2>2){ System.out.println("Введите доступную цифру с опцией!");}
            else
            if (vibor2 == 1) {
                System.out.println(text);
                System.out.println("Тип данных: Ограниченный - Открытый");
            }
            if (vibor2 == 2){
                System.out.println(text);
                System.out.println("Тип данных: Ограниченный - Закрытый");
            }
        }
    }
}