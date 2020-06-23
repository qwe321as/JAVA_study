import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ExPanel extends Frame implements ActionListener{
	
	Button b1,b2,b3,b4;
	
	ExPanel(String title){
		super(title);

		super.setSize(400,300);
		//		super.setResizable(false);
		super.setVisible(true);

		setLayout(new FlowLayout());

		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();

		p1.setBackground(Color.green);
		p2.setBackground(Color.pink);
		p3.setBackground(Color.red);

		b1 = new Button("버튼1");
		b2 = new Button("버튼2");
		b3 = new Button("버튼3");
		b4 = new Button("버튼4");
		
		b1.addActionListener(this); // this:ExPanel
		b2.addActionListener(this);
		b3.addActionListener(this); // new ActionEvent();
		b4.addActionListener(this); // new ActionEvent();

		b1.setBackground(Color.yellow);
		p1.add(b1);
		p2.add(b2);
		p3.add(b3);

		super.add(p1,"North");
		super.add(p2,"South");
		super.add(p3,"Center");
		super.add(b4);
	}

	@Override
//	ActionEvent e = new ActionEvent()
	public void actionPerformed(ActionEvent e) {
		//System.out.println("action Event 발생");

		Object obj = e.getSource();
		
//		b1 cannot be resolved to a variable
		
		if(obj == b1 ) {
			super.setBackground(Color.cyan);
		} 
		else if(obj == b2) {
			super.setBackground(Color.orange);
		} 
		else if(obj == b3) {
			super.setBackground(Color.MAGENTA);
		} 
		else if(obj == b4) {
			super.setBackground(Color.gray);
		} 
	}
}

public class Ex12_02_Panel {
	public static void main(String[] args) {

		ExPanel ex = new ExPanel("panel 예제");
		//		ex.setVisible(true);

	}

}




