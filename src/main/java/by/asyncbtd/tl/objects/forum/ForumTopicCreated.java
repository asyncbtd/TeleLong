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

public class ForumTopicCreated {

    private String name;
    private Integer iconColor;
    private String iconCustomEmojiId;

    public String getName() {
        return name;
    }

    public Integer getIconColor() {
        return iconColor;
    }

    public String getIconCustomEmojiId() {
        return iconCustomEmojiId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIconColor(Integer iconColor) {
        this.iconColor = iconColor;
    }

    public void setIconCustomEmojiId(String iconCustomEmojiId) {
        this.iconCustomEmojiId = iconCustomEmojiId;
    }

    public String toString() {
        return "ForumTopicCreated(name=" + this.getName() +
                ", iconColor=" + this.getIconColor() +
                ", iconCustomEmojiId=" + this.getIconCustomEmojiId() + ")";
    }

    public ForumTopicCreated() {
    }

    public ForumTopicCreated(String name, Integer iconColor, String iconCustomEmojiId) {
        this.name = name;
        this.iconColor = iconColor;
        this.iconCustomEmojiId = iconCustomEmojiId;
    }
}
