/*
 * Copyright 2010, Jesper Fussing Mørk
 *
 * This file is part of Ratebeer Mobile for Android.
 *
 * Ratebeer Mobile is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Ratebeer Mobile is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Ratebeer Mobile.  If not, see <http://www.gnu.org/licenses/>.
 */
package dk.moerks.ratebeermobile.exceptions;

import android.content.Context;

public class NetworkException extends RBException {
	private static final long serialVersionUID = -3490133595541874885L;

	public NetworkException(String parentClass, String message, Exception exception){
		super(parentClass, message, exception);
	}
	
	public NetworkException(Context context, String parentClass, String message, Exception exception){
		super(parentClass, message, exception);
	}

}
