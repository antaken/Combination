package combination;

public class combination_lib {


	public int getFactorial(int n) {
		int f = 1;
		//�K��v�Z
		if(n == 0) {
			return f;
		}
		else {
			for(int i = n; i > 0; i--)
				f *= i;
			return f;
		}
	}
	

}
