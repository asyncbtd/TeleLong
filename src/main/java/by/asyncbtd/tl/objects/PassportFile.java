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

public class PassportFile {

    private String fileId;
    private String fileUniqueId;
    private Integer fileSize;
    private Integer fileDate;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public Integer getFileDate() {
        return fileDate;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public void setFileDate(Integer fileDate) {
        this.fileDate = fileDate;
    }

    public String toString() {
        return "PassportFile(fileId=" + this.getFileId() +
                ", fileUniqueId=" + this.getFileUniqueId() +
                ", fileSize=" + this.getFileSize() +
                ", fileDate=" + this.getFileDate() + ")";
    }

    public PassportFile() {
    }

    public PassportFile(String fileId, String fileUniqueId, Integer fileSize, Integer fileDate) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.fileSize = fileSize;
        this.fileDate = fileDate;
    }
}
