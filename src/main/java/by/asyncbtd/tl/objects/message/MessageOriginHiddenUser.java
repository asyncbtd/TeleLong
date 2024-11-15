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

public class MessageOriginHiddenUser {

    private String type;
    private Integer data;
    private String senderUserName;

    public String getType() {
        return type;
    }

    public Integer getData() {
        return data;
    }

    public String getSenderUserName() {
        return senderUserName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public void setSenderUserName(String senderUserName) {
        this.senderUserName = senderUserName;
    }

    public String toString() {
        return "MessageOriginHiddenUser(type=" + this.type +
                ", data=" + this.data +
                ", senderUserName=" + this.senderUserName + ")";
    }

    public MessageOriginHiddenUser() {
    }

    public MessageOriginHiddenUser(String type, Integer data, String senderUserName) {
        this.type = type;
        this.data = data;
        this.senderUserName = senderUserName;
    }
}
