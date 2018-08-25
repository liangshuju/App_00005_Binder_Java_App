
/*
 * 1. addService
 * 2. while(true) { read data, parse data, call function, reply }
 *
 **********/

import android.util.Slog;
import android.os.ServiceManager;


public class TestServer {

	private static final String TAG = "binder_java_TestServer";

	public static void main(String args[]) {

		/* add server */
        Slog.i(TAG, "liangsj add hello server.");
		ServiceManager.addService("hello", new HelloService());
		
		Slog.i(TAG, "liangsj add goodbye server.");
		ServiceManager.addService("goodbye", new GoodbyeService());

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
					
			}
		}
	}
}



	
 
