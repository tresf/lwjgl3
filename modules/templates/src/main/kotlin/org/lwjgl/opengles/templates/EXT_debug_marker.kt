/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_debug_marker = "EXTDebugMarker".nativeClassGLES("EXT_debug_marker", postfix = EXT) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension defines a mechanism for OpenGL and OpenGL ES applications to annotate their command stream with markers for discrete events and groups
		of commands using descriptive text markers.

		When profiling or debugging such an application within a debugger or profiler it is difficult to relate the commands within the command stream to the
		elements of the scene or parts of the program code to which they correspond. Markers help obviate this by allowing applications to specify this link.

		The intended purpose of this is purely to improve the user experience within OpenGL and OpenGL ES development tools.
		"""

	void(
		"InsertEventMarkerEXT",
		"",

		AutoSize("marker") _ GLsizei.IN("length", ""),
		const _ GLcharUTF8_p.IN("marker", "")
	)

	void(
		"PushGroupMarkerEXT",
		"",

		AutoSize("marker") _ GLsizei.IN("length", ""),
		const _ GLcharUTF8_p.IN("marker", "")
	)

	void(
		"PopGroupMarkerEXT",
		""
	)
}