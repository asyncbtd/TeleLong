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

import by.asyncbtd.tl.objects.Chat;
import by.asyncbtd.tl.objects.User;

import java.util.List;

public class MessageReactionUpdated {

    private Chat chat;
    private Integer messageId;
    private User user;
    private Chat actorChat;
    private Integer date;
    private List<ReactionType> oldReaction;
    private List<ReactionType> newReaction;

    public Chat getChat() {
        return chat;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public User getUser() {
        return user;
    }

    public Chat getActorChat() {
        return actorChat;
    }

    public Integer getDate() {
        return date;
    }

    public List<ReactionType> getOldReaction() {
        return oldReaction;
    }

    public List<ReactionType> getNewReaction() {
        return newReaction;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setActorChat(Chat actorChat) {
        this.actorChat = actorChat;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setOldReaction(List<ReactionType> oldReaction) {
        this.oldReaction = oldReaction;
    }

    public void setNewReaction(List<ReactionType> newReaction) {
        this.newReaction = newReaction;
    }

    public String toString() {
        return "MessageReactionUpdated(chat=" + this.getChat() +
                ", messageId=" + this.getMessageId() +
                ", user=" + this.getUser() +
                ", actorChat=" + this.getActorChat() +
                ", date=" + this.getDate() +
                ", oldReaction=" + this.getOldReaction() +
                ", newReaction=" + this.getNewReaction() + ")";
    }

    public MessageReactionUpdated() {
    }

    public MessageReactionUpdated(Chat chat, Integer messageId, User user, Chat actorChat, Integer date, List<ReactionType> oldReaction, List<ReactionType> newReaction) {
        this.chat = chat;
        this.messageId = messageId;
        this.user = user;
        this.actorChat = actorChat;
        this.date = date;
        this.oldReaction = oldReaction;
        this.newReaction = newReaction;
    }
}
