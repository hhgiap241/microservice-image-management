package com.example.imageservice.controller;

import com.example.imageservice.model.Image;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 8/25/2022, Thursday
 * @project: image-service
 **/
@RestController
@RequestMapping("/")
public class ImageController {
    @RequestMapping("/images")
    public ResponseEntity<List<Image>> getImages() {
        List<Image> images = Arrays.asList(
                new Image(1, "Treehouse of Horror V", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
                new Image(2, "The Town", "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
                new Image(3, "The Last Traction Hero", "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112"));
        return ResponseEntity.ok(images);
    }
}
