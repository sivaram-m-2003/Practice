package Work;

public class Recursion {
public static int sum(int k) {
	if(k<0) {
		return 0;
	}
	else {
		return k+sum(k-1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=5;
		int res=sum(k);
		System.out.println(res);
	}

}
