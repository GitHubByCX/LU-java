package revise;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class A2_DynamicProxy_Hello implements InvocationHandler {
    //
    private  Object target;
    //
    public Object bind(Object object){
        this.target = object;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }
    //
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        A2_proxy_Logger.begin();
        result = method.invoke(this.target,args);
        A2_proxy_Logger.end();
        return result;
    }
}
