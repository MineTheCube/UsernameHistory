/* 
 * Copyright (c) 2015 Parker Kemp
 * 
 * This file is part of UsernameHistory.
 *
 * UsernameHistory is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * UsernameHistory is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with UsernameHistory.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.spinalcraft.usernamehistory;

import java.util.Arrays;
import java.util.UUID;

/**
 * UHistory contains a list of {@link UName}, where each UName is a prior (or current) name
 * of a certain player.
 * @author Parker Kemp
 */
public class UHistory{
	private UUID uuid;
	
	private UName[] oldNames;
	
	public UHistory(UUID uuid, UName[] oldNames){
		this.uuid = uuid;
		this.oldNames = oldNames;
		Arrays.sort(this.oldNames);
	}
	
	/**
	 * @return The UUID of the player
	 */
	public UUID getUuid(){
		return uuid;
	}
	
	/**
	 * Returns an array containing the player's username history in chronological order, where
	 * index 0 is their first (original) username.
	 * @return The player's username history.
	 */
	public UName[] getOldUsernames(){
		return oldNames;
	}
}
