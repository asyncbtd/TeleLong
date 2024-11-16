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

public class ChatBoostUpdated {

    private Chat chat;
    private ChatBoost boost;

    public Chat getChat() {
        return chat;
    }

    public ChatBoost getBoost() {
        return boost;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setBoost(ChatBoost boost) {
        this.boost = boost;
    }

    public String toString() {
        return "ChatBoostUpdated(chat=" + this.getChat() +
                ", boost=" + this.getBoost() + ")";
    }

    public ChatBoostUpdated() {
    }

    public ChatBoostUpdated(Chat chat, ChatBoost boost) {
        this.chat = chat;
        this.boost = boost;
    }
}
