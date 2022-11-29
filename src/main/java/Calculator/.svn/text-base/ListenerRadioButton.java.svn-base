package Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Listener для радио кнопок на основной панели.
 * @author Siraev
 * @version 1.0
 */
public final class ListenerRadioButton implements ActionListener{
	
	/** Ссылка на основную панель. */
	private Main_GUI gui;
	
	/** Надпись "НДФЛ" на основной панели. */
	private JLabel label;
	
	/**
	 * Конструктор класса
	 *
	 * @param label передаваемая ссылка на надпись
	 */
	public ListenerRadioButton(JLabel label) {
		this.label = label;
	}
	
	/**
	 * Метод, переопределенный из интерфейса ActionListener <br>
	 * Если выбрано "Да", то процент НДФЛ = 13% <br>
	 * Если выбрано "Нет", то процент НДФЛ = 30% <br>
	 * Изменяется надпись на основной форме.
	 * @param e событие.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		JRadioButton but = (JRadioButton)e.getSource();
		if (but.getText() == "Да") {
			Salary.percent = 13;
		}
		if (but.getText() == "Нет") {
			Salary.percent = 30;
		}
		label.setText( "НДФЛ " + Salary.percent + "%");
		
	}
	
}
