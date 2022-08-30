package ru.baib.ya;

import java.io.*;
import java.util.*;

public class Alice {

    List<Character> alphabet = new ArrayList<>();

    public Alice() {
        for (int i = 97; i < 123; i++) {
            alphabet.add((char) i);
        }
        alphabet.add(' ');
    }

    public String convert(List<Integer> nums) {
        int temp = 0;
        StringBuilder res = new StringBuilder();
        for (Integer num: nums) {
            int e = extract(temp, num);
            res.append(alphabet.get(e));
            temp = num;
        }
        return res.toString();
    }

    private int extract(int temp, int num) {
        int res = 0;
        String temps = String.format("%32s", Integer.toBinaryString(temp)).replace(' ', '0');
        String nums = String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');
        for (int i = nums.length() - 1; i > 0; i--) {
            if (temps.charAt(i) == nums.charAt(i)) {
                res++;
            } else {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        br.readLine();
        String[] strings = br.readLine().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String str: strings) {
            nums.add(Integer.parseInt(str));
        }
        Alice alice = new Alice();
        String res = alice.convert(nums);
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        bw.write(res);
        bw.flush();
    }
}

