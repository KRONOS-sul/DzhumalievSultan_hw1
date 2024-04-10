public class Energy {
    private float power;

    public Energy(float power) {
        this.power = power;
    }

    public String powerInfo() {
        return "Energy power : " + power;
    }

    public float getPower() {
        return power;
    }

}
