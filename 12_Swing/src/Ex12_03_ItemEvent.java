import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class ItemEventEx extends Frame implements ItemListener{
	Choice ch = new Choice();
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Label lb = new Label("���� �����ϼ���.");
	Label lb1 = new Label("                      ");
	ItemEventEx(){
		setSize(400,300);
		setVisible(true);
		//borderlayout �⺻�Ӥ�
		p1.setBackground(Color.orange);
		p2.setBackground(Color.pink);
		p3.setBackground(Color.yellow);
		p1.add(lb);
		p2.add(ch);
		p3.add(lb1);
//		ch.add("���");
//		ch.add("���޷�");
		String[] flower = {"��ȭ", "�ڽ���" , "���", "�عٶ��", "������"};
		for (int i = 0; i < flower.length; i++) {
			ch.add(flower[i]);
		}
		ch.addItemListener(this);
		add(p1,"North");
		add(p2,"Center");
		add(p3,"South");
	
}
	public void itemStateChanged(ItemEvent e) {
//		System.out.println("����");
		System.out.print(ch.getSelectedIndex()+":");
		System.out.println (ch.getSelectedItem());
		lb1.setText(ch.getSelectedItem());
	}
}
public class Ex12_03_ItemEvent {
	public static void main(String[] args) {
		ItemEventEx f = new ItemEventEx();
//		f.setSize(400, 300);
//		f.setVisible(true);

	}
}
