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

package by.asyncbtd.tl.objects.reaction;

public class ReactionType {

    private String type;
    private String emoji;

    public String getType() {
        return type;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public String toString() {
        return "ReactionType(type=" + this.getType() +
                ", emoji=" + this.getEmoji() + ")";
    }

    public ReactionType() {
    }

    public ReactionType(String type, String emoji) {
        this.type = type;
        this.emoji = emoji;
    }
}
