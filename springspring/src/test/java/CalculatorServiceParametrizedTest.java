import com.skyproshka.springspring.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorServiceParametrizedTest {
    CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @CsvSource({"5, 5, 10",
            "-5, 5, 0"
    })
    void getSumParamTest(int num1, int num2, int expectedResult) {
        assertEquals(expectedResult, calculatorService.getSum(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5, 0",
            "-5, 5, -10"
    })
    void getSubParamTest(int num1, int num2, int expectedResult) {
        assertEquals(expectedResult, calculatorService.getSub(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 5, 25",
            "2, 3, 6"
    })
    void getMultParamTest(int num1, int num2, int expectedResult) {
        assertEquals(expectedResult, calculatorService.getMult(num1, num2));
    }

    @ParameterizedTest
    @CsvSource({
            "10, 5, 2",
            "9, 3, 3"
    })
    void getDivParamTest(int num1, int num2, int expectedResult) {
        assertEquals(expectedResult, calculatorService.getDiv(num1, num2));
    }
}
