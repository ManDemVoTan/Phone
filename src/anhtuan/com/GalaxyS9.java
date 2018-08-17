package anhtuan.com;

public class GalaxyS9 extends SmartPhone {
    GalaxyS9() {
        double r = Math.random();
        this.setName("Galaxy S9");
        this.setId(this.getName() + " " + r);
    }
}
