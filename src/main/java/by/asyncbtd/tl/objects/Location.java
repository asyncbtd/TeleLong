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

public class Location {

    private Float latitude;
    private Float longitude;
    private Float horizontalAccuracy;
    private Integer livePeriod;
    private Integer heading;
    private Integer proximityAlertRadius;

    public Float getLatitude() {
        return latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public Float getHorizontalAccuracy() {
        return horizontalAccuracy;
    }

    public Integer getLivePeriod() {
        return livePeriod;
    }

    public Integer getHeading() {
        return heading;
    }

    public Integer getProximityAlertRadius() {
        return proximityAlertRadius;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public void setHorizontalAccuracy(Float horizontalAccuracy) {
        this.horizontalAccuracy = horizontalAccuracy;
    }

    public void setLivePeriod(Integer livePeriod) {
        this.livePeriod = livePeriod;
    }

    public void setHeading(Integer heading) {
        this.heading = heading;
    }

    public void setProximityAlertRadius(Integer proximityAlertRadius) {
        this.proximityAlertRadius = proximityAlertRadius;
    }

    public String toString() {
        return "Location(latitude=" + this.latitude +
                ", longitude=" + this.longitude +
                ", horizontalAccuracy=" + this.horizontalAccuracy +
                ", livePeriod=" + this.livePeriod +
                ", heading=" + this.heading +
                ", proximityAlertRadius=" + this.proximityAlertRadius + ")";
    }

    public Location() {
    }

    public Location(Float latitude, Float longitude, Float horizontalAccuracy, Integer livePeriod, Integer heading, Integer proximityAlertRadius) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.horizontalAccuracy = horizontalAccuracy;
        this.livePeriod = livePeriod;
        this.heading = heading;
        this.proximityAlertRadius = proximityAlertRadius;
    }
}
