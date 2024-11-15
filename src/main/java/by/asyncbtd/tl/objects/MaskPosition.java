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

public class MaskPosition {

    private String point;
    private Float xShift;
    private Float yShift;
    private Float scale;

    public String getPoint() {
        return point;
    }

    public Float getxShift() {
        return xShift;
    }

    public Float getyShift() {
        return yShift;
    }

    public Float getScale() {
        return scale;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public void setxShift(Float xShift) {
        this.xShift = xShift;
    }

    public void setyShift(Float yShift) {
        this.yShift = yShift;
    }

    public void setScale(Float scale) {
        this.scale = scale;
    }

    public String toString() {
        return "MaskPosition(point=" + this.getPoint() +
                ", xShift=" + this.getxShift() +
                ", yShift=" + this.getyShift() +
                ", scale=" + this.getScale() + ")";
    }

    public MaskPosition() {
    }

    public MaskPosition(String point, Float xShift, Float yShift, Float scale) {
        this.point = point;
        this.xShift = xShift;
        this.yShift = yShift;
        this.scale = scale;
    }
}
