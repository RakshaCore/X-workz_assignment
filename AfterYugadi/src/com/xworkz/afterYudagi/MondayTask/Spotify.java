package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.MusicPlatform;
import com.xworkz.afterYudagi.Internal.OnlineMusicPlatform;

public class Spotify {
    public void useSpotify(MusicPlatform musicPlatform)
    {
        musicPlatform.uploadSong();
        musicPlatform.createPlaylist();
        musicPlatform.streamMusic();
        musicPlatform.downloadMusic();
        musicPlatform.recommendSongs();

        if(musicPlatform instanceof OnlineMusicPlatform)
        {
            OnlineMusicPlatform onlineMusicPlatform=(OnlineMusicPlatform) musicPlatform;
            onlineMusicPlatform.listenSongs();
        }
    }
}
