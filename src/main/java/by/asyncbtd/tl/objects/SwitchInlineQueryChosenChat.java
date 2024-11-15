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

public class SwitchInlineQueryChosenChat {

    private String query;
    private Boolean allowUserChats;
    private Boolean allowBotChat;
    private Boolean allowGroupChats;
    private Boolean allowChannelChats;

    public String getQuery() {
        return query;
    }

    public Boolean getAllowUserChats() {
        return allowUserChats;
    }

    public Boolean getAllowBotChat() {
        return allowBotChat;
    }

    public Boolean getAllowGroupChats() {
        return allowGroupChats;
    }

    public Boolean getAllowChannelChats() {
        return allowChannelChats;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setAllowUserChats(Boolean allowUserChats) {
        this.allowUserChats = allowUserChats;
    }

    public void setAllowBotChat(Boolean allowBotChat) {
        this.allowBotChat = allowBotChat;
    }

    public void setAllowGroupChats(Boolean allowGroupChats) {
        this.allowGroupChats = allowGroupChats;
    }

    public void setAllowChannelChats(Boolean allowChannelChats) {
        this.allowChannelChats = allowChannelChats;
    }

    public String toString() {
        return "SwitchInlineQueryChosenChat(query=" + this.getQuery() +
                ", allowUserChats=" + this.getAllowUserChats() +
                ", allowBotChat=" + this.getAllowBotChat() +
                ", allowGroupChats=" + this.getAllowGroupChats() +
                ", allowChannelChats=" + this.getAllowChannelChats() + ")";
    }

    public SwitchInlineQueryChosenChat() {
    }

    public SwitchInlineQueryChosenChat(String query, Boolean allowUserChats, Boolean allowBotChat, Boolean allowGroupChats, Boolean allowChannelChats) {
        this.query = query;
        this.allowUserChats = allowUserChats;
        this.allowBotChat = allowBotChat;
        this.allowGroupChats = allowGroupChats;
        this.allowChannelChats = allowChannelChats;
    }
}
