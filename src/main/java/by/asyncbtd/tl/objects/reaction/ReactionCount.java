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

package by.asyncbtd.tl.objects.reaction;

public class ReactionCount {

    private ReactionType type;
    private Integer totalCount;

    public ReactionType getType() {
        return type;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setType(ReactionType type) {
        this.type = type;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String toString() {
        return "ReactionCount(type=" + this.getType() +
                ", totalCount=" + this.getTotalCount() + ")";
    }

    public ReactionCount() {
    }

    public ReactionCount(ReactionType type, Integer totalCount) {
        this.type = type;
        this.totalCount = totalCount;
    }
}
