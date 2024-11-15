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

import by.asyncbtd.tl.objects.Location;

public class BusinessLocation {

    private String address;
    private Location location;

    public String getAddress() {
        return address;
    }

    public Location getLocation() {
        return location;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String toString() {
        return "BusinessLocation(address=" + this.address +
                ", location=" + this.location + ")";
    }

    public BusinessLocation() {
    }

    public BusinessLocation(String address, Location location) {
        this.address = address;
        this.location = location;
    }
}
