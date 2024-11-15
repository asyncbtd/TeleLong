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

public class Document {

    private String fileId;
    private String fileUniqueId;
    private PhotoSize thumbnail;
    private String fileName;
    private Long fileSize;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }

    public String getFileName() {
        return fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
    }

    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public String toString() {
        return "Document(fileId=" + this.getFileId() +
                ", fileUniqueId=" + this.getFileUniqueId() +
                ", thumbnail=" + this.getThumbnail() +
                ", fileName=" + this.getFileName() +
                ", fileSize=" + this.getFileSize() + ")";
    }

    public Document(){
    }

    public Document(String fileId, String fileUniqueId, PhotoSize thumbnail, String fileName, Long fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.thumbnail = thumbnail;
        this.fileName = fileName;
        this.fileSize = fileSize;
    }
}
