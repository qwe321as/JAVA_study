import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex12_06_�̿��� extends Frame implements ItemListener{
	Choice chd = new Choice();
	Choice chc = new Choice();
	String [] ��� = {"�ƽþ�","����","������ī"};
	String [][]���� = {{"�ѱ�","�Ϻ�","�߱�"},{"����","������","������"},{"����Ʈ","���","�찣��"}};
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Label lb = new Label("����� ���� �����ϼ���! ");
	Label lb2 = new Label("������ ����� �����");
	Label lb3 = new Label("        ");
	Label lb4 = new Label("        ");
	
	
	Ex12_06_�̿���(String title)	{
		setTitle(title);
		addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.out.println("�ݴ´�.");
						System.exit(0);}
				});
		setSize(300,200);
		setVisible(true);
		p1.setBackground(Color.lightGray);
		p2.setBackground(Color.gray);
		p3.setBackground(Color.white);
//		for (int i = 0; i < ���.length; i++) {
//			chd.add(���[i]);
//			for (int j = 0; j < ����[i].length; j++) {
//					chc.add(����[i][j]);
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
		Ex12_06_�̿��� yeji = new Ex12_06_�̿���("Choice ����");
	}
	public void itemStateChanged(ItemEvent e) {
		lb4.setText(chc.getSelectedItem());
		lb3.setText(chd.getSelectedItem());
	}


}
