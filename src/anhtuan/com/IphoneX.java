package anhtuan.com;

public class IphoneX extends SmartPhone {
    public IphoneX() {
        double r = Math.random();
        this.setName("Iphone X");
        this.setId(this.getName() + " " + r);
    }
}
