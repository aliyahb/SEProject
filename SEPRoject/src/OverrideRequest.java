/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author edenruffell
 */
public class OverrideRequest extends Request{
    
    
  
   RoomBooking roombooking;
  
    
    
    
    public OverrideRequest(User user, RoomBooking roombooking, String requestType){
    
        super(user, requestType);
        this.roombooking = roombooking;
        
    
    }
    
    
    public String changeBooking(User user){
    
        
        if(user.type.equals("T")){
        roombooking.setOwner(user.name);
        
           
        return "Override Approved";
        }
        else{
        return "Unauthorised Override - You do not have permission to override.";
        }
        
    }
  
}
