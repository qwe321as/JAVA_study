
class Big extends Thread{ //������->���ÿ�
	Big() {
		System.out.println("big ()"); //�����ڴ� Ŭ������ �̸��� ���� ����Ÿ�Ծ���
	}
	public void run() { //run�� start�� ȣ���� 
		for (char i = 'A'; i <='Z' ; i++) {
			System.out.print(i+" ");//for ���� char ��밡��
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//sleep�� ���� ��, ����ƽ �޼��� Thread.��������ӹ޾� ���� 1000��1��
			//interruptedException

		}
		System.out.println();
	}
}
class Small implements Runnable { //�������̽� ��ӽ� implements
	Small(){
		
	}
	public void run() {
	for(char i ='a'; i<='z'; i++) {
		System.out.print(i +" ");
		try {
			Thread.sleep(100);
		} catch (Exception e) {
		}
	}
	}
}
public class Ex10_01_thread { //���α׷����� ���������� ����Ǵ� �޼���
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		Big b = new Big(); 
		b.start();
		Small s = new Small();
		Thread th = new Thread(s);
		th.start();
		System.out.println("���α׷� ��");

	}
}
