/*
 * 1. getService
 * 2. call service function sayhello or sayhello_to
 ************
 */

 // test_client <hello|goodbye [name]>

 public class TestClient {

	private static final String TAG = "java_binder_TestClient";

	public static void main(String args[]) {

		if (args.length == 0) {
			System.out.println("Usage : need parameter: <hello|goodbye> [name]");
			Slog.i(TAG, "Usage : need parameter: <hello|goodbye> [name]");
			return ;
		}


		if (args[0].equals("hello")) {
			/* 1. get sevice */
			IBinder binderHello = ServiceManager.getService("hello");
			if (binderHello == null) {
				System.out.println("can not get hello sevice !!");
				Slog.i(TAG, "can not get hello sevice !!");
				return ;
			}

			/* 2. call service function */
			IHelloService serviceHello = IHelloService.Stub.asBinder(binderHello);
			if (args.length == 1) {
				serviceHello.sayhello();
				System.out.println(TAG, "test_client call sayhello.");
				Slog.i(TAG, "test_client call sayhello.");
			} else if (args.length == 2) {
				serviceHello.sayhello_to(args[1]);
				System.out.println(TAG, "test_client call sayhello_to ");
				Slog.i(TAG, );
			}
			
		}

	}
 }
