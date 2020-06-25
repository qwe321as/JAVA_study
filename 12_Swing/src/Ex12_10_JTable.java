import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class JTableEx extends JFrame {
	int cnt = 1;
	Vector<String> columnNames = null;
	Vector<Vector<String>> rowData = null;
	JTableEx(String title){
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		columnNames = new Vector<String>();
		rowData = new Vector<Vector<String>>();
		getFile();

		compose();
		setSize(500,200);
		setVisible(true);

	}// 积己磊

	private void compose() {
		JTable table =new JTable(rowData,columnNames);
		JScrollPane scrollPand =  new JScrollPane(table);
		Container contentPane = getContentPane();
		contentPane.add(scrollPand,BorderLayout.CENTER);
		JButton btn = new JButton("免仿");
		btn.addActionListener(new TablePrint(table));
		contentPane.add(btn,BorderLayout.SOUTH);

	}

	void getFile(){

		File f = new File("table.txt");

		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String str;
			while( (str = br.readLine()) != null ) {
				//				System.out.println(str);
				TableMake(str);

			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void TableMake(String str) {
		String[] split = str.split("/");
		if(cnt==1) {
			for (int i = 0; i < split.length; i++) {
				columnNames.add(split[i]);
			}
			cnt++;
		}
		else {
			Vector<String> one = new Vector<String>();
			for (int i = 0; i < split.length; i++) {
				one.add(split[i]);
			}
			rowData.add(one);
		}
	}

}//jtableex 场 
class TablePrint implements ActionListener{
	JTable table;
	TablePrint(JTable table) {
		this.table=table;
	}

	public void actionPerformed(ActionEvent e) {
		int rowNum = table.getRowCount();
		int colNum = table.getColumnCount();
		System.out.println(rowNum+","+colNum);
		for (int i = 0; i < colNum; i++) {
			String colName = table.getColumnName(i);
			System.out.print(colName+"\t");
		}
		System.out.println();
//		Object obj = table.getValueAt(0, 0);
//		System.out.println(obj);
		
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
		Object obj = table.getValueAt(i, j);
		System.out.print(obj+"\t");
				
			}
			System.out.println();
		}
	}

}

public class Ex12_10_JTable {
	public static void main(String[] args) {

		JTableEx ex = new JTableEx("JTable 抗力");
	}

}
