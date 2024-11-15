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

package by.asyncbtd.tl.objects.message;

import by.asyncbtd.tl.objects.User;

public class MessageOriginUser implements MessageOrigin {

    private String type;
    private Integer date;
    private User senderUser;

    public String getType() {
        return type;
    }

    public Integer getDate() {
        return date;
    }

    public User getSenderUser() {
        return senderUser;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void setSenderUser(User senderUser) {
        this.senderUser = senderUser;
    }

    @Override
    public String toString() {
        return "MessageOriginUser(type=" + this.type +
                ", date=" + this.date +
                ", senderUser=" + this.senderUser + ")";
    }

    public MessageOriginUser() {
    }

    public MessageOriginUser(String type, Integer date, User senderUser) {
        this.type = type;
        this.date = date;
        this.senderUser = senderUser;
    }
}
