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

package by.asyncbtd.tl.objects.business;

import by.asyncbtd.tl.objects.Chat;

import java.util.List;

public class BusinessMessagesDeleted {

    private String businessConnectionId;
    private Chat chat;
    private List<Integer> messageIds;

    public String getBusinessConnectionId() {
        return businessConnectionId;
    }

    public Chat getChat() {
        return chat;
    }

    public List<Integer> getMessageIds() {
        return messageIds;
    }

    public void setBusinessConnectionId(String businessConnectionId) {
        this.businessConnectionId = businessConnectionId;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    public String toString() {
        return "BusinessMessagesDeleted(businessConnectionId=" + this.businessConnectionId +
                ", chat=" + this.chat +
                ", messageIds=" + this.messageIds + ")";
    }

    public BusinessMessagesDeleted() {
    }

    public BusinessMessagesDeleted(String businessConnectionId, Chat chat, List<Integer> messageIds) {
        this.businessConnectionId = businessConnectionId;
        this.chat = chat;
        this.messageIds = messageIds;
    }
}
