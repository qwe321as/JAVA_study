import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class 대륙나라 extends Frame implements ItemListener{

	String[] 대륙 = {"아시아","유럽","아프리카"};

	String[][] 나라 = {	{"한국","일본","중국"},
			{"영국","스위스","프랑스"},
			{"이집트","콩고","우간다"}
	};
	Choice ch1;
	Choice ch2;
	Label lb2;
	대륙나라(String title){

		super.setTitle(title);

		Label lb1 = new Label("대륙과 나라를 선택하세요");
		lb1.setBackground(Color.lightGray);

		lb2 = new Label();
		lb2.setBackground(Color.white);
		lb2.setAlignment(Label.CENTER);

		Panel p = new Panel();
		p.setBackground(Color.gray);

		ch1 = new Choice();
		ch2 = new Choice();

		p.add(ch1);
		p.add(ch2);

		super.add(lb1,"North");
		super.add(p,"Center");
		super.add(lb2,"South");

		for(int i=0;i<대륙.length;i++) {
			ch1.add(대륙[i]);
		}
		ch2.add("             ");

		ch1.addItemListener(this); // => new ItemEvent() ItemStateChanged() 
		ch2.addItemListener(this); // => new ItemEvent() ItemStateChanged() 

		setSize(300,200);
		setVisible(true);

		// Frame종료 기능 넣기
		
		this.addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				}
				);
	}

	public static void main(String[] args) {

		new 대륙나라("Choice 과제");

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		Object obj = e.getSource();
		String str = "선택한 대륙과 나라는 : ";
		if(obj==ch1) {
			ch2.removeAll();
			int index = ch1.getSelectedIndex();
			for(int j=0;j<나라[index].length;j++) {
				ch2.add(나라[index][j]);
			}
		}
		else if(obj==ch2) {
			str += ch1.getSelectedItem()+"  ";
			str += ch2.getSelectedItem();
			lb2.setText(str);
		}

	}

}






