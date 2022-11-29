package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import javax.swing.JOptionPane;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.Document;

import create.CreatePDF;

/**
 * Класс основан на библиотеке itextpdf.<br>
 * Для создания PDF файла необходимо создать экземпляр объекта CreatePDF и далее добавлять необходимые вставки
 * @author Khasanov_RA
 * @version 1.0
 */

public final class ListenerPDF implements ActionListener {
	
	/** 
	 *  Ссылка на основную форму
	 **/
	private Main_GUI gui;
	
	/**
	 * 
	 * Конструктор класса 
	 * @param gui передаваемая ссылка на основную форму
	 */
	public ListenerPDF(Main_GUI gui) {
		this.gui = gui;
	}
	
	/**
	 * Метод, переопределенный из интерфейса ActionListener<br>
	 * Использует библиотеку CreatePDF для генерации PDF-документа. <br>Добавление шрифта, логотипа, и таблицы
	 * @param e событие
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String[][] NameCell = new String[7][4];
		NameCell[0][0]= "Надбавка";
		NameCell[1][0]= "НДФЛ";
		NameCell[2][0]= "ПФ";
		NameCell[3][0]= "ФОМС";
		NameCell[4][0]= "ФСС";
		NameCell[5][0]= "ФСС НС";
		NameCell[6][0]= "Сумма сотруднику";
		
		NameCell[0][1]= gui.getCalendar().getDate(false);
		NameCell[1][1]= gui.getCalendar().getDate(false);
		NameCell[2][1]= gui.getCalendar().getDate(false);
		NameCell[3][1]= gui.getCalendar().getDate(false);
		NameCell[4][1]= gui.getCalendar().getDate(false);
		NameCell[5][1]= gui.getCalendar().getDate(false);
		NameCell[6][1]= gui.getCalendar().getDate(false);

		NameCell[0][2]= gui.getFieldAllowance().getText();
		NameCell[1][2]= "-";
		NameCell[2][2]= "-";
		NameCell[3][2]= "-";
		NameCell[4][2]= "-";
		NameCell[5][2]= "-";
		NameCell[6][2]= gui.getFieldSum().getText();
		
		NameCell[0][3]= "-";
		NameCell[1][3]= gui.getFieldNDFL().getText();
		NameCell[2][3]= gui.getFieldPF().getText();
		NameCell[3][3]= gui.getFieldFOMS().getText();
		NameCell[4][3]= gui.getFieldFSS().getText();
		NameCell[5][3]= gui.getFieldFSSNS().getText();
		NameCell[6][3]= "-";
		
		String[] Hat = new String[4];
		Hat[0]="Начислено / Удержано";
		Hat[1]="За период";
		Hat[2]="Начислено";
		Hat[3]="Удержано";

		String Texthat = gui.getFieldNameOrg().getText();
		String Texthat1 = "Расчетный листок за " + gui.getCalendar().getDate(true);
		String Textgeneral = "ФИО: " + gui.getFieldFIO().getText() + "\n"
				+ "Подразделение: " + gui.getFieldSubdivision().getText() + "\n"
				+ "Должность: " + gui.getFieldPosition().getText() + "\n"
				+ "Ставка: " + gui.getFieldCost().getText() + " рублей за деталь" + "\n"
				+ "Количество деталей: " + gui.getFieldAmount().getText();
		
		URL Imagelink=getClass().getResource("/picture/ugatu.png");
		String Namefile = "Document.pdf";
		BaseFont times = null;
		try {
			times = BaseFont.createFont("/fonts/times.ttf", "cp1251", BaseFont.EMBEDDED);
		} catch (DocumentException e2) {
			e2.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		CreatePDF pdf = new CreatePDF(Namefile,times);
		Document document = pdf.getDocument();
		pdf.addText(document, Texthat, 20,true);
		pdf.addText(document, Texthat1, 20,true);
		pdf.addText(document, Textgeneral, 14,true);
		pdf.addPicture(Imagelink, document, 500, 740);
		pdf.InitTableAndAddHat(document,Hat);
		pdf.addRowsInTable(pdf.getTable(), NameCell);
		pdf.addTable(document,pdf.getTable());
		pdf.getClose();
		
		gui.getLabelMessage().setText("Файл "+ Namefile + " создан!");
	}
}
