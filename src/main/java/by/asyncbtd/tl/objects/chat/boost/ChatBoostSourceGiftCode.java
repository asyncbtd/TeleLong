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

import by.asyncbtd.tl.objects.User;

public class ChatBoostSourceGiftCode implements ChatBoostSource {

    private String source;
    private User user;

    public String getSource() {
        return source;
    }

    public User getUser() {
        return user;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String toString() {
        return "ChatBoostSourcePremium(source=" + this.getSource() +
                ", user=" + this.getUser() + ")";
    }

    public ChatBoostSourceGiftCode() {
    }

    public ChatBoostSourceGiftCode(String source, User user) {
        this.source = source;
        this.user = user;
    }
}
