package callingMethod.Sector;

public class Main {
    void Sector() {
        float radius = 5.2f;
        int angle = 60;
        float result = 3.142f * radius * radius * (angle / 360.0f);
        System.out.println("Area of sector: " + result);
    }

    public static void main(String[] args) {
        new Main().Sector();
    }
}

