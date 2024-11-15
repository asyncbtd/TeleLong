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

public class Contact {

    private String phoneNumber;
    private String firstName;
    private String lastName;
    private Long userId;
    private String vcard;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getUserId() {
        return userId;
    }

    public String getVcard() {
        return vcard;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setVcard(String vcard) {
        this.vcard = vcard;
    }

    public String toString() {
        return "Contact(phoneNumber=" + this.getPhoneNumber() +
                ", firstName=" + this.getFirstName() +
                ", lastName=" + this.getLastName() +
                ", userId=" + this.getUserId() +
                ", vcard=" + this.getVcard() + ")";
    }

    public Contact() {
    }

    public Contact(String phoneNumber, String firstName, String lastName, Long userId, String vcard) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
        this.vcard = vcard;
    }
}
