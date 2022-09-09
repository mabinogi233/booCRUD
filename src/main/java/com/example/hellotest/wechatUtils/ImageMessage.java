package com.example.hellotest.wechatUtils;


/**
图片消息
 **/
public class ImageMessage extends BaseMessage {
    private ImageBase Image ;

    public ImageBase getImageBase() {
        return Image;
    }

    public void setImageBase(ImageBase Image) {
        this.Image = Image;
    }
}
