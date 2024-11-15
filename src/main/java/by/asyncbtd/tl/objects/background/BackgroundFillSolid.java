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

package by.asyncbtd.tl.objects.background;

public class BackgroundFillSolid implements BackgroundFill {

    private String type;
    private Integer color;

    public String getType() {
        return type;
    }

    public Integer getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String toString() {
        return "BackgroundFillSolid(type=" + this.getType() +
                ", color=" + this.getColor() + ")";
    }

    public BackgroundFillSolid() {
    }

    public BackgroundFillSolid(String type, Integer color) {
        this.type = type;
        this.color = color;
    }
}
