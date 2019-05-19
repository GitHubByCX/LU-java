package revise;

public class A2_proxy_TestHello {
    public static void main(String[] args) {
        A2_proxy_IHello iHello = new A2_proxy_ProxyHello(new A2_proxy_ImplHello());
        iHello.sayHi();
    }
}
