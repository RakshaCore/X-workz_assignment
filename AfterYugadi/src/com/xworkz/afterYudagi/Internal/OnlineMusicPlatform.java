package com.xworkz.afterYudagi.Internal;

public class OnlineMusicPlatform extends  MusicPlatform{
    public OnlineMusicPlatform() {
        System.out.println("OnlineMusicPlatform Constructor");
    }
    @Override
    public void uploadSong() {
        System.out.println("Music platform is uploading a song");
    }
    @Override
    public void createPlaylist() {
        System.out.println("Music platform is creating a playlist");
    }
    @Override
    public void streamMusic() {
        System.out.println("Music platform is streaming music");
    }
    @Override
    public void downloadMusic() {
        System.out.println("Music platform is allowing music downloads");
    }
    @Override
    public void recommendSongs() {
        System.out.println("Music platform is recommending songs");
    }
}
