package com;

public class InterceptingFilterDemo {
	   public static void main(String[] args) {
	      FilterManager filterManager = new FilterManager();
	      
	      /*filterManager.setFilter(new AuthenticationFilter());	      
	      filterManager.setFilter(new DebugFilter()); // 000 D. I	      
	      filterManager.setFilter(new Filter1()); ///	      
	      filterManager.setFilter(new Filter2());
*/
	      
	     /*List of filter we need to create dynamically*/
	      
	      
	      Client client = new Client();
	      client.setFilterManager(filterManager);
	      client.sendRequest("HOME");
	   }
	}