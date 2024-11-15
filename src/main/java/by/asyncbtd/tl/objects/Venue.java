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

public class Venue {

    private Location location;
    private String title;
    private String address;
    private String foursquareId;
    private String foursquareType;
    private String googlePlaceId;
    private String googlePlaceType;

    public Location getLocation() {
        return location;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getFoursquareId() {
        return foursquareId;
    }

    public String getFoursquareType() {
        return foursquareType;
    }

    public String getGooglePlaceId() {
        return googlePlaceId;
    }

    public String getGooglePlaceType() {
        return googlePlaceType;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
    }

    public void setFoursquareType(String foursquareType) {
        this.foursquareType = foursquareType;
    }

    public void setGooglePlaceId(String googlePlaceId) {
        this.googlePlaceId = googlePlaceId;
    }

    public void setGooglePlaceType(String googlePlaceType) {
        this.googlePlaceType = googlePlaceType;
    }

    public String toString() {
        return "Venue(location=" + this.getLocation() +
                ", title=" + this.getTitle() +
                ", address=" + this.getAddress() +
                ", foursquareId=" + this.getFoursquareId() +
                ", foursquareType=" + this.getFoursquareType() +
                ", googlePlaceId=" + this.getGooglePlaceId() +
                ", googlePlaceType=" + this.getGooglePlaceType() + ")";
    }

    public Venue() {
    }

    public Venue(Location location, String title, String address, String foursquareId, String foursquareType, String googlePlaceId, String googlePlaceType) {
        this.location = location;
        this.title = title;
        this.address = address;
        this.foursquareId = foursquareId;
        this.foursquareType = foursquareType;
        this.googlePlaceId = googlePlaceId;
        this.googlePlaceType = googlePlaceType;
    }
}
