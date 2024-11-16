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

package by.asyncbtd.tl.objects.chat.boost;

import by.asyncbtd.tl.objects.chat.Chat;

public class ChatBoostRemoved {

    private Chat chat;
    private String boostId;
    private Integer remove_date;
    private ChatBoostSource source;

    public Chat getChat() {
        return chat;
    }

    public String getBoostId() {
        return boostId;
    }

    public Integer getRemove_date() {
        return remove_date;
    }

    public ChatBoostSource getSource() {
        return source;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setBoostId(String boostId) {
        this.boostId = boostId;
    }

    public void setRemove_date(Integer remove_date) {
        this.remove_date = remove_date;
    }

    public void setSource(ChatBoostSource source) {
        this.source = source;
    }

    public String toString() {
        return "ChatBoostRemoved(chat=" + this.getChat() +
                ", boostId=" + this.getBoostId() +
                ", remove_date=" + this.getRemove_date() +
                ", source=" + this.getSource() + ")";
    }

    public ChatBoostRemoved() {
    }

    public ChatBoostRemoved(Chat chat, String boostId, Integer remove_date, ChatBoostSource source) {
        this.chat = chat;
        this.boostId = boostId;
        this.remove_date = remove_date;
        this.source = source;
    }
}
