package org.example.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;



import org.example.model.Apprenant;
import org.example.model.Reservation;
import org.example.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReservationContoller {

	
	
	
	@Autowired
    private ReservationService reservationService;
	
	@RequestMapping(value = "/reservation", method = RequestMethod.GET )
	   public ModelAndView listReservation(ModelAndView theModel) throws IOException {
		List<Reservation> listReservation = reservationService.getAllReservation();
		theModel.addObject("listReservation", listReservation);
		theModel.setViewName("reservation");
        return theModel;

	}


	  @RequestMapping(value = "/reservationf", method = RequestMethod.GET)
       public ModelAndView createReservation(ModelAndView theModel) {
           Reservation reservation = new Reservation();
            theModel.addObject("reservation", reservation);
           theModel.setViewName("reservationf");
           return theModel;
       }
//	  @RequestMapping(value = "saveReservation", method = RequestMethod.POST)
//      public ModelAndView saveReservation(@ModelAttribute Reservation reservation) {
//          System.out.println(reservation.getDateReservation());
//          reservation.setApprenant((Apprenant) LoginController.user);
//		   reservationService.addReservation(reservation);
//          return new ModelAndView("redirect:/");
//
//      }
	  @RequestMapping(value = "saveReservation", method = RequestMethod.POST)
       public ModelAndView saveReservation(@ModelAttribute Reservation reservation, HttpServletRequest request) {
           System.out.println(request.getParameter("date"));
			try {
				String parts[] = request.getParameter("date").split("-");
				int year = Integer.parseInt(parts[0]);
				int month = Integer.parseInt(parts[1]);
				int day = Integer.parseInt(parts[2]);
				System.out.println(year + " " + month + " " + day);
				java.util.Date simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("date"));
				System.out.println(simpleDateFormat);
				reservation.setDateReservation(simpleDateFormat);
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           
        reservation.setApprenant((Apprenant) LoginController.user);
		   reservationService.addReservation(reservation);
           return new ModelAndView("redirect:/");

       }


       @RequestMapping(value = "deleteReservation", method = RequestMethod.POST)
       public String deleteReservation(HttpServletRequest request){
	        Long id = Long.valueOf(request.getParameter("id"));
            reservationService.deleteReservation(id);
	        return "redirect:/reservation";
       }


    @RequestMapping(value = "AccpterReservation", method = RequestMethod.POST)
    public String accepterReservation(HttpServletRequest request){
        Long id = Long.valueOf(request.getParameter("id"));
        Reservation reservation =reservationService.getReservation(id);
        reservation.setConfirmation(true);
        reservationService.updateReservation(reservation);
        return "redirect:/reservation";
    }

}
