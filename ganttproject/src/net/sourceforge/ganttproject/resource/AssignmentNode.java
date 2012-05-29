/*
Copyright 2003-2012 Dmitry Barashev, GanttProject Team

This file is part of GanttProject, an opensource project management tool.

GanttProject is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

GanttProject is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with GanttProject.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.sourceforge.ganttproject.resource;

import org.jdesktop.swingx.treetable.DefaultMutableTreeTableNode;

import net.sourceforge.ganttproject.roles.Role;
import net.sourceforge.ganttproject.task.ResourceAssignment;
import net.sourceforge.ganttproject.task.Task;

public class AssignmentNode extends DefaultMutableTreeTableNode {

  private final ResourceAssignment resourceAssignment;

  public AssignmentNode(ResourceAssignment res) {
    super(res);
    resourceAssignment = res;
  }

  public ResourceAssignment getAssignment() {
    return resourceAssignment;
  }

  public Role getRoleForAssigment() {
    return resourceAssignment.getRoleForAssignment();
  }

  public void setRoleForAssigment(Role role) {
    resourceAssignment.setRoleForAssignment(role);
  }

  public Task getTask() {
    return resourceAssignment.getTask();
  }

  @Override
  public String toString() {
    return resourceAssignment.getTask().getName();
  }

}
