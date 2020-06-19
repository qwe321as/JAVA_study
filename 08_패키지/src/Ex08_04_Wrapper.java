public class Ex08_04_Wrapper {

	public static void main(String[] args) {
		Integer it1=new Integer(11);
		Integer it2=11; //11->new Integer(11):autoboxing
		Integer it3=22;
		System.out.println(it2+it3);
		int it4=33;
		int it5 = new Integer(44); //new Integer(44)->44: unboxing
		int i = Integer.parseInt("100");
		int j = Integer.parseInt("200");//""Ç¥¸¦ »©°í Á¤¼ö·Î ¹Ù²ãÁÜ
		System.out.println(i+j);
		System.out.println("100"+"200");
		Integer a=Integer.valueOf("100");
		int b=Integer.valueOf("200");
		System.out.println(a+b);
		System.out.println();
		double c =Double.parseDouble("123.4");
		System.out.println(c);
		System.out.println();
//		i=Integer.parseInt("100.3");
//		System.out.println(i);
		try {
			i=Integer.parseInt("100.3");
			System.out.println("i:"+i);
		} catch (Exception e) {
			System.out.println("¿À·ù¹ß»ý");
		}
		System.out.println();
		int[] arr= {1,2,3,4,5};
		int sum = 0;
		for (int k = 0; k < arr.length; k++) {
			sum+= arr[k];
		}
		System.out.println("sum: "+sum);
		int sum1=0;
		String[] arr2= {"1","2","3","4","5"};
		for (int k = 0; k < arr2.length; k++) {
			sum1 +=Integer.parseInt(arr2[k]);
		}
		System.out.println(sum1);
		System.out.println();
		String[]str= {"À¢µð:90","Å©¸®½ºÅ»:70","¾ÆÀÌÀ¯:80"
		};
		int sum3=0;
		for (int k = 0; k < str.length; k++) {
			System.out.println(str[k]);
			int pos =str[k].indexOf(":");
			String s =str[k].substring(pos+1);
			System.out.println(s);
			sum3+=Integer.parseInt(s);
		}
		System.out.println(sum3);
		int sum4=0;
		String[]str2= {"À¢µð:90","Å©¸®½ºÅ»:70","¾ÆÀÌÀ¯:80"
		};
		for (int k = 0; k < str2.length; k++) {
			String[] s = str2[k].split(":");
			sum4+=Integer.parseInt(s[1]);
		}
		System.out.println(sum4);
	}

}
