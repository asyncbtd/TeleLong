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

public class ChatMemberOwner {

    private String status;
    private User user;
    private Boolean isAnonymous;
    private String customTitle;

    public String getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }

    public Boolean getIsAnonymous() {
        return isAnonymous;
    }

    public String getCustomTitle() {
        return customTitle;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setIsAnonymous(Boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public void setCustomTitle(String customTitle) {
        this.customTitle = customTitle;
    }

    public String toString() {
        return "ChatMemberOwner(status=" + this.getStatus() +
                ", user=" + this.getUser() +
                ", isAnonymous=" + this.getIsAnonymous() +
                ", customTitle=" + this.getCustomTitle() + ")";
    }

    public ChatMemberOwner() {
    }

    public ChatMemberOwner(String status, User user, Boolean isAnonymous, String customTitle) {
        this.status = status;
        this.user = user;
        this.isAnonymous = isAnonymous;
        this.customTitle = customTitle;
    }
}
