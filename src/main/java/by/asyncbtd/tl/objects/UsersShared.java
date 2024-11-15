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

public class UsersShared {

    private Integer requestId;
    private List<SharedUser> users;

    public Integer getRequestId() {
        return requestId;
    }

    public List<SharedUser> getUsers() {
        return users;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public void setUsers(List<SharedUser> users) {
        this.users = users;
    }

    public String toString() {
        return "UsersShared(requestId=" + this.getRequestId() +
                ", users=" + this.getUsers() + ")";
    }

    public UsersShared() {
    }

    public UsersShared(Integer requestId, List<SharedUser> users) {
        this.requestId = requestId;
        this.users = users;
    }
}
