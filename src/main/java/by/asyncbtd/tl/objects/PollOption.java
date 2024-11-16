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

import by.asyncbtd.tl.objects.message.MessageEntity;

import java.util.List;

public class PollOption {

    private String text;
    private List<MessageEntity> textEntities;
    private Integer voterCount;

    public String getText() {
        return text;
    }

    public List<MessageEntity> getTextEntities() {
        return textEntities;
    }

    public Integer getVoterCount() {
        return voterCount;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTextEntities(List<MessageEntity> textEntities) {
        this.textEntities = textEntities;
    }

    public void setVoterCount(Integer voterCount) {
        this.voterCount = voterCount;
    }

    public String toString() {
        return "PollOption(text=" + this.getText() +
                ", textEntities=" + this.getTextEntities() +
                ", voterCount=" + this.getVoterCount() + ")";
    }

    public PollOption() {
    }

    public PollOption(String text, List<MessageEntity> textEntities, Integer voterCount) {
        this.text = text;
        this.textEntities = textEntities;
        this.voterCount = voterCount;
    }
}
