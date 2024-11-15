/*
 * Copyright 2024 asyncbtd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package by.asyncbtd.tl.objects.message;

import by.asyncbtd.tl.objects.Chat;

public class MessageOriginChannel implements MessageOrigin {

    private String type;
    private Integer date;
    private Chat chat;
    private Long messageId;
    private String authorSignature;

    public String getType() {
        return type;
    }

    public Integer getDate() {
        return date;
    }

    public Chat getChat() {
        return chat;
    }

    public Long getMessageId() {
        return messageId;
    }

    public String getAuthorSignature() {
        return authorSignature;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public void setAuthorSignature(String authorSignature) {
        this.authorSignature = authorSignature;
    }

    public String toString() {
        return "MessageOriginChannel(type=" + this.type +
                ", date=" + this.date +
                ", chat=" + this.chat +
                ", messageId=" + this.messageId +
                ", authorSignature=" + this.authorSignature + ")";
    }

    public MessageOriginChannel() {
    }

    public MessageOriginChannel(String type, Integer date, Chat chat, Long messageId, String authorSignature) {
        this.type = type;
        this.date = date;
        this.chat = chat;
        this.messageId = messageId;
        this.authorSignature = authorSignature;
    }
}
