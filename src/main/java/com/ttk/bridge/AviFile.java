package com.ttk.bridge;

/**
 * @Author TTK
 * @Description avi视频文件（具体的实现化角色）
 * @Version 1.0
 */
public class AviFile implements VideoFile {

    public void decode(String fileName) {
        System.out.println("avi视频文件 ：" + fileName);
    }
}
