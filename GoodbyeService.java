

import android.util.Slog;

public class GoodbyeService extends IGoodbyeService.Stub {

	private static final String TAG = "java_binder_GoodbyeService";
	private int cnt1 = 0;
	private int cnt2 = 0;
	
	
	public void saygoodbye() throws android.os.RemoteException {
		cnt1 ++;
		Slog.i(TAG, "saygoodbye : cnt1 = " + cnt1);
	}

	public int saygoodbye_to(java.lang.String name) throws android.os.RemoteException {
		cnt2 ++;

		Slog.i(TAG, "saygoodbye_to name = " + name + ", cnt2 = " + cnt2);

		return cnt2;
	}
}

