import java.util.*;

public class oneTask {
    public static void main(String[] args) {
        String str = "";
        List<String> lst = new ArrayList<>();
        while (!str.equals("exit")) {
            System.out.println("--------------------------------------------" +
                    "\nМеню\n add: добавить запись\n print: печать списка\n revert: удалить последнюю запись\n exit: выход"
                    + "\n--------------------------------------------");
            System.out.println("");
            Scanner in = new Scanner(System.in);
            str = in.nextLine();
            if (str.equals("print")) {
                printLst(lst);
            } else if (str.equals("add")) {
                System.out.print("\nВведите запись: ");
                String newStr = in.nextLine();
                record(lst, newStr);
            } else if (str.equals("revert")) {
                revert(lst);
            } else if (str.equals("exit")) {
                in.close();
                System.out.println("\nПока!");
            } else {
                System.out.println("\nОшибка ввода, попробуй еще...");
            }

        }
    }

    private static void printLst(List<String> lst) {
        if (lst.size() != 0) {
            int reversLst = lst.size() - 1;
            for (int i = reversLst; i >= 0; i--) {
                System.out.println("\n" + lst.get(i));
            }
        } else {
            System.out.println("Ошибка, список пустой. Сначала добавь запись...");
        }
    }

    private static List<String> record(List<String> lst, String str) {
        lst.add(str);
        return lst;
    }

    private static List<String> revert(List<String> lst) {
        int lastEl = lst.size() - 1;
        String lastRecord = lst.get(lst.size() - 1);
        lst.remove(lastEl);
        System.out.println("Запись - " + lastRecord + " удалена");
        return lst;
    }
}