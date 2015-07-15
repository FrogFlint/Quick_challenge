
public class challenge {
	public static float Xold;
	public static float Xnew;
	public static int N = 1000;
	public static int i;
	public static boolean isDone;
	
	public static void main(String[] args){
		Xold = 1;
		if (Xold == Xnew){
			isDone = true;
		}
		else{
			isDone = false;
		}

		//System.out.println("0");
		for (i = 1;i < 15 ;i ++ ){
			Xnew = (Xold + (N/Xold))/2;
			System.out.println(Xnew);
			Xold = Xnew;
		}
	}
}
