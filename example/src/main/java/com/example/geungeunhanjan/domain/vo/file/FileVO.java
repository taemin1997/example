package com.example.geungeunhanjan.domain.vo.file;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class FileVO {
    private Long fileId;
    private String fileProfileName;
    private String fileProfileSource;
    private String fileBackName;
    private String fileBackSource;
    private Long userId;
}
