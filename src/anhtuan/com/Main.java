package anhtuan.com;

public class Main {


    public static void main(String[] args) {

        Subject service = new NewsService();

        SmartPhone galaxyS9 = new GalaxyS9();
        galaxyS9.setOn(Math.random() % 2 == 0);

        SmartPhone galaxyS92 = new GalaxyS9();
        galaxyS92.setOn(Math.random() % 2 == 0);

        SmartPhone galaxyNote9 = new GalaxyNote9();
        galaxyNote9.setOn(true);

        SmartPhone iPhoneX = new IphoneX();
        iPhoneX.setOn(true);


        service.subscribe(galaxyS9);
        service.subscribe(galaxyNote9);
        service.subscribe(galaxyS92);
        service.subscribe(iPhoneX);
        service.unsubscribe(iPhoneX);

        service.notifyObservers();

    }

}
