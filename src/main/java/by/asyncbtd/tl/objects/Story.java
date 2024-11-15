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

package by.asyncbtd.tl.objects;

public class Story {

    private Chat chat;
    private Long id;

    public Chat getChat() {
        return chat;
    }

    public Long getId() {
        return id;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String toString() {
        return "Story(chat=" + this.getChat() +
                ", id=" + this.getId() + ")";
    }

    public Story() {
    }

    public Story(Chat chat, Long id) {
        this.chat = chat;
        this.id = id;
    }
}
