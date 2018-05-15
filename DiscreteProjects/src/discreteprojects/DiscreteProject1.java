 
package discreteprojects;

import java.util.Arrays;

public class DiscreteProject1 {
    
    public static void main(String[] args) {
        
        double seats = 40;
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
        double standardQuotaCombined = Math.round(standardQuotaOne) + Math.round(standardQuotaTwo) + Math.round(standardQuotaThree) + Math.round(standardQuotaFour); 
        
        double newsqone = ((Math.floor(standardQuotaOne) + (Math.ceil(standardQuotaOne))) / 2 ); 
        int resultOne = (int) Math.round(newsqone); 
            if(resultOne == 0) {
                resultOne++;
            }
        System.out.println("State 1 Seat Assignment:" + resultOne);
        
        double newsqtwo = ((Math.floor(standardQuotaTwo) + (Math.ceil(standardQuotaTwo))) / 2 ); 
        int resultTwo = (int) Math.round(newsqtwo); 
            if(resultTwo == 0) {
                resultTwo++;
            }
        System.out.println("State 2 Seat Assignment:" + resultTwo);
        double newsqthree = ((Math.floor(standardQuotaThree) + (Math.ceil(standardQuotaThree))) / 2 );
        int resultThree = (int) Math.round(newsqthree); 
            if(resultThree == 0) {
                resultThree++;
            }
        System.out.println("State 3 Seat Assignment:" + resultThree);
        double newsqfour = ((Math.floor(standardQuotaFour) + (Math.ceil(standardQuotaFour))) / 2 );
        int resultFour = (int) Math.round(newsqfour); 
            if(resultFour == 0) {
                resultFour++;
            }
            
        int totalSeatsAssigned = resultOne + resultTwo + resultThree + resultFour; 
        System.out.println("State 4 Seat Assignment:" + resultFour);
        System.out.println("Total Seats Assigned:" + totalSeatsAssigned);
       
        if(totalSeatsAssigned > seats || totalSeatsAssigned < seats) {
            
            double modifiedDivisor = population/seats;
            double modifiedQuotaOne = stateOnePopulation/modifiedDivisor;
            double modifiedQuotaTwo = stateTwoPopulation/modifiedDivisor;
            double modifiedQuotaThree = stateThreePopulation/modifiedDivisor;
            double modifiedQuotaFour = stateFourPopulation/modifiedDivisor; 
            
            for(int i = totalSeatsAssigned; i > seats || i < seats; i--) {
                
                population = population + 250; 
                modifiedDivisor = population/seats;
                modifiedQuotaOne = stateOnePopulation/modifiedDivisor;
                modifiedQuotaTwo = stateTwoPopulation/modifiedDivisor;
                modifiedQuotaThree = stateThreePopulation/modifiedDivisor;
                modifiedQuotaFour = stateFourPopulation/modifiedDivisor; 
                
                newsqone = ((Math.floor(modifiedQuotaOne) + (Math.ceil(modifiedQuotaOne))) / 2 ); 
                resultOne = (int) Math.round(newsqone); 
                    if(resultOne == 0) {
                        resultOne++;
                    }
                

                newsqtwo = ((Math.floor(modifiedQuotaTwo) + (Math.ceil(modifiedQuotaTwo))) / 2 ); 
                resultTwo = (int) Math.round(newsqtwo); 
                    if(resultTwo == 0) {
                        resultTwo++;
                    }
                
                newsqthree = ((Math.floor(modifiedQuotaThree) + (Math.ceil(modifiedQuotaThree))) / 2 );
                resultThree = (int) Math.round(newsqthree); 
                    if(resultThree == 0) {
                        resultThree++;
                    }
                newsqfour = ((Math.floor(modifiedQuotaFour) + (Math.ceil(modifiedQuotaFour))) / 2 );
                resultFour = (int) Math.round(newsqfour); 
                    if(resultFour == 0) {
                        resultFour++;
                    }
                
                totalSeatsAssigned = resultOne + resultTwo + resultThree + resultFour; 
               
            } 
            
            System.out.println("State 1 New Seat Assignment:" + resultOne);
            System.out.println("State 2 New Seat Assignment:" + resultTwo);
            System.out.println("State 3 New Seat Assignment:" + resultThree);
            System.out.println("State 4 New Seat Assignment:" + resultFour);
            System.out.println("Total Seats Assigned:" + totalSeatsAssigned);

        }
        
    }
    
}
