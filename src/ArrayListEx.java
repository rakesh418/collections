import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,0);
        arrayList.add(1,1);
        arrayList.add(4);
        arrayList.add(3);
        System.out.println(arrayList);

        FileOutputStream fos = new FileOutputStream("fos");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(arrayList);
        oos.close();
        fos.close();
        System.out.println(oos);
    }
}
