public class Main {
    public static void main(String[] args) {

        Generator generator = new Generator(25, 50);

        System.out.println(generator.powerInfo());
        generator.genEnvironmentalFriendliness();


        SocketType socketTypeA = new SocketType("Japanese");
        Socket socketA = new Socket(10, 500, socketTypeA, Volt.V110);

        System.out.println("--------------\n" + socketA.powerInfo());
        socketA.genEnvironmentalFriendliness("About 60%");

        SocketType socketTypeB = new SocketType("Kyrgyz");
        Socket socketB = new Socket(22, 1000, socketTypeB, Volt.V220);
        System.out.println("--------------\n" + socketB.powerInfo());
        socketB.genEnvironmentalFriendliness();
    }
}