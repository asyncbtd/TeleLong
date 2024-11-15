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

public class BackgroundTypeFill implements BackgroundType {

    private String type;
    private BackgroundFill fill;
    private Integer darkThemeDimming;

    public String getType() {
        return type;
    }

    public BackgroundFill getFill() {
        return fill;
    }

    public Integer getDarkThemeDimming() {
        return darkThemeDimming;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFill(BackgroundFill fill) {
        this.fill = fill;
    }

    public void setDarkThemeDimming(Integer darkThemeDimming) {
        this.darkThemeDimming = darkThemeDimming;
    }

    public String toString() {
        return "BackgroundTypeFill(type=" + this.getType() +
                ", fill=" + this.getFill() +
                ", darkThemeDimming=" + this.getDarkThemeDimming() + ")";
    }

    public BackgroundTypeFill() {
    }

    public BackgroundTypeFill(String type, BackgroundFill fill, Integer darkThemeDimming) {
        this.type = type;
        this.fill = fill;
        this.darkThemeDimming = darkThemeDimming;
    }
}
