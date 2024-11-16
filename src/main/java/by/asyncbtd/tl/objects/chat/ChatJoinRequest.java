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

package by.asyncbtd.tl.objects.chat;

import by.asyncbtd.tl.objects.User;

public class ChatJoinRequest {

    private Chat chat;
    private User from;
    private Long userChatId;
    private Integer date;
    private String bio;
    private ChatInviteLink inviteLink;

    public Chat getChat() {
        return chat;
    }

    public User getFrom() {
        return from;
    }

    public Long getUserChatId() {
        return userChatId;
    }

    public Integer getDate() {
        return date;
    }

    public String getBio() {
        return bio;
    }

    public ChatInviteLink getInviteLink() {
        return inviteLink;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setUserChatId(Long userChatId) {
        this.userChatId = userChatId;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setInviteLink(ChatInviteLink inviteLink) {
        this.inviteLink = inviteLink;
    }

    public String toString() {
        return "ChatJoinRequest(chat=" + this.getChat() +
                ", from=" + this.getFrom() +
                ", userChatId=" + this.getUserChatId() +
                ", date=" + this.getDate() +
                ", bio=" + this.getBio() +
                ", inviteLink=" + this.getInviteLink() + ")";
    }

    public ChatJoinRequest() {
    }

    public ChatJoinRequest(Chat chat, User from, Long userChatId, Integer date, String bio, ChatInviteLink inviteLink) {
        this.chat = chat;
        this.from = from;
        this.userChatId = userChatId;
        this.date = date;
        this.bio = bio;
        this.inviteLink = inviteLink;
    }
}
