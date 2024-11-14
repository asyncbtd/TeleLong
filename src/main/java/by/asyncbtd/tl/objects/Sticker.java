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

import java.io.File;

public class Sticker {

    private String fileId;
    private String fileUniqueId;
    private String type;
    private Integer width;
    private Integer height;
    private Boolean isAnimated;
    private Boolean isVideo;
    private PhotoSize thumbnail;
    private String emoji;
    private String setName;
    private File premiumAnimation;
    private MaskPosition maskPosition;
    private String customEmojiId;
    private Boolean needsRepainting;
    private Integer fileSize;

    public String getFileId() {
        return fileId;
    }

    public String getFileUniqueId() {
        return fileUniqueId;
    }

    public String getType() {
        return type;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Boolean getAnimated() {
        return isAnimated;
    }

    public Boolean getVideo() {
        return isVideo;
    }

    public PhotoSize getThumbnail() {
        return thumbnail;
    }

    public String getEmoji() {
        return emoji;
    }

    public String getSetName() {
        return setName;
    }

    public File getPremiumAnimation() {
        return premiumAnimation;
    }

    public MaskPosition getMaskPosition() {
        return maskPosition;
    }

    public String getCustomEmojiId() {
        return customEmojiId;
    }

    public Boolean getNeedsRepainting() {
        return needsRepainting;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setAnimated(Boolean animated) {
        isAnimated = animated;
    }

    public void setVideo(Boolean video) {
        isVideo = video;
    }

    public void setThumbnail(PhotoSize thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public void setSet_name(String set_name) {
        this.setName = set_name;
    }

    public void setPremiumAnimation(File premiumAnimation) {
        this.premiumAnimation = premiumAnimation;
    }

    public void setMaskPosition(MaskPosition maskPosition) {
        this.maskPosition = maskPosition;
    }

    public void setCustomEmojiId(String customEmojiId) {
        this.customEmojiId = customEmojiId;
    }

    public void setNeedsRepainting(Boolean needsRepainting) {
        this.needsRepainting = needsRepainting;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String toSring() {
        return "Sticker(fileId=" + this.fileId +
                ", fileUniqueId=" + this.fileUniqueId +
                ", type=" + this.type +
                ", width=" + this.width +
                ", height=" + this.height +
                ", isAnimated=" + this.isAnimated +
                ", isVideo=" + this.isVideo +
                ", thumbnail=" + this.thumbnail +
                ", emoji=" + this.emoji +
                ", setName=" + this.setName +
                ", premiumAnimation=" + this.premiumAnimation +
                ", maskPosition=" + this.maskPosition +
                ", customEmojiId=" + this.customEmojiId +
                ", needsRepainting=" + this.needsRepainting +
                ", fileSize=" + this.fileSize + ")";
    }

    public Sticker() {
    }

    public Sticker(String fileId, String fileUniqueId, String type, Integer width, Integer height, Boolean isAnimated, Boolean isVideo, PhotoSize thumbnail, String emoji,
                   String setName, File premiumAnimation, MaskPosition maskPosition, String customEmojiId, Boolean needsRepainting, Integer fileSize) {
        this.fileId = fileId;
        this.fileUniqueId = fileUniqueId;
        this.type = type;
        this.width = width;
        this.height = height;
        this.isAnimated = isAnimated;
        this.isVideo = isVideo;
        this.thumbnail = thumbnail;
        this.emoji = emoji;
        this.setName = setName;
        this.premiumAnimation = premiumAnimation;
        this.maskPosition = maskPosition;
        this.customEmojiId = customEmojiId;
        this.needsRepainting = needsRepainting;
        this.fileSize = fileSize;
    }
}
