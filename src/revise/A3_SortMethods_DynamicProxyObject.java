package revise;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class A3_SortMethods_DynamicProxyObject implements InvocationHandler {
    //
    private Object target;
    private Object proxy;
    //
    public Object bind(Object target,Object proxy){
        this.target = target;
        this.proxy = proxy;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //
        Class clazz = this.proxy.getClass();
        //
        Method start = clazz.getDeclaredMethod("start",new Class[]{Method.class});
        start.invoke(this.proxy,new Object[]{method});
        //
        //result = method.invoke(this.target,args);
        try {
            result = method.invoke(this.target,args);
        }catch (InvocationTargetException e){
            throw  e.getCause();
        }

        //
        Method end = clazz.getDeclaredMethod("end",new Class[]{Method.class});
        end.invoke(this.proxy,new Object[]{method});
        //
        Method time = clazz.getDeclaredMethod("showTime");
        time.invoke(this.proxy);
        //
        return result;
    }
}
