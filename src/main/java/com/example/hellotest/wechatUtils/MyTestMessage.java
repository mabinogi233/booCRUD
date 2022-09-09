package com.example.hellotest.wechatUtils;

/**
 文本消息的内容
 **/
public class MyTestMessage  extends BaseMessage{
    private String Content;
    private String  MsgId;

    public String getContent() {
        return Content;
    }


    public void setContent(String content) {
        Content = content;
    }

    public String getMsgId() {
        return MsgId;
    }

    public void setMsgId(String msgId) {
        MsgId = msgId;
    }
}
