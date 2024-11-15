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

public class BusinessOpeningHoursInterval {

    private Integer openingMinute;
    private Integer closingMinute;

    public Integer getOpeningMinute() {
        return openingMinute;
    }

    public Integer getClosingMinute() {
        return closingMinute;
    }

    public void setOpeningMinute(Integer openingMinute) {
        this.openingMinute = openingMinute;
    }

    public void setClosingMinute(Integer closingMinute) {
        this.closingMinute = closingMinute;
    }

    public String toString() {
        return "BusinessOpeningHoursInterval(openingMinute=" + this.openingMinute +
                ", closingMinute=" + this.closingMinute + ")";
    }

    public BusinessOpeningHoursInterval() {
    }

    public BusinessOpeningHoursInterval(Integer openingMinute, Integer closingMinute) {
        this.openingMinute = openingMinute;
        this.closingMinute = closingMinute;
    }
}
