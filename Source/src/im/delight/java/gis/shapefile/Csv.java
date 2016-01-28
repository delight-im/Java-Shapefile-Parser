package im.delight.java.gis.shapefile;

/*
 * Copyright (c) delight.im <info@delight.im>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA
 */

import java.lang.String;

/** Provides CSV (comma-separated values) features such as encoding/decoding and escaping/unescaping */
public class Csv {

	protected static final String DELIMITER = ",";
	protected static final String QUOTE = "\"";

	public static String encode(final Iterable<?> iterable) {
		StringBuilder out = new StringBuilder();

		String str;
		for (Object obj : iterable) {
			if (out.length() > 0) {
				out.append(DELIMITER);
			}

			if (obj instanceof String) {
				str = (String) obj;
			}
			else {
				str = obj.toString();
			}

			out.append(escape(str));
		}

		return out.toString();
	}

	public static String escape(final String str) {
		if (containsReservedCharacter(str)) {
			return QUOTE + str.replace(QUOTE, QUOTE + QUOTE) + QUOTE;
		}
		else {
			return str;
		}
	}

	protected static boolean containsReservedCharacter(final String str) {
		return str.contains(DELIMITER) || str.contains(QUOTE) || str.contains("\r") || str.contains("\n");
	}

}
