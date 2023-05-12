
public class TwoThread extends Thread {
        final static int N = 10;
	public void run() {
		for ( int i = 0; i < N; i++ ) {
			System.out.print(i % 50 == 0 ? "\n" : "" + "- ");
		}
	}

	public static void main(String[] args) {
		TwoThread tt = new TwoThread();
		tt.start();

		for ( int i = 0; i < N; i++ ) {
			System.out.print(i % 50 == 0 ? "\n" : "" + "* ");
		}
        }
}

