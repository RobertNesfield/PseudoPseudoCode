import java.util.Scanner;
public Average{
	final static long MAX=1000000;
	final static long MIN=-1000000;
	public static void main(String[] args){
		long max=-1000001;
		long min=1000001;
		long sum=0;
		long count=0;
		long num;
		Boolean cont=true;
		while(cont){
			num=1000001;
			while(num>MAX||num<MIN){num=intput("Enter a number: ");}
			sum+=num;
			count++;
			if(num>max){max=num;}
			if(num<min){min=num;}
			System.out.println("Minimum: "+min+", Maximum: "+max+", Mean: "+(sum/count));
			if(strinput("Continue? (Y/N): ").charAt(0)=='N'){cont=false;}
		}
	}
	public static int intput(String msg){
  		System.out.print(msg);
		Scanner in=new Scanner(System.in);
		return in.nextInt();
	}
	public static String strinput(String msg){
		System.out.print(msg);
		Scanner in=new Scanner(System.in);
		return in.next();
	}
}
