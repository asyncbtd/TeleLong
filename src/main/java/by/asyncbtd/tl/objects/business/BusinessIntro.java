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

package by.asyncbtd.tl.objects.business;

import by.asyncbtd.tl.objects.Sticker;

public class BusinessIntro {

    private String title;
    private String message;
    private Sticker sticker;

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }

    public String toString() {
        return "BusinessIntro(title=" + this.getTitle() +
                ", message=" + this.getMessage() +
                ", sticker=" + this.getSticker() + ")";
    }

    public BusinessIntro() {
    }

    public BusinessIntro(String title, String message, Sticker sticker) {
        this.title = title;
        this.message = message;
        this.sticker = sticker;
    }
}
