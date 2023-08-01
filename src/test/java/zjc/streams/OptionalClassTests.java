package zjc.streams;

import org.junit.jupiter.api.Test;
import zjc.misc.OptionalClass;

public class OptionalClassTests {

    OptionalClass optionalClass = new OptionalClass();

    @Test
    public void withoutOptionalExample01() {
        optionalClass.withoutOptionalExample01();
    }

    //@Test
    @Test
    public void withOptionalExample01() {
        optionalClass.withOptionalExample01();
    }

    @Test
    public void filterWithMap() {
        optionalClass.filterWithMap();
    }

    @Test
    public void filterWithFlatMap() {
        optionalClass.filterWithFlatMap();
    }

    @Test
    public void filterWithOptionalStream() {
        optionalClass.filterWithOptionalStream();
    }
}
