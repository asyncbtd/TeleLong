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

package by.asyncbtd.tl.objects.reaction;

import by.asyncbtd.tl.objects.chat.Chat;

import java.util.List;

public class MessageReactionCountUpdated {

    private Chat chat;
    private Integer messageId;
    private Integer date;
    private List<ReactionCount> reactions;

    public Chat getChat() {
        return chat;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public Integer getDate() {
        return date;
    }

    public List<ReactionCount> getReactions() {
        return reactions;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setReactions(List<ReactionCount> reactions) {
        this.reactions = reactions;
    }

    public String toString() {
        return "MessageReactionCountUpdated(chat=" + this.getChat() +
                ", messageId=" + this.getMessageId() +
                ", date=" + this.getDate() +
                ", reactions=" + this.getReactions() + ")";
    }

    public MessageReactionCountUpdated() {
    }

    public MessageReactionCountUpdated(Chat chat, Integer messageId, Integer date, List<ReactionCount> reactions) {
        this.chat = chat;
        this.messageId = messageId;
        this.date = date;
        this.reactions = reactions;
    }
}
