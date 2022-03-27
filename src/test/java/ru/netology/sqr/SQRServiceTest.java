package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {" `Min Boundary Values`, 99,101,1",
            " `Max Boundary Values`, 9800, 9802,1",
            " `Average Values `, 1000,5000,39",
            " `Not value Min`,0,99,0",
            " `Not value Max`, 9802,1000,0",
            " `Max value counter`,100,9801,90"})
    void showCalculate(String testName, int minNumber, int maxNumber, int factCounter) {
        SQRService calculate = new SQRService();

        int actualCounter = calculate.calculateSQR(minNumber, maxNumber);

        assertEquals(actualCounter, factCounter);
    }

}