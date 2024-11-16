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

public class ShippingQuery {

    private String id;
    private User from;
    private String invoicePayload;
    private ShippingAddress shippingAddress;

    public String getId() {
        return id;
    }

    public User getFrom() {
        return from;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public void setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String toString() {
        return "ShippingQuery(id=" + this.getId() +
                ", from=" + this.getFrom() +
                ", invoicePayload=" + this.getInvoicePayload() +
                ", shippingAddress=" + this.getShippingAddress() + ")";
    }

    public ShippingQuery() {
    }

    public ShippingQuery(String id, User from, String invoicePayload, ShippingAddress shippingAddress) {
        this.id = id;
        this.from = from;
        this.invoicePayload = invoicePayload;
        this.shippingAddress = shippingAddress;
    }
}
