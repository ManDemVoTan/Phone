package anhtuan.com;

public class GalaxyNote9 extends SmartPhone {

    public GalaxyNote9() {
        double r = Math.random();
        this.setName("Galaxy Note 9");
        this.setId(this.getName() + " " + r);
    }
}
