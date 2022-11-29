package Calculator;
/**
 * Неизменяемый класс Date, который содержит дату выбранную в календаре.
 * @author Siraev
 * @version 1.1
 */
public final class Date {
	/** Строковое представление месяца.*/
	private String strMonth;
	
	/** Целочисленное представление года.*/
	private int year;
	
	/** Целочисленное представление месяца.*/
	private int month;
	
	/**
	 * Конструктор класса Date.
	 *
	 * @param month передоваемая строка месяца.
	 * @param year передоваемое значение года.
	 */
	public Date(String month, int year) {
		strMonth = month;
		this.year = year;
	}
	
	/**
	 * Метод переводит строку месяца в число.
	 */
	public final void setMonthInNumbers() {
		switch(strMonth) {
		case ("Январь"):
			month = 1;
			break;
		case ("Февраль"):
			month = 2;
			break;
		case ("Март"):
			month = 3;
			break;
		case ("Апрель"):
			month = 4;
			break;
		case ("Май"):
			month = 5;
			break;
		case ("Июнь"):
			month = 6;
			break;
		case ("Июль"):
			month = 7;
			break;
		case ("Август"):
			month = 8;
			break;
		case ("Сентябрь"):
			month = 9;
			break;
		case ("Октябрь"):
			month = 10;
			break;
		case ("Ноябрь"):
			month = 11;
			break;
		case ("Декабрь"):
			month = 12;
			break;
		}
	}
	
	/**
	 * Метод, возвращающий месяц и год
	 * 
	 * @param fullDate если true, то дата в формате "ММ.ГГГГ,", иначе дата в формате "ММ.ГГ,"
	 * @return строка с датой
	 */
	public final String getDate(boolean fullDate) {
		setMonthInNumbers();
		if (!fullDate) {
			year = year%100;
		}
		if(month < 10) {
			return "0" + month + "." + year;
		}else {
			return month + "." + year;
		}
	}
}
