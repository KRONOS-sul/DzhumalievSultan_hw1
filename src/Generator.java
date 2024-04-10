public class Generator extends Energy {
    private int produced;

    public Generator(float power, int produced) {
        super(power);
        this.produced = produced;
    }

    public void genEnvironmentalFriendliness(String environmentalFriendliness) {
        System.out.println
                ("Gen's Environmental Friendliness is -> " + environmentalFriendliness);
    }

    public final void genEnvironmentalFriendliness() {
        System.out.println
                ("Gen is not environmental friendly");
    }


    @Override
    public String powerInfo() {
        return super.powerInfo() + "\nEnergy produced : " + produced;
    }

    public int getProduced() {
        return produced;
    }

}
