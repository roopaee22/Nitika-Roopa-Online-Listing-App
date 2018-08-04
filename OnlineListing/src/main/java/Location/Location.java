package Location;


public class Location {
	
	Integer StartPoint;
	Integer EndPoint;
	
	public Location(Integer startPoint, Integer endPoint) {
		super();
		StartPoint = startPoint;
		EndPoint = endPoint;
	}

	
	public Integer getStartPoint() {
		return StartPoint;
	}
	public void setStartPoint(Integer startPoint) {
		StartPoint = startPoint;
	}
	public Integer getEndPoint() {
		return EndPoint;
	}
	public void setEndPoint(Integer endPoint) {
		EndPoint = endPoint;
	}
	

	

}
