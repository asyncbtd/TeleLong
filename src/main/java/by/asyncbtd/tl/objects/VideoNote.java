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

public class VideoNote {

    private String fileId;
    private String fileUniqueId;
    private Integer length;
    private Integer duration;
    private PhotoSize thumbnail;
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getDuration() {
        return duration;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
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

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String toString() {
        return "VideoNote(fileId=" + this.getFileId() +
                ", fileUniqueId=" + this.getFileUniqueId() +
                ", length=" + this.getLength() +
                ", duration=" + this.getDuration() +
                ", thumbnail=" + this.getThumbnail() +
                ", fileSize=" + this.getFileSize() + ")";
    }

    public VideoNote() {
    }

    public VideoNote(String fileId, String fileUniqueId, Integer length, Integer duration, PhotoSize thumbnail, Integer fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.length = length;
        this.duration = duration;
        this.thumbnail = thumbnail;
        this.fileSize = fileSize;
    }
}
