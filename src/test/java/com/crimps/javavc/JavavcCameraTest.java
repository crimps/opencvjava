package com.crimps.javavc;


public class JavavcCameraTest {

    @org.junit.Test
    public void recordCamera() throws Exception {
//        JavavcCamera.recordCamera("output.mp4",25);
        JavavcCamera.recordCamera("rtmp://10.83.3.46/live/record1",25);
    }
}