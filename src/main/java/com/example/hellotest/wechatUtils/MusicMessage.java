package com.example.hellotest.wechatUtils;

/**
    用于包装音乐的实体
 **/
public class MusicMessage extends BaseMessage {
    private MusicBase Music;

    public MusicBase getMusic() {
        return Music;
    }

    public void setMusic(MusicBase music) {
        Music = music;
    }
}

