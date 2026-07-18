package com.github.wechat.ilink.sdk.core.model;

public class RefMessage {
    private MessageItem message_item;
    private String title;

    public RefMessage() {}

    public RefMessage(MessageItem messageItem, String title) {
        this.message_item = messageItem;
        this.title = title;
    }

    public MessageItem getMessage_item() {
        return message_item;
    }

    public void setMessage_item(MessageItem v) {
        message_item = v;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String v) {
        title = v;
    }

    public String getText() {
        if (message_item == null) {
            return title;
        }
        if (message_item.getText_item() != null && message_item.getText_item().getText() != null) {
            return message_item.getText_item().getText();
        }
        return title;
    }
}
