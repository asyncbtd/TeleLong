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

import by.asyncbtd.tl.objects.chat.Chat;

import java.util.List;

public class PollAnswer {

    private String pollId;
    private Chat voterChat;
    private User user;
    private List<Integer> optionIds;

    public String getPollId() {
        return pollId;
    }

    public Chat getVoterChat() {
        return voterChat;
    }

    public User getUser() {
        return user;
    }

    public List<Integer> getOptionIds() {
        return optionIds;
    }

    public void setPollId(String pollId) {
        this.pollId = pollId;
    }

    public void setVoterChat(Chat voterChat) {
        this.voterChat = voterChat;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setOptionIds(List<Integer> optionIds) {
        this.optionIds = optionIds;
    }

    public String toString() {
        return "PollAnswer(pollId=" + this.getPollId() +
                ", voterChat=" + this.getVoterChat() +
                ", user=" + this.getUser() +
                ", optionIds=" + this.getOptionIds() + ")";
    }

    public PollAnswer() {
    }

    public PollAnswer(String pollId, Chat voterChat, User user, List<Integer> optionIds) {
        this.pollId = pollId;
        this.voterChat = voterChat;
        this.user = user;
        this.optionIds = optionIds;
    }
}
