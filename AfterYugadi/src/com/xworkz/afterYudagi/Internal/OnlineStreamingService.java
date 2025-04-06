package com.xworkz.afterYudagi.Internal;

public class OnlineStreamingService extends StreamingService {
    public OnlineStreamingService() {
        System.out.println("OnlineStreamingService Constructor");
    }
    @Override
    public void browseMovies() {
        System.out.println("StreamingService is browsing movies");
    }
    @Override
    public void playMovie() {
        System.out.println("StreamingService is playing a movie");
    }
    @Override
    public void pauseMovie() {
        System.out.println("StreamingService is pausing a movie");
    }
    @Override
    public void adjustQuality() {
        System.out.println("StreamingService is adjusting video quality");
    }
    @Override
    public void recommendMovies() {
        System.out.println("StreamingService is recommending movies");
    }
}
