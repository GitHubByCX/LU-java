package revise;

public class A2_DynamicProxy_TestHello {
    public static void main(String[] args) {
        A2_proxy_IHello iHello = (A2_proxy_IHello)new A2_DynamicProxy_Hello().bind(new A2_proxy_ImplHello());
        iHello.sayHi();
    }
}
