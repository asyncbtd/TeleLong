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

package by.asyncbtd.tl.objects.keyboard;

import by.asyncbtd.tl.objects.CopyTextButton;
import by.asyncbtd.tl.objects.LoginUrl;
import by.asyncbtd.tl.objects.SwitchInlineQueryChosenChat;
import by.asyncbtd.tl.objects.game.CallbackGame;
import by.asyncbtd.tl.objects.web.WebAppInfo;

public class InlineKeyboardButton {

    private String text;
    private String url;
    private String callbackData;
    private WebAppInfo webApp;
    private LoginUrl loginUrl;
    private String switchInlineQuery;
    private String switchInlineQueryCurrentChat;
    private SwitchInlineQueryChosenChat switchInlineQueryChosenChat;
    private CopyTextButton copyText;
    private CallbackGame callbackGame;
    private Boolean pay;

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public WebAppInfo getWebApp() {
        return webApp;
    }

    public LoginUrl getLoginUrl() {
        return loginUrl;
    }

    public String getSwitchInlineQuery() {
        return switchInlineQuery;
    }

    public String getSwitchInlineQueryCurrentChat() {
        return switchInlineQueryCurrentChat;
    }

    public SwitchInlineQueryChosenChat getSwitchInlineQueryChosenChat() {
        return switchInlineQueryChosenChat;
    }

    public CopyTextButton getCopyText() {
        return copyText;
    }

    public CallbackGame getCallbackGame() {
        return callbackGame;
    }

    public Boolean getPay() {
        return pay;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setCallbackData(String callbackData) {
        this.callbackData = callbackData;
    }

    public void setWebApp(WebAppInfo webApp) {
        this.webApp = webApp;
    }

    public void setLoginUrl(LoginUrl loginUrl) {
        this.loginUrl = loginUrl;
    }

    public void setSwitchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
    }

    public void setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
    }

    public void setSwitchInlineQueryChosenChat(SwitchInlineQueryChosenChat switchInlineQueryChosenChat) {
        this.switchInlineQueryChosenChat = switchInlineQueryChosenChat;
    }

    public void setCopyText(CopyTextButton copyText) {
        this.copyText = copyText;
    }

    public void setCallbackGame(CallbackGame callbackGame) {
        this.callbackGame = callbackGame;
    }

    public void setPay(Boolean pay) {
        this.pay = pay;
    }

    public String toString() {
        return "InlineKeyboardButton(text=" + this.getText() +
                ", url=" + this.getUrl() +
                ", callbackData=" + this.getCallbackData() +
                ", webApp=" + this.getWebApp() +
                ", loginUrl=" + this.getLoginUrl() +
                ", switchInlineQuery=" + this.getSwitchInlineQuery() +
                ", switchInlineQueryCurrentChat=" + this.getSwitchInlineQueryCurrentChat() +
                ", switchInlineQueryChosenChat=" + this.getSwitchInlineQueryChosenChat() +
                ", copyText=" + this.getCopyText() +
                ", callbackGame=" + this.getCallbackGame() +
                ", pay=" + this.getPay() + ")";
    }

    public InlineKeyboardButton(String text, String url, String callbackData, WebAppInfo webApp, LoginUrl loginUrl, String switchInlineQuery,
                                String switchInlineQueryCurrentChat, SwitchInlineQueryChosenChat switchInlineQueryChosenChat, CopyTextButton copyText,
                                CallbackGame callbackGame, Boolean pay) {
        this.text = text;
        this.url = url;
        this.callbackData = callbackData;
        this.webApp = webApp;
        this.loginUrl = loginUrl;
        this.switchInlineQuery = switchInlineQuery;
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
        this.switchInlineQueryChosenChat = switchInlineQueryChosenChat;
        this.copyText = copyText;
        this.callbackGame = callbackGame;
        this.pay = pay;
    }
}
