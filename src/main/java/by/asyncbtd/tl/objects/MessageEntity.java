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

public class MessageEntity {

    private String type;
    private Integer offset;
    private Integer length;
    private String url;
    private User user;
    private String language;
    private String customEmojiId;

    public String getType() {
        return type;
    }

    public Integer getOffset() {
        return offset;
    }

    public Integer getLength() {
        return length;
    }

    public String getUrl() {
        return url;
    }

    public User getUser() {
        return user;
    }

    public String getLanguage() {
        return language;
    }

    public String getCustomEmojiId() {
        return customEmojiId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCustomEmojiId(String customEmojiId) {
        this.customEmojiId = customEmojiId;
    }

    public String toString() {
        return "MessageEntity(type=" + this.getType() +
                ", offset=" + this.getOffset() +
                ", length=" + this.getLength() +
                ", url=" + this.getUrl() +
                ", user=" + this.getUser() +
                ", language=" + this.getLanguage() +
                ", customEmojiId=" + this.getCustomEmojiId() + ")";
    }

    public MessageEntity() {
    }

    public MessageEntity(String type, Integer offset, Integer length, String url, User user, String language, String customEmojiId) {
        this.type = type;
        this.offset = offset;
        this.length = length;
        this.url = url;
        this.user = user;
        this.language = language;
        this.customEmojiId = customEmojiId;
    }
}
