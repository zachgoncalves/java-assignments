
package stringcoll;

public class Stringcoll {
   private int howmany;
   private btNode c;

   public Stringcoll() {
       c = null;
       howmany = 0;
   }

   public Stringcoll(String i) {
       c = null;
       howmany = 0;
   }

   private static btNode copytree(btNode t) {
       btNode root = null; 
       if(t != null) {
           root = new btNode();
           root.info = t.info;
           root.left = t.left;
           root.right = t.right;
       }
       return root;
   }

   public void copy(Stringcoll obj) {
      if (this != obj) {
          howmany = obj.howmany;
          c = copytree(obj.c);  
      }
   }

   public void insert(String i) {
      if (i != null) {
         btNode pred = null;
         btNode p = c;

         while ((p != null) && (!p.info.equals(i))) {
             pred = p;
	     if (p.info.compareTo(i) > 0) {
                 p = p.left;
             } else {
                 p = p.right;
             }
         }
         if (p == null) {
            howmany++; 
            p = new btNode(i, null, null);
            if (pred != null) {
	       if (pred.info.compareTo(i) > 0) { 
                   pred.left = p;
               } else {
                   pred.right = p;
               }
	    }
            else {
                c = p;
            }
         }
      }
   }

   
   public void omit(String i) {    
       btNode p = c;
       btNode pred = null;
       while(p != null && p.info.compareTo(i) != 0) {
           pred = p;
           if(i.compareTo(p.info) < 0) {
               p = p.left;
           } else {
               p = p.right;
           }
       }
       if(p != null) {
           howmany--;
           if((p.left == null) && (p.right == null)) {
               if(pred != null) {
                   if(i.compareTo(pred.info) < 0) {
                       pred.left = null;
                   } else {
                       pred.right = null;
                   }
               } else {
                   c = null;
               }
           } 
           else if((p.left == null) && (p.right != null)) {
               if(pred != null) {
                   if(i.compareTo(pred.info) < 0) {
                       pred.left = p.right;
                   } else {
                       pred.right = p.right;
                   }
               } else {
                   c = p.right;
               }
           } 
           else if((p.left != null) && (p.right == null)) {
               if(pred != null) {
                   if(i.compareTo(pred.info) < 0) {
                       pred.left = p.left;
                   } else {
                       pred.right = p.left;
                   }
               } 
               else {
                   c = p.left;
               }
           } 
           else if((p.left != null) && (p.right != null)) {
               btNode n = p.left; 
               btNode n2 = p;     
               while(n.right != null) {
                   n2 = n;
                   n = n.right;
               }
               if(n2 != p) { 
                   n2.right = n.left;
                } else {
                   n2.left = n.left;
               }
               if(pred != null){//case where pred is not null.
                   if(i.compareTo(pred.info) < 0) {
                       pred.left = n;
                       n.right = p.right;
                       n.left = p.left;
                       n2.right = null;
                   } else {//same as above, but for i>pred.info
                       pred.right = n;
                       n.right = p.right;
                       n.left = p.left;
                       n2.right = null; 
                   }
               } else {//case where pred is null. 
                   c = n;
                   n.right = p.right;
                   n.left = p.left;
                   n2.right = null;
               }
           }
       }   
   }

   public boolean belongs(String i) {
      btNode p = c;
      while ((p != null) && (p.info.compareTo(i) != 0)) {
        if (p.info.compareTo(i) > 0) {
            p = p.left;
        } else {
            p = p.right;
        }
      }
      return (p != null); 
   }

   public int get_howmany() {
       return howmany;
   }

   public void print() {
      printtree(c);
   }

   public boolean equals(Stringcoll obj) {
        int counter = 0; 
        boolean equal = (this.howmany == obj.howmany); 
        if(equal) {
            String[] a = new String[this.howmany];
            String[] b = new String[obj.howmany];

            toarray(c, a, 0);
            toarray(obj.c, b, 0);
            
            while(equal && counter < howmany) {
                equal = ((a[counter].equals(b[counter])));
                counter++;
            }
            
       }
       
       return equal; 
   }

   private static void printtree(btNode t) {
      if (t != null) {
          printtree(t.left);
          System.out.println(t.info);
          printtree(t.right);
      }
   }

   private static int toarray(btNode t, String[] a, int i) {
      int num_nodes=0;
      if (t != null) {
         num_nodes = toarray(t.left, a, i);
         a[num_nodes+i] = t.info;   
         num_nodes = num_nodes + 1 + toarray(t.right, a, num_nodes+i+1);
      }
      return num_nodes;
   } 

   private static class btNode {
       String info; 
       btNode left; 
       btNode right;

       private btNode(String i, btNode lt, btNode rt) {
          info=i; 
          left=lt; 
          right=rt;  
       }

       private btNode() {
          info=null; left=null; right=null;
       }
   }
}
