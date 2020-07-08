abstract class Plan{  

         protected double rate;  
         abstract void getRate();  
   
         public void calculateBill(int units)
         {  
              System.out.println(units*rate);  
         }  
}//end of Plan class

class  DomesticPlan extends Plan{  
         
         public void getRate(){  
             rate=3.50;              
        }  
   }//end of DomesticPlan class

class  CommercialPlan extends Plan{  
   
    public void getRate(){   
        rate=7.50;  
   }   
} //end of CommercialPlan class.  

class  InstitutionalPlan extends Plan{  
   
    public void getRate(){   
        rate=5.50;  
   }   //end of InstitutionalPlan class.  
}

class GetPlanFactory{  
      
   //use getPlan method to get object of type Plan   
       public Plan getPlan(String planType){  
            if(planType == null){  
             return null;  
            }  
          if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
                 return new DomesticPlan();  
               }   
           else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
                return new CommercialPlan();  
            }   
          else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
                return new InstitutionalPlan();  
          }  
      return null;  
   }  
}//end of GetPlanFactory class.  

//Generate Bill by using the GetPlanFactory to get the object of concrete classes by passing an information such as type of plan DOMESTICPLAN or COMMERCIALPLAN or INSTITUTIONALPLAN.
  
class GenerateBill{  
    public static void main(String args[])  

   //Get the only object available
   public static CommercialPlan getInstance(){
      return instance;
   }

}
      
}//end of GenerateBill class.  


