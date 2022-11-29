package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Calculator.Calculation;

/**
 * Класс для тестирования абстрактного класса Calculation.
 */
public class CalculationTest {
	
	/** Количество. */
	private int amount;
	
	/** Цена. */
	private int cost;
	
	/** Надбавка. */
	private int allowance;
	
	/** Ожидаемый результат. */
	private int resultExpected;
	
	/**
	 * Метод задает переменные перед тестом.
	 */
	@Before
	public void setUp() {
		resultExpected = 1540;
		amount = 54;
		cost =10;
		allowance =1000;
	}
	
	/**
	 * Тест, вызывает метод вычисления заработной платы до вычета налога и<br>
	 * сравнивает полученный результат с ожидаемым.
	 */
	@Test
	public void test() {
		Calculation.calcNetSalary(amount,cost,allowance);
		assertEquals(Calculation.netSalary,resultExpected);
	}

}
