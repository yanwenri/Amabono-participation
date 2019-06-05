package com.sk.amabono.participation.application.sp.web;

import java.text.ParseException;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sk.amabono.participation.domain.model.Participants;
import com.sk.amabono.participation.domain.model.Participation;
import com.sk.amabono.participation.domain.repository.ParticipationRepository;





@Controller
public class ParticipationRestController {

	@Autowired
	private ParticipationRepository partRepository;
	

	@RequestMapping("/participation")
	public String participation() { 
		return "participation"; 
	}
	
	@RequestMapping(value="/participation", method=RequestMethod.POST)
	public void PostPart(HttpServletRequest request, HttpServletResponse response) throws ParseException{
						

    
    String member_id ="testuser";
    boolean isparticipated= true;
    
    String bono_id ="1";
   
    
   
    Participants pat= new Participants();
   
    
    pat.setMember_id(member_id);
    pat.setIsparticipated(isparticipated);
    
    int Requestcountlimitd=5;
    
    Participation  tes = new Participation();
    
    int count = 0;
    
    if(pat.getIsparticipated()) {
    	
    	count = tes.getRequestcount()+1;
    	tes.setRequestcount(count);
    	  
    	
    }
    int limit = tes.getRequestcountlimit();
    
    int req = tes.getRequestcount();
    if( limit == req) {
    	tes.setIsclosed(true);    	
    }
    tes.setBono_id(bono_id);
    tes.setRequestcountlimit(Requestcountlimitd);
    
    
    tes.setParticipants(member_id);
     
    partRepository.save(tes);  
  
	}

	
	
}
