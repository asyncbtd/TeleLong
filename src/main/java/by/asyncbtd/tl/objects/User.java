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

public class User {

    private Long id;
    private Boolean isBot;
    private String firstName;
    private String lastName;
    private String username;
    private String languageCode;
    private Boolean isPremium;
    private Boolean addedToAttachmentMenu;
    private Boolean canJoinGroups;
    private Boolean canReadAllGroupMessages;
    private Boolean supportsInlineQueries;
    private Boolean canConnectToBusiness;
    private Boolean hasMainWebApp;

    public Long getId() {
        return this.id;
    }

    public Boolean getIsBot() {
        return this.isBot;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public Boolean getIsPremium() {
        return this.isPremium;
    }

    public Boolean getAddedToAttachmentMenu() {
        return this.addedToAttachmentMenu;
    }

    public Boolean getCanJoinGroups() {
        return this.canJoinGroups;
    }

    public Boolean getCanReadAllGroupMessages() {
        return this.canReadAllGroupMessages;
    }

    private Boolean getSupportsInlineQueries() {
        return this.supportsInlineQueries;
    }

    private Boolean getCanConnectToBusiness() {
        return this.canConnectToBusiness;
    }

    private Boolean getHasMainWebApp() {
        return this.hasMainWebApp;
    }

    public void setId(Long id) {
        if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
        } else {
            this.id = id;
        }
    }

    public void setIsBot(Boolean isBot) {
        if (isBot == null) {
            throw new NullPointerException("isBot is marked non-null but is null");
        } else {
            this.isBot = isBot;
        }
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new NullPointerException("firstName is marked non-null but is null");
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public void setIsPremium(Boolean isPremium) {
        this.isPremium = isPremium;
    }

    public void setAddedToAttachmentMenu(Boolean addedToAttachmentMenu) {
        this.addedToAttachmentMenu = addedToAttachmentMenu;
    }

    public void setCanJoinGroups(Boolean canJoinGroups) {
        this.canJoinGroups = canJoinGroups;
    }

    public void setCanReadAllGroupMessages(Boolean canReadAllGroupMessages) {
        this.canReadAllGroupMessages = canReadAllGroupMessages;
    }

    public void setSupportsInlineQueries(Boolean supportsInlineQueries) {
        this.supportsInlineQueries = supportsInlineQueries;
    }

    public void setCanConnectToBusiness(Boolean canConnectToBusiness) {
        this.canConnectToBusiness = canConnectToBusiness;
    }

    public void setHasMainWebApp(Boolean hasMainWebApp) {
        this.hasMainWebApp = hasMainWebApp;
    }

    public String toString() {
        return "User(id=" + this.getId() +
                ", isBot=" + this.getIsBot() +
                ", firstName=" + this.getFirstName() +
                ", lastName=" + this.getLastName() +
                ", username=" + this.getUsername() +
                ", languageCode=" + this.getLanguageCode() +
                ", isPremium=" + this.getIsPremium() +
                ", addedToAttachmentMenu=" + this.getAddedToAttachmentMenu() +
                ", canJoinGroups=" + this.getCanJoinGroups() +
                ", canReadAllGroupMessages=" + this.getCanReadAllGroupMessages() +
                ", supportsInlineQueries=" + this.getSupportsInlineQueries() +
                ", canConnectToBusiness=" + this.getCanConnectToBusiness() +
                ", hasMainWebApp=" + this.getHasMainWebApp() + ")";
    }

    public User() {
    }

    public User(Long id, Boolean isBot, String firstName, String lastName, String username, String languageCode, Boolean isPremium, Boolean addedToAttachmentMenu,
                Boolean canJoinGroups, Boolean canReadAllGroupMessages, Boolean supportsInlineQueries, Boolean canConnectToBusiness, Boolean hasMainWebApp) {
        if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
        } else if (isBot == null) {
            throw new NullPointerException("isBot is marked non-null but is null");
        } else if (firstName == null) {
            throw new NullPointerException("firstName is marked non-null but is null");
        } else {
            this.id = id;
            this.isBot = isBot;
            this.firstName = firstName;
            this.lastName = lastName;
            this.username = username;
            this.languageCode = languageCode;
            this.isPremium = isPremium;
            this.addedToAttachmentMenu = addedToAttachmentMenu;
            this.canJoinGroups = canJoinGroups;
            this.canReadAllGroupMessages = canReadAllGroupMessages;
            this.supportsInlineQueries = supportsInlineQueries;
            this.canConnectToBusiness = canConnectToBusiness;
            this.hasMainWebApp = hasMainWebApp;
        }
    }

    public User(Long id, Boolean isBot, String firstName) {
        if (id == null) {
            throw new NullPointerException("id is marked non-null but is null");
        } else if (isBot == null) {
            throw new NullPointerException("isBot is marked non-null but is null");
        } else if (firstName == null) {
            throw new NullPointerException("firstName is marked non-null but is null");
        } else {
            this.id = id;
            this.isBot = isBot;
            this.firstName = firstName;
        }
    }
}
