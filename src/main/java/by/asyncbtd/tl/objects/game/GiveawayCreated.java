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

public class GiveawayCreated {

    private Integer prizeStarCount;

    public Integer getPrizeStarCount() {
        return prizeStarCount;
    }

    public void setPrizeStarCount(Integer prizeStarCount) {
        this.prizeStarCount = prizeStarCount;
    }

    public String toString() {
        return "GiveawayCreated(prizeStarCount=" + this.getPrizeStarCount() + ")";
    }

    public GiveawayCreated() {
    }

    public GiveawayCreated(Integer prizeStarCount) {
        this.prizeStarCount = prizeStarCount;
    }
}
