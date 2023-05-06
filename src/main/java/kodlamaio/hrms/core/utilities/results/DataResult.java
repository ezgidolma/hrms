package kodlamaio.hrms.core.utilities.results;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Image;

public class DataResult<T> extends Result {

	private T data;
	public DataResult(T data,boolean success, String message) {
		super(success, message);
		this.data=data;
	}
	
	public DataResult(T data,boolean success) {
		super(success);
		this.data=data;
		
	}

	


	

}
