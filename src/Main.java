public class Main {

    public static void main(String[] args) {

        System.out.println("--- Remote Proxy ---");

        RealMedia movie = new RealMedia("The Adventure Movie", 120);
        MediaItem remoteMovie = new RemoteMediaProxy(movie);

        System.out.println(remoteMovie.getTitle());
        remoteMovie.play();

        System.out.println("\n--- Virtual Proxy ---");

        MediaItem virtualMovie =
                new VirtualMediaProxy("Space Adventure", 150);

        System.out.println("Virtual proxy created.");

        System.out.println(virtualMovie.getTitle());
        virtualMovie.play();

    }
}
