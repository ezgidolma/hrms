package kodlamaio.hrms.core.utilities.Business;

import kodlamaio.hrms.core.utilities.results.Result;

public class BusinessRules {
	public static Result Run(Result... logics) {
		  for( Result logic : logics)
	      {
	          if (!logic.isSucces())
	          {
	              return logic;
	          }
	      }
	      return null;
	  }
}
