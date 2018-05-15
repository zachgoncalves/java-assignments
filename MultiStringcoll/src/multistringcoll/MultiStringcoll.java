
package multistringcoll;

public class MultiStringcoll {
   private int howmany;
   private int total;
   private btNode c;

   public MultiStringcoll() {
       c = null;
       howmany = 0;
       total = 0;
   }

   public MultiStringcoll(String i) {
       c = null;
       howmany = 0;
       total = 0;
   }

   private static btNode copytree(btNode t) {
       btNode root = null; 
       if(t != null) {
           root = new btNode();
           root.info = t.info;
           root.left = t.left;
           root.right = t.right;
           root.howmanyinit = t.howmanyinit;
       }
       return root;
   }

   public void copy(MultiStringcoll obj) {
      if (this != obj) {
          howmany = obj.howmany;
          total = obj.total;
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
         if((p != null) && p.info.equals(i)) {
             p.howmanyinit++;
             total++;
         }
         if (p == null) {
            howmany++; 
            total++;
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
 
   public int belongs(String i) {
      btNode p = c;
      int total_occurances = 0;
    
      while ((p != null) && (p.info.compareTo(i) != 0)) {
        if (p.info.compareTo(i) > 0) {
            p = p.left;
        } else {
            p = p.right;
        }
      }
      if(p != null) {
          total_occurances = p.howmanyinit;
      }
      return total_occurances; 
   }

   public int get_howmany() {
       return howmany;
   }

   public int gettotal() {
       return total;
   }
   
   public boolean compareWeights() {
       return true; 
   }
   
   public void print() {
      printtree(c);
   }
   
   public boolean equals(MultiStringcoll obj) {
        int counter = 0; 
        boolean equal = ((this.howmany == obj.howmany) && (this.gettotal() == obj.gettotal())); 
        if(equal) {
            String[] a = new String[this.howmany];
            String[] b = new String[obj.howmany];

            toarray(c, a, 0);
            toarray(obj.c, b, 0);
            
            int[] weightA= new int[this.howmany];
            int[] weightB = new int[obj.howmany];

            weightsToArray(c, weightA, 0);
            weightsToArray(obj.c, weightB, 0);

            
            while(equal && counter < howmany) {
                equal = ((a[counter].equals(b[counter])) && (weightA[counter] == weightB[counter]));
                counter++;
            }
            
       }
       
       return equal; 
   }

   private static void printtree(btNode t) {
      if (t != null) {
          printtree(t.left);
          System.out.println(t.info + " (" + t.howmanyinit + ")");
          printtree(t.right);
      }
   }

   
   private static int weightsToArray(btNode t, int[] a, int i) {
      int num_nodes=0;
      if (t != null) {
         num_nodes = weightsToArray(t.left, a, i);
         a[num_nodes+i] = t.howmanyinit;   
         num_nodes = num_nodes + 1 + weightsToArray(t.right, a, num_nodes+i+1);
      }
      return num_nodes;
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
       int howmanyinit; 

       private btNode(String i, btNode lt, btNode rt) {
          info=i; 
          left=lt; 
          right=rt;
          howmanyinit = 1;
       }

       private btNode() {
          info=null; left=null; right=null; howmanyinit = 1;
       }
   }
}
