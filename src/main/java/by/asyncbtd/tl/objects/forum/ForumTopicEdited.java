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

package by.asyncbtd.tl.objects.forum;

public class ForumTopicEdited {

    private String name;
    private String iconCustomEmojiId;

    public String getName() {
        return name;
    }

    public String getIconCustomEmojiId() {
        return iconCustomEmojiId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIconCustomEmojiId(String iconCustomEmojiId) {
        this.iconCustomEmojiId = iconCustomEmojiId;
    }

    public String toString() {
        return "ForumTopicEdited(name=" + this.getName() +
                ", iconCustomEmojiId=" + this.getIconCustomEmojiId() + ")";
    }

    public ForumTopicEdited() {
    }

    public ForumTopicEdited(String name, String iconCustomEmojiId) {
        this.name = name;
        this.iconCustomEmojiId = iconCustomEmojiId;
    }
}
