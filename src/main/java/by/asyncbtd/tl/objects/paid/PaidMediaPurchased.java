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

import by.asyncbtd.tl.objects.User;

public class PaidMediaPurchased {

    private User from;
    private String paidMediaPayload;

    public User getFrom() {
        return from;
    }

    public String getPaidMediaPayload() {
        return paidMediaPayload;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setPaidMediaPayload(String paidMediaPayload) {
        this.paidMediaPayload = paidMediaPayload;
    }

    public String toString() {
        return "PaidMediaPurchased(from=" + this.getFrom() +
                ", paidMediaPayload=" + this.getPaidMediaPayload() + ")";
    }

    public PaidMediaPurchased() {
    }

    public PaidMediaPurchased(User from, String paidMediaPayload) {
        this.from = from;
        this.paidMediaPayload = paidMediaPayload;
    }
}
