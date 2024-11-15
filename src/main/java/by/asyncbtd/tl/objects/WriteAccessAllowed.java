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

public class WriteAccessAllowed {

    private Boolean fromRequest;
    private String webAppName;
    private Boolean fromAttachmentMenu;

    public Boolean getFromRequest() {
        return fromRequest;
    }

    public String getWebAppName() {
        return webAppName;
    }

    public Boolean getFromAttachmentMenu() {
        return fromAttachmentMenu;
    }

    public void setFromRequest(Boolean fromRequest) {
        this.fromRequest = fromRequest;
    }

    public void setWebAppName(String webAppName) {
        this.webAppName = webAppName;
    }

    public void setFromAttachmentMenu(Boolean fromAttachmentMenu) {
        this.fromAttachmentMenu = fromAttachmentMenu;
    }

    public String toString() {
        return "WriteAccessAllowed(fromRequest=" + this.getFromRequest() +
                ", webAppName=" + this.getWebAppName() +
                ", fromAttachmentMenu=" + this.getFromAttachmentMenu() + ")";
    }

    public WriteAccessAllowed() {
    }

    public WriteAccessAllowed(Boolean fromRequest, String webAppName, Boolean fromAttachmentMenu) {
        this.fromRequest = fromRequest;
        this.webAppName = webAppName;
        this.fromAttachmentMenu = fromAttachmentMenu;
    }
}
