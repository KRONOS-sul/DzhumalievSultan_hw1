public final class Socket extends Generator {
    private final SocketType socketType;
    private Volt volt;

    public Socket(float power, int produced, SocketType socketType, Volt volt) {
        super(power, produced);
        this.socketType = socketType;
        this.volt = volt;
    }

    public Socket(float power, int produced, SocketType socketType) {
        super(power, produced);
        this.socketType = socketType;
    }

    @Override
    public void genEnvironmentalFriendliness(String environmentalFriendliness) {
        super.genEnvironmentalFriendliness(environmentalFriendliness) ;
    }

    @Override
    public String powerInfo() {
        return super.powerInfo()
                + "\nSocket type : " + socketType.getSocketType()
                + "\nVolt frequency : " + volt;
    }

    public SocketType getSocketType() {
        return socketType;
    }

    public Volt getVolt() {
        return volt;
    }
}
