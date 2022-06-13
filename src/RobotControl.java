
class RobotControl
 {
   private Robot r;
   
   public RobotControl(Robot r)
   {
       this.r = r;
   }

   public void control(int barHeights[], int blockHeights[], int required[], boolean ordered)
   {
	   //Start of Part A
	   /*goingUp(7);
	   extending(9);
	   r.pick();
	   contracting(9);
	   lowerAndDrop(6);
	   
	   
	   raising(5);
	   extending(9);
	   lowerAndPick(1);
	   contracting(9);
	   lowerAndDrop(2);
	   
	   extending(9);
	   r.pick();
	   raising(2);
	   contracting(9);
	   r.drop();
	   
	   extending(9);
	   lowerAndPick(4);
	   raising(6);
	   contracting(9);
	   r.drop();
	   //End of Part A*/
	   
	   
	   
	   
	   
	   
	   //Start of Part B
	   int max=0;
	   for(int i=0;i<=3;i++) {
		   max= max + blockHeights[i];
	   }
	   goingUp(max+1);
	   extending(9);
	   lowerAndPick(2);
	   raising(2);
	   contracting(9);
	   lowerAndDrop(8);
	   
	   raising(8);
	   extending(9);
	   lowerAndPick(4);
	   raising(4);
	   contracting(9);
	   lowerAndDrop(6);
	   
	   raising(6);
	   extending(9);
	   lowerAndPick(6);
	   raising(6);
	   contracting(9);
	   lowerAndDrop(4);
	   
	   raising(4);
	   extending(9);
	   lowerAndPick(8);
	   raising(8);
	   contracting(9);
	   lowerAndDrop(2);
	 //End of Part B
	   
   }
       
public void extending(int i)
	   {
			for(int secondArm=1;secondArm<=i;secondArm++) {
				r.extend();
			}
			
		}
	   public void goingUp(int i) {
		   for(int firstArm=1;firstArm<=i;firstArm++) {
				r.up();
			}
		   
	   }
		public void contracting(int i) {
			for(int secondArm=1;secondArm<=i;secondArm++) {
				r.contract();
			}
			
			
		}
		public void raising(int i) {
			for(int thirdArm=1;thirdArm<=i;thirdArm++) {
				r.raise();
			}
			
		}
		
		public void lowerAndPick(int i) {
			for(int thirdArm=1;thirdArm<=i;thirdArm++) {
				r.lower();
			}
			r.pick();
			
		}
		
		public void lowerAndDrop(int i) {
			for(int thirdArm=1;thirdArm<=i;thirdArm++) {
				r.lower();
			}
			r.drop();
		}
 }

	
   
 
	  
       
        
        
        
        
    	
    
  
	
    	
	
	
    
		
	
	
	
	
	   
	   // Part B requires you to access the array barHeights passed as argument as the robot arm must move
	   // over the bars
	   
	     
	   
	   
	   // The third part requires you to access the arrays barHeights and blockHeights 
	   // as the heights of bars and blocks are allowed to vary through command line arguments
	   

	   
	   
	   // The fourth part allows the user  to specify the order in which bars must 
	   // be placed in the target column. This will require you to use the use additional column
	   // which can hold temporary values
	   

	   
	   
	   
	   // The last part requires you to write the code to move from source column to target column using
	   // an additional temporary column but without placing a larger block on top of a smaller block 
	   
  

