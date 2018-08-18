
/* realize hello service function */

import android.util.Slog;


public class HelloService extends IHelloService.Stub {

	private static final String TAG = "java_binder_HelloService";
	private int cnt1 = 0;
	private int cnt2 = 0;

	public void sayhello() throws android.os.RemoteException {
		cnt1 ++;
		Slog.i(TAG, "sayhello : cnt1 = " + cnt1);
	}
	
	public int sayhello_to(java.lang.String name) throws android.os.RemoteException {
		cnt2 ++;
		Slog.i(TAG, "sayhello_to : name = " + name + ", cnt2 = " + cnt2);
		
		return cnt2;
	}
}

