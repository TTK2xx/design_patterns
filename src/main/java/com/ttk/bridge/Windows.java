package com.ttk.bridge;

/**
 * @Author TTK
 * @Description 扩展抽象化角色(windows操作系统)
 * @Version 1.0
 */
public class Windows extends OpratingSystem {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
