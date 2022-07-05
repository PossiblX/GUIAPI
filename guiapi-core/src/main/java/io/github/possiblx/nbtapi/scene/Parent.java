package io.github.possiblx.nbtapi.scene;

import java.util.ArrayList;
import java.util.List;

public class Parent extends Node {

	private List<Node> children = new ArrayList<>();

	protected List<Node> getChildren() {
		return children;
	}


	///////////////////////////////////////////////////////////////////////////
	// layout
	///////////////////////////////////////////////////////////////////////////

	public final void layout() {
		// TODO: check whether method call is needed
		for (int i = 0; i < children.size(); i++) {
			final Node child = children.get(i);
			if (child instanceof Parent parent) {
				parent.layout();
			}
		}
		layoutChildren();
	}

	protected void layoutChildren() {
		// layout by x and y in Node
	}

}
