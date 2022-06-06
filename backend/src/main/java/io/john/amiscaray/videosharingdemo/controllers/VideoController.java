package io.john.amiscaray.videosharingdemo.controllers;

import io.john.amiscaray.videosharingdemo.services.VideoService;
import lombok.AllArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("video")
@AllArgsConstructor
public class VideoController {

    private VideoService videoService;

    // Each parameter annotated with @RequestParam corresponds to a form field where the String argument is the name of the field
    @PostMapping()
    public ResponseEntity<String> saveVideo(@RequestParam("file") MultipartFile file, @RequestParam("name") String name) throws IOException {

        videoService.saveVideo(file, name);
        return ResponseEntity.ok("Video saved successfully.");

    }

    // {name} is a path variable in the url. It is extracted as the String parameter annotated with @PathVariable
    @GetMapping("{name}")
    public ResponseEntity<Resource> getVideoByName(@PathVariable("name") String name){
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-type",
                "video/mp4");
        return ResponseEntity.ok().headers(responseHeaders).body(new ByteArrayResource(videoService.getVideo(name).getData()));

    }

    @GetMapping("all")
    public ResponseEntity<List<String>> getAllVideoNames(){

        return ResponseEntity
                .ok(videoService.getAllVideoNames());

    }

}
