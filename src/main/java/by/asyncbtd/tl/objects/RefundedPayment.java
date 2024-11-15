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

public class RefundedPayment {

    private String currency;
    private Integer totalAmount;
    private String invoicePayload;
    private String telegramPaymentChargeId;
    private String providerPaymentChargeId;

    public String getCurrency() {
        return currency;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public String getTelegramPaymentChargeId() {
        return telegramPaymentChargeId;
    }

    public String getProviderPaymentChargeId() {
        return providerPaymentChargeId;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
    }

    public void setTelegramPaymentChargeId(String telegramPaymentChargeId) {
        this.telegramPaymentChargeId = telegramPaymentChargeId;
    }

    public void setProviderPaymentChargeId(String providerPaymentChargeId) {
        this.providerPaymentChargeId = providerPaymentChargeId;
    }

    public String toString() {
        return "RefundedPayment(currency=" + this.getCurrency() +
                ", totalAmount=" + this.getTotalAmount() +
                ", invoicePayload=" + this.getInvoicePayload() +
                ", telegramPaymentChargeId=" + this.getTelegramPaymentChargeId() +
                ", providerPaymentChargeId=" + this.getProviderPaymentChargeId() + ")";
    }

    public RefundedPayment() {
    }

    public RefundedPayment(String currency, Integer totalAmount, String invoicePayload, String telegramPaymentChargeId, String providerPaymentChargeId) {
        this.currency = currency;
        this.totalAmount = totalAmount;
        this.invoicePayload = invoicePayload;
        this.telegramPaymentChargeId = telegramPaymentChargeId;
        this.providerPaymentChargeId = providerPaymentChargeId;
    }
}
