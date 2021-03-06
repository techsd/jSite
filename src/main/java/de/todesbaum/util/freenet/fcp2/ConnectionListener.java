/*
 * jSite - ConnectionListener.java - Copyright © 2006–2012 David Roden
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 */

package de.todesbaum.util.freenet.fcp2;

import java.util.EventListener;

/**
 * Interface for clients that want to be notified when a message was received.
 *
 * @author David Roden &lt;droden@gmail.com&gt;
 * @version $Id$
 */
public interface ConnectionListener extends EventListener {

	/**
	 * Notifies a client that a message was received.
	 *
	 * @param connection
	 *            The connection the message was received on
	 * @param message
	 *            The message that was received
	 */
	public void messageReceived(Connection connection, Message message);

	/**
	 * Notifies a client that the connection to the node has been lost.
	 *
	 * @param connection
	 *            The connection that was lost
	 */
	public void connectionTerminated(Connection connection);

}
