package lab_05_1;
public class Main_32 {
    public static void main(String[] args) {
        Plane p1 = new Plane();
        p1.setPlaneInfo(300, "High");
        p1.showPlaneInfo();
        p1.fly();
        p1.showPlaneInfo();
        p1.fly();
        p1.showPlaneInfo();
    }
}
