package com.sitp.tjvideo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sitp.tjvideo.mapper")
public class TjvideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TjvideoApplication.class, args);
    }
}
