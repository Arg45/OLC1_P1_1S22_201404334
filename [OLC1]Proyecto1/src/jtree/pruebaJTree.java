package jtree;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;

public class pruebaJTree extends JFrame {

	JTree tree = new JTree();

	DefaultTreeModel model = (DefaultTreeModel) tree.getModel();

	TreeSelectionModel selectionModel = tree.getSelectionModel();

	JButton removeButton = new JButton("Remove selected node");

	JButton addButton = new JButton("Add node");

	public pruebaJTree() {

		Container contentPane = getContentPane();

		selectionModel.setSelectionMode(

		TreeSelectionModel.SINGLE_TREE_SELECTION);

		contentPane.add(new ControlPanel(), BorderLayout.NORTH);

		contentPane.add(tree, BorderLayout.CENTER);

		tree.addTreeSelectionListener(

		new TreeSelectionListener() {

			public void valueChanged(TreeSelectionEvent e) {

				TreePath path = e.getNewLeadSelectionPath();

				boolean nodesAreSelected = (path != null);

				addButton.setEnabled(nodesAreSelected);

				removeButton.setEnabled(nodesAreSelected);

			}

		});

		model.addTreeModelListener(new TreeModelListener() {

			public void treeNodesInserted(TreeModelEvent e) {

				showInsertionOrRemoval(e, " added to ");

			}

			public void treeNodesRemoved(TreeModelEvent e) {

				showInsertionOrRemoval(e, " removed from ");

			}

			private void showInsertionOrRemoval(TreeModelEvent e,

			String s) {

				Object[] parentPath = e.getPath();

				int[] indexes = e.getChildIndices();

				Object[] children = e.getChildren();

				Object parent = parentPath[parentPath.length - 1];

				JOptionPane.showMessageDialog(pruebaJTree.this,
						"Node " + children[0].toString() + "" + s
								+ parent.toString() + " at index " + indexes[0],
						"Node Added or Removed",
						JOptionPane.INFORMATION_MESSAGE);

			}

			public void treeNodesChanged(TreeModelEvent e) {
			}

			public void treeStructureChanged(TreeModelEvent e) {
			}

		});

	}

	class ControlPanel extends JPanel {

		public ControlPanel() {

			addButton.setEnabled(false);

			removeButton.setEnabled(false);

			add(addButton);

			add(removeButton);

			addButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					TreePath path =

					selectionModel.getSelectionPath();

					MutableTreeNode parent, node =

					(MutableTreeNode) path.getLastPathComponent();

					if (path.getPathCount() > 1)

						parent = (MutableTreeNode) node.getParent();

					else

						parent = (MutableTreeNode) node;

					int index = parent.getIndex(node) + 1;

					String s = JOptionPane.showInputDialog(pruebaJTree.this,

					"Enter a name for the new node:",

					"New Tree Node",

					JOptionPane.QUESTION_MESSAGE);

					MutableTreeNode newNode =

					new DefaultMutableTreeNode(s);

					model.insertNodeInto(newNode, parent, index);

				}

			});

			removeButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					TreePath path =

					selectionModel.getSelectionPath();

					if (path.getPathCount() == 1) {

						JOptionPane.showMessageDialog(ControlPanel.this,

						"Can't remove root node!");

						return;

					}

					MutableTreeNode node =

					(MutableTreeNode) path.getLastPathComponent();

					model.removeNodeFromParent(node);

				}

			});

		}

	}

	public static void main(String args[]) {

		pruebaJTree t = new pruebaJTree();

		t.setSize(400, 300);

		t.show();

	}

}