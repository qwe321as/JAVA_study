import java.util.ArrayList;

public class Ex09_02_ArrayList {

	public static void main(String[] args) {
		String s ="hello";
		System.out.println("s"+s.toString());
		ArrayList<String> al =new ArrayList<String>();
		System.out.println(al);
		al.add("����");
		al.add("�¿�");
		al.add("����");
		al.add("ȿ��");
		al.add("����");// �ߺ����
		
		System.out.println("a1 : "+al.toString()); //����������, tostring ����
		System.out.println("al.size"+al.size());
		System.out.println("al.get"+al.get(1));
		al.add(1,"����");
		System.out.println(al);
//		length :�迭�� ���ǰ���
//		length() :���ڹ迭�� ���ǰ���
//		size():�÷����� �������ũ��
		ArrayList<String> add = new ArrayList<String>();
		add.add("������");
		add.add("����");
		al.addAll(add);
		System.out.println(al.toString());
		String str = al.remove(1);
		boolean b = al.remove("����");//��� ��ġ��ȣ�����
		al.add("����");
		System.out.println(al.toString());
		ArrayList<String> rm = new ArrayList<String>();
		rm.add("����");
		al.removeAll(rm);
		System.out.println(str+b);
		System.out.println(al.toString());
		System.out.println(al.size());
		int pos = al.indexOf("ȿ��");
		System.out.println(pos);
		pos = al.indexOf("����");
		System.out.println(pos);
		boolean isEx=al.contains("ȿ��");
		System.out.println(isEx);
		isEx = al.contains("����");
		System.out.println(isEx);
		al.set(1, "����");
		System.out.println(al);
		al.clear();
		System.out.println(al.toString());
		System.out.println(al.size());
	
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		System.out.println(al2.toString());
		System.out.println(al2.size());
		System.out.println(al2.get(1));
		pos = al.indexOf("ȿ��");
		System.out.println(pos);

	}
}
