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

public class ProximityAlertTriggered {

    private User traveler;
    private User watcher;
    private Integer distance;

    public User getTraveler() {
        return traveler;
    }

    public User getWatcher() {
        return watcher;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setTraveler(User traveler) {
        this.traveler = traveler;
    }

    public void setWatcher(User watcher) {
        this.watcher = watcher;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String toString() {
        return "ProximityAlertTriggered(traveler=" + this.getTraveler() +
                ", watcher=" + this.getWatcher() +
                ", distance=" + this.getDistance() + ")";
    }

    public ProximityAlertTriggered() {
    }

    public ProximityAlertTriggered(User traveler, User watcher, Integer distance) {
        this.traveler = traveler;
        this.watcher = watcher;
        this.distance = distance;
    }
}
