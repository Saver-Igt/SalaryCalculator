package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


/**
 * Класс-слушатель для кнопки назад на форме информации.
 */
public final class ListenerButtonBack  implements ActionListener{
	
	/** Ссылка на форму информации. */
	private JFrame frame;
	
	/**
	 * Конструктор класса.
	 *
	 * @param frame передаваемая ссылка
	 */
	public ListenerButtonBack (JFrame frame) {
		this.frame = frame;
	}
	
	/**
	 * Реализация метода из интерфейса ActionListener
	 *
	 * @param e событие нажатия на кнопку
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
	}
	
}