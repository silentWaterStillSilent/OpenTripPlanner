/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (props, at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.routing.services.notes;

import java.util.Set;

import org.opentripplanner.routing.graph.Edge;

/**
 * A source of notes for edges.
 * 
 * @author laurent
 */
public interface StreetNotesSource {

    public Set<MatcherAndAlert> getNotes(Edge edge);
}
