import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Filter;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    List<Integer> list = new ArrayList<>();

    @Test
    public void testList() {
        list.add(10);
        list.add(8);
        list.add(6);
        list.add(4);
        list.add(2);
        Filter filter = new Filter(6);
        List<Integer> result = filter.filterOut(list);

        int expectedSize = 3;
        int resultSize = result.size();
        Assertions.assertEquals(expectedSize, resultSize);
    }
}
