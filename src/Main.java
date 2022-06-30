import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intSample();
		//longSample();
		//doubleSample();
		//boolSample();
		//charSample();
		//arraySample();
		//stringSample();
		//forExample();
		ifExample();
		
	}

	private static void ifExample() {
		// TODO Auto-generated method stub
		int a =7;
		// if (boolean value) {} 
		if (a>5) {
			System.out.println("a>5");;
		} else if(a>1) {
			System.out.println("1<a<=5");
		} else {
			System.out.println("a<=1");
		}
		
		if (true) {
			System.out.println("always true");
		} else {
			System.out.println("never happens");
		}
		
		boolean b1 = a>5;
		boolean b2 = a>1;
		
		if (b1) {
			System.out.println("a>5");;
		} 
		if(!b1 && b2) {
			System.out.println("1<a<=5");
		} 
		if (!b1 && !b2) {
			System.out.println("a<=1");
		}
	}

	private static void forExample() {
		// TODO Auto-generated method stub
		int a=0;
		for (int i=0;i<10;i++)  // initial condition; valid condition; update
		{
			a+=i;
		}
		System.out.println(a);
		
		int c = 100;
		for (;c<200;c+=3) {
			System.out.print(c+",");
		}
		System.out.println();
		
		boolean b=true;
		int i=0;
		for (;b;b= i<10) {
			i+=1;
			
		}
		System.out.println(i);
		
	}

	private static void stringSample() {
		// TODO Auto-generated method stub
		System.out.println("Please input s1 and s2:");
		String s1 = sc.next();
		String s2 = sc.next();
		
		
		System.out.println(s1);
		System.out.println(s2);
		sc.nextLine();
		
		System.out.println("Please input s1 and s2 with space in string:");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1 = "123456";
		for (int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i)+",");
		}
		System.out.println();
		
	}

	private static void doubleSample() {
		// TODO Auto-generated method stub
		System.out.println("Please input d1 and d2:");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		System.out.println(d1+"+"+d2+"="+(d1+d2));
		
		System.out.println(d1+"*"+d2+"="+(d1*d2));

		System.out.println(d1+"-"+d2+"="+(d1-d2));
		
		System.out.println(d1+"/"+d2+"="+(d1/d2));
		
		System.out.println(d1+"%"+d2+"="+(d1%d2));
		
		
	}

	private static void arraySample() {
		// Java is a "strong typed" language
		int[] ia = {2,3,(int)4.4,5}; //python [2,3,4,5]
		for (int i=0;i<ia.length;i++) {
			System.out.print(ia[i]+",");
		}
		System.out.println();
		
		boolean[] ba= {true, false, false, true};
		for (int i=0;i<ba.length;i++) {
			System.out.print(ba[i]+",");
		}
		System.out.println();
		
		double[] da= {1.3, 1, 7.7, 5.6,8.8};
		for (int i=0;i<da.length;i++) {
			System.out.print(da[i]+",");
		}
		System.out.println();
		
		char[] ca= {'A','+','$',')', 88, 77};
		for (int i=0;i<ca.length;i++) {
			System.out.print(ca[i]+",");
		}
		System.out.println();
		
		String[] sa = {"abc","def","ghi"};
		for (int i=0;i<sa.length;i++) {
			System.out.print(sa[i]+",");
		}
		System.out.println();
		
		char[] ca2 = new char[10]; // capacity
		ca2[0] = 'A';
		ca2[1] = 'B';
		ca2[2] = 'C';
		ca2[8] = 'D';
		
		
		for (int i=0;i<ca2.length;i++) {
			System.out.print(ca2[i]+",");
		}
		System.out.println();
	}

	private static void charSample() {
		// TODO Auto-generated method stub
		char c1 = 'A';
		char c2 = 'B';
		char c3 = '1';
		char c4 = '&';
		
		int i1=c1;
		int i2=c2;
		int i3=c3;
		int i4=c4;
		
		System.out.println(""+c1+c2+c3+c4);
		System.out.println(i1+","+i2+","+i3+","+i4);
		c1++;
		c2++;
		c3++;
		c4++;
		System.out.println(""+c1+c2+c3+c4);
		System.out.println("c1>'+' is "+(c1>'+'));
		
		c1 = 32;
		c2 = 44;
		c3 = 55;
		c4 = 77;
		
		System.out.println(""+c1+c2+c3+c4);
		
		i1 = 32;
		i2 = 44;
		i3 = 55;
		i4 = 77;
		
		System.out.println(""+(char)i1+(char)i2+(char)i3+(char)i4); // type casting, python int("1234"), str(1234);
	}

	private static void boolSample() {
		// TODO Auto-generated method stub
		System.out.println("Please input t1 and t2:");
		boolean b1 = sc.nextBoolean();
		boolean b2 = sc.nextBoolean();
		
		System.out.println("!"+b1+"="+!b1);
		System.out.println("!"+b2+"="+!b2);
		
		System.out.println(b1+"&&"+b2+"="+(b1&&b2));
		System.out.println(b1+"||"+b2+"="+(b1||b2));
		
		System.out.println("Please input i1 and i2");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		b1 = i1==i2;
		b2 = i1>i2;
		
		System.out.println("i1==i2 is "+b1);
		System.out.println("i1>i2 is "+ b2);
		System.out.println("i1>=i2 is "+(i1>=i2));
		System.out.println("i1<=i2 is "+(i1<=i2));
		System.out.println("i1<i2 is "+(i1<i2));
		System.out.println("i1!=i2 is "+(i1!=i2));
		
	}

	private static void longSample() {
		// TODO Auto-generated method stub
		long l = 1;
		for (int i=1;i<=20;i++) {
			l *= i;
		}
		System.out.println("20!="+l);
	}

	private static void intSample() {
		// TODO Auto-generated method stub
		int i1 = 1;
		int i2 = 2;
		System.out.println(i1+"+"+i2+"="+(i1+i2));
		int i3 = i1+i2;
		System.out.println("i3=i1+i2="+i3);
		
		System.out.println("Please input i1 and i2:");
		i1 = sc.nextInt();
		i2 = sc.nextInt();
		System.out.println(i1+"+"+i2+"="+(i1+i2));
		
		System.out.println(i1+"*"+i2+"="+(i1*i2));

		System.out.println(i1+"-"+i2+"="+(i1-i2));
		
		System.out.println(i1+"/"+i2+"="+(i1/i2));
		
		System.out.println(i1+"%"+i2+"="+(i1%i2));
		
		i1 = 1;
		for (int i=1;i<=20;i++) {
			i1 *= i;
		}
		System.out.println("20!="+i1);
		
	}

}
