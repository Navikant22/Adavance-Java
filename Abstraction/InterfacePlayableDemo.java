interface Playable {
    void play();
    void pause();
    void stop();
}

class AudioPlayer implements Playable {

    public void play() {
        System.out.println("Audio is playing");
    }

    public void pause() {
        System.out.println("Audio is paused");
    }

    public void stop() {
        System.out.println("Audio is stopped");
    }
}

class VideoPlayer implements Playable {

    public void play() {
        System.out.println("Video is playing");
    }

    public void pause() {
        System.out.println("Video is paused");
    }

    public void stop() {
        System.out.println("Video is stopped");
    }
}

public class InterfacePlayableDemo {
    public static void main(String[] args) {

        Playable p;

        p = new AudioPlayer();
        p.play();
        p.pause();
        p.stop();

        System.out.println("------");

        p = new VideoPlayer();
        p.play();
        p.pause();
        p.stop();
    }
}
