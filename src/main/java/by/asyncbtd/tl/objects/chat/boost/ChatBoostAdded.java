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

public class ChatBoostAdded {

    private Integer boostCount;

    public Integer getBoostCount() {
        return boostCount;
    }

    public void setBoostCount(Integer boostCount) {
        this.boostCount = boostCount;
    }

    public String toString() {
        return "ChatBoostAdded(boostCount=" + this.getBoostCount() +")";
    }

    public ChatBoostAdded() {
    }

    public ChatBoostAdded(Integer boostCount) {
        this.boostCount = boostCount;
    }
}
