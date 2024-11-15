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

public class BackgroundTypeChatTheme implements BackgroundType {

    private String type;
    private String themeName;

    public String getType() {
        return type;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public String toString() {
        return "BackgroundTypeChatTheme(type=" + this.getType() +
                ", themeName=" + this.getThemeName() + ")";
    }

    public BackgroundTypeChatTheme() {
    }

    public BackgroundTypeChatTheme(String type, String themeName) {
        this.type = type;
        this.themeName = themeName;
    }
}
