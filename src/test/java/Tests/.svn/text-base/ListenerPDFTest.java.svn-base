package Tests;

import static org.junit.Assert.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.Before;
import org.junit.Test;

import Calculator.Main_GUI;

/**
 * Класс, тестирующий наличие файла Document.pdf
 */
public class ListenerPDFTest {

	/**
	 * Метод, открывающий основную форму и нажимающий на кнопку сгенерировать PDF
	 *		 
	 * @throws Exception обработка исключений
	 */
	@Before
	public void setUp() throws Exception {
		Main_GUI gui = new Main_GUI("");
		gui.getButtonPDF().doClick();
	}

	/**
	 * Тест, проверяющий наличие файла Document.pdf
	 *
	 */
	@Test
	public void test() {

		String location = "./Document.pdf";
		File pdf = new File(location);
		Path path = pdf.toPath();
		assertTrue(Files.exists(path));

	}

}