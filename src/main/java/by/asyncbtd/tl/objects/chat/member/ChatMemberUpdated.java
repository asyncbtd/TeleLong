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

package by.asyncbtd.tl.objects.chat.member;

import by.asyncbtd.tl.objects.User;
import by.asyncbtd.tl.objects.chat.Chat;
import by.asyncbtd.tl.objects.chat.ChatInviteLink;

public class ChatMemberUpdated {

    private Chat chat;
    private User from;
    private Integer date;
    private ChatMember oldChatMember;
    private ChatMember newChatMember;
    private ChatInviteLink inviteLink;
    private Boolean viaJoinRequest;
    private Boolean viaChatFolderInviteLink;

    public Chat getChat() {
        return chat;
    }

    public User getFrom() {
        return from;
    }

    public Integer getDate() {
        return date;
    }

    public ChatMember getOldChatMember() {
        return oldChatMember;
    }

    public ChatMember getNewChatMember() {
        return newChatMember;
    }

    public ChatInviteLink getInviteLink() {
        return inviteLink;
    }

    public Boolean getViaJoinRequest() {
        return viaJoinRequest;
    }

    public Boolean getViaChatFolderInviteLink() {
        return viaChatFolderInviteLink;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setOldChatMember(ChatMember oldChatMember) {
        this.oldChatMember = oldChatMember;
    }

    public void setNewChatMember(ChatMember newChatMember) {
        this.newChatMember = newChatMember;
    }

    public void setInviteLink(ChatInviteLink inviteLink) {
        this.inviteLink = inviteLink;
    }

    public void setViaJoinRequest(Boolean viaJoinRequest) {
        this.viaJoinRequest = viaJoinRequest;
    }

    public void setViaChatFolderInviteLink(Boolean viaChatFolderInviteLink) {
        this.viaChatFolderInviteLink = viaChatFolderInviteLink;
    }

    public String toString() {
        return "ChatMemberUpdated(chat=" + this.getChat() +
                ", from=" + this.getFrom() +
                ", date=" + this.getDate() +
                ", oldChatMember=" + this.getOldChatMember() +
                ", newChatMember=" + this.getNewChatMember() +
                ", inviteLink=" + this.getInviteLink() +
                ", viaJoinRequest=" + this.getViaJoinRequest() +
                ", viaChatFolderInviteLink=" + this.getViaChatFolderInviteLink() + ")";
    }

    public ChatMemberUpdated() {
    }

    public ChatMemberUpdated(Chat chat, User from, Integer date, ChatMember oldChatMember, ChatMember newChatMember, ChatInviteLink inviteLink,
                             Boolean viaJoinRequest, Boolean viaChatFolderInviteLink) {
        this.chat = chat;
        this.from = from;
        this.date = date;
        this.oldChatMember = oldChatMember;
        this.newChatMember = newChatMember;
        this.inviteLink = inviteLink;
        this.viaJoinRequest = viaJoinRequest;
        this.viaChatFolderInviteLink = viaChatFolderInviteLink;
    }
}
