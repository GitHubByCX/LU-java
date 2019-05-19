package revise;

import java.lang.reflect.Method;

public class A3_SortMethods_ImplLogger implements A3_SortMethods_ILogger{
    //
    private long startTime,endTime;

    @Override
    public void start(Method method) {
        startTime = System.currentTimeMillis();
        System.out.println("methods name : "+method.getName()+" ---- start time : "+startTime);
        //return startTime;
    }
    @Override
    public void end(Method method) {
        endTime = System.currentTimeMillis();
        System.out.println("methods name : "+method.getName()+" ---- start time : "+endTime);
        //return endTime;
    }

    @Override
    public void showTime() {
        System.out.println("用时 : "+(endTime-startTime)+" 毫秒.");
    }
}
