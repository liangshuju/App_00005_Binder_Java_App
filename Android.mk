LOCAL_PATH:= $(call my-dir)
    
include $(CLEAR_VARS)
LOCAL_SRC_FILES := IHelloService.java HelloService.java IGoodbyeService.java GoodbyeService.java TestServer.java
   
LOCAL_MODULE := TestServer
include $(BUILD_JAVA_LIBRARY)

include $(CLEAR_VARS)
LOCAL_SRC_FILES := IHelloService.java HelloService.java IGoodbyeService.java GoodbyeService.java TestClient.java
   
LOCAL_MODULE := TestClient
include $(BUILD_JAVA_LIBRARY)
