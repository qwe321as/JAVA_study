import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12_06_이예지 extends Frame implements ItemListener{
	Choice chd = new Choice();
	Choice chc = new Choice();
	String [] 대륙 = {"아시아","유럽","아프리카"};
	String [][]나라 = {{"한국","일본","중국"},{"영국","스위스","프랑스"},{"이집트","콩고","우간다"}};
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Label lb = new Label("대륙과 나라를 선택하세요! ");
	Label lb2 = new Label("선택한 대륙과 나라는");
	Label lb3 = new Label("        ");
	Label lb4 = new Label("        ");
	
	
	Ex12_06_이예지(String title)	{
		setTitle(title);
		addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.out.println("닫는다.");
						System.exit(0);}
				});
		setSize(300,200);
		setVisible(true);
		p1.setBackground(Color.lightGray);
		p2.setBackground(Color.gray);
		p3.setBackground(Color.white);
//		for (int i = 0; i < 대륙.length; i++) {
//			chd.add(대륙[i]);
//			for (int j = 0; j < 나라[i].length; j++) {
//					chc.add(나라[i][j]);
//			}
//		}
//			
		chd.addItemListener(this);
		p1.add(lb);
		p2.add(chd);
		p2.add(chc);
		p3.add(lb2);
		p3.add(lb3);
		p3.add(lb4);
		add(p1,"North");
		add(p2,"Center");
		add(p3,"South");
	}
	public static void main(String[] args) {
		Ex12_06_이예지 yeji = new Ex12_06_이예지("Choice 과제");
	}
	public void itemStateChanged(ItemEvent e) {
		lb4.setText(chc.getSelectedItem());
		lb3.setText(chd.getSelectedItem());
	}


}
