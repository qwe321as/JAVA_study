import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Ex12_08_image extends JFrame{
	
	JRadioButton [] radio = new JRadioButton[3];
	String [] fruit = {"사과","배","체리"};
	JLabel imaJLabel = new JLabel();
	ImageIcon [] image ={new ImageIcon("images/apple.jpg"),	new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg")};
	Ex12_08_image(String title){
		super(title);

		Container contentPane = getContentPane();
		//borderlayout
		
		JPanel radioPanel = new JPanel();
		radioPanel.setBackground(Color.pink);
//		JRadioButton r1 = new JRadioButton();
//		JRadioButton r2 = new JRadioButton();
//		JRadioButton r3 = new JRadioButton();
		ButtonGroup group = new ButtonGroup(); //그룹으로 묶으면 하나만 선택가능
		for (int i = 0; i < radio.length; i++) {
			radio [i] = new JRadioButton(fruit[i]);
			group.add(radio[i]);
			radioPanel.add(radio[i]);
			radio[i].addItemListener(new ImageItemEvent());
		}
		radio[0].setSelected(true);
		contentPane.add(radioPanel,BorderLayout.NORTH);
		contentPane.add(imaJLabel,BorderLayout.CENTER);
		imaJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(350,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class ImageItemEvent implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
			if (radio[0].isSelected()) {
				imaJLabel.setIcon(image[0]);
			}
			else if(radio[1].isSelected()) {
				imaJLabel.setIcon(image[1]);				
			}
			else {				
				imaJLabel.setIcon(image[2]);				
			}
		}
		
	} //이 클래스안에서만 사용
	
	public static void main(String[] args) {
		new Ex12_08_image("과일 과일");

	}

}
