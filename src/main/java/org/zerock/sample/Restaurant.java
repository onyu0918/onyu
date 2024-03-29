package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ToString
public class Restaurant {
	
	@Setter(onMethod_ = {@Autowired})
	private Chef chef;

}
