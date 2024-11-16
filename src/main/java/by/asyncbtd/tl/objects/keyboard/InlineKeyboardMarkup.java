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

package by.asyncbtd.tl.objects.keyboard;

import java.util.List;

public class InlineKeyboardMarkup {

    private List<List<InlineKeyboardButton>> inlineKeyboard;

    public List<List<InlineKeyboardButton>> getInlineKeyboard() {
        return inlineKeyboard;
    }

    public void setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
    }

    public String toString() {
        return "InlineKeyboardMarkup(inlineKeyboard=" + this.getInlineKeyboard() + ")";
    }

    public InlineKeyboardMarkup() {
    }

    public InlineKeyboardMarkup(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
    }
}
