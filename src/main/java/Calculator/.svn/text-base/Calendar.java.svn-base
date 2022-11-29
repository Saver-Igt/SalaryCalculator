package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Класс Calendar реализует выбор периода расчета заработной платы.
 * @author Siraev
 * @version 1.2
 */
public final class Calendar {
	
	/**Индекс текущего месяца. */
	private int index = 0;
	
	/** Поле для ввода года. */
	private JTextField yearField;
	
	/** Целочисленное представление года.*/
	private int year = 2021;
	
	/** Массив из месяцов. */
	private String[] arrayOfMonth = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
	
	/**
	 * Конструктор класса Calendar. <br>
	 * Создает кнопки влево, вправо для смены месяцов,<br>
	 * поле, куда вводится год и <br>
	 * надпись,с выбранным с месяцем.<br>
	 * Содержит также мнимые классы-листенеры для кнопок.<br>
	 *
	 * @param panel панель, на которую необходимо добавить элементы
	 */
	public Calendar (JPanel panel) {
		JButton leftBut = new JButton("<");
		JButton rightBut = new JButton(">");
		yearField = new JTextField(String.valueOf(year));
		JLabel monthLabel = new JLabel(arrayOfMonth[index]);
		JLabel yearLabel = new JLabel("год");
		leftBut.setBounds(510,80,50,25);
		rightBut.setBounds(710,80,50,25);
		monthLabel.setBounds(570,80,80,25);
		yearLabel.setBounds(685,80,80,25);
		yearField.setBounds(640,80,40,25);
		panel.add(leftBut);
		panel.add(rightBut);
		panel.add(monthLabel);
		panel.add(yearLabel);
		panel.add(yearField);
		rightBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				checkYearValue();
				if (index == 11) {
					index = 0;
					year++;
				}else {
					index++;
				}
				yearField.setText(String.valueOf(year));
				monthLabel.setText(arrayOfMonth[index]);
			}	
		});
		leftBut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				checkYearValue();
				if (index == 0) {
					index = 11;
					year--;
				}else {
					index--;
				}
				yearField.setText(String.valueOf(year));
				monthLabel.setText(arrayOfMonth[index]);
			}
		});
	}
	
	/**
	 * Метод, проверяющий правильность задания поля год.
	 */
	public final void checkYearValue() {
		try {
			year = Integer.parseInt(yearField.getText());
		}catch (NumberFormatException e) {
			year=2021;
		}
		if (year < 0) {
			year=2021;
		}
	}
	
	/**
	 * Метод создает неизменяемый объект date.
	 * 
	 * @param fullDate в каком формате вернуть дату
	 * @return Выбранную дату.
	 * @see Date
	 */
	public final String getDate(boolean fullDate) {
		Date date = new Date(arrayOfMonth[index],year);
		return date.getDate(fullDate);	
	}
}
