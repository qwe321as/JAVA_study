import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowEventEx extends Frame implements WindowListener{

	WindowEventEx(){
		this.addWindowListener(this);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Ex12_04_WindowEvent {
	public static void main(String[] args) {
		
		Frame f = new WindowEventEx();
		
		f.setSize(400, 300);
		f.setVisible(true);
		
	}

}
