package eth.vote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/overview")
public class OverviewController {

    @RequestMapping("/layout")
    public String getCarPartialPage() {
        return "/views/overview/layout.html";
    }
    
    @RequestMapping("/liveStream")
    public String getLivestreamPage() {
        return "/views/liveStream/liveStream.html";
    }
    
    @RequestMapping("/liveStreamPublisher")
    public String getLivestreamPublisherPage() {
        return "/views/liveStream/liveStreamPublisher.html";
    }
    

    
    
    @RequestMapping("/topicPublisher")
    public String getTopicPublisherPage() {
        return "/views/liveStream/topicPublisher.html";
    }
    
    @RequestMapping("/publisher")
    public String getPublisherPage() {
        return "/views/overview/publisher.html";
    }
    
    
    
}
