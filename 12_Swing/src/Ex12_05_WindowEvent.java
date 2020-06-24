import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WAdapter extends Frame {
	public WAdapter() {
		setSize(400,200);
		setVisible(true);
		addWindowListener(
				new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.out.println("windowclosing()");
						System.exit(0);
					}
					public void windowActivated(WindowEvent e) {
						System.out.println("windowActivated()");
					}
				}
				
				);
		
		
	}
}
public class Ex12_05_WindowEvent {

	public static void main(String[] args) {
		Frame f = new WAdapter();
		
	}

}
