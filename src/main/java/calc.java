
public class calc {
	int add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	int div(int a,int b) {
		if(b!=0) {
			return a/b;
		}
		else {
			return 0;
		}
	}
    public static void main(String args[]) {
    	calc ob=new calc();
    	System.out.println(ob.add(2,4));
    	System.out.println(ob.sub(2,4));
    	System.out.println(ob.mul(2,4));
    	System.out.println(ob.div(2,4));
    }
}
