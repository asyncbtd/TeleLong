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

import by.asyncbtd.tl.objects.business.BusinessConnection;
import by.asyncbtd.tl.objects.business.BusinessMessagesDeleted;
import by.asyncbtd.tl.objects.chat.ChatJoinRequest;
import by.asyncbtd.tl.objects.chat.boost.ChatBoostRemoved;
import by.asyncbtd.tl.objects.chat.member.ChatMemberUpdated;
import by.asyncbtd.tl.objects.chat.boost.ChatBoostUpdated;
import by.asyncbtd.tl.objects.message.Message;
import by.asyncbtd.tl.objects.paid.PaidMediaPurchased;
import by.asyncbtd.tl.objects.reaction.MessageReactionUpdated;
import by.asyncbtd.tl.objects.reaction.MessageReactionCountUpdated;

public class Update {

    private Integer updateId;
    private Message message;
    private Message editedMessage;
    private Message channelPost;
    private Message editedChannelPost;
    private BusinessConnection businessConnection;
    private Message businessMessage;
    private Message editedBusinessMessage;
    private BusinessMessagesDeleted deletedBusinessMessages;
    private MessageReactionUpdated messageReaction;
    private MessageReactionCountUpdated messageReactionCountUpdated;
    private InlineQuery inlineQuery;
    private ChosenInlineResult chosenInlineResult;
    private CallbackQuery callbackQuery;
    private ShippingQuery shippingQuery;
    private PreCheckoutQuery preCheckoutQuery;
    private PaidMediaPurchased purchasedPaidMedia;
    private Poll poll;
    private PollAnswer pollAnswer;
    private ChatMemberUpdated myChatMember;
    private ChatMemberUpdated chatMember;
    private ChatJoinRequest chatJoinRequest;
    private ChatBoostUpdated chatBoost;
    private ChatBoostRemoved removedChatBoost;

    public Integer getUpdateId() {
        return updateId;
    }

    public Message getMessage() {
        return message;
    }

    public Message getEditedMessage() {
        return editedMessage;
    }

    public Message getChannelPost() {
        return channelPost;
    }

    public Message getEditedChannelPost() {
        return editedChannelPost;
    }

    public BusinessConnection getBusinessConnection() {
        return businessConnection;
    }

    public Message getBusinessMessage() {
        return businessMessage;
    }

    public Message getEditedBusinessMessage() {
        return editedBusinessMessage;
    }

    public BusinessMessagesDeleted getDeletedBusinessMessages() {
        return deletedBusinessMessages;
    }

    public MessageReactionUpdated getMessageReaction() {
        return messageReaction;
    }

    public MessageReactionCountUpdated getMessageReactionCountUpdated() {
        return messageReactionCountUpdated;
    }

    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    public ChosenInlineResult getChosenInlineResult() {
        return chosenInlineResult;
    }

    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    public ShippingQuery getShippingQuery() {
        return shippingQuery;
    }

    public PreCheckoutQuery getPreCheckoutQuery() {
        return preCheckoutQuery;
    }

    public PaidMediaPurchased getPurchasedPaidMedia() {
        return purchasedPaidMedia;
    }

    public Poll getPoll() {
        return poll;
    }

    public PollAnswer getPollAnswer() {
        return pollAnswer;
    }

    public ChatMemberUpdated getMyChatMember() {
        return myChatMember;
    }

    public ChatMemberUpdated getChatMember() {
        return chatMember;
    }

    public ChatJoinRequest getChatJoinRequest() {
        return chatJoinRequest;
    }

    public ChatBoostUpdated getChatBoost() {
        return chatBoost;
    }

    public ChatBoostRemoved getRemovedChatBoost() {
        return removedChatBoost;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setEditedMessage(Message editedMessage) {
        this.editedMessage = editedMessage;
    }

    public void setChannelPost(Message channelPost) {
        this.channelPost = channelPost;
    }

    public void setEditedChannelPost(Message editedChannelPost) {
        this.editedChannelPost = editedChannelPost;
    }

    public void setBusinessConnection(BusinessConnection businessConnection) {
        this.businessConnection = businessConnection;
    }

    public void setBusinessMessage(Message businessMessage) {
        this.businessMessage = businessMessage;
    }

    public void setEditedBusinessMessage(Message editedBusinessMessage) {
        this.editedBusinessMessage = editedBusinessMessage;
    }

    public void setDeletedBusinessMessages(BusinessMessagesDeleted deletedBusinessMessages) {
        this.deletedBusinessMessages = deletedBusinessMessages;
    }

    public void setMessageReaction(MessageReactionUpdated messageReaction) {
        this.messageReaction = messageReaction;
    }

    public void setMessageReactionCountUpdated(MessageReactionCountUpdated messageReactionCountUpdated) {
        this.messageReactionCountUpdated = messageReactionCountUpdated;
    }

    public void setInlineQuery(InlineQuery inlineQuery) {
        this.inlineQuery = inlineQuery;
    }

    public void setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
        this.chosenInlineResult = chosenInlineResult;
    }

    public void setCallbackQuery(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
    }

    public void setShippingQuery(ShippingQuery shippingQuery) {
        this.shippingQuery = shippingQuery;
    }

    public void setPreCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
        this.preCheckoutQuery = preCheckoutQuery;
    }

    public void setPurchasedPaidMedia(PaidMediaPurchased purchasedPaidMedia) {
        this.purchasedPaidMedia = purchasedPaidMedia;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public void setPollAnswer(PollAnswer pollAnswer) {
        this.pollAnswer = pollAnswer;
    }

    public void setMyChatMember(ChatMemberUpdated myChatMember) {
        this.myChatMember = myChatMember;
    }

    public void setChatMember(ChatMemberUpdated chatMember) {
        this.chatMember = chatMember;
    }

    public void setChatJoinRequest(ChatJoinRequest chatJoinRequest) {
        this.chatJoinRequest = chatJoinRequest;
    }

    public void setChatBoost(ChatBoostUpdated chatBoost) {
        this.chatBoost = chatBoost;
    }

    public void setRemovedChatBoost(ChatBoostRemoved removedChatBoost) {
        this.removedChatBoost = removedChatBoost;
    }

    public String toString() {
        return "Update(updateId=" + this.getUpdateId() +
                ", message=" + this.getMessage() +
                ", editedMessage=" + this.getEditedMessage() +
                ", channelPost=" + this.getChannelPost() +
                ", editedChannelPost=" + this.getEditedChannelPost() +
                ", businessConnection=" + this.getBusinessConnection() +
                ", businessMessage=" + this.getBusinessMessage() +
                ", editedBusinessMessage=" + this.getEditedBusinessMessage() +
                ", deletedBusinessMessages=" + this.getDeletedBusinessMessages() +
                ", messageReaction=" + this.getMessageReaction() +
                ", messageReactionCountUpdated=" + this.getMessageReactionCountUpdated() +
                ", inlineQuery=" + this.getInlineQuery() +
                ", chosenInlineResult=" + this.getChosenInlineResult() +
                ", callbackQuery=" + this.getCallbackQuery() +
                ", shippingQuery=" + this.getShippingQuery() +
                ", preCheckoutQuery=" + this.getPreCheckoutQuery() +
                ", purchasedPaidMedia=" + this.getPurchasedPaidMedia() +
                ", poll=" + this.getPoll() +
                ", pollAnswer=" + this.getPollAnswer() +
                ", myChatMember=" + this.getMyChatMember() +
                ", chatMember=" + this.getChatMember() +
                ", chatJoinRequest=" + this.getChatJoinRequest() +
                ", chatBoost=" + this.getChatBoost() +
                ", removedChatBoost=" + this.getRemovedChatBoost() + ")";
    }

    public Update(Integer updateId, Message message, Message editedMessage, Message channelPost, Message editedChannelPost, BusinessConnection businessConnection,
                  Message businessMessage, Message editedBusinessMessage, BusinessMessagesDeleted deletedBusinessMessages, MessageReactionUpdated messageReaction,
                  MessageReactionCountUpdated messageReactionCountUpdated, InlineQuery inlineQuery, ChosenInlineResult chosenInlineResult, CallbackQuery callbackQuery,
                  ShippingQuery shippingQuery, PreCheckoutQuery preCheckoutQuery, PaidMediaPurchased purchasedPaidMedia, Poll poll, PollAnswer pollAnswer,
                  ChatMemberUpdated myChatMember, ChatMemberUpdated chatMember, ChatJoinRequest chatJoinRequest, ChatBoostUpdated chatBoost, ChatBoostRemoved removedChatBoost) {
        this.updateId = updateId;
        this.message = message;
        this.editedMessage = editedMessage;
        this.channelPost = channelPost;
        this.editedChannelPost = editedChannelPost;
        this.businessConnection = businessConnection;
        this.businessMessage = businessMessage;
        this.editedBusinessMessage = editedBusinessMessage;
        this.deletedBusinessMessages = deletedBusinessMessages;
        this.messageReaction = messageReaction;
        this.messageReactionCountUpdated = messageReactionCountUpdated;
        this.inlineQuery = inlineQuery;
        this.chosenInlineResult = chosenInlineResult;
        this.callbackQuery = callbackQuery;
        this.shippingQuery = shippingQuery;
        this.preCheckoutQuery = preCheckoutQuery;
        this.purchasedPaidMedia = purchasedPaidMedia;
        this.poll = poll;
        this.pollAnswer = pollAnswer;
        this.myChatMember = myChatMember;
        this.chatMember = chatMember;
        this.chatJoinRequest = chatJoinRequest;
        this.chatBoost = chatBoost;
        this.removedChatBoost = removedChatBoost;
    }
}
