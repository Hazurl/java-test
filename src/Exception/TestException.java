package Exception;

/*
 *  TestException
 */
public class TestException {
	public static void main(String[] args) {
		String[] arguments = {"0", "1", "2", "trois", "4"};
		int res=0;
		
		for(int i=0; i<arguments.length; ++i) {
			try {
				res = fonction(Integer.valueOf(arguments[i]).intValue());
				System.out.println("fonction("+arguments[i]+") = " + res);
			} catch (ExceptionPerso e) {
				System.out.println("main : ExceptionPerso, " + e.getMessage());
			} catch (Exception e) {
				System.out.println("main : " + e.getClass() + ", " + e.getMessage());
			}
		}
	}
	
	private static int fonction(int n) throws ExceptionPerso {
		try {
			switch(n) {
				case 0:
					return 1/n;
				case 1:
					throw new SousExceptionPerso("Pas 1 !");
				default:
					break;
			}
		} catch (SousExceptionPerso e) {
			System.out.println("fonction : SousExceptionPerso, " + e.getMessage());
			throw e;
		}
		
		return 0;
	}
}
