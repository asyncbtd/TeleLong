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

package by.asyncbtd.tl.objects.chat;

public class ChatPhoto {

    private String smallFileId;
    private String smallFileUniqueId;
    private String bigFileId;
    private String bigFileUniqueId;

    public String getSmallFileId() {
        return this.smallFileId;
    }

    public String getSmallFileUniqueId() {
        return this.smallFileUniqueId;
    }

    public String getBigFileId() {
        return this.bigFileId;
    }

    public String getBigFileUniqueId() {
        return this.bigFileUniqueId;
    }

    public void setSmallFileId() {
        this.smallFileId = smallFileId;
    }

    public void setSmallFileUniqueId() {
        this.smallFileUniqueId = smallFileUniqueId;
    }

    public void setBigFileId() {
        this.bigFileId = bigFileId;
    }

    public void setBigFileUniqueId() {
        this.bigFileUniqueId = bigFileUniqueId;
    }

    public String toString() {
        return "ChatPhoto(smallFileId=" + this.getSmallFileId() +
                ", smallFileUniqueId=" + this.getSmallFileUniqueId() +
                ", bigFileId=" + this.getBigFileId() +
                ", bigFileUniqueId=" + this.getBigFileUniqueId() + ")";
    }

    public ChatPhoto() {
    }

    public ChatPhoto(String smallFileId, String smallFileUniqueId, String bigFileId, String bigFileUniqueId) {
        this.smallFileId = smallFileId;
        this.smallFileUniqueId = smallFileUniqueId;
        this.bigFileId = bigFileId;
        this.bigFileUniqueId = bigFileUniqueId;
    }
}
