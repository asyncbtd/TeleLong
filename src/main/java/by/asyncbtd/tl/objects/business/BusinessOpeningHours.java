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

package by.asyncbtd.tl.objects.business;

import java.util.List;

public class BusinessOpeningHours {

    private String timeZoneName;
    private List<BusinessOpeningHoursInterval> openingHours;

    public String getTimeZoneName() {
        return timeZoneName;
    }

    public List<BusinessOpeningHoursInterval> getOpeningHours() {
        return openingHours;
    }

    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    public void setOpeningHours(List<BusinessOpeningHoursInterval> openingHours) {
        this.openingHours = openingHours;
    }

    public String toString() {
        return "BusinessOpeningHours(timeZoneName=" + this.timeZoneName +
                ", openingHours=" + this.openingHours + ")";
    }

    public BusinessOpeningHours() {
    }

    public BusinessOpeningHours(String timeZoneName, List<BusinessOpeningHoursInterval> openingHours) {
        this.timeZoneName = timeZoneName;
        this.openingHours = openingHours;
    }
}
