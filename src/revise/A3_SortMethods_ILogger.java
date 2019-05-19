package revise;

import java.lang.reflect.Method;

public interface A3_SortMethods_ILogger {
    void start(Method method);
    void end(Method method);
    void showTime();
}
