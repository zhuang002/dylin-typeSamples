import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intSample();
		longSample();
		doubleSample();
		boolSample();
		charSample();
		arraySample();
		
	}

	private static void doubleSample() {
		// TODO Auto-generated method stub
		
	}

	private static void arraySample() {
		// TODO Auto-generated method stub
		
	}

	private static void charSample() {
		// TODO Auto-generated method stub
		
	}

	private static void boolSample() {
		// TODO Auto-generated method stub
		
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
