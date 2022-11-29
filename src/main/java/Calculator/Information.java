package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Класс, создающий окно информации о разработчиках.
 */
public final class Information implements ActionListener{
	
	/** Форма окна информации. */
	private JFrame info_frame;
	
	/** Надпись с информацией о модераторе. */
	private JLabel info_label_AT;
	 
	/** Надпись с информацией о первом разработчике. */
	private JLabel info_label_SR;
	
	/** Надпись с информацией о втором разработчике. */
	private JLabel info_label_FR;
	
	/** Надпись с информацией о третьем разработчике. */
	private JLabel info_label_HR;
	
	/** Заголовок окна. */
	private String title;
	
	/** Массив с информацией. */
	private String[] info_str;
	
	/**
	 * Конструктор класса.
	 *
	 * @param title передаваемый заголовок
	 * @param info_str передаваемая информация
	 */
	public Information(String title,String[] info_str) {
		this.title = title;
		this.info_str = info_str;
	}
	
	/**
	 * Метод, реализованный из интерфейса ActionListener.
	 *
	 * @param e Событие нажатия на кнопку
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		this.createInfoFrame();
	}
	
	/**
	 * Метод создающий форму информации.
	 */
	public final void createInfoFrame() {	
		info_frame = new JFrame();
		info_frame.setTitle (title);
		info_frame.setBounds(100,400,400,300);
		info_label_AT = new JLabel();
		info_label_HR = new JLabel();
		info_label_SR = new JLabel();
		info_label_FR = new JLabel();
		JLabel[] arrayLabel= {info_label_AT,info_label_SR,info_label_HR,info_label_FR};
		
		JPanel info_panel = new JPanel();
		info_panel.setLayout(null);
		info_frame.add(info_panel);
		
		for (int i=0;i<arrayLabel.length;i++) {
			arrayLabel[i].setText(info_str[i]);
		}
		
		info_label_AT.setBounds(10,0,300,30);
		info_label_SR.setBounds(10,30,300,30);
		info_label_HR.setBounds(10,60,300,30);
		info_label_FR.setBounds(10,90,300,30);
		info_panel.add(info_label_AT);
		info_panel.add(info_label_SR);
		info_panel.add(info_label_HR);
		info_panel.add(info_label_FR);
		
		JButton back = new JButton("Назад");
		back.setBounds(260,210,120,40);
		back.addActionListener(new ListenerButtonBack(info_frame));
		info_panel.add(back);
		
		info_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		info_frame.setVisible(true);
	}
}