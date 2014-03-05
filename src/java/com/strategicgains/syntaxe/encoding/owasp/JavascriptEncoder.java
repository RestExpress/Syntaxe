/*
    Copyright 2014, Strategic Gains, Inc.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package com.strategicgains.syntaxe.encoding.owasp;

import org.owasp.encoder.Encode;

import com.strategicgains.syntaxe.encoding.XssEncoder;

/**
 * Uses the OWASP Encode class to encode for cross-site scripting Javascript.
 * 
 * @author toddf
 * @since Mar 5, 2014
 */
public class JavascriptEncoder
implements XssEncoder
{
	@Override
    public String encode(String input)
    {
		return Encode.forJavaScript(input);
    }
}
