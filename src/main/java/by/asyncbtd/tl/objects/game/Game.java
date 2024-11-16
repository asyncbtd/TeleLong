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

package by.asyncbtd.tl.objects.game;

import by.asyncbtd.tl.objects.Animation;
import by.asyncbtd.tl.objects.message.MessageEntity;
import by.asyncbtd.tl.objects.PhotoSize;

import java.util.List;

public class Game {

    private String title;
    private String description;
    private List<PhotoSize> photo;
    private String text;
    private List <MessageEntity> textEntities;
    private Animation animation;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public String getText() {
        return text;
    }

    public List<MessageEntity> getTextEntities() {
        return textEntities;
    }

    public Animation getAnimation() {
        return animation;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTextEntities(List<MessageEntity> textEntities) {
        this.textEntities = textEntities;
    }

    public void setAnimation(Animation animation) {
        this.animation = animation;
    }

    public String toString() {
        return "Game(title=" + this.getTitle() +
                ", description=" + this.getDescription() +
                ", photo=" + this.getPhoto() +
                ", text=" + this.getText() +
                ", textEntities=" + this.getTextEntities() +
                ", animation=" + this.getAnimation() + ")";
    }

    public Game() {
    }

    public Game(String title, String description, List<PhotoSize> photo, String text, List<MessageEntity> textEntities, Animation animation) {
        this.title = title;
        this.description = description;
        this.photo = photo;
        this.text = text;
        this.textEntities = textEntities;
        this.animation = animation;
    }
}
