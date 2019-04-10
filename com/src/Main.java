import array_3.*;
import string_3.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String str1;
        String str2;

        //countYZ
        str1 = "y2bz !!day--yaz!! DAY abc XYZ";
        System.out.printf("countYZ: Считает 'y' и 'z' в конце слова в строке \"%s\"%n", str1);
        System.out.println(new countYZ().start(str1));
        System.out.println();
        System.out.println("Hello");

        //withoutString
        str1 = "MkjtMkx";
        str2 = "Mk";
        System.out.printf("withoutString: Удаляет из строки \"%s\" строку \"%s\"%n", str1, str2);
        System.out.println(new withoutString().start(str1, str2));
        System.out.println();

        //equalIsNot
        str1 = "noisxxnotyynotxisi";
        System.out.printf("equalIsNot: Считает равно ли кол-во \"is\", кол-ву \"not\" в строке \"%s\"%n", str1);
        System.out.println(new equalIsNot().start(str1));
        System.out.println();

        //gHappy
        str1 = "gxxgggxygg";
        System.out.printf("gHappy: Проверяет все ли 'g' парные в строке  \"%s\"%n", str1);
        System.out.println(new gHappy().start(str1));
        System.out.println();

        //maxSpan
        int[] nums = {1, 4, 2, 1, 4, 4, 4};
        System.out.println("maxSpan: Возвращает наибольшее кол-во элементов, между двумя одинаковыми в массиве:" + Arrays.toString(nums));
        System.out.println(new maxSpan().start(nums));
        System.out.println();

        //fix45
        nums = new int[]{5, 5, 4, 1, 4, 1};
        System.out.println("fix45: Выставляет все 5 за 4 в массиве:" + Arrays.toString(nums));
        System.out.println(Arrays.toString(new fix45().start(nums)));
        System.out.println();

        //linearIn
        nums = new int[]{-1, 0, 3, 3, 3, 10, 12};
        int[] nums2 = {-1, 0, 3, 12};
        System.out.println("linearIn: Проверяет все ли элементы второго массива есть в первом (массивы отсортированы):" + Arrays.toString(nums) + " | " + Arrays.toString(nums2));
        System.out.println(new linearIn().start(nums, nums2));
        System.out.println();

        //maxMirror
        nums = new int[]{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9};
        System.out.println("maxMirror: Возвращает длинну наибольшей зеркальной последовательности в массиве" + Arrays.toString(nums));
        System.out.println(new maxMirror().start(nums));
        System.out.println();

    }

    public void vetka() {
        System.out.println("slava");
    }

    public void method1() {
        System.out.println("sdfg");
    }

}
