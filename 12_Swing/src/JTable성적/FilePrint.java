package JTable¼ºÀû;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTable;

public class FilePrint implements ActionListener{
	JTable table;
	FilePrint(JTable table){
		this.table = table;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		int rowNum = table.getRowCount();
		int colNum = table.getColumnCount();
		
		File f = new File("table.txt");
		
		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			
			for(int i=0;i<colNum;i++) {
				bw.write(table.getColumnName(i));
				if (i!= colNum-1) {
					bw.write("/");
				}
				else {
					bw.newLine();
				}
			}
			for (int i = 0; i < rowNum; i++) {
				for (int j = 0; j < colNum; j++) {
					Object obj = table.getValueAt(i,j);
					bw.write((String)obj);
					if(j != colNum-1) {
						bw.write("/");
					}
					else {
						bw.newLine();
					}
				}
				System.out.println();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if(bw != null)
					bw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}

}
