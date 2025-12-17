package Algoritham.Tree.Week_6;

public class AVL_Rotations {

	class AVLNode{
		int key;
		AVLNode left,right;
		int height;

		AVLNode(int val)
		{
			this.key=val;
			this.height=1;
			this.left=null;
			this.right=null;
		}
	}



	class AVLTree{

		// Get height safely
		int height(AVLNode n)
		{
			return (n==null) ? 0 : n.height;
		}

		// Get balance factor = leftHeight - rightHeight
		int getBalance(AVLNode n)
		{
			if(n==null)
			{
				return 0;
			}
			return height(n.left)-height(n.right);
		}

		// Update height after changes
		void updateHeight(AVLNode n)
		{
			n.height=1+Math.max(height(n.left),height(n.right));
		}







		// --------------- ROTATIONS ---------------- //
		// LL

		// RIGHT ROTATION
		//      y                 x
		//     / \               / \
		//    x   T3   --->    T1  y
		//   / \                  / \
		// T1  T2               T2  T3
		AVLNode rightRotate(AVLNode y)
		{ 
			//		  AVLNode x = y.left;
			//        AVLNode T2 = x.right;
			//
			//        // Perform rotation
			//        x.right = y;
			//        y.left = T2;
			//
			//        // Update heights
			//        updateHeight(y);
			//        updateHeight(x);
			//
			//        // New root = x
			//        return x;
			AVLNode x=y.left;
			AVLNode T2=x.right;
			x.right=y;
			y.left=T2;

			updateHeight(y);
			updateHeight(x);
			return x;
		}

		// LEFT ROTATION
		//    x                    y
		//   / \                  / \
		// T1  y     --->       x  T3
		//    / \              / \
		//   T2 T3            T1 T2
		AVLNode leftRotate(AVLNode x) {
			AVLNode y = x.right;
			AVLNode T2 = y.left;

			// rotation
			y.left = x;
			x.right = T2;

			// heights
			updateHeight(x);
			updateHeight(y);

			return y; // new root
		}







		// ---------------- INSERT ---------------- //
		AVLNode insert(AVLNode node,int key)
		{
			// 1. Normal BST insert
			if(node==null)
			{
				return new AVLNode(key);
			}
			if(key<node.key)
			{
				node.left=insert(node.left,key);
			}
			else if(key>node.key)
			{
				node.right=insert(node.right,key);
			}
			else
			{
				return node; // no duplicates allowed
			}




			// 2. Update height
			updateHeight(node);


			// 3. Check balance
			int balance = getBalance(node);

			// Case 1: Right Right //RR
			if(balance<-1 && key>node.right.key)
			{
				leftRotate(node);
			}
			// Case 2: Right Left  //RL
			if(balance<-1 && key <node.right.key)
			{
				node.right=rightRotate(node.right);
				return leftRotate(node);
			}



			// Case 3: Left Reft //LL
			if(balance>1 && key<node.left.key)
			{
				return rightRotate(node);
			}

			// Case 4: Left Right //LR
			if(balance>1 && key>node.left.key)
			{
				node.left=leftRotate(node.left);
				return rightRotate(node);
			}
			return node;
		}
	}




	public AVL_Rotations()
	{
		AVLTree tree=new AVLTree();
		AVLNode root=null;

		int[] values={10,20,30,40,50,25};
		for(int v : values)
		{
			root=tree.insert(root,v);
		}
	}

}
