public class TheBinaryTree {
	private CustomerInfo rootnode;
	private int placeinTree;

//class TheBinaryTree has attributes for the "rootnode" and "the place in tree"

	public TheBinaryTree() {
		this.rootnode = null;
		this.placeinTree = 0;
	}
//The root node is set to null and the place in tree is zero for the object binary tree

	public CustomerInfo getrootnode() {
		return this.rootnode;
	}

	public void setrootnode(CustomerInfo rootnode) {
		this.rootnode = rootnode;
	}

	public int getplaceinTree() {
		return this.placeinTree;
	}

  	public void setplaceinTree(int placeinTree) {
		this.placeinTree = placeinTree;
	}
//getter and setter methods

	public void addToTree(CustomerInfo rootnode, CustomerInfo adding) {

		if (adding.getcustomerID() <= rootnode.getcustomerID()) {
			if (rootnode.getLeft() == null) {
				rootnode.setLeft(adding);
			} else {
				addToTree(rootnode.getLeft(), adding);
			}

		}
		if (adding.getcustomerID() > rootnode.getcustomerID()) {
			if (rootnode.getRight() == null) {
				rootnode.setRight(adding);
			} else {
				addToTree(rootnode.getRight(), adding);
			}
		}

  	if (this.placeinTree == 0 || this.getrootnode() == null) {
			placeinTree++;
			this.setrootnode(adding);
			return;

		}  

	}
//Void method for adding something to the binary tree using nested if statements

	public void preorder(CustomerInfo rootnode) {

		if (rootnode != null) {
			Print(rootnode);
			preorder(rootnode.getLeft());
			preorder(rootnode.getRight());
		}
	}
//code for the preorder traversal of a binary tree

	public void inorder(CustomerInfo rootnode) {

		if (rootnode != null) {
			inorder(rootnode.getLeft());
			Print(rootnode);
			inorder(rootnode.getRight());
		}
	}
//code for the inorder traversal of a binary tree

	public void postorder(CustomerInfo rootnode) {

		if (rootnode != null) {
			postorder(rootnode.getLeft());
			postorder(rootnode.getRight());
			Print(rootnode);
		}
	}
//code for the postorder traversal of a binary tree

	private void Print(CustomerInfo printx) {
		System.out.print(printx.getcustomerID() + ", ");
	}

	private void Print(CustomerInfo printx, boolean y) {
		if (!y) {
			System.out.print(printx.getcustomerID() + ", ");
		} else {
			System.out.print(printx.getcustomerID() + " ");
		}
		return;
	}
//The output statement for the Binary Tree in an orderly and clean format
}
