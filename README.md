last incre

import java.util.Scanner;

class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
         digits[size - 1]++;
         if (digits[0]>= 9) {
            digits = new int[size + 1];
            digits[0] = 1;
        }

        System.out.print("[");
        for (int i = 0; i <= size - 1; i++) {
            System.out.print(digits[i] + ",");
        }
        System.out.println("]");
        return digits;
    }
}
