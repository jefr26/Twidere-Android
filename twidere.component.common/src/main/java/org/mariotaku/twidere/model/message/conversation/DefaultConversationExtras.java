/*
 *         Twidere - Twitter client for Android
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.mariotaku.twidere.model.message.conversation;

import android.os.Parcel;
import android.os.Parcelable;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;
import com.hannesdorfmann.parcelableplease.annotation.ParcelablePlease;

import org.mariotaku.microblog.library.twitter.model.DMResponse;

/**
 * Created by mariotaku on 2017/2/13.
 */

@ParcelablePlease
@JsonObject
public class DefaultConversationExtras extends ConversationExtras implements Parcelable {

    @JsonField(name = "notifications_disabled")
    public boolean notificationsDisabled;

    @Override
    public String toString() {
        return "DefaultConversationExtras{" +
                "notificationsDisabled=" + notificationsDisabled +
                "} " + super.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        DefaultConversationExtrasParcelablePlease.writeToParcel(this, dest, flags);
    }

    public static final Creator<DefaultConversationExtras> CREATOR = new Creator<DefaultConversationExtras>() {
        public DefaultConversationExtras createFromParcel(Parcel source) {
            DefaultConversationExtras target = new DefaultConversationExtras();
            DefaultConversationExtrasParcelablePlease.readFromParcel(target, source);
            return target;
        }

        public DefaultConversationExtras[] newArray(int size) {
            return new DefaultConversationExtras[size];
        }
    };
}
