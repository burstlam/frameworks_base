/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.server.firewall;

import android.content.Intent;
import android.content.pm.ApplicationInfo;

interface Filter {
    /**
     * Does the given intent + context info match this filter?
     *
     * @param ifw The IntentFirewall instance
     * @param intent The intent being started/bound/broadcast
     * @param callerUid The uid of the caller
     * @param callerPid The pid of the caller
     * @param resolvedType The resolved mime type of the intent
     * @param resolvedApp The application that contains the resolved component that the intent is
     */
    boolean matches(IntentFirewall ifw, Intent intent, int callerUid, int callerPid,
            String resolvedType, ApplicationInfo resolvedApp);
}
