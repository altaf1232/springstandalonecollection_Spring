package com.springstandalonecollection;

import java.util.List;
           //here is name bean person
import java.util.Map;
import java.util.Properties;

public class Person 
{
  private List<String> frinds;
  private Map<String,Integer> feestructure;
  private Properties properties;
  //properties is a class basically it is used to database connection

public List<String> getFrinds() {
	return frinds;
}

public void setFrinds(List<String> frinds) {
	this.frinds = frinds;
}


public Map<String, Integer> getFeestructure() {
	return feestructure;
}

public void setFeestructure(Map<String, Integer> feestructure) {
	this.feestructure = feestructure;
}


public Properties getProperties() 
{
	return properties;
}

public void setProperties(Properties properties) {
	this.properties = properties;
}

@Override
public String toString() {
	return "Person [frinds=" + frinds + ", feestructure=" + feestructure + "]";
}



  

}
