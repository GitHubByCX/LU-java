package revise;

public class A2_proxy_ProxyHello implements A2_proxy_IHello{
    private A2_proxy_IHello iHello;
    public A2_proxy_ProxyHello(A2_proxy_IHello iHello){
        super();
        this.iHello = iHello;
    }
    @Override
    public void sayHi() {
        A2_proxy_Logger.begin();
        iHello.sayHi();
        A2_proxy_Logger.end();
    }
}
