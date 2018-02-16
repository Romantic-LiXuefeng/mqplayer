/*
 * Copyright (C) 2017 The Android Open Source Project
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
package com.google.android.exoplayer2.ext.ffmpeg;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.video.ColorInfo;

/**
 * Input buffer to a {@link FFmpegDecoder}.
 */
/* package */ final class FFmpegPacketBuffer extends DecoderInputBuffer {

  public static final int BUFFER_FLAG_DECODE_AGAIN = 0x00800000;

  public ColorInfo colorInfo;

  public FFmpegPacketBuffer() {
    super(DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DIRECT);
  }

  public boolean hasFlag(int flag) {
    return getFlag(flag);
  }
}
