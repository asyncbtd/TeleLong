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

import java.util.List;

public class ChatShared {

    private Integer requestId;
    private Long chatId;
    private String title;
    private String username;
    private List<PhotoSize> photo;

    public Integer getRequestId() {
        return requestId;
    }

    public Long getChatId() {
        return chatId;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public String toString() {
        return "ChatShared(requestId=" + this.getRequestId() +
                ", chatId=" + this.getChatId() +
                ", title=" + this.getTitle() +
                ", username=" + this.getUsername() +
                ", photo=" + this.getPhoto() + ")";
    }

    public ChatShared() {
    }

    public ChatShared(Integer requestId, Long chatId, String title, String username, List<PhotoSize> photo) {
        this.requestId = requestId;
        this.chatId = chatId;
        this.title = title;
        this.username = username;
        this.photo = photo;
    }
}
