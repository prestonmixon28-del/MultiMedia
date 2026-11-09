public class Main {

    public static void main(String[] args) {

        RealMedia movie = new RealMedia("The Adventure Movie", 120);

        MediaItem remoteMovie = new RemoteMediaProxy(movie);

        System.out.println("Title: " + remoteMovie.getTitle());

        System.out.println("Duration: " + remoteMovie.getDuration() + " seconds");

        remoteMovie.play();

    }
}