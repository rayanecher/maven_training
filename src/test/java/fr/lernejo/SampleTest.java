package fr.lernejo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

class SampleTest {

    private final Sample sample = new Sample();

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "-4, -5, -9"
    })

    void super_test_1(int a, int b, int expectedResult) {
        int result = sample.op(Sample.Operation.ADD,a ,b);
        assertThat(result).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource({
        "4, 5, 20",
        "-4, 5, -20"
    })
    void super_test_2(int a, int b, int expectedResult) {
        int result = sample.op(Sample.Operation.MULT,a ,b);
        assertThat(result).isEqualTo(expectedResult);
    }
}
