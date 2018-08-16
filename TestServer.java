
/*
 * 1. addService
 * 2. while(true) { read data, parse data, call function, reply }
 *
 **********/

public class TestServer {

	private static final String TAG = "java_binder_TestServer";

	public static void main(String args[]) {

		/* add server */
        Slog.i(TAG, " add hello server.");
		ServiceManager.addService("hello", new HelloService());

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
					
			}
		}
	}
}



	
 
