package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * Listener для кнопки "Выход" на основной панели и в главном меню.
 * @author Siraev
 * @version 1.0
 */
public final class ListenerButtonExit implements ActionListener{
	
	/** Сообщение, выдаваемое при нажатии на кнопку */
	private String message;
	
	/** Загаловок сообщения */
	private String title;
	
	/**
	 * Конструктор класса. <br>
	 *
	 * @param message передаваемое сообщение
	 * @param title заголовок диалогового окна
	 */
	public ListenerButtonExit(String message,String title) {
		this.message = message;
		this.title = title;
	}

	/**
	 * Реализация метода из интерфейса ActionListener.<br>
	 * Выводит диалоговое окно с необходимым зпголовком и сообщением.<br>
	 * Если было нажато "Yes", то программа закрывается.
	 *
	 * @param e Событие нажатия на кнопку
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		int exit = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		if (JOptionPane.YES_OPTION==exit) {
			System.exit(1);
		}
	}

}
