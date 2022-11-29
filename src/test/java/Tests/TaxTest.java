package Tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Calculator.Tax;

/**
 * Класс, реализующий проверку вычислений в классе Tax.
 */
public class TaxTest {
    
    /** Ссылка на объект класса Tax. */
    private Tax tax;
    
    /** Количество. */
    private int amount;
    
    /** Стоимость. */
    private int cost;
    
    /** Надбавка. */
    private int allowance;
    
    /** Ожидаемый результат вычисления. */
    private int expectedResult;
    
    /**
     * Метод, задающий переменные вычисления и ожидаемый результат.
     *
     * @throws Exception исключения
     */
    @Before
    public void setUp() throws Exception {
        tax = new Tax(50);
        amount = 1000;
        cost = 500;
        allowance = 2000;
        expectedResult = 251000;
    }

    /**
     * Тест, запускающий метод вычисления налога и сверяющий полученный результат с ожидаемым.
     */
    @Test
    public void test() {
        tax.calcNetSalary(amount, cost, allowance);
        assertEquals(tax.calc(), expectedResult);
    }

}