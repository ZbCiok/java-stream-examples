package zjc.misc;

import java.util.Optional;

// java11+
public class OptionalVsExceptions {
    public void optionalsToAvoidNullPointerException() {
        Number x = null;
        String b = "hi there";

        var opt = Optional.ofNullable(x)
                .map(y -> y.toString())
                .map(str -> str.toLowerCase())
                .map(lower -> lower.toUpperCase())
                .orElse(null);

        System.out.println(opt);

        var opt2 = Optional.ofNullable(b)
                .map(y -> y.toString())
                .map(str -> str.toLowerCase())
                .map(lower -> lower.toUpperCase())
                .orElse(null);
        //assertThat(opt2).isEqualTo("HI THERE");
        System.out.println(opt2);


    }
}
