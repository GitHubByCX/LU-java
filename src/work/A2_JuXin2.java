package work;

public class A2_JuXin2 extends A2_JuXin{
    //属性
    private double x;
    private double y;
    private double z;

    //构造器
    public A2_JuXin2(double x,double y,double z){
        super(x,y);
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public A2_JuXin2(){

    }

    //自定义方法
    public double jiShuanTiJi() {
        return (x+y+z)/2;
    }

    @Override
    public double jiShuanMianJi() {
        return super.jiShuanMianJi();
    }
}
