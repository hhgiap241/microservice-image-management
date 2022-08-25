package com.example.galleryservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 8/25/2022, Thursday
 * @project: image-service
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gallery {
    private Integer id;
    private List<Object> images;
}
