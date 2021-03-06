package com.davidparry.widgets;

import com.davidparry.widgets.util.ImageCache;

/**
 * Copyright 2015 David Parry
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public interface ThreadLoad extends MemoryCache.Listener {
    void loadImageFromUrl(String url);

    String getImageUrl();

    void startLoad();

    ImageCache getCache();

    void setCache(ImageCache cache);
}
