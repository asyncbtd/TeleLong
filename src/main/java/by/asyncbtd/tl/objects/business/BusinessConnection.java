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

import by.asyncbtd.tl.objects.User;

public class BusinessConnection {

    private String id;
    private User user;
    private Long userChatId;
    private Integer date;
    private Boolean canReply;
    private Boolean isEnabled;

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Long getUserChatId() {
        return userChatId;
    }

    public Integer getDate() {
        return date;
    }

    public Boolean getCanReply() {
        return canReply;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserChatId(Long userChatId) {
        this.userChatId = userChatId;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setCanReply(Boolean canReply) {
        this.canReply = canReply;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public String toString() {
        return "BusinessConnection(id=" + this.id +
                ", user=" + this.user +
                ", userChatId=" + this.userChatId +
                ", date=" + this.date +
                ", canReply" + this.canReply +
                ", isEnable" + this.isEnabled + ")";
    }

    public BusinessConnection() {
    }

    public BusinessConnection(String id, User user, Long userChatId, Integer date, Boolean canReply, Boolean isEnabled) {
        this.id = id;
        this.user = user;
        this.userChatId = userChatId;
        this.date = date;
        this.canReply = canReply;
        this.isEnabled = isEnabled;
    }
}
