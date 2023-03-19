import java.util.LinkedList;

public class twoTask {
    public static void main(String[] args) throws Exception {
            String str1 = new String("3");
            String str2 = new String("2");
            String str3 = new String("1");
            LinkedList<String> lst = new LinkedList<>();
            lst.add(str1);
            lst.add(str2);
            lst.add(str3);
            System.out.println(lst);
            lst = reversLst(lst);
            System.out.println(lst);
    }

    public static LinkedList<String> reversLst(LinkedList<String> llist) {
        LinkedList<String> lst = new LinkedList<String>();
        for (int i = llist.size() - 1; i >= 0; i--) {
            lst.add(llist.get(i));
        }
        return lst;
    }
}