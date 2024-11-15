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

package by.asyncbtd.tl.objects.paid;

import java.util.List;

public class PaidMediaInfo {

    private Integer starCount;
    private List<PaidMedia> paidMedia;

    public Integer getStarCount() {
        return starCount;
    }

    public List<PaidMedia> getPaidMedia() {
        return paidMedia;
    }

    public void setStarCount(Integer starCount) {
        this.starCount = starCount;
    }

    public void setPaidMedia(List<PaidMedia> paidMedia) {
        this.paidMedia = paidMedia;
    }

    public String toString() {
        return "PaidMediaInfo(starCount=" + getStarCount() +
                ", paidMedia=" + getPaidMedia() + ")";
    }

    public PaidMediaInfo(){
    }

    public PaidMediaInfo(Integer starCount, List<PaidMedia> paidMedia) {
        this.starCount = starCount;
        this.paidMedia = paidMedia;
    }
}
