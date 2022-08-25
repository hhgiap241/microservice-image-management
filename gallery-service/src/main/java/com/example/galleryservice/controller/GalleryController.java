package com.example.galleryservice.controller;

import com.example.galleryservice.model.Gallery;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 8/25/2022, Thursday
 * @project: image-service
 **/
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class GalleryController {
    private final RestTemplate restTemplate;
    private final Environment env;

    @GetMapping("/")
    public ResponseEntity<String> home() {
        String message = "Hello from Gallery Service running at port: " + env.getProperty("local.server.port");
        return ResponseEntity.ok(message);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gallery> getGallery(@PathVariable Integer id) {
        Gallery gallery = new Gallery();
        gallery.setId(id);
        List<Object> images = restTemplate.getForObject("http://image-service/images/", List.class);
        gallery.setImages(images);
        return ResponseEntity.ok(gallery);
    }
}
