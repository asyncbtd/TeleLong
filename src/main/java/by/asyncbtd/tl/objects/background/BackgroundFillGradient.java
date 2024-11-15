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

public class BackgroundFillGradient implements BackgroundFill {

    private String type;
    private Integer topColor;
    private Integer bottomColor;
    private Integer rotationAngle;

    public String getType() {
        return type;
    }

    public Integer getTopColor() {
        return topColor;
    }

    public Integer getBottomColor() {
        return bottomColor;
    }

    public Integer getRotationAngle() {
        return rotationAngle;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTopColor(Integer topColor) {
        this.topColor = topColor;
    }

    public void setBottomColor(Integer bottomColor) {
        this.bottomColor = bottomColor;
    }

    public void setRotationAngle(Integer rotationAngle) {
        this.rotationAngle = rotationAngle;
    }

    public String toString() {
        return "BackgroundFillGradient(type=" + this.getType() +
                ", topColor=" + this.getTopColor() +
                ", bottomColor=" + this.getBottomColor() +
                ", rotationAngle=" + this.getRotationAngle() + ")";
    }

    public BackgroundFillGradient() {
    }

    public BackgroundFillGradient(String type, Integer topColor, Integer bottomColor, Integer rotationAngle) {
        this.type = type;
        this.topColor = topColor;
        this.bottomColor = bottomColor;
        this.rotationAngle = rotationAngle;
    }
}
