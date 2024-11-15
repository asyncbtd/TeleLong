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

public class Dice {

    private String emoji;
    private Integer value;

    public String getEmoji() {
        return emoji;
    }

    public Integer getValue() {
        return value;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String toString() {
        return "Dice(emoji=" + this.getEmoji() +
                ", value=" + this.getValue() + ")";
    }

    public Dice() {
    }

    public Dice(String emoji, Integer value) {
        this.emoji = emoji;
        this.value = value;
    }
}
