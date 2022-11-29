package Calculator;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Класс создающий основную форму.
 * @author Ayupov Timur
 * @version 1.0
 */
public final class Main_GUI {
	
	/** Основная форма. */
	private JFrame mainFrame;
	
	/** Основная панель. */
	private JPanel mainPanel;
	
	/** Поле для ввода названия организации. */
	private JTextField fieldNameOrg;
	
	/** Поле для ввода ФИО. */
	private JTextField fieldFIO;
	
	/** Поле для ввода должности . */
	private JTextField fieldPosition;
	
	/** Поле для ввода подразделения. */
	private JTextField fieldSubdivision;
	
	/** Поле для ввода количества деталей. */
	private JTextField fieldAmountDetails;
	
	/** Поле для ввода ставки. */
	private JTextField fieldBid;
	
	/** Поле для ввода надбавки. */
	private JTextField fieldAllowance;
	
	/** Поле для вывода НДФЛ. */
	private JTextField fieldNDFL;
	
	/** Поле для вывода ПФ. */
	private JTextField fieldPF;
	
	/** Поле для вывода ФОМС. */
	private JTextField fieldFOMS;
	
	/** Поле для вывода ФСС. */
	private JTextField fieldFSS;
	
	/** Поле для вывода ФСС НС. */
	private JTextField fieldFSSNS;
	
	/** Поле для вывода заработной платы. */
	private JTextField fieldsum;
	
	/** Поле календаря. */
	private Calendar calendar;
	
	/** Кнопка генерации PDF. */
	private JButton buttonPDF;
	
	/** Надпись для вывода сообщения. */
	private JLabel labelMessage;
	
	/**
	 * Конструктор класса.
	 *
	 * @param title Заголовок основной формы
	 */
	public Main_GUI(String title) {
		mainFrame = new JFrame();
		mainFrame.setTitle (title);
		mainFrame.setBounds(500,150,800,500);
		mainFrame.setResizable(false);
		
		String[] info_str = {"Аюпов Тимур Русланович: 065","Хасанов Ренат Альбертович: 090","Сираев Радмир Винерович: 503","Фахретдинов Ринат Наилевич: 481"};
		String exitMessage = "Вы действительно хотите выйти?";
		String exitTitle = "Завершение работы";
		
		//Меню
		JMenu menuMain = new JMenu("Главная");
		JMenuBar menuBar = new JMenuBar();
		JMenuItem menu1 = new JMenuItem("Информация о команде");
		JMenuItem menu2 = new JMenuItem("Выход");
		menuMain.add(menu1);
		menuMain.add(menu2);
		menuBar.add(menuMain);
		menu2.addActionListener(new ListenerButtonExit(exitMessage, exitTitle));
		menu1.addActionListener(new Information("Информация", info_str));
		mainFrame.setJMenuBar(menuBar);
		
		//Панель
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainFrame.add(mainPanel);
		
		// Надписи
		JLabel labelName = new JLabel("Название"); 				
		setComponentOnPanel(labelName,10,5,80,30);
		JLabel labelOrg = new JLabel("организации:"); 			
		setComponentOnPanel(labelOrg,10,15,80,30);
		JLabel labelFIO = new JLabel("ФИО:"); 					
		setComponentOnPanel(labelFIO,10,45,80,30);
		JLabel labelAmount = new JLabel("Количество"); 			
		setComponentOnPanel(labelAmount,10,75,80,20);
		JLabel labelDetails = new JLabel(" деталей:"); 			
		setComponentOnPanel(labelDetails,8,85,80,30);
		JLabel labelBid = new JLabel("Ставка"); 				
		setComponentOnPanel(labelBid,210,75,60,30);
		JLabel labelDetail = new JLabel(" детали: "); 			
		setComponentOnPanel(labelDetail,207,85,60,30);
		JLabel labelPosition = new JLabel("Должность:"); 		
		setComponentOnPanel(labelPosition,410,45,80,30);
		JLabel labelSubdivision = new JLabel("Подразделение:"); 
		setComponentOnPanel(labelSubdivision,410,10,100,30);
		JLabel labelPeriod = new JLabel("Период:"); 					
		setComponentOnPanel(labelPeriod,410,77,80,30);
		JLabel labelPF = new JLabel("ПФ"); 						
		setComponentOnPanel(labelPF,260,250,80,30);
		JLabel labelFOMS = new JLabel("ФОМС"); 					
		setComponentOnPanel(labelFOMS,260,290,80,30);
		JLabel labelFSS = new JLabel("ФСС"); 						
		setComponentOnPanel(labelFSS,260,330,80,30);
		JLabel labelFSSNS = new JLabel("ФСС НС"); 				
		setComponentOnPanel(labelFSSNS,260,370,80,30);
		JLabel labelAllowance = new JLabel("Надбавка"); 			
		setComponentOnPanel(labelAllowance,10,115,80,30);
		JLabel labelSum = new JLabel("Сумма сотруднику:"); 			
		setComponentOnPanel(labelSum,10,250,150,30);
		JLabel labelResident = new JLabel("Резидент РФ"); 				
		setComponentOnPanel(labelResident,10,145,80,30);
		JLabel labelNDFL = new JLabel("НДФЛ 13%"); 					
		setComponentOnPanel(labelNDFL,50,290,80,30);
		
		labelMessage = new JLabel();
		setComponentOnPanel(labelMessage,320, 200, 400, 30);
		
		//JRadioButton
		ButtonGroup group = new ButtonGroup();
		JRadioButton radioButYes = new JRadioButton("Да", true);
		radioButYes.addActionListener(new ListenerRadioButton(labelNDFL));
		group.add(radioButYes);
		setComponentOnPanel(radioButYes,110,145,50,30);
		JRadioButton radioButNo = new JRadioButton("Нет", false);
		radioButNo.addActionListener(new ListenerRadioButton(labelNDFL));
		setComponentOnPanel(radioButNo,170,145,50,30);
		group.add(radioButNo);
		
		//Поля 
		fieldNameOrg = new JTextField();							//Название организации
		setComponentOnPanel(fieldNameOrg,100,10,300,30,true);
		fieldFIO = new JTextField(); 								//ФИО
		setComponentOnPanel(fieldFIO,100,45,300,30,true);
		fieldPosition = new JTextField();							//Должность
		setComponentOnPanel(fieldPosition,510,45,250,30,true);
		fieldSubdivision = new JTextField();						//Подразделение
		setComponentOnPanel(fieldSubdivision,510,10,250,30,true);
		fieldAmountDetails = new JTextField("0");   				//Количество деталей
		setComponentOnPanel(fieldAmountDetails,100,80,90,30,true);
		fieldBid = new JTextField("0");  							//Ставка
		setComponentOnPanel(fieldBid,265,80,90,30,true);
		fieldAllowance = new JTextField("0");   					//Надбавка
		setComponentOnPanel(fieldAllowance,100,115,90,30,true);
		
		//Неизменяемое
		fieldNDFL = new JTextField();   							//НДФЛ
		setComponentOnPanel(fieldNDFL,130,290,90,30,false);
		fieldPF = new JTextField();   								//ПФ
		setComponentOnPanel(fieldPF,310,250,90,30,false);
		fieldFOMS = new JTextField();   							//ФОМС
		setComponentOnPanel(fieldFOMS,310,290,90,30,false);
		fieldFSS = new JTextField();   								//ФСС
		setComponentOnPanel(fieldFSS,310,330,90,30,false);
		fieldFSSNS = new JTextField();   							//ФСС НС
		setComponentOnPanel(fieldFSSNS,310,370,90,30,false);
		fieldsum = new JTextField();   								//Сумма 
		setComponentOnPanel(fieldsum,130,250,100,30,false);
		
		//Период
		calendar = new Calendar(mainPanel);
		
		//Кнопки
		JButton buttonCalculation = new JButton("Расчет");
		setComponentOnPanel(buttonCalculation,10,200,110,30);
		buttonCalculation.addActionListener(new ListenerButtonCalc(this));
		JButton buttonExit = new JButton("Выход");
		buttonExit.addActionListener(new ListenerButtonExit(exitMessage, exitTitle));
		setComponentOnPanel(buttonExit,650,390,110,30);
		buttonPDF = new JButton("Сгенерировать PDF");
		setComponentOnPanel(buttonPDF, 135, 200, 180, 30);
		buttonPDF.addActionListener(new ListenerPDF(this));
	   
		mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);

   }
	
	/**
	 * Метод, задающий координаты, размеры и добаляющий на основную панель компонент JRadioButton.
	 *
	 * @param but Компонент
	 * @param x Координата по x
	 * @param y Координата по y
	 * @param width Ширина
	 * @param height Высота
	 */
	public final void setComponentOnPanel(JRadioButton but, int x, int y, int width, int height) {
		but.setBounds(x,y,width,height);
		mainPanel.add(but);
	}
	
	/**
	 * Метод, задающий координаты, размеры и добаляющий на основную панель компонент JLabel.
	 *
	 * @param label Компонент
	 * @param x Координата по x
	 * @param y Координата по y
	 * @param width Ширина
	 * @param height Высота
	 */
	public final void setComponentOnPanel(JLabel label, int x, int y, int width, int height) {
		label.setBounds(x,y,width,height);
		mainPanel.add(label);
	}
	
	/**
	 * Метод, задающий координаты, размеры и добаляющий на основную панель компонент JButton.
	 *
	 * @param but Компонент
	 * @param x Координата по x
	 * @param y Координата по y
	 * @param width Ширина
	 * @param height Высота
	 */
	public final void setComponentOnPanel(JButton but, int x, int y, int width, int height) {
		but.setBounds(x,y,width,height);
		mainPanel.add(but);
	}
	
	/**
	 * Метод, задающий координаты, размеры и добаляющий на основную панель компонент JTextField. <br>
	 * Задает возможность редактирования поля.
	 * @param field Компонент
	 * @param x Координата по x
	 * @param y Координата по y
	 * @param width Ширина
	 * @param height Высота
	 * @param editable Возможность редактирования поля
	 */
	public final void setComponentOnPanel(JTextField field, int x, int y, int width, int height, boolean editable) {
		field.setBounds(x,y,width,height);
		field.setEditable(editable);
		mainPanel.add(field);
	}
	
	/**
	 * Геттер для поля количество деталей.
	 *
	 * @return Ссылка на поле
	 */
	public final JTextField getFieldAmount() {
		return fieldAmountDetails;
	}
	
	/**
	 * Геттер для поля цены детали.
	 *
	 * @return Ссылка на поле
	 */
	public final JTextField getFieldCost() {
		return fieldBid;
	}
	
	/**
	 * Геттер для поля НДФЛ.
	 *
	 * @return Ссылка на поле
	 */
	public final JTextField getFieldNDFL() {
		return fieldNDFL;
	}
	
	/**
	 * Геттер для поля ПФ.
	 *
	 * @return Ссылка на поле
	 */
	public final JTextField getFieldPF() {
		return fieldPF;
	}
	
	/**
	 * Геттер для поля ФОМС.
	 *
	 * @return Ссылка на поле
	 */
	public final JTextField getFieldFOMS() {
		return fieldFOMS;
	}
	
	/**
	 * Геттер для поля ФСС.
	 *
	 * @return Ссылка на поле
	 */
	public final JTextField getFieldFSS() {
		return fieldFSS;
	}
	
	/**
	 * Геттер для поля ФСС НС.
	 *
	 * @return Ссылка на поле
	 */
	public final JTextField getFieldFSSNS() {
		return fieldFSSNS;
	}
	
	/**
	 * Геттер для поля надбавка.
	 *
	 * @return Ссылка на поле
	 */
	public final JTextField getFieldAllowance() {
		return fieldAllowance;
	}
	
	/**
	 * Геттер для поля заработная плата.
	 *
	 * @return Ссылка на поле
	 */
	public final JTextField getFieldSum() {
		return fieldsum;
	}
	
	/**
	 * Геттер для основной формы.
	 *
	 * @return Ссылка на форму
	 */
	public final JFrame getFrame() {
		return mainFrame;
	}
	
	/**
	 * Геттер для поля название организации.
	 *
	 * @return Ссылка на поле
	 */
	public final JTextField getFieldNameOrg() {
		return fieldNameOrg;
	}
	
	/**
	 * Геттер для поля ФИО.
	 *
	 * @return Ссылка на поле
	 */
	public final JTextField getFieldFIO() {
		return fieldFIO;
	}
	
	/**
	 * Геттер для поля должность.
	 *
	 * @return Ссылка на поле
	 */
	public final JTextField getFieldPosition() {
		return fieldPosition;
	}
	
	/**
	 * Геттер для поля подразделение.
	 *
	 * @return Ссылка на поле
	 */
	public final JTextField getFieldSubdivision() {
		return fieldSubdivision;
	}
	
	/**
	 * Геттер для объекта календарь.
	 *
	 * @return Ссылка на объект
	 */
	public final Calendar getCalendar() {
		return calendar;
	}
	
	/**
	 * Геттер для кнопки генерации PDF.
	 *
	 * @return Ссылка на кнопку
	 */
	public final JButton getButtonPDF() {
		return buttonPDF;
	}
	
	/**
	 * Геттер для надписи сообщения.
	 *
	 * @return Ссылка на надпись
	 */
	public final JLabel getLabelMessage() {
		return labelMessage;
	}
	
	/**
	 * Сеттер для надписи сообщение.
	 *
	 * @param label передаваемая надпись
	 */
	public final void setLabelMessage(JLabel label) {
		labelMessage = label;
	}
}


