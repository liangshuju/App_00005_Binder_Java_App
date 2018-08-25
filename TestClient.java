/*
 * 1. getService
 * 2. call service function sayhello or sayhello_to
 ************
 */

 // test_client <hello|goodbye [name]>

import android.util.Slog;
import android.os.ServiceManager;
import android.os.IBinder;

public class TestClient {

	private static final String TAG = "binder_java_TestClient";

	public static void main(String args[]) {

		int reply;

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
			IHelloService serviceHello = IHelloService.Stub.asInterface(binderHello);
			if (args.length == 1) {

				try {
					serviceHello.sayhello();
					System.out.println("test_client call sayhello.");
					Slog.i(TAG, "test_client call sayhello.");
				} catch (Exception e) {

				}
			} else if (args.length == 2) {

				try {
					reply = serviceHello.sayhello_to(args[1]);
					System.out.println("test_client call sayhello_to : reply = " + reply);
					Slog.i(TAG, "test_client call sayhello_to : reply = " + reply);
				} catch (Exception e) {

				}
			}
			
		}else if (args[0].equals("goodbye")) {
			/* 1. get service */
			IBinder binderGoodbye = ServiceManager.getService("goodbye");
			if (binderGoodbye == null) {
				System.out.println("can not get goodbye sevice !!");
				Slog.i(TAG, "can not get goodbye sevice !!");
				return ;
			}
			IGoodbyeService serviceGoodbye = IGoodbyeService.Stub.asInterface(binderGoodbye);
			
			/* 2. call function */
			if (args.length == 1) {
				try {
					serviceGoodbye.saygoodbye();
					System.out.println("test_client call saygoodbye .");
					Slog.i(TAG, "test_client call saygoodbye .");
				} catch (Exception e) {

				}
			} else if (args.length == 2) {
				try {
					reply = serviceGoodbye.saygoodbye_to(args[1]);
					System.out.println("test_client call saygoodbye_to. : reply = " + reply);
					Slog.i(TAG, "test_client call saygoodbye_to. : reply = " + reply);
				} catch (Exception e) {
				
				}
			}
		}

	}
 }
