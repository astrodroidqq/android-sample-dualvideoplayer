/**
 * Copyright (c) 2014-2016, Digi International Inc. <support@digi.com>
 *
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.digi.android.sample.dualvideoplayer;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Specifies the accepted extensions to be played.
 */
public class VideoFilter implements FilenameFilter {
	@Override
	public boolean accept(File dir, String name) {
		return (name.endsWith(".mp4") || name.endsWith(".3gp") 
				|| name.endsWith(".webm") || name.endsWith(".avi")
				|| name.endsWith(".wmv") || name.endsWith(".mkv")
				|| name.endsWith(".mov"));
	}
}
