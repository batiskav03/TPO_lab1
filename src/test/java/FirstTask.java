import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import src.first_task.Sec;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTask {
    @ParameterizedTest()
    @DisplayName("Check PI dots")
    @ValueSource(doubles = {-2 * Math.PI, -1.75 * Math.PI, -1.25 * Math.PI, -Math.PI, -0.75 * Math.PI, 0,
            0.75 * Math.PI, Math.PI, 1.25 * Math.PI, 1.75 * Math.PI, 2 * Math.PI})
    void checkPiDots(double param) {
        Sec secCalc = new Sec();
        assertAll(
                () -> assertEquals(1.0 / Math.cos(param), secCalc.calc(param, 100), 0.0001)
        );
    }

    @ParameterizedTest
    @DisplayName("Check dots close to discontinuities")
    @ValueSource(doubles = {0.5 * Math.PI - 0.00001, 0.5 * Math.PI + 0.00001})
    void checkDiscontinuities(double param) {
        Sec secCalc = new Sec();
        assertAll(
                () -> assertEquals(1.0 / Math.cos(param), secCalc.calc(param, 100), 0.0001)
        );
    }
}
