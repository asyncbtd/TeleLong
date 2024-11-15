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

public class OrderInfo {

    private String name;
    private String phoneNumber;
    private String email;
    private ShippingAddress shippingAddress;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String toString() {
        return "OrderInfo(name=" + this.getName() +
                ", phoneNumber=" + this.getPhoneNumber() +
                ", email=" + this.getEmail() +
                ", shippingAddress=" + this.getShippingAddress() + ")";
    }

    public OrderInfo() {
    }

    public OrderInfo(String name, String phoneNumber, String email, ShippingAddress shippingAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.shippingAddress = shippingAddress;
    }
}
