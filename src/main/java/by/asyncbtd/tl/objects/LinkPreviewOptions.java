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

public class LinkPreviewOptions {

    private Boolean isDisabled;
    private String url;
    private Boolean preferSmallMedia;
    private Boolean preferLargeMedia;
    private Boolean showAboveText;

    public Boolean getDisabled() {
        return isDisabled;
    }

    public String getUrl() {
        return url;
    }

    public Boolean getPreferSmallMedia() {
        return preferSmallMedia;
    }

    public Boolean getPreferLargeMedia() {
        return preferLargeMedia;
    }

    public Boolean getShowAboveText() {
        return showAboveText;
    }

    public void setDisabled(Boolean disabled) {
        isDisabled = disabled;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPreferSmallMedia(Boolean preferSmallMedia) {
        this.preferSmallMedia = preferSmallMedia;
    }

    public void setPreferLargeMedia(Boolean preferLargeMedia) {
        this.preferLargeMedia = preferLargeMedia;
    }

    public void setShowAboveText(Boolean showAboveText) {
        this.showAboveText = showAboveText;
    }

    public String toString() {
        return "LinkPreviewOptions(isDisabled=" + this.isDisabled +
                ", url=" + this.url +
                ", preferSmallMedia=" + this.preferSmallMedia +
                ", preferLargeMedia=" + this.preferLargeMedia +
                ", showAboveText=" + this.showAboveText + ")";
    }

    public LinkPreviewOptions() {
    }

    public LinkPreviewOptions(Boolean isDisabled, String url, Boolean preferSmallMedia, Boolean preferLargeMedia, Boolean showAboveText) {
        this.isDisabled = isDisabled;
        this.url = url;
        this.preferSmallMedia = preferSmallMedia;
        this.preferLargeMedia = preferLargeMedia;
        this.showAboveText = showAboveText;
    }
}
