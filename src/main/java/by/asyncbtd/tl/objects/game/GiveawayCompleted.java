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

package by.asyncbtd.tl.objects.game;

import by.asyncbtd.tl.objects.message.Message;

public class GiveawayCompleted {

    private Integer winnerCount;
    private Integer unclaimedPrizeCount;
    private Message giveawayMessage;
    private Boolean isStarGiveaway;

    public Integer getWinnerCount() {
        return winnerCount;
    }

    public Integer getUnclaimedPrizeCount() {
        return unclaimedPrizeCount;
    }

    public Message getGiveawayMessage() {
        return giveawayMessage;
    }

    public Boolean getIsStarGiveaway() {
        return isStarGiveaway;
    }

    public void setWinnerCount(Integer winnerCount) {
        this.winnerCount = winnerCount;
    }

    public void setUnclaimedPrizeCount(Integer unclaimedPrizeCount) {
        this.unclaimedPrizeCount = unclaimedPrizeCount;
    }

    public void setGiveawayMessage(Message giveawayMessage) {
        this.giveawayMessage = giveawayMessage;
    }

    public void setIsStarGiveaway(Boolean isStarGiveaway) {
        this.isStarGiveaway = isStarGiveaway;
    }

    public String toString() {
        return "GiveawayCompleted(winnerCount=" + this.getWinnerCount() +
                ", unclaimedPrizeCount=" + this.getUnclaimedPrizeCount() +
                ", giveawayMessage=" + this.getGiveawayMessage() +
                ", isStarGiveaway=" + this.getIsStarGiveaway() + ")";
    }

    public GiveawayCompleted() {
    }

    public GiveawayCompleted(Integer winnerCount, Integer unclaimedPrizeCount, Message giveawayMessage, Boolean isStarGiveaway) {
        this.winnerCount = winnerCount;
        this.unclaimedPrizeCount = unclaimedPrizeCount;
        this.giveawayMessage = giveawayMessage;
        this.isStarGiveaway = isStarGiveaway;
    }
}
