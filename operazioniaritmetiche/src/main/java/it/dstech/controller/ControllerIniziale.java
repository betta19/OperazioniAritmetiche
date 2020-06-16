package it.dstech.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class ControllerIniziale {
	@RequestMapping(value  = "/scelta", method = RequestMethod.POST)
	public ModelAndView checkParameter(@RequestParam("scelta") String scelta, Model model) {
		return new ModelAndView("numeri", "sceltaOperazione", scelta);	
	} 
	
	@RequestMapping(value = "/addizione", method = RequestMethod.POST)
	public ModelAndView addizione(@RequestParam("addizione") double primoNumero, double secondoNumero, Model model) {
		return new ModelAndView("risultato", "risultato", primoNumero+secondoNumero);
	}
	
	@RequestMapping(value = "/sottrazione", method = RequestMethod.POST)
	public ModelAndView sottrazione(@RequestParam("sottrazione") double primoNumero, double secondoNumero, Model model) {
		return new ModelAndView("risultato", "risultato", primoNumero-secondoNumero);
	}
	
	@RequestMapping(value = "/moltiplicazione", method = RequestMethod.POST)
	public ModelAndView moltiplicazione(@RequestParam("moltiplicazione") double primoNumero, double secondoNumero, Model model) {
		return new ModelAndView("risultato", "risultato", primoNumero*secondoNumero);
	}
	
	@RequestMapping(value = "/divisione", method = RequestMethod.POST)
	public ModelAndView divisione(@RequestParam("divisione") double primoNumero, double secondoNumero, Model model) {
		return new ModelAndView("risultato", "risultato", primoNumero/secondoNumero);
	}
}
