import String_3.countYZ;
import String_3.equalIsNot;
import String_3.withoutString;

public class Main {

    public static void main(String[] args) {

        System.out.println("countYZ: Считает 'y' и 'z' в конце слова в строке \"y2bz !!day--yaz!! DAY abc XYZ\"");
        System.out.println(new countYZ().start("y2bz !!day--yaz!! DAY abc XYZ"));
        System.out.println();

        System.out.println("withoutString: Удаляет из строки \"MkjtMkx\" строку \"Mk\"");
        System.out.println(new withoutString().start("MkjtMkx", "Mk"));
        System.out.println();

        System.out.println("equalIsNot: Считает равно ли кол-во \"is\", кол-ву \"not\" в строке \"noisxxnotyynotxisi\"");
        System.out.println(new equalIsNot().start("noisxxnotyynotxisi"));
        System.out.println();
    }

}
