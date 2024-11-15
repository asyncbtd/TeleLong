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

public class MessageOriginChat implements MessageOrigin {

    private String type;
    private Integer data;
    private Chat senderChat;
    private String authorSignature;

    public String getType() {
        return type;
    }

    public Integer getData() {
        return data;
    }

    public Chat getSenderChat() {
        return senderChat;
    }

    public String getAuthorSignature() {
        return authorSignature;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setSenderChat(Chat senderChat) {
        this.senderChat = senderChat;
    }

    public void setAuthor_signature(String authorSignature) {
        this.authorSignature = authorSignature;
    }

    public String toString() {
        return "MessageOriginChat(type=" + this.getType() +
                ", data=" + this.getData() +
                ", senderChat=" + this.getSenderChat() +
                ", author_signature=" + this.authorSignature + ")";
    }

    public MessageOriginChat() {
    }

    public MessageOriginChat(String type, Integer data, Chat senderChat, String authorSignature) {
        this.type = type;
        this.data = data;
        this.senderChat = senderChat;
        this.authorSignature = authorSignature;
    }
}
