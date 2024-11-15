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

package by.asyncbtd.tl.objects.web;

public class WebAppData {

    private String data;
    private String buttonText;

    public String getData() {
        return data;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public String toString() {
        return "WebAppData(data=" + this.getData() +
                ", buttonText=" + this.getButtonText() + ")";
    }

    public WebAppData() {
    }

    public WebAppData(String data, String buttonText) {
        this.data = data;
        this.buttonText = buttonText;
    }
}
