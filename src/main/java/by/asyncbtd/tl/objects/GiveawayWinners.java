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

import java.util.List;

public class GiveawayWinners {

    private Chat chat;
    private Integer giveawayMessageId;
    private Integer winnersSelectionDate;
    private Integer winnerCount;
    private List<User> winners;
    private Integer additionalChatCount;
    private Integer prizeStarCount;
    private Integer premiumSubscriptionMonthCount;
    private Integer unclaimedPrizeCount;
    private Boolean onlyNewMembers;
    private Boolean wasRefunded;
    private String prizeDescription;

    public Chat getChat() {
        return chat;
    }

    public Integer getGiveawayMessageId() {
        return giveawayMessageId;
    }

    public Integer getWinnersSelectionDate() {
        return winnersSelectionDate;
    }

    public Integer getWinnerCount() {
        return winnerCount;
    }

    public List<User> getWinners() {
        return winners;
    }

    public Integer getAdditionalChatCount() {
        return additionalChatCount;
    }

    public Integer getPrizeStarCount() {
        return prizeStarCount;
    }

    public Integer getPremiumSubscriptionMonthCount() {
        return premiumSubscriptionMonthCount;
    }

    public Integer getUnclaimedPrizeCount() {
        return unclaimedPrizeCount;
    }

    public Boolean getOnlyNewMembers() {
        return onlyNewMembers;
    }

    public Boolean getWasRefunded() {
        return wasRefunded;
    }

    public String getPrizeDescription() {
        return prizeDescription;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public void setGiveawayMessageId(Integer giveawayMessageId) {
        this.giveawayMessageId = giveawayMessageId;
    }

    public void setWinnersSelectionDate(Integer winnersSelectionDate) {
        this.winnersSelectionDate = winnersSelectionDate;
    }

    public void setWinnerCount(Integer winnerCount) {
        this.winnerCount = winnerCount;
    }

    public void setWinners(List<User> winners) {
        this.winners = winners;
    }

    public void setAdditionalChatCount(Integer additionalChatCount) {
        this.additionalChatCount = additionalChatCount;
    }

    public void setPrizeStarCount(Integer prizeStarCount) {
        this.prizeStarCount = prizeStarCount;
    }

    public void setPremiumSubscriptionMonthCount(Integer premiumSubscriptionMonthCount) {
        this.premiumSubscriptionMonthCount = premiumSubscriptionMonthCount;
    }

    public void setUnclaimedPrizeCount(Integer unclaimedPrizeCount) {
        this.unclaimedPrizeCount = unclaimedPrizeCount;
    }

    public void setOnlyNewMembers(Boolean onlyNewMembers) {
        this.onlyNewMembers = onlyNewMembers;
    }

    public void setWasRefunded(Boolean wasRefunded) {
        this.wasRefunded = wasRefunded;
    }

    public void setPrizeDescription(String prizeDescription) {
        this.prizeDescription = prizeDescription;
    }

    public String toString() {
        return "GiveawayWinners(chat=" + this.getChat() +
                ", giveawayMessageId=" + this.getGiveawayMessageId() +
                ", winnersSelectionDate=" + this.getWinnersSelectionDate() +
                ", winnerCount=" + this.getWinnerCount() +
                ", winners=" + this.getWinners() +
                ", additionalChatCount=" + this.getAdditionalChatCount() +
                ", prizeStarCount=" + this.getPrizeStarCount() +
                ", premiumSubscriptionMonthCount=" + this.getPremiumSubscriptionMonthCount() +
                ", unclaimedPrizeCount=" + this.getUnclaimedPrizeCount() +
                ", onlyNewMembers=" + this.getOnlyNewMembers() +
                ", wasRefunded=" + this.getWasRefunded() +
                ", prizeDescription=" + this.getPrizeDescription() + ")";
    }

    public GiveawayWinners() {
    }

    public GiveawayWinners(Chat chat, Integer giveawayMessageId, Integer winnersSelectionDate, Integer winnerCount, List<User> winners, Integer additionalChatCount,
                           Integer prizeStarCount, Integer premiumSubscriptionMonthCount, Integer unclaimedPrizeCount, Boolean onlyNewMembers, Boolean wasRefunded,
                           String prizeDescription) {
        this.chat = chat;
        this.giveawayMessageId = giveawayMessageId;
        this.winnersSelectionDate = winnersSelectionDate;
        this.winnerCount = winnerCount;
        this.winners = winners;
        this.additionalChatCount = additionalChatCount;
        this.prizeStarCount = prizeStarCount;
        this.premiumSubscriptionMonthCount = premiumSubscriptionMonthCount;
        this.unclaimedPrizeCount = unclaimedPrizeCount;
        this.onlyNewMembers = onlyNewMembers;
        this.wasRefunded = wasRefunded;
        this.prizeDescription = prizeDescription;
    }
}