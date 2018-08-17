package anhtuan.com;

public class SmartPhone implements Observer {
    private boolean phoneState;
    private String id;
    private String name;

    public SmartPhone() {
    }

    public SmartPhone(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return phoneState;
    }

    public void setOn(boolean phoneState) {
        this.phoneState = phoneState;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void update() {
        if (isOn()) {
            System.out.println("phone with id: " + id + " name: " + name + " has received notification");
        }
    }
}
