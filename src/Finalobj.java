import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Finalobj {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        List<String> strings = Collections.unmodifiableList(list);
        list.add("dsad");
        list.add("dsasd");
        list.add("dsadw");
        list.add("dsaad");
        System.out.println(strings.get(2));

    }

}
