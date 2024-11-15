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

public class Invoice {

    private String title;
    private String description;
    private String startParameter;
    private String currency;
    private Integer totalAmount;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStartParameter() {
        return startParameter;
    }

    public String getCurrency() {
        return currency;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartParameter(String startParameter) {
        this.startParameter = startParameter;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String toString() {
        return "Invoice(title=" + this.getTitle() +
                ", description=" + this.getDescription() +
                ", startParameter=" + this.getStartParameter() +
                ", currency=" + this.getCurrency() +
                ", totalAmount=" + this.getTotalAmount() + ")";
    }

    public Invoice() {
    }

    public Invoice(String title, String description, String startParameter, String currency, Integer totalAmount) {
        this.title = title;
        this.description = description;
        this.startParameter = startParameter;
        this.currency = currency;
        this.totalAmount = totalAmount;
    }
}
