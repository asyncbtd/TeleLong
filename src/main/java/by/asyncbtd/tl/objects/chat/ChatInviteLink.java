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

package by.asyncbtd.tl.objects.chat;

import by.asyncbtd.tl.objects.Invoice;
import by.asyncbtd.tl.objects.User;

public class ChatInviteLink {

    private String inviteLink;
    private User creator;
    private Boolean createsJoinRequest;
    private Boolean isPrimary;
    private Boolean isRevoked;
    private String name;
    private Integer expireDate;
    private Integer memberLimit;
    private Integer pendingJoinRequestCount;
    private Integer subscriptionPeriod;
    private Integer subscriptionPrice;

    public String getInviteLink() {
        return inviteLink;
    }

    public User getCreator() {
        return creator;
    }

    public Boolean getCreatesJoinRequest() {
        return createsJoinRequest;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public Boolean getIsRevoked() {
        return isRevoked;
    }

    public String getName() {
        return name;
    }

    public Integer getExpireDate() {
        return expireDate;
    }

    public Integer getMemberLimit() {
        return memberLimit;
    }

    public Integer getPendingJoinRequestCount() {
        return pendingJoinRequestCount;
    }

    public Integer getSubscriptionPeriod() {
        return subscriptionPeriod;
    }

    public Integer getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public void setInviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public void setCreatesJoinRequest(Boolean createsJoinRequest) {
        this.createsJoinRequest = createsJoinRequest;
    }

    public void setZisPrimary(Boolean zisPrimary) {
        this.isPrimary = zisPrimary;
    }

    public void setIsRevoked(Boolean isRevoked) {
        this.isRevoked = isRevoked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpireDate(Integer expireDate) {
        this.expireDate = expireDate;
    }

    public void setMemberLimit(Integer memberLimit) {
        this.memberLimit = memberLimit;
    }

    public void setPendingJoinRequestCount(Integer pendingJoinRequestCount) {
        this.pendingJoinRequestCount = pendingJoinRequestCount;
    }

    public void setSubscriptionPeriod(Integer subscriptionPeriod) {
        this.subscriptionPeriod = subscriptionPeriod;
    }

    public void setSubscriptionPrice(Integer subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public String toString() {
        return "ChatInviteLink(inviteLink=" + this.getInviteLink() +
                ", creator=" + this.getCreator() +
                ", createsJoinRequest=" + this.getCreatesJoinRequest() +
                ", isPrimary=" + this.getIsPrimary() +
                ", isRevoked=" + this.getIsRevoked() +
                ", name=" + this.getName() +
                ", expireDate=" + this.getExpireDate() +
                ", memberLimit=" + this.getMemberLimit() +
                ", pendingJoinRequestCount=" + this.getPendingJoinRequestCount() +
                ", subscriptionPeriod=" + this.getSubscriptionPeriod() +
                ", subscriptionPrice=" + this.getSubscriptionPrice() + ")";
    }

    public ChatInviteLink() {
    }

    public ChatInviteLink(String inviteLink, User creator, Boolean createsJoinRequest, Boolean isPrimary, Boolean isRevoked, String name, Integer expireDate,
                          Integer memberLimit, Integer pendingJoinRequestCount, Integer subscriptionPeriod, Integer subscriptionPrice) {
        this.inviteLink = inviteLink;
        this.creator = creator;
        this.createsJoinRequest = createsJoinRequest;
        this.isPrimary = isPrimary;
        this.isRevoked = isRevoked;
        this.name = name;
        this.expireDate = expireDate;
        this.memberLimit = memberLimit;
        this.pendingJoinRequestCount = pendingJoinRequestCount;
        this.subscriptionPeriod = subscriptionPeriod;
        this.subscriptionPrice = subscriptionPrice;
    }
}
