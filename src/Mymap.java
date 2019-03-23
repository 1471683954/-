import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;

public class Mymap {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        map.put(new String("sd"),10);
        map.put(new String("sd"),20);
        map.put(new String("sds"),20);
        for (String s : map.keySet()) {
            System.out.println(s);
        }
        for (Map.Entry<String, Object> stringObjectEntry : map.entrySet()) {
            System.out.println(stringObjectEntry);
        }
        HashSet set = new HashSet(10);
        set.add(null);
        System.out.println(map);
        HashMap m  = new HashMap();
        Class<? extends HashMap> aClass = m.getClass();
        Method hash = aClass.getDeclaredMethod("hash", Object.class);
        hash.setAccessible(true);
        Object invoke = hash.invoke( m,"adsa");
        System.out.println(invoke);

    }
}
