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

public class ChosenInlineResult {

    private String resultId;
    private User from;
    private Location location;
    private String inlineMessageId;
    private String query;

    public String getResultId() {
        return resultId;
    }

    public User getFrom() {
        return from;
    }

    public Location getLocation() {
        return location;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public String getQuery() {
        return query;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String toString() {
        return "ChosenInlineResult(resultId=" + this.getResultId() +
                ", from=" + this.getFrom() +
                ", location=" + this.getLocation() +
                ", inlineMessageId=" + this.getInlineMessageId() +
                ", query=" + this.getQuery() + ")";
    }

    public ChosenInlineResult() {
    }

    public ChosenInlineResult(String resultId, User from, Location location, String inlineMessageId, String query) {
        this.resultId = resultId;
        this.from = from;
        this.location = location;
        this.inlineMessageId = inlineMessageId;
        this.query = query;
    }
}
