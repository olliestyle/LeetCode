package ru.baib;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>(); // в set храним множество всех полученных чисел
        while (n != 1) {
            n = sumSquareOfDigit(n); // вычисляем сумму квадратов
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        return true;
    }

    public static int sumSquareOfDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10; // получаем последнюю цифру в числе
            sum += digit * digit;
            n /= 10; // отбрасывем последнюю цифру в числе
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(28));
    }
}

