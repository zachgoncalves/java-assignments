
package discreteproject3;

public class DiscreteProject3 {

    public static void main(String[] args) {
        
        double seats = 45;
        double population = 10000;
        double stateOnePopulation = 2450;
        double stateTwoPopulation = 3623;
        double stateThreePopulation = 1897;
        double stateFourPopulation = 2030; 
        
        double standardDivisor = population/seats;
        double standardQuotaOne = stateOnePopulation/standardDivisor;
        double standardQuotaTwo = stateTwoPopulation/standardDivisor;
        double standardQuotaThree = stateThreePopulation/standardDivisor;
        double standardQuotaFour = stateFourPopulation/standardDivisor;
        
        double newsqone = (Math.round(standardQuotaOne)); 
        int resultOne = (int) Math.round(newsqone); 
            if(resultOne == 0) {
                resultOne++;
            }
        System.out.println("State 1 Seat Assignment:" + resultOne);
        
        double newsqtwo = (Math.round(standardQuotaTwo)); 
        int resultTwo = (int) Math.round(newsqtwo); 
            if(resultTwo == 0) {
                resultTwo++;
            }
        System.out.println("State 2 Seat Assignment:" + resultTwo);
        double newsqthree = (Math.round(standardQuotaThree));
        int resultThree = (int) Math.round(newsqthree); 
            if(resultThree == 0) {
                resultThree++;
            }
        System.out.println("State 3 Seat Assignment:" + resultThree);
        double newsqfour = (Math.round(standardQuotaFour));
        int resultFour = (int) Math.round(newsqfour); 
            if(resultFour == 0) {
                resultFour++;
            }
            
        int totalSeatsAssigned = resultOne + resultTwo + resultThree + resultFour; 
        System.out.println("State 4 Seat Assignment:" + resultFour);
        System.out.println("Total Seats Assigned:" + totalSeatsAssigned);
       
        if(totalSeatsAssigned > seats) {
            
            double modifiedDivisor = population/seats;
            double modifiedQuotaOne = stateOnePopulation/modifiedDivisor;
            double modifiedQuotaTwo = stateTwoPopulation/modifiedDivisor;
            double modifiedQuotaThree = stateThreePopulation/modifiedDivisor;
            double modifiedQuotaFour = stateFourPopulation/modifiedDivisor; 
            
            for(int i = totalSeatsAssigned; i > seats; i--) {
                
                population = population + 250; 
                modifiedDivisor = population/seats;
                modifiedQuotaOne = stateOnePopulation/modifiedDivisor;
                modifiedQuotaTwo = stateTwoPopulation/modifiedDivisor;
                modifiedQuotaThree = stateThreePopulation/modifiedDivisor;
                modifiedQuotaFour = stateFourPopulation/modifiedDivisor; 
                
                newsqone = (Math.round(modifiedQuotaOne) ); 
                resultOne = (int) Math.round(newsqone); 
                    if(resultOne == 0) {
                        resultOne++;
                    }
                

                newsqtwo = (Math.round(modifiedQuotaTwo)); 
                resultTwo = (int) Math.round(newsqtwo); 
                    if(resultTwo == 0) {
                        resultTwo++;
                    }
                
                newsqthree = (Math.round(modifiedQuotaThree));
                resultThree = (int) Math.round(newsqthree); 
                    if(resultThree == 0) {
                        resultThree++;
                    }
                newsqfour = (Math.round(modifiedQuotaFour));
                resultFour = (int) Math.round(newsqfour); 
                    if(resultFour == 0) {
                        resultFour++;
                    }
                
                if(newsqone > newsqtwo && newsqone > newsqthree && newsqone > newsqfour) {
                   resultOne++; 
                }
                if(newsqtwo > newsqone && newsqtwo > newsqthree && newsqtwo > newsqfour) {
                   resultOne++; 
                }
                if(newsqthree > newsqone && newsqthree > newsqtwo && newsqthree > newsqfour) {
                   resultOne++; 
                }
                if(newsqfour > newsqone && newsqfour > newsqtwo && newsqfour > newsqthree) {
                   resultOne++; 
                }
                    
                totalSeatsAssigned = resultOne + resultTwo + resultThree + resultFour; 
               
            } 
            
            if(totalSeatsAssigned < seats) {
            
            modifiedDivisor = population/seats;
            modifiedQuotaOne = stateOnePopulation/modifiedDivisor;
            modifiedQuotaTwo = stateTwoPopulation/modifiedDivisor;
            modifiedQuotaThree = stateThreePopulation/modifiedDivisor;
            modifiedQuotaFour = stateFourPopulation/modifiedDivisor; 
            
            for(int i = totalSeatsAssigned; i > seats; i--) {
                
                population = population + 250; 
                modifiedDivisor = population/seats;
                modifiedQuotaOne = stateOnePopulation/modifiedDivisor;
                modifiedQuotaTwo = stateTwoPopulation/modifiedDivisor;
                modifiedQuotaThree = stateThreePopulation/modifiedDivisor;
                modifiedQuotaFour = stateFourPopulation/modifiedDivisor; 
                
                newsqone = (Math.round(modifiedQuotaOne) ); 
                resultOne = (int) Math.round(newsqone); 
                    if(resultOne == 0) {
                        resultOne++;
                    }
                

                newsqtwo = (Math.round(modifiedQuotaTwo)); 
                resultTwo = (int) Math.round(newsqtwo); 
                    if(resultTwo == 0) {
                        resultTwo++;
                    }
                
                newsqthree = (Math.round(modifiedQuotaThree));
                resultThree = (int) Math.round(newsqthree); 
                    if(resultThree == 0) {
                        resultThree++;
                    }
                newsqfour = (Math.round(modifiedQuotaFour));
                resultFour = (int) Math.round(newsqfour); 
                    if(resultFour == 0) {
                        resultFour++;
                    }
                    
                if(newsqone > newsqtwo && newsqone > newsqthree && newsqone > newsqfour) {
                   resultOne++; 
                }
                if(newsqtwo > newsqone && newsqtwo > newsqthree && newsqtwo > newsqfour) {
                   resultOne++; 
                }
                if(newsqthree > newsqone && newsqthree > newsqtwo && newsqthree > newsqfour) {
                   resultOne++; 
                }
                if(newsqfour > newsqone && newsqfour > newsqtwo && newsqfour > newsqthree) {
                   resultOne++; 
                }
                
                totalSeatsAssigned = resultOne + resultTwo + resultThree + resultFour; 
               
            }
            
            
            for(int i = 0; i < 4; i--) {
                
                // check first state against the others
                if(stateOnePopulation > stateTwoPopulation && resultOne < resultTwo) {
                    resultOne++;
                    resultTwo--;
                }
                if(stateOnePopulation > stateThreePopulation && resultOne < resultThree) {
                    resultOne++;
                    resultThree--;
                }
                if(stateOnePopulation > stateFourPopulation && resultOne < resultFour) {
                    resultOne++;
                    resultFour--;
                }
                
                // check second state
                if(stateTwoPopulation > stateOnePopulation && resultTwo < resultOne) {
                    resultTwo++;
                    resultOne--;
                }
                if(stateTwoPopulation > stateThreePopulation && resultTwo < resultThree) {
                    resultTwo++;
                    resultThree--;
                }
                if(stateTwoPopulation > stateFourPopulation && resultTwo < resultFour) {
                    resultTwo++;
                    resultFour--;
                }
                
                // check third state
                if(stateThreePopulation > stateOnePopulation && resultThree < resultOne) {
                    resultThree++;
                    resultOne--;
                }
                if(stateThreePopulation > stateTwoPopulation && resultThree < resultTwo) {
                    resultThree++;
                    resultTwo--;
                }
                if(stateThreePopulation > stateFourPopulation && resultThree < resultFour) {
                    resultThree++;
                    resultFour--;
                }
                
                // check fourth state
                if(stateFourPopulation > stateOnePopulation && resultFour < resultOne) {
                    resultFour++;
                    resultOne--;
                }
                if(stateFourPopulation > stateTwoPopulation && resultFour < resultTwo) {
                    resultThree++;
                    resultTwo--;
                }
                if(stateFourPopulation > stateThreePopulation && resultFour < resultThree) {
                    resultFour++;
                    resultThree--;
                }
                
            }
            
            System.out.println("State 1 New Seat Assignment:" + resultOne);
            System.out.println("State 2 New Seat Assignment:" + resultTwo);
            System.out.println("State 3 New Seat Assignment:" + resultThree);
            System.out.println("State 4 New Seat Assignment:" + resultFour);
            System.out.println("Total Seats Assigned:" + totalSeatsAssigned);
            
            }
        }
                
    }
    
}
