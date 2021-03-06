/*
 * (C) Copyright Robot Media SL (http://robotmedia.net) and others.
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
package net.robotmedia.widget;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;

public class ImageViewTest extends AndroidTestCase {

	private ImageView mImageView;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mImageView = new ImageView(getContext());
	}
	
	@SmallTest
	public void testFitYUniformly_NullDrawable() {
		mImageView.fitYUniformly();
	}
	
}
