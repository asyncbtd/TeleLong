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

public class Animation {

    private String fileId;
    private String fileUniqueId;
    private Integer width;
    private Integer height;
    private Integer duration;
    private PhotoSize thumbnail;
    private String fileName;
    private String mimeType;
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getDuration() {
        return duration;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }

    public String getFileName() {
        return fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setFileUniqueId(String fileUniqueId) {
        this.fileUniqueId = fileUniqueId;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String toString() {
        return "Animation(fileId=" + this.fileId +
                ", fileUniqueId=" + this.fileUniqueId +
                ", width=" + this.width +
                ", height=" + this.height +
                ", duration=" + this.duration +
                ", thumbnail=" + this.thumbnail +
                ", fileName=" + this.fileName +
                ", mimeType=" + this.mimeType +
                ", fileSize=" + this.fileSize + ")";
    }

    public Animation() {
    }

    public Animation(String fileId, String fileUniqueId, Integer width, Integer height, Integer duration, PhotoSize thumbnail, String fileName,
                     String mimeType, Integer fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.width = width;
        this.height = height;
        this.duration = duration;
        this.thumbnail = thumbnail;
        this.fileName = fileName;
        this.mimeType = mimeType;
        this.fileSize = fileSize;
    }
}
