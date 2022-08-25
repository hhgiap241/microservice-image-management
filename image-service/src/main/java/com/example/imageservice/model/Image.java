package com.example.imageservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : giaphoang
 * @mailto : hoanghuugiap241@gmail.com
 * @created : 8/25/2022, Thursday
 * @project: image-service
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    private Integer id;
    private String title;
    private String url;
}
