package Tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import Calculator.Main_GUI;

/**
 * Класс, тестирующий наличие заголовка в основной форме.
 */
public class Main_GUItest {
	
	/** Заголовок */
	private String title;
    
    /**
     * Метод, задающий заголовок перед тестированием.
     */
    @Before
    public void setUp() {
        title = "Заголовок";
    }
    
    /**
     * Тест, создает основную форму, передает заголовок, затем проверяяет его наличие.
     */
    @Test()
    public void test() {
        //Проверка заголовка
        Main_GUI gui = new Main_GUI(title);
        assertEquals(gui.getFrame().getTitle(), title);
    }

}