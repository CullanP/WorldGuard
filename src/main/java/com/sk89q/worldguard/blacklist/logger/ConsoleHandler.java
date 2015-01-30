/*
 * WorldGuard, a suite of tools for Minecraft
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldGuard team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldguard.blacklist.logger;

import com.sk89q.worldedit.blocks.ItemType;
import com.sk89q.worldguard.blacklist.event.BlacklistEvent;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsoleHandler implements LoggerHandler {

    private String worldName;
    private final Logger logger;

    public ConsoleHandler(String worldName, Logger logger) {
        this.worldName = worldName;
        this.logger = logger;
    }

    @Override
    public void logEvent(BlacklistEvent event, String comment) {
        logger.log(Level.INFO, "[" + worldName + "] " + event.getLoggerMessage() +
                (comment != null ? " (" + comment + ")" : ""));
    }

    @Override
    public void close() {
    }

}
