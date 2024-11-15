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

public class LoginUrl {

    private String url;
    private String forwardText;
    private String botUsername;
    private Boolean requestWriteAccess;

    public String getUrl() {
        return url;
    }

    public String getForwardText() {
        return forwardText;
    }

    public String getBotUsername() {
        return botUsername;
    }

    public Boolean getRequestWriteAccess() {
        return requestWriteAccess;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setForwardText(String forwardText) {
        this.forwardText = forwardText;
    }

    public void setBotUsername(String botUsername) {
        this.botUsername = botUsername;
    }

    public void setRequestWriteAccess(Boolean requestWriteAccess) {
        this.requestWriteAccess = requestWriteAccess;
    }

    public String toString() {
        return "LoginUrl(url=" + this.getUrl() +
                ", forwardText=" + this.getForwardText() +
                ", botUsername=" + this.getBotUsername() +
                ", requestWriteAccess=" + this.getRequestWriteAccess() + ")";
    }

    public LoginUrl() {
    }

    public LoginUrl(String url, String forwardText, String botUsername, Boolean requestWriteAccess) {
        this.url = url;
        this.forwardText = forwardText;
        this.botUsername = botUsername;
        this.requestWriteAccess = requestWriteAccess;
    }
}
