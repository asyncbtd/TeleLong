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

public class TextQuote {

    private String text;
    private List<MessageEntity> entities;
    private Integer position;
    private Boolean isManual;

    public String getText() {
        return text;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public Integer getPosition() {
        return position;
    }

    public Boolean getIsManual() {
        return isManual;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setEntities(List<MessageEntity> entities) {
        this.entities = entities;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public void setIsManual(Boolean isManual) {
        this.isManual = isManual;
    }

    public String toString() {
        return "TextQuote(text=" + this.getText() +
                ", entities=" + this.getEntities() +
                ", position=" + this.getPosition() +
                ", isManual=" + this.getIsManual() + ")";
    }

    public TextQuote() {
    }

    public TextQuote(String text, List<MessageEntity> entities, Integer position, Boolean isManual) {
        this.text = text;
        this.entities = entities;
        this.position = position;
        this.isManual = isManual;
    }
}
