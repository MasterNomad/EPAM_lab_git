import String_3.countYZ;
import String_3.equalIsNot;
import String_3.gHappy;
import String_3.withoutString;

public class Main {

    public static void main(String[] args) {

        String str1;
        String str2;

        str1 = "y2bz !!day--yaz!! DAY abc XYZ";
        System.out.printf("countYZ: Считает 'y' и 'z' в конце слова в строке \"%s\"%n", str1);
        System.out.println(new countYZ().start(str1));
        System.out.println();

        str1 = "MkjtMkx";
        str2 = "Mk";
        System.out.printf("withoutString: Удаляет из строки \"%s\" строку \"%s\"%n", str1, str2);
        System.out.println(new withoutString().start(str1, str2));
        System.out.println();

        str1 = "noisxxnotyynotxisi";
        System.out.printf("equalIsNot: Считает равно ли кол-во \"is\", кол-ву \"not\" в строке \"%s\"%n", str1);
        System.out.println(new equalIsNot().start(str1));
        System.out.println();

        str1 = "gxxgggxygg";
        System.out.printf("gHappy: Проверяет все ли 'g' парные в строке  \"%s\"%n", str1);
        System.out.println(new gHappy().start(str1));
        System.out.println();
    }

}
