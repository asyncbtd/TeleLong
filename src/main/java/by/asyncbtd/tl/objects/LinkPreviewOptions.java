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
