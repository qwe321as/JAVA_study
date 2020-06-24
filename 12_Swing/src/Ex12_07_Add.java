import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex12_07_Add extends JFrame {
	Ex12_07_Add(String title){
		super(title);
		setVisible(true);
//		setSize(400,300);
		Container contentPane = getContentPane();
		JPanel p1 = new JPanel();
		p1.setBackground(Color.LIGHT_GRAY);
		JPanel p2 = new JPanel();
		p2.setBackground(Color. DARK_GRAY);
		contentPane.add(p1,BorderLayout.CENTER);
		contentPane.add(p2,"South");
		JTextField text1 = new JTextField(5);
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(5);
		p1.add(text1);
		p1.add(new JLabel("+"));
		p1.add(text2);
		p1.add(new JLabel("="));
		p1.add(text3);
		JButton b1 = new JButton("확인");
		JButton b2 = new JButton("취소");
		OkButton ok = new OkButton(text1,text2,text3);
		CancelButton cancel = new CancelButton(text1,text2,text3);
		b1.addActionListener(ok);
		b2.addActionListener(cancel);
		p2.add(b1);
		p2.add(b2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();//안에 넣은 것의 크기만큼 만들어짐.
		
		
	}

	public static void main(String[] args) {
		new Ex12_07_Add(" 덧셈 ");
	}

}
class OkButton implements ActionListener{
	JTextField text1;
	JTextField text2;
	JTextField text3;
	public OkButton(JTextField text1, JTextField text2, JTextField text3) {
		this.text1=text1;
		this.text2=text2;
		this.text3=text3;
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("확인 버튼 클릭");
		int num1  =Integer.parseInt(text1.getText());
		int num2  =Integer.parseInt(text2.getText());
		System.out.println(num1+num2);
		int sum = num1+num2;
		text3.setText(sum+" ");
		
	}
	}

class CancelButton implements ActionListener{
	JTextField text1;
	JTextField text2;
	JTextField text3;
	
	CancelButton(JTextField text1,JTextField text2,JTextField text3){
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("취소 버튼 클릭");
		text1.setText("");
		text2.setText("");
		text3.setText("");
	}
	
}
