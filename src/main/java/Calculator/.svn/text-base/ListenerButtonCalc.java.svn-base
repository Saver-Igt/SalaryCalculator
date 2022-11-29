package Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Listener для кнопки "Расчет" на основной панели.
 * @author Siraev
 * @version 2.0
 */
public final class ListenerButtonCalc implements ActionListener{
	
	/** Ссылка на основную панель. */
	private Main_GUI gui;
	
	/** Количество деталей. */
	private int amount;
	
	/** Цена одной детали. */
	private int cost;
	
	/** Надбавка. */
	private int allowance;
	
	/** Выводимое сообщение. */
	private String Message = "";
	
	/**
	 * Конструктор класса. <br>
	 * Задает ссылку на основную форму для получения из нее геттеров.
	 * @param gui передаваемая ссылка на основную форму
	 */
	public ListenerButtonCalc(Main_GUI gui) {
		this.gui = gui;
	}
	
	/**
	 * Метод, переопределенный из интерфейса ActionListener
	 *
	 * @param e событие
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (checkValue()) {
			Salary salary = new Salary(amount,cost,allowance);
			
			gui.getFieldSum().setText(getString(salary.calc(), 100));
			gui.getFieldNDFL().setText(getString(salary.getCess(), 100));
			
			Deducation PF = new Deducation(22);
			Deducation FOMS = new Deducation(51); //  5.1
			Deducation FSS = new Deducation(29);  //  2.9
			Deducation FSSNS = new Deducation(2); //  0.2
			
			gui.getFieldPF().setText(getString(PF.calc(), 100));
			gui.getFieldFOMS().setText(getString(FOMS.calc(), 1000));
			gui.getFieldFSS().setText(getString(FSS.calc(), 1000));
			gui.getFieldFSSNS().setText(getString(FSSNS.calc(), 1000));
			Message = "Выполнено!";
		}else {
			gui.getFieldSum().setText("");
			gui.getFieldNDFL().setText("");
			gui.getFieldPF().setText("");
			gui.getFieldFOMS().setText("");
			gui.getFieldFSS().setText("");
			gui.getFieldFSSNS().setText("");
			JOptionPane.showMessageDialog(gui.getFrame(),"Неверное значение!","Ошибка",JOptionPane.ERROR_MESSAGE);
		}
		gui.getLabelMessage().setText(Message);
		
	}
	
	/**
	 * Метод для проверки значчений <br>
	 * Значения берутся из полей основной формы и переводятся в int.
	 * Значения, связанные с деньгами, переводятся в копейки.
	 *
	 * @return true, если все проверки пройдены
	 */
	public final boolean checkValue() {
		String amountStr = gui.getFieldAmount().getText();
		String costStr = gui.getFieldCost().getText();
		String allowanceStr = gui.getFieldAllowance().getText();
		try {
			Message = "Проверьте значения поля \"Количество деталей\" !";
			amount = Integer.parseInt(amountStr);
			Message = "Проверьте значения поля \"Ставка детали\" !";
			cost = (int) (100 * Float.parseFloat(costStr));  				// перевод в копейки
			Message = "Проверьте значения поля \"Надбавка\" !";
			allowance = (int) (100 * Float.parseFloat(allowanceStr));   	// перевод в копейки
			} catch (NumberFormatException e) {
				return false;
			}
		if(cost < 0) {
			Message = "Значение поля \"Ставка детали\" < 0 !";
			return false;
		}
		if(amount < 0) {
			Message = "Значение поля \"Количество деталей\" < 0 !";
			return false;
		}
		return true;
	}
	
	/**
	 * Метод приводит результат к нужному формату (две цифры после запятой).
	 *
	 * @param value значение, полученное в ходе вычислений
	 * @param div делитель
	 * @return Строка с результатом
	 */
	public final String getString(long value, int div) {
		float res;
		res = (float) value / div;
		String result = String.format("%.2f",res);
		return result + " руб.";
	}
}
