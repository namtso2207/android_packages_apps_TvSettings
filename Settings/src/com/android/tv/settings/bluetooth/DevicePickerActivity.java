/*
 * Copyright (C) 2010 The Android Open Source Project
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

package com.android.tv.settings.bluetooth;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import com.android.tv.settings.R;
import com.android.tv.settings.BaseSettingsFragment;
import com.android.tv.settings.TvSettingsActivity;

/**
 * Activity for Bluetooth device picker dialog. The device picker logic
 * is implemented in the {@link BluetoothSettings} fragment.
 */
public final class DevicePickerActivity extends TvSettingsActivity {
    @Override
    protected Fragment createSettingsFragment() {
        return DevicePickerFragment.newInstance();
    }

    public static class SettingsFragment extends BaseSettingsFragment {

        public static SettingsFragment newInstance() {
            return new SettingsFragment();
        }

        @Override
        public void onPreferenceStartInitialScreen() {
            final DevicePickerFragment fragment = DevicePickerFragment.newInstance();
            startPreferenceFragment(fragment);
        }
    }
}
