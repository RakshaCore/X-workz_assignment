package com.xworkz.afterYudagi.MondayTask;

import com.xworkz.afterYudagi.Internal.OnlineFoodDelivery;
import com.xworkz.afterYudagi.Internal.OnlineStreamingService;
import com.xworkz.afterYudagi.Internal.StreamingService;

public class Netflix {
    public void download(StreamingService streamingService)
    {
        streamingService.browseMovies();
        streamingService.playMovie();
        streamingService.pauseMovie();
        streamingService.adjustQuality();
        streamingService.recommendMovies();

        if(streamingService instanceof OnlineStreamingService)
        {
            OnlineStreamingService onlineStreamingService=(OnlineStreamingService) streamingService;
            onlineStreamingService.feedback();
        }
    }
}
