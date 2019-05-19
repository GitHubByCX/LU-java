package revise;

import java.util.Date;

public class A2_proxy_Logger {
    public static void begin(){
        System.out.println("begin:"+new Date());
    }
    public static void end(){
        System.out.println("end:"+new Date());
    }
}
