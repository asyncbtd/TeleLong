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

public class ChatMemberMember implements ChatMember {

    private String status;
    private User user;
    private Integer untilDate;

    public String getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }

    public Integer getUntilDate() {
        return untilDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUntilDate(Integer untilDate) {
        this.untilDate = untilDate;
    }

    public String toString() {
        return "ChatMemberMember(status=" + this.getStatus() +
                ", user=" + this.getUser() +
                ", untilDate=" + this.getUntilDate() + ")";
    }

    public ChatMemberMember() {
    }

    public ChatMemberMember(String status, User user, Integer untilDate) {
        this.status = status;
        this.user = user;
        this.untilDate = untilDate;
    }
}
