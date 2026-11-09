public class Main {

    public static void main(String[] args) {

        System.out.println("=== Remote Proxy ===");

        RealMedia movie = new RealMedia("Inception", 148);
        MediaItem remoteMovie = new RemoteMediaProxy(movie);

        System.out.println(remoteMovie.getTitle());
        System.out.println(remoteMovie.getDuration());
        remoteMovie.play();
        remoteMovie.play();

        System.out.println("\n=== Virtual Proxy ===");

        MediaItem virtualMovie = new VirtualMediaProxy("The Matrix", 136);

        System.out.println("virtual proxy created");

        System.out.println(virtualMovie.getTitle());
        System.out.println(virtualMovie.getDuration());
        virtualMovie.play();
        virtualMovie.play();

    }
}
